import java.util.Date;

public class VehicleForRent extends ForRent implements RentPayment{

	private int vehicleSaleNo;
	private String model;
	private int year;
	private String transmission;
	private String fuel;
	private String color;
	
	public VehicleForRent(int price, Date advertDate, String location,int vehicleSaleNo,String model,int year,String transmission,String fuel, String color) {
		super(price, advertDate, location);
		this.color=color;
		this.fuel=fuel;
		this.model=model;
		this.transmission=transmission;
		this.vehicleSaleNo=vehicleSaleNo;
		this.year=year;
	}

	@Override
	public int dailyRent(int price) {
		return price;
	}

	@Override
	public int weeklyRent(int price) {
		price=price*85/100;
		return price;
	}

	@Override
	public int monthlyRent(int price) {
		price=price*60/100;
		return price;
	}

	public int getVehicleSaleNo() {
		return vehicleSaleNo;
	}
	public void setVehicleSaleNo(int vehicleSaleNo) {
		this.vehicleSaleNo = vehicleSaleNo;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	public String getTransmission() {
		return transmission;
	}
	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
