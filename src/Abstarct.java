public class Abstarct {
    public static void main(String[] args) {
       PaymentMethod card = new CreditCard();
       PaymentMethod paypal = new PayPalPayment();
        processPayment(card, 1000);
        processPayment(paypal, 2000);



    }

    static abstract class PaymentMethod {
        void pay(int amount){
        }
    }

    static class CreditCard extends PaymentMethod {

        @Override
        void pay(int amount){
            System.out.println("Credit card payment");
        }
    }

    static class PayPalPayment extends PaymentMethod {
        @Override
        void pay(int amount){
            System.out.println("PayPal method payment");
        }
    }

    static void processPayment(PaymentMethod method, int amount){
        method.pay(amount);
    }
}


