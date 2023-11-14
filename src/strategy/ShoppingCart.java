package strategy;

public class ShoppingCart {
	private PaymentStrategy paymentStrategy;
	
	public ShoppingCart(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void finishPurchase(double value) {
    	paymentStrategy.processPayment(value);
    }

}
