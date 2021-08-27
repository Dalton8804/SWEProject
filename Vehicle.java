public class Vehicle{
	private long VIN = 00000000000000000;
	private String type = "N/A"; 
	private String make = "N/A";
	private String model = "N/A";
	private String country = "N/A";
	private int year = 0000;
	private int mileage = 000000;
	private String[] addedFeatures;
	private String size = "N/A";
	private String color = "N/A";
	private String engine = "N/A";
	private String mpg = "N/A";
	private String fuelType = "N/A";
	private String currentLocation = "N/A";
	private int monthlyPayment = 999;

	public Vehicle(long VIN, String type, String make, String model,
		 String country, int year, int mileage, String[] addedFeatures,
		 String size, String color, String engine, String mpg, String fuelType,
		 String currentLocation, int monthlyPayment){
			 this.VIN = VIN;
			 this.type = type;
			 this.make = make;
			 this.model = model;
			 this.country = country;
			 this.year = year;
			 this.mileage = mileage;
			 this.addedFeatures = addedFeatures;
			 this.size = size;
			 this.color = color; 
			 this.engine = engine;
			 this.mpg = mpg; 
			 this.fuelType = fuelType;
			 this.currentLocation = currentLocation;
			 this.monthlyPayment = monthlyPayment;
	}

	public Vehicle(long VIN){
		this.VIN = VIN;
	}

	public long getVIN(){
		return this.VIN;
	}

}
