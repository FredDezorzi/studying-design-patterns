package factory;

public class FactoryTruck implements FactoryTransport{

	@Override
	public Transport createTransport() {
		return new Truck();
	}

}
