package strategy;

public class Main {
	
	public static void main(String[] args) {
        PaymentStrategy creditCard = new PaymentCredit();
        PaymentStrategy payPal = new PaymentPayPal();

        ShoppingCart Cart1 = new ShoppingCart(creditCard);
        ShoppingCart Cart2 = new ShoppingCart(payPal);

        Cart1.finishPurchase(100.0);
        Cart2.finishPurchase(100.0);
    }

}
