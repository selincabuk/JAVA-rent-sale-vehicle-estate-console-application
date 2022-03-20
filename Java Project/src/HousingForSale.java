import java.util.Date;

public class HousingForSale extends ApartmentForSale{

	private boolean furnished;
	
	public HousingForSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,
			int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues,boolean furnished) {
		super(price, advertDate, location, estateSaleNo, squareMeters, floorNumber, numberOfRooms, heating, balcony, dues);
		this.furnished=furnished;
	}

	public boolean getFurnished() {
		return furnished;
	}
	public void setFurnished(boolean furnished) {
		this.furnished = furnished;
	}

	
}
