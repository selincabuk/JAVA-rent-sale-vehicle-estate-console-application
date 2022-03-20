import java.util.Date;

public class HousingForRent extends ApartmentForRent{

	public HousingForRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,
			String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters,boolean furnished) {
		super(price, advertDate, location, floorNumber, numberOfRooms, heating, balcony, dues, apartmentRentNo, squareMeters);
		this.setFurnished(furnished);
	}
	private boolean furnished;
	public boolean isFurnished() {
		return furnished;
	}
	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}

}
