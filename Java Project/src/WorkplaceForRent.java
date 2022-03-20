import java.util.Date;

public class WorkplaceForRent extends ApartmentForRent{
	public WorkplaceForRent(int price, Date advertDate, String location, int floorNumber,int squareMeters,int apartmentRentNo, String numberOfRooms,
			String heating, boolean balcony, int dues, int maxquota) {
		super(price, advertDate, location, floorNumber, numberOfRooms, heating, balcony, dues, apartmentRentNo, squareMeters);
		this.setMaxquota(maxquota);	
	}
	private int maxquota;
	
	public int getMaxquota() {
		return maxquota;
	}
	public void setMaxquota(int maxquota) {
		this.maxquota = maxquota;
	}

}
