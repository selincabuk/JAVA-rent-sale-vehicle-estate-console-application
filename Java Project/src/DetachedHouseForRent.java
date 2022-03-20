import java.util.Date;

public class DetachedHouseForRent extends HousingForRent{

	public DetachedHouseForRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,
			String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters, boolean furnished) {
		super(price, advertDate, location, floorNumber, numberOfRooms, heating, balcony, dues, apartmentRentNo, squareMeters,
				furnished);
	}
}
