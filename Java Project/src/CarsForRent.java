import java.util.ArrayList;
import java.util.Date;

public class CarsForRent extends VehicleForRent implements CarsFunction{

	private String safeType;
	private ArrayList<String> CarsBrands;
	
	public CarsForRent(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,
			String transmission, String fuel, String color,ArrayList<String> carBrands,String safeType) {
		super(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color);
		this.safeType=safeType;
		this.CarsBrands=carBrands;
	}

	@Override
	public void createCarBrand() {
		
	}

	@Override
	public void removeCarBrand(int BrandID) {
		
	}

	@Override
	public void modifyCarBrand(int BrandID) {
		
	}

	@Override
	public void listCarsBrands() {
		
	}

	public String getSafeType() {
		return safeType;
	}

	public void setSafeType(String safeType) {
		this.safeType = safeType;
	}

	public ArrayList<String> getCarsBrands() {
		return CarsBrands;
	}

	public void setCarsBrands(ArrayList<String> carsBrands) {
		CarsBrands = carsBrands;
	}

}
