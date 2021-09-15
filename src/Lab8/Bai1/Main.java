package Lab8.Bai1;

public class Main {
    public static void main (String []args) {
        String from = "sender@gmail.com";
        String to = "a@gmail.com";
        String subject = "Tieu de mail";
        String body = "Noi dung mail";
        JMailSender.send(from, to, subject,body);
    }
}
