import java.util.Date;

public class FarmHouseForRent extends HousingForRent{


	public FarmHouseForRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,
			String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters, boolean furnished,boolean haveBarn) {
		super(price, advertDate, location, floorNumber, numberOfRooms, heating, balcony, dues, apartmentRentNo, squareMeters,
				furnished);
		this.setHaveBarn(haveBarn);
	}
	private boolean haveBarn;

	public boolean isHaveBarn() {
		return haveBarn;
	}
	public void setHaveBarn(boolean haveBarn) {
		this.haveBarn = haveBarn;
	}

}
