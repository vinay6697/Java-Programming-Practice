package collectionFramework.list.sorting;

public class Batman implements Comparable<Batman>{
	
	private String name;
	private Double strikeRate;
	private int noOfHundreds;
	
	
	//No argument Constructor
	public Batman() {
	}
	
	//Parameterized constructor
	public Batman(String name, double strikeRate, int noOfHundreds) {
		this.name = name;
		this.strikeRate = strikeRate;
		this.noOfHundreds = noOfHundreds;
	}


	//Getters and Setters
	public String getName() {
		return name;
	}
	public Double getStrikeRate() {
		return strikeRate;
	}
	public int getNoOfHundreds() {
		return noOfHundreds;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setStrikeRate(Double strikeRate) {
		this.strikeRate = strikeRate;
	}
	public void setNoOfHundreds(int noOfHundreds) {
		this.noOfHundreds = noOfHundreds;
	}

	@Override
	public String toString() {
		return "Batman "
				+ "[name=" + name +"\t, strikeRate=" + strikeRate + "\t, noOfHundreds=" + noOfHundreds + "]";
	}

	@Override
	public int compareTo(Batman batman) {
		return this.strikeRate.compareTo(batman.strikeRate);
	}
	
	
}
