class method {
	private String make;
	private String model;
	private int year;

	// Parameterized constructor
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}

	// Method to display car information
	public void displayInfo() {
		System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
	}
}

public class Main {
	public static void main(String[] args) {
		// Create instances of Car class
		Car car1 = new Car("Toyota", "Camry", 2022);
		Car car2 = new Car("Ford", "Mustang", 2023);

		// Call the displayInfo method for each car
		car1.displayInfo();
		car2.displayInfo();
	}
}
