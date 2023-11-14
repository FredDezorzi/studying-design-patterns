package Builder;

public class Main {
	public static void main(String[] args) {
        Car car = new Car.Builder("Sedan", "Black", 2022)
                .addMotor("V6")
                .build();

        System.out.println(car);
    }

}
