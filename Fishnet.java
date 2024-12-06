package MockExam;

public class Fishnet {
	private int numberFish;
	private double averageFishWeight;
	
	public Fishnet() {
	}

	public int getNumberFish() {
		return numberFish;
	}

	public void setNumberFish(int numberFish) {
		this.numberFish = numberFish;
	}

	public double getAverageFishWeight() {
		return averageFishWeight;
	}

	public void setAverageFishWeight(double averageFishWeight) {
		this.averageFishWeight = averageFishWeight;
	}

	public double calculateTotalWeight() {
	double totalWeight = numberFish*averageFishWeight;
	return totalWeight;
	}
	public String toString() {
		return String.format("The total weight is: %.2f",  calculateTotalWeight(),"kg");
	}	

}
