import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		System.out.println("******************** DUOTECH TOLL ADMINISTRATION APPLICATION ********************");

		System.out.println("------------------------------------------------------------------------------");

		// Implement the TAA application logic here
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.println("Number of Vehicles you want to calculate the toll for");
		number = scanner.nextInt();
		String typeString;
		int distance;
		ArrayList<Vehicle> arrayList = new ArrayList<>();
		for (int i = 1; i <= number; i++) {
			System.out.println("Calculating the toll for the " + i + " Vehicle");
			Vehicle vehicle = null;
			System.out.print("Choose the vehicle type: 1.Car 2.Truck 3.Police Cruiser");
			int num = scanner.nextInt();
			System.out.print("Distance Traveled :");
			distance = scanner.nextInt();
			if (num == 1) {
				boolean bool1, bool2;
				System.out.print("Does it have a trailer?:");
				bool1 = scanner.nextBoolean();
				System.out.print("Is HOV+3 on?: ");
				bool2 = scanner.nextBoolean();
				vehicle = new Car(distance, bool1, bool2);

			} else if (num == 2) {
				int numOfAxles;
				System.out.println("Number of axles");
				numOfAxles = scanner.nextInt();
				vehicle = new Truck(distance, numOfAxles);

			} else if (num == 3) {
				vehicle = new PoliceCruiser(distance);
			}
			System.out.println(
					"TOLL INFO: Vehicle Distance Toll Amount \n------------------------------------------------ ");
			System.out.println(vehicle);
			arrayList.add(vehicle);

		}
		System.out.println(
				"TOLL INFO FOR ALL VEHICLES: Vehicle Distance Toll Amount \n------------------------------------------------");
		for (Vehicle vehicle : arrayList) {
			System.out.println(vehicle);
		}

		System.out.println("THANK YOU FOR USING DUOTECH TAA! GOODBYE!");

	}

}