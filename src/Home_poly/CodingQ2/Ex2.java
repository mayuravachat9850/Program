package Home_poly.CodingQ2;

public class Ex2 {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        System.out.println(paymentService.pay(1000));

        PaymentService onlinePaymentService = new OnlinePaymentService();
        System.out.println(onlinePaymentService.pay(1000));
    }
}
