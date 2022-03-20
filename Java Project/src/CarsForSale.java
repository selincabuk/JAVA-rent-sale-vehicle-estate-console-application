import java.util.ArrayList;
import java.util.Date;

public class CarsForSale extends VehiclesForSale implements CarsFunction{

	private String safeType;
	private ArrayList<String> CarsBrands;
	
	public CarsForSale(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,ArrayList<String> CarsBrands,String safeType) {
		super(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color);
		this.CarsBrands=CarsBrands;
		//CarsBrands.addAll(CarsBrands); OLABÝLÝR
		this.safeType=safeType;
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
}
