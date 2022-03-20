import java.util.Date;

public class ForRent {
	private int price;
	private Date advertDate;
	private String location;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public Date getAdvertDate() {
		return advertDate;
	}
	public void setAdvertDate(Date advertDate) {
		this.advertDate = advertDate;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public ForRent(int price,Date advertDate2,String location) {//Void yapabiliriz.
		this.price=price;
		this.advertDate=advertDate2;
		this.location=location;
	}
	
	public boolean isAvailable() {//DÜZENLE
		
		return false;
	}

}
