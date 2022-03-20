import java.util.Date;

public class ApartmentForSale extends RealEstateForSale{

	private int floorNumber;
	private int dues;
	private String numberOfRooms; 
	private String heating;
	private boolean balcony;
	
	public ApartmentForSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,int floorNumber,String numberOfRooms,String heating,boolean balcony,int dues) {
		super(price, advertDate, location, estateSaleNo, squareMeters);
		this.floorNumber=floorNumber;
		this.numberOfRooms=numberOfRooms;
		this.heating=heating;
		this.balcony=balcony;
		this.dues=dues;
	}

	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
	}

	public int getDues() {
		return dues;
	}
	public void setDues(int dues) {
		this.dues = dues;
	}

	public String getNumberOfRooms() {
		return numberOfRooms;
	}
	public void setNumberOfRooms(String numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}

	public String getHeating() {
		return heating;
	}
	public void setHeating(String heating) {
		this.heating = heating;
	}

	public boolean getisBalcony() {
		return balcony;
	}
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

}
