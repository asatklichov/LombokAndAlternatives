package record_demo.net.sahet.record;

import java.time.LocalDate;

public class CarDemo {

	public static void main(String[] args) {
		String model = "Toyota RAV4";
		String vin = "AbC23332323JSS23";
		LocalDate producedDate = LocalDate.of(2022, 1, 13);

		System.out.println("Using Java Bean");
		VeboseCar car1 = new VeboseCar(model, producedDate, vin);
		System.out.println(car1);

		System.out.println("Using Java Record");
		Car car2 = new Car(model, producedDate, vin);
		System.out.println(car2);
	}
}
