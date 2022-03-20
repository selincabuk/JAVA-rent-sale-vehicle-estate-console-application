import java.util.ArrayList;
import java.util.Date;

public class VanForSale extends VehiclesForSale implements VansFunctions{

	private String vanType;
	private int bedCapacity;
	private ArrayList<String> VanBrands;
	
	public VanForSale(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,String vanType,int bedCapacity,ArrayList<String> VanBrands) {
		super(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color);
		this.VanBrands=VanBrands;
		//CarsBrands.addAll(CarsBrands); OLABÝLÝR
		this.vanType=vanType;
		this.bedCapacity=bedCapacity;
	}

	@Override
	public void createVanBrand() {
		
	}

	@Override
	public void removeVanBrand(int BrandID) {
		
	}

	@Override
	public void modifyVanBrand(int BrandID) {
		
	}

	@Override
	public void listVanBrands() {
		
	}

	public String getVanType() {
		return vanType;
	}

	public void setVanType(String vanType) {
		this.vanType = vanType;
	}

	public int getBedCapacity() {
		return bedCapacity;
	}

	public void setBedCapacity(int bedCapacity) {
		this.bedCapacity = bedCapacity;
	}

	public ArrayList<String> getVanBrands() {
		return VanBrands;
	}

	public void setVanBrands(ArrayList<String> vanBrands) {
		VanBrands = vanBrands;
	}

}
