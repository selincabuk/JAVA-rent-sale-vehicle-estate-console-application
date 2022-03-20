import java.util.Date;

public class ApartmentForRent extends ForRent implements RentPayment{

	private int floorNumber;
	private String numberOfRooms;
	private String heating;
	private boolean balcony;
	private int dues;
	private int apartmentRentNo;
	private int squareMeters;
	
	public ApartmentForRent(int price, Date advertDate, String location,int floorNumber,String numberOfRooms,String heating,boolean balcony,int dues,int apartmentRentNo,int squareMeters) {
		super(price, advertDate, location);
		this.setBalcony(balcony);
		this.setDues(dues);
		this.setFloorNumber(floorNumber);
		this.setHeating(heating);
		this.setNumberOfRooms(numberOfRooms);
		this.setApartmentRentNo(apartmentRentNo);
		this.setSquareMeters(squareMeters);
	}

	@Override
	public int dailyRent(int price) {
		return price;
	}

	@Override
	public int weeklyRent(int price) {
		price=price*90/100;
		return price;
	}

	@Override
	public int monthlyRent(int price) {
		price=price*70/100;
		return price;
	}

	public int getFloorNumber() {
		return floorNumber;
	}
	public void setFloorNumber(int floorNumber) {
		this.floorNumber = floorNumber;
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

	public boolean isBalcony() {
		return balcony;
	}
	public void setBalcony(boolean balcony) {
		this.balcony = balcony;
	}

	public int getDues() {
		return dues;
	}
	public void setDues(int dues) {
		this.dues = dues;
	}

	public int getApartmentRentNo() {
		return apartmentRentNo;
	}

	public void setApartmentRentNo(int apartmentRentNo) {
		this.apartmentRentNo = apartmentRentNo;
	}

	public int getSquareMeters() {
		return squareMeters;
	}

	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}

}
