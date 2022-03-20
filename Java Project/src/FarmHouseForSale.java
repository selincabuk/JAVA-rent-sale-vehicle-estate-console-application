import java.util.Date;

public class FarmHouseForSale extends HousingForSale{
	
	boolean haveBarn;

	public FarmHouseForSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,
			int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues, boolean furnished,
			boolean haveBarn) {
		super(price, advertDate, location, estateSaleNo, squareMeters, floorNumber, numberOfRooms, heating, balcony,
				dues, furnished);
		this.haveBarn = haveBarn;
	}
	

	

}
