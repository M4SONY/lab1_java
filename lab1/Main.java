package ua.lvil.iot.lab1;

public class Main {

	public static void main(String[] args) {
		Lamp turbo = new Lamp();

		Lamp enerlight = new Lamp("enerlight", 60, "2 years", "Germany", 120, "LED", "black", 80);

		Lamp ilumia = new Lamp("ilumia", 60, "6 months", "Japan");

		ilumia.setPrice(300);
		ilumia.setType("LED");
		ilumia.setColor("Grey");
		ilumia.setSize(100);

		System.out.println(turbo.toString());
		System.out.println(enerlight.toString());
		System.out.println(ilumia.toString());

		System.out.println("printStaticName: ");
		turbo.printStaticWight();
		enerlight.printStaticWight();
		ilumia.printStaticWight();

		System.out.println("printName");
		turbo.printWight();
		enerlight.printWight();
		ilumia.printWight();

	}

}
