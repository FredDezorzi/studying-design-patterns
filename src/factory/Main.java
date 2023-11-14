package factory;

public class Main {

	public static void main(String[] args) {

		FactoryTransport factoryTruck = new FactoryTruck();
		FactoryTransport factoryShip = new FactoryShip();
		
		Transport truck = factoryTruck.createTransport();
		Transport ship = factoryShip.createTransport();
		
		truck.deliver();
		ship.deliver();
	}
}
