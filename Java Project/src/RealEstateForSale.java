import java.util.Date;

public class RealEstateForSale extends ForSale implements IsAvailableForSale{

	private int estateSaleNo;
	private int squareMeters; 
	
	public RealEstateForSale(int price, Date advertDate, String location,int estateSaleNo,int squareMeters) {
		super(price, advertDate, location);
		this.estateSaleNo=estateSaleNo;
		this.squareMeters=squareMeters;
	}

	public int getEstateSaleNo() {
		return estateSaleNo;
	}
	public void setEstateSaleNo(int estateSaleNo) {
		this.estateSaleNo = estateSaleNo;
	}

	public int getSquareMeters() {
		return squareMeters;
	}
	public void setSquareMeters(int squareMeters) {
		this.squareMeters = squareMeters;
	}
	
	@Override
	public boolean UnableForSale() {
		return false;
	}


}
