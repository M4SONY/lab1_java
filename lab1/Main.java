package Lab1;

public class Main {

	public static void main(String[] args) {
	Lamp Turbo = new Lamp();
	
	Lamp Enerlight = new Lamp(
			"Enerlight",
			60,
			"2 years",
			"Germany",
			120,
			"LED",
			"black",
			80
);
	
	Lamp iLumia = new Lamp();
	
	iLumia.setManufacturerName("iLumia");
	iLumia.setPower(60);
	iLumia.setGuarantee("6 months");
	iLumia.setProducingCountry("Japan");
	iLumia.setPrice(200);
	iLumia.setType("LED");
	iLumia.setColor("grey");
	iLumia.setSize(90);
	
	System.out.println(Turbo.toString());
	System.out.println(Enerlight.toString());
	System.out.println(iLumia.toString());
	
	Lamp.printStaticWight();
	iLumia.printWight();

	}

}
