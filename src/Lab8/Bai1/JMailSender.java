package Lab8.Bai1;

import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.util.Date;
import java.util.Properties;

public class JMailSender {
    private static final String email = "user@gmail.com";
    private static final String pass = "songlong";
    private static final Properties config = new Properties();
    static {
        //Cac thong so gmail
        config.setProperty("mail.smtp.host", "smtp.gmail.com");
        config.setProperty("mail.smtp.port", "465");
        config.setProperty("mail.smtp.starttls.enable", "true");
        config.setProperty("mail.smtp.auth", "true");
        config.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        config.setProperty("mail.smtp.socketFactory.fallback", "false");
    }

    public static Session getSession(){
        //Dang nhap gmail
        Authenticator authenticator = new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, pass);
            }
        };
        Session session = Session.getInstance(config, authenticator);
        return session;
    }


    public static void send(String to, String subject, String body) {
        String from = String.format("EStore Web Master <%s>", email);
        JMailSender.send(from, to, subject, body);
    }

    public static void send(String from, String to, String subject, String body) {
        String cc = "", bcc = "", attach = "";
        JMailSender.send(from, to, cc, bcc, subject, body, attach);
    }

    public static void send(String from, String to, String cc, String bcc, String subject, String body, String attachments) {
        try{
            MimeMessage mail = new MimeMessage(getSession());

            String[] addresses = from.split("[<>]");
            String name = addresses[0].trim();
            String email = (addresses.length > 1 ? addresses[1] : addresses[0].trim());
            InternetAddress fromAddress = new InternetAddress(email, name, "utf8");

            mail.setFrom(fromAddress);
            mail.setReplyTo(new InternetAddress[]{fromAddress});

            final String toEmails = to.trim().replaceAll("[,;\\s]+",",");
            mail.addRecipients(Message.RecipientType.TO, toEmails);

            if(cc != null && cc.trim().length() > 0) {
                final String ccEmails = cc.trim().replaceAll("[,;\\s]+",",");
                mail.addRecipients(Message.RecipientType.CC, ccEmails);
            }

            if (bcc != null && cc.trim().length() > 0) {
                final String bccEmails = bcc.trim().replaceAll("[,;\\s]+",",");
                mail.addRecipients(Message.RecipientType.BCC, bccEmails);
            }

            mail.setSubject(subject, "utf-8");
            mail.setContent(body, "text/html; charset=utf-8");
            mail.setSentDate(new Date());

            if (attachments != null && attachments.trim().length() > 0) {
                MimeMultipart multipart = new MimeMultipart();

                MimeBodyPart mailBodyPart = new MimeBodyPart();
                mailBodyPart.setContent(body, "text/html; charset=utf8");
                multipart.addBodyPart(mailBodyPart);

                String[] paths = attachments.split("[,;]+");
                for(String path : paths){
                    File file = new File(path.trim());
                    MimeBodyPart attachBodyPart = new MimeBodyPart();
                    FileDataSource fds = new FileDataSource(file);
                    attachBodyPart.setDataHandler(new DataHandler(fds));
                    attachBodyPart.setFileName(file.getName());
                    multipart.addBodyPart(attachBodyPart);
                }
                mail.setContent(multipart);
            }
            JMailSenderService.queue(mail);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
