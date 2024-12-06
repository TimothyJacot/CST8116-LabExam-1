package MockExam;
import java.util.Scanner;

public class Driver {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Fishnet calc = new Fishnet();
		System.out.print("Please enter the amount of fish in the fishnet:");
		int numberFish = keyboard.nextInt();
		calc.setNumberFish(numberFish);
		System.out.print("Please enter the average weight of each fish: ");
		double averageFishWeight = keyboard.nextDouble();
		calc.setAverageFishWeight(averageFishWeight);
		
		
		System.out.printf(calc.toString());
		keyboard.close();
	}

}
