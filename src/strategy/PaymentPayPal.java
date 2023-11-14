package strategy;

public class PaymentPayPal implements PaymentStrategy{

	@Override
	public void processPayment(double value) {
		System.out.println(" Payment by PayPal in the amount of US$: " + value);
	}

}
