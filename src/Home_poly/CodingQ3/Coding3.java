package Home_poly.CodingQ3;

public class Coding3 {
    /*
     * TODO 1: Instantiate the onlinePaymentService attribute using the Anonymous class.
     * The anonymous class should extend the PaymentService class and override the pay(int)
     * method to return the following output.
     * 		paid <money> rupees online
     *
     * 		For example,
     * 		paid 1000 rupees online
     *
     * Note: Keep the onlinePaymentService public and static, otherwise the testcases would fail.
     */
    public static PaymentService onlinePaymentService = new PaymentService(){
        public String pay(int money){
            return "paid " + money +" rupees online";
        }
    };

    public static void main(String[] args) {
        System.out.println(onlinePaymentService.pay(1000));
    }
}

