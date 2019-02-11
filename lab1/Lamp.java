package Lab1;

public class Lamp {
	private String  manufacturerName;
    private int power;
    private String guarantee;
    private String producingCountry;
    private int price;
    private String type;
    protected String color;
    protected int size;
    static int wight = 500;
    
    Lamp() {
    	this.manufacturerName = "Turbo";
    	this.power = 60;
    	this.guarantee = "1 year";
    	this.producingCountry = "China";
    	this.price = 100;
    	this.type = "LED";
    	this.color = "white";
    	this.size = 100;
    	
    }
    
    Lamp(
    		String manufacturerName,
    		int power,
    		String guarantee,
    		String producingCountry,
    		int price,
            String type,
            String color,
            int size
           ) {
    	this.manufacturerName = manufacturerName;
    	this.power = power;
    	this.guarantee = guarantee;
    	this.producingCountry = producingCountry;
    	this.price = price;
    	this.type = type;
    	this.color = color;
    	this.size = size;
    }
    
    public String toString() {
    	return "Company name: " + this.manufacturerName + "\n" +
                "Power: " + this.power + "\n" +
    			"Guarantee: " + this.guarantee + "\n" +
                "Producing Country: " + this.producingCountry + "\n" +
    			"Price: " + this.price + "\n" +
                "Type: " + this.type + "\n" +
    			"Color: " + this.color + "\n" +
                "Size: " + this.size + "\n";
                
    }
    static void printStaticWight() {
    	System.out.println("Wight " + wight);
    }
    
    public void printWight() {
    	System.out.println("Wight: " + wight);
    	}
    
    public void resetValues(
    		String manufacturerName,
    		int power,
    		String guarantee,
    		String producingCountry,
    		int price,
    		String type,
    		String color,
    		int size
    		) {
    	
    this.manufacturerName = manufacturerName;
    this.power = power;
    this.guarantee = guarantee;
    this.producingCountry = producingCountry;
    this.price = price;
    this.type = type;
    this.color = color;
    this.size = size;
    	
    }

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getGuarantee() {
		return guarantee;
	}

	public void setGuarantee(String guarantee) {
		this.guarantee = guarantee;
	}

	public String getProducingCountry() {
		return producingCountry;
	}

	public void setProducingCountry(String producingCountry) {
		this.producingCountry = producingCountry;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
    
    
    
}
