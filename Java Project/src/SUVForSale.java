import java.util.ArrayList;
import java.util.Date;

public class SUVForSale extends VehiclesForSale implements SUVsFunctions{

	private String tractionType;
	private ArrayList<String> SUVBrands;
	
	public SUVForSale(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,String tractionType, ArrayList<String> SUVBrands) {
		super(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color);
		this.SUVBrands=SUVBrands;
		//CarsBrands.addAll(CarsBrands); OLABÝLÝR
		this.tractionType=tractionType;
	}

	@Override
	public void createSUVBrand() {
		
	}

	@Override
	public void removeSUVBrand(int BrandID) {
		
	}

	@Override
	public void modifySUVBrand(int BrandID) {
		
	}

	@Override
	public void listSUVBrands() {
		
	}

	public String getTractionType() {
		return tractionType;
	}

	public void setTractionType(String tractionType) {
		this.tractionType = tractionType;
	}

	public ArrayList<String> getSUVBrands() {
		return SUVBrands;
	}

	public void setSUVBrands(ArrayList<String> sUVBrands) {
		SUVBrands = sUVBrands;
	}

}
