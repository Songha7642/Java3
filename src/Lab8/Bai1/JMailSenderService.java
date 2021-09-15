package Lab8.Bai1;


import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import java.util.ArrayList;
import java.util.List;




public class JMailSenderService extends Thread {
    static {
        JMailSenderService sender = new JMailSenderService();
        sender.start();
    }
    static final List<MimeMessage> queue = new ArrayList<>();
    public static void queue (MimeMessage mail) {
        synchronized (queue){
            queue.add(mail);
            queue.notify();
        }
    }

    @Override
    public void run() {
        while(true) {
            try{
                synchronized(queue) {
                    if(queue.size() > 0) {
                        try {
                            MimeMessage mail = queue.remove(0);
                            Transport.send(mail);
                            System.out.println("The mail was sent.");
                        } catch (MessagingException e) {
                            System.out.println("Unable to send mail.");
                        }
                    }
                    else {
                        queue.wait();
                    }
                }
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}


