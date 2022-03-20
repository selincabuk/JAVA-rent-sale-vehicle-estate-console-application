import java.util.Date;

public class DetachedHouseForSale extends HousingForSale{

	public DetachedHouseForSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,
			int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues, boolean furnished) {
		super(price, advertDate, location, estateSaleNo, squareMeters, floorNumber, numberOfRooms, heating, balcony, dues,
				furnished);
	}

}
