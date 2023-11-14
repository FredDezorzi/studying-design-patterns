package Builder;

public class Car {
	private String model;
	private String color;
	private int year;
	private String motor;
	
	private Car() {
		
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", color=" + color + ", year=" + year + ", motor=" + motor + "]";
	}
	
	public static class Builder {
        private Car car;

        public Builder(String model, String color, int year) {
            this.car = new Car();
            this.car.model = model;
            this.car.color = color;
            this.car.year = year;
        }

        public Builder addMotor(String motor) {
            this.car.motor = motor;
            return this;
        }


        public Car build() {
            return this.car;
        }
    }
 	
	
	

}
