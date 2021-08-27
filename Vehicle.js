function Vehicle(VIN, type, make, model,
		 country, year, mileage, addedFeatures,
		 size, color, engine, mpg, fuelType,
		 currentLocation, monthlyPayments) {
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
	this.monthlyPayment = monthlyPayments;
	this.getVin = function() {
		return this.VIN;
	};
}

