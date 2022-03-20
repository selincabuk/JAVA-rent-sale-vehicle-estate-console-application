import java.util.Date;

public class VehiclesForSale extends ForSale implements IsAvailableForSale{

	private int vehicleSaleNo;
	private String model;
	private int year;
	private String transmission;
	private String fuel;
	private String color;
	
	
	public VehiclesForSale(int price, Date advertDate, String location,int vehicleSaleNo,String model,int year,String transmission,String fuel,String color) {
		super(price, advertDate, location);
		this.vehicleSaleNo=vehicleSaleNo;
		this.model=model;
		this.year=year;
		this.transmission=transmission;
		this.fuel=fuel;
		this.color=color;
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

	@Override
	public boolean UnableForSale() {

		return false;
	}
}
