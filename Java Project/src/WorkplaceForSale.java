import java.util.Date;

public class WorkplaceForSale extends ApartmentForSale{

	private int maxquota;
	
	public WorkplaceForSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,
			int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues,int maxquota) {
		super(price, advertDate, location, estateSaleNo, squareMeters, floorNumber, numberOfRooms, heating, balcony, dues);
		this.maxquota=maxquota;
	}

	public int getMaxquota() {
		return maxquota;
	}
	public void setMaxquota(int maxquota) {
		this.maxquota = maxquota;
	}
	
	
}
