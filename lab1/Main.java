package ua.lvil.iot.lab1;

public class Main {

	public static void main(String[] args) {
		Lamp Turbo = new Lamp();

		Lamp Enerlight = new Lamp("Enerlight", 60, "2 years", "Germany", 120, "LED", "black", 80);

		Lamp iLumia = new Lamp("iLumia", 60, "6 months", "Japan");

		iLumia.setPrice(300);
		iLumia.setType("LED");
		iLumia.setColor("Grey");
		iLumia.setSize(100);

		System.out.println(Turbo.toString());
		System.out.println(Enerlight.toString());
		System.out.println(iLumia.toString());

		System.out.println("printStaticName: ");
		Turbo.printStaticWight();
		Enerlight.printStaticWight();
		iLumia.printStaticWight();

		System.out.println("printName");
		Turbo.printWight();
		Enerlight.printWight();
		iLumia.printWight();

	}

}
