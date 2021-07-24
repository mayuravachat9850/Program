package Home_poly.CodingQ2;

/*
 * TODO 1: Extend the OnlinePaymentService class with the PaymentService class.
 * TODO 2: Override the pay(int) method such that it return the following output:
 * 		paid <money> rupees online
 *
 * 		For example:
 * 		paid 1000 rupees online
 */
public class OnlinePaymentService extends PaymentService{
    public String pay(int money) {
        return "paid " + money + " rupees online";
    }
}

