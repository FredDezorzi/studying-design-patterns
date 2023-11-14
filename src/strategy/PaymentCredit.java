package strategy;

public class PaymentCredit implements PaymentStrategy{
	@Override
	public void processPayment(double value) {
		value = value * 1.2;
		System.out.println(" Payment by Credit Card in the amount of US$: " + value);
	}
}
