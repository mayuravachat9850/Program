package Home_Inheritance.CodingQ2;

public class Coding {
    public static void main(String[] args) {
        EmailService emailService = new EmailService("Hello", "ishwar@gmail.com");
        System.out.println(emailService.sendNotification());
    }
}
