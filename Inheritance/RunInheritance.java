class RunInheritance {
	public static void main (String [] args){
		Car myCar = new Car ("Chevrolet", "Tahoe", true);

		System.out.println(myCar.displayInfo());
	}
}

class Vehicle {
	String make;
	String model;
}

class Car extends Vehicle {
	boolean isDomestic;

	Car (String mk, String mod,boolean isDom) {
		make = mk;
		model = mod;
		isDomestic = isDom;
	}

	String displayInfo () {
		return String.format ("Make: %s\nModel: %s\nDomestic: %s",make,model,isDomestic);
	}
}
