package factory;

public class FactoryShip implements FactoryTransport{

	@Override
	public Transport createTransport() {
		return new Ship();
	}

}
