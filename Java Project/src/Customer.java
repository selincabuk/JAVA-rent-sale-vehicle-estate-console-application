import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Customer {
	private String customerID;
	private String password;
	private String customerName;
	private String address;
	private String phone;
	private String email;
	
	public Customer(String customerID2,String password) {
		this.customerID=customerID2;
		this.password=password;
	}
	
	public Customer(String customerID,String password,String customerName,String address,String phone,String email) {
		this.address=address;
		this.customerID=customerID;
		this.customerName=customerName;
		this.email=email;
		this.password=password;
		this.phone=phone;
	}

	public void addAdvertDetachedhouseRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters, boolean furnished){
		DetachedHouseForRent[] DetachedhouseForRent= {};
		String filename="DetachedhousesForRent.txt";
		ArrayList<String> RentDetachedHouse = storage(filename);
		DetachedHouseForRent[] new_detachedhouses_rent = new DetachedHouseForRent[DetachedhouseForRent.length+1];
		
	    for (int i = 0; i < DetachedhouseForRent.length; i++) {
	    	new_detachedhouses_rent[i] = DetachedhouseForRent[i];
	    }

	    new_detachedhouses_rent[DetachedhouseForRent.length] = new DetachedHouseForRent(price,advertDate,location, floorNumber,numberOfRooms,heating,balcony, dues,apartmentRentNo,squareMeters,furnished);
	    DetachedhouseForRent = new_detachedhouses_rent;
	    RentDetachedHouse.add(DetachedhouseForRent[DetachedhouseForRent.length-1].getLocation()+ "-"+DetachedhouseForRent[DetachedhouseForRent.length-1].getPrice() + "-"+DetachedhouseForRent[DetachedhouseForRent.length-1].getSquareMeters() +  "-"+DetachedhouseForRent[DetachedhouseForRent.length-1].getFloorNumber() + "-"+DetachedhouseForRent[DetachedhouseForRent.length-1].getNumberOfRooms() +"-" + DetachedhouseForRent[DetachedhouseForRent.length-1].getDues() +"-"+DetachedhouseForRent[DetachedhouseForRent.length-1].getHeating()+"-"+DetachedhouseForRent[DetachedhouseForRent.length-1].isBalcony()+"-"+ DetachedhouseForRent[DetachedhouseForRent.length-1].isFurnished()+ "-" + DetachedhouseForRent[DetachedhouseForRent.length-1].getApartmentRentNo()+"-"+DetachedhouseForRent[DetachedhouseForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentDetachedHouse);
	 }
	public void addAdvertDetachedhouseSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues, boolean furnished){
		DetachedHouseForSale[] DetachedhouseForSale= {};
		String filename="DetachedhousesForSale.txt";
		ArrayList<String> SaleDetachedHouse = storage(filename);
		DetachedHouseForSale[] new_detachedhouses_sale = new DetachedHouseForSale[DetachedhouseForSale.length+1];
		
	    for (int i = 0; i < DetachedhouseForSale.length; i++) {
	    	new_detachedhouses_sale[i] = DetachedhouseForSale[i];
	    }

	    new_detachedhouses_sale[DetachedhouseForSale.length] = new DetachedHouseForSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished  );
	    DetachedhouseForSale = new_detachedhouses_sale;
	    SaleDetachedHouse.add(DetachedhouseForSale[DetachedhouseForSale.length-1].getLocation()+ "-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getPrice() + "-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getSquareMeters() +  "-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getFloorNumber() + "-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getNumberOfRooms() +"-" + DetachedhouseForSale[DetachedhouseForSale.length-1].getDues() +"-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getHeating()+"-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getisBalcony()+"-"+ DetachedhouseForSale[DetachedhouseForSale.length-1].getFurnished() + "-" + DetachedhouseForSale[DetachedhouseForSale.length-1].getEstateSaleNo() +"-"+DetachedhouseForSale[DetachedhouseForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleDetachedHouse);
	 }
	public void addAdvertVillaSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues, boolean furnished){
		VillaForSale[] VillaForSale= {};
		String filename="VillasForSale.txt";
		ArrayList<String> SaleVilla = storage(filename);
		VillaForSale[] new_villas_sale = new VillaForSale[VillaForSale.length+1];
		
	    for (int i = 0; i < VillaForSale.length; i++) {
	    	new_villas_sale[i] = VillaForSale[i];
	    }

	    new_villas_sale[VillaForSale.length] = new VillaForSale(price,advertDate,location,estateSaleNo,squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished);
	    VillaForSale = new_villas_sale;
	    SaleVilla.add(VillaForSale[VillaForSale.length-1].getLocation()+ "-"+VillaForSale[VillaForSale.length-1].getPrice() + "-"+VillaForSale[VillaForSale.length-1].getSquareMeters() +  "-"+VillaForSale[VillaForSale.length-1].getFloorNumber() + "-"+VillaForSale[VillaForSale.length-1].getNumberOfRooms() +"-" + VillaForSale[VillaForSale.length-1].getDues() +"-"+VillaForSale[VillaForSale.length-1].getHeating()+"-"+VillaForSale[VillaForSale.length-1].getisBalcony()+"-"+ VillaForSale[VillaForSale.length-1].getFurnished() + "-" + VillaForSale[VillaForSale.length-1].getEstateSaleNo() +"-"+VillaForSale[VillaForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleVilla);
	 }
	public void addAdvertVillaRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters, boolean furnished){
		VillaForRent[] VillaForRent= {};
		String filename="VillasForRent.txt";
		ArrayList<String> RentVilla = storage(filename);
		VillaForRent[] new_villas_rent = new VillaForRent[VillaForRent.length+1];
		
	    for (int i = 0; i < VillaForRent.length; i++) {
	    	new_villas_rent[i] = VillaForRent[i];
	    }

	    new_villas_rent[VillaForRent.length] = new VillaForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters,furnished  );
	    VillaForRent = new_villas_rent;
	    RentVilla.add(VillaForRent[VillaForRent.length-1].getLocation()+ "-"+VillaForRent[VillaForRent.length-1].getPrice() + "-"+VillaForRent[VillaForRent.length-1].getSquareMeters() +  "-"+VillaForRent[VillaForRent.length-1].getFloorNumber() + "-"+VillaForRent[VillaForRent.length-1].getNumberOfRooms() +"-" + VillaForRent[VillaForRent.length-1].getDues() +"-"+VillaForRent[VillaForRent.length-1].getHeating()+"-"+VillaForRent[VillaForRent.length-1].isBalcony()+"-"+ VillaForRent[VillaForRent.length-1].isFurnished() + "-" + VillaForRent[VillaForRent.length-1].getApartmentRentNo() +"-"+VillaForRent[VillaForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentVilla);
	 }
	public void addAdvertWorkplaceRent(int price, Date advertDate, String location, int floorNumber,int squareMeters,int estateSaleNo, String numberOfRooms,String heating, boolean balcony, int dues, int maxquota){
		WorkplaceForRent[] WorkplaceForRent= {};
		String filename="WorkplacesForRent.txt";
		ArrayList<String> RentWorkplace = storage(filename);
		WorkplaceForRent[] new_workplaces_rent = new WorkplaceForRent[WorkplaceForRent.length+1];
		
	    for (int i = 0; i < WorkplaceForRent.length; i++) {
	    	new_workplaces_rent[i] = WorkplaceForRent[i];
	    }

	    new_workplaces_rent[WorkplaceForRent.length] = new WorkplaceForRent(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,maxquota );
	    WorkplaceForRent = new_workplaces_rent;
	    RentWorkplace.add(WorkplaceForRent[WorkplaceForRent.length-1].getLocation()+ "-"+WorkplaceForRent[WorkplaceForRent.length-1].getSquareMeters() + "-"+WorkplaceForRent[WorkplaceForRent.length-1].getPrice()+  "-" + WorkplaceForRent[WorkplaceForRent.length-1].getDues()  + "-" + WorkplaceForRent[WorkplaceForRent.length-1].getMaxquota() +  "-"+WorkplaceForRent[WorkplaceForRent.length-1].getFloorNumber()+"-"+WorkplaceForRent[WorkplaceForRent.length-1].getNumberOfRooms() +"-"+WorkplaceForRent[WorkplaceForRent.length-1].getHeating()+"-"+WorkplaceForRent[WorkplaceForRent.length-1].isBalcony()+"-"+WorkplaceForRent[WorkplaceForRent.length-1].getApartmentRentNo() +"-"+WorkplaceForRent[WorkplaceForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentWorkplace);
	 }	
	
	public void addAdvertWorkplaceSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues,int maxquota){
		WorkplaceForSale[] WorkplaceForSale= {};
		String filename="WorkplacesForSale.txt";
		ArrayList<String> SaleWorkplace = storage(filename);
		WorkplaceForSale[] new_workplaces_sale = new WorkplaceForSale[WorkplaceForSale.length+1];
		
	    for (int i = 0; i < WorkplaceForSale.length; i++) {
	    	new_workplaces_sale[i] = WorkplaceForSale[i];
	    }

	    new_workplaces_sale[WorkplaceForSale.length] = new WorkplaceForSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,maxquota );
	    WorkplaceForSale = new_workplaces_sale;
	    SaleWorkplace.add(WorkplaceForSale[WorkplaceForSale.length-1].getLocation()+ "-"+WorkplaceForSale[WorkplaceForSale.length-1].getSquareMeters() + "-"+WorkplaceForSale[WorkplaceForSale.length-1].getPrice()+  "-" + WorkplaceForSale[WorkplaceForSale.length-1].getDues()  + "-" + WorkplaceForSale[WorkplaceForSale.length-1].getMaxquota() +  "-"+WorkplaceForSale[WorkplaceForSale.length-1].getFloorNumber()+"-"+WorkplaceForSale[WorkplaceForSale.length-1].getNumberOfRooms() +"-"+WorkplaceForSale[WorkplaceForSale.length-1].getHeating()+"-"+WorkplaceForSale[WorkplaceForSale.length-1].getisBalcony()+"-"+WorkplaceForSale[WorkplaceForSale.length-1].getEstateSaleNo() +"-"+WorkplaceForSale[WorkplaceForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleWorkplace);
	 }
	public void addAdvertFarmHouseRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters, boolean furnished,boolean haveBarn){
		FarmHouseForRent[] farmhouseForRent= {};
		String filename="FarmhousesForRent.txt";
		ArrayList<String> RentFarmhouse = storage(filename);
		FarmHouseForRent[] new_farmhouses_rent= new FarmHouseForRent[farmhouseForRent.length+1];
		
	    for (int i = 0; i < farmhouseForRent.length; i++) {
	    	new_farmhouses_rent[i] = farmhouseForRent[i];
	    }

	    new_farmhouses_rent[farmhouseForRent.length] = new FarmHouseForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters,furnished,haveBarn );
	    farmhouseForRent = new_farmhouses_rent;
	    RentFarmhouse.add(farmhouseForRent[farmhouseForRent.length-1].getLocation()+"-"+farmhouseForRent[farmhouseForRent.length-1].getPrice()+"-"+farmhouseForRent[farmhouseForRent.length-1].getSquareMeters()+"-"+farmhouseForRent[farmhouseForRent.length-1].getFloorNumber()+"-"+farmhouseForRent[farmhouseForRent.length-1].getNumberOfRooms() + "-" + farmhouseForRent[farmhouseForRent.length-1].getDues()+"-"+farmhouseForRent[farmhouseForRent.length-1].getHeating()+"-"+farmhouseForRent[farmhouseForRent.length-1].isBalcony()+"-"+farmhouseForRent[farmhouseForRent.length-1].isFurnished()+"-"+farmhouseForRent[farmhouseForRent.length-1].isHaveBarn() +farmhouseForRent[farmhouseForRent.length-1].getApartmentRentNo()+"-"+farmhouseForRent[farmhouseForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentFarmhouse);
	 }
	public void addAdvertFarmHouseSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues, boolean furnished,boolean haveBarn){
		FarmHouseForSale[] farmhouseForSale= {};
		String filename="FarmhousesForSale.txt";
		ArrayList<String> SaleFarmhouse = storage(filename);
		FarmHouseForSale[] new_farmhouses_sale = new FarmHouseForSale[farmhouseForSale.length+1];
		
	    for (int i = 0; i < farmhouseForSale.length; i++) {
	    	new_farmhouses_sale[i] = farmhouseForSale[i];
	    }

	    new_farmhouses_sale[farmhouseForSale.length] = new FarmHouseForSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished, haveBarn  );
	    farmhouseForSale = new_farmhouses_sale;
	    SaleFarmhouse.add(farmhouseForSale[farmhouseForSale.length-1].getLocation()+"-"+farmhouseForSale[farmhouseForSale.length-1].getPrice()+"-"+farmhouseForSale[farmhouseForSale.length-1].getSquareMeters()+"-"+farmhouseForSale[farmhouseForSale.length-1].getFloorNumber()+"-"+farmhouseForSale[farmhouseForSale.length-1].getNumberOfRooms() + "-" + farmhouseForSale[farmhouseForSale.length-1].getDues()+"-"+farmhouseForSale[farmhouseForSale.length-1].getHeating()+"-"+farmhouseForSale[farmhouseForSale.length-1].getisBalcony()+"-"+farmhouseForSale[farmhouseForSale.length-1].getFurnished()+"-"+farmhouseForSale[farmhouseForSale.length-1].getEstateSaleNo() +"-"+farmhouseForSale[farmhouseForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleFarmhouse);
	 }
	public void addAdvertMansionRent(int price, Date advertDate, String location, int floorNumber, String numberOfRooms,String heating, boolean balcony, int dues, int apartmentRentNo, int squareMeters, boolean furnished){
		MansionForRent[] mansionForRent= {};
		String filename="MansionsForRent.txt";
		ArrayList<String> RentMansion = storage(filename);
		MansionForRent[] new_mansions_rent = new MansionForRent[mansionForRent.length+1];
		
	    for (int i = 0; i < mansionForRent.length; i++) {
	    	new_mansions_rent[i] = mansionForRent[i];
	    }

	    new_mansions_rent[mansionForRent.length] = new MansionForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters,furnished);
	    mansionForRent = new_mansions_rent;
	    RentMansion.add(mansionForRent[mansionForRent.length-1].getLocation()+"-"+mansionForRent[mansionForRent.length-1].getPrice()+"-"+mansionForRent[mansionForRent.length-1].getSquareMeters()+"-"+mansionForRent[mansionForRent.length-1].getFloorNumber()+"-"+mansionForRent[mansionForRent.length-1].getNumberOfRooms() + "-" + mansionForRent[mansionForRent.length-1].getDues()+"-"+mansionForRent[mansionForRent.length-1].getHeating()+"-"+mansionForRent[mansionForRent.length-1].isBalcony()+"-"+mansionForRent[mansionForRent.length-1].isFurnished()+"-"+mansionForRent[mansionForRent.length-1].getApartmentRentNo() +"-"+mansionForRent[mansionForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentMansion);
	 }
	
	public void addAdvertMansionSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters,int floorNumber, String numberOfRooms, String heating, boolean balcony, int dues, boolean furnished){
		MansionForSale[] mansionForSale= {};
		String filename="MansionsForSale.txt";
		ArrayList<String> SaleMansion = storage(filename);
		MansionForSale[] new_mansions_sale = new MansionForSale[mansionForSale.length+1];
		
	    for (int i = 0; i < mansionForSale.length; i++) {
	    	new_mansions_sale[i] = mansionForSale[i];
	    }

	    new_mansions_sale[mansionForSale.length] = new MansionForSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished );
	    mansionForSale = new_mansions_sale;
	    SaleMansion.add(mansionForSale[mansionForSale.length-1].getLocation()+"-"+mansionForSale[mansionForSale.length-1].getPrice()+"-"+mansionForSale[mansionForSale.length-1].getSquareMeters()+"-"+mansionForSale[mansionForSale.length-1].getFloorNumber()+"-"+mansionForSale[mansionForSale.length-1].getNumberOfRooms() + "-" + mansionForSale[mansionForSale.length-1].getDues()+"-"+mansionForSale[mansionForSale.length-1].getHeating()+"-"+mansionForSale[mansionForSale.length-1].getisBalcony()+"-"+mansionForSale[mansionForSale.length-1].getFurnished()+"-"+mansionForSale[mansionForSale.length-1].getEstateSaleNo() +"-"+mansionForSale[mansionForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleMansion);
	 }
	public void addAdvertTerrainSale(int price, Date advertDate, String location, int estateSaleNo, int squareMeters){
		TerrainForSale[] terrainForSale= {};
		String filename="TerrainsForSale.txt";
		ArrayList<String> SaleTerrain = storage(filename);
		TerrainForSale[] new_terrains_sale = new TerrainForSale[terrainForSale.length+1];
		
	    for (int i = 0; i < terrainForSale.length; i++) {
	    	new_terrains_sale[i] = terrainForSale[i];
	    }

	    new_terrains_sale[terrainForSale.length] = new TerrainForSale(price, advertDate, location, estateSaleNo, squareMeters  );
	    terrainForSale = new_terrains_sale;
	    SaleTerrain.add(terrainForSale[terrainForSale.length-1].getLocation()+"-"+terrainForSale[terrainForSale.length-1].getPrice()+"-"+terrainForSale[terrainForSale.length-1].getSquareMeters()+"-"+terrainForSale[terrainForSale.length-1].getEstateSaleNo()+"-"+terrainForSale[terrainForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleTerrain);
	 }
	
	public void addAdvertSUVSale(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,String tractionType, ArrayList<String> SUVBrands){
		SUVForSale[] SUVForSale= {};
		String filename="SUVsForSale.txt";
		ArrayList<String> SaleSuv = storage(filename);
		SUVForSale[] new_suvs_sale = new SUVForSale[SUVForSale.length+1];
		
	    for (int i = 0; i < SUVForSale.length; i++) {
	    	new_suvs_sale[i] = SUVForSale[i];
	    }

	    new_suvs_sale[SUVForSale.length] = new SUVForSale(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color, tractionType, SUVBrands );
	    SUVForSale = new_suvs_sale;
	    SaleSuv.add(SUVForSale[SUVForSale.length-1].getSUVBrands().get(0)+"-"+SUVForSale[SUVForSale.length-1].getModel()+"-"+SUVForSale[SUVForSale.length-1].getPrice()+"-"+SUVForSale[SUVForSale.length-1].getYear()+"-"+SUVForSale[SUVForSale.length-1].getLocation()+"-"+SUVForSale[SUVForSale.length-1].getTransmission()+"-"+SUVForSale[SUVForSale.length-1].getFuel()+"-"+SUVForSale[SUVForSale.length-1].getColor()+"-"+SUVForSale[SUVForSale.length-1].getTractionType()+"-"+SUVForSale[SUVForSale.length-1].getVehicleSaleNo()+"-"+SUVForSale[SUVForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleSuv);
	 }
	
	public void addAdvertSUVRent(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,String tractionType, ArrayList<String> SUVBrands){
		SUVForRent[] SUVForRent= {};
		String filename="SUVsForRent.txt";
		ArrayList<String> RentSuv = storage(filename);
		SUVForRent[] new_suvs_rent = new SUVForRent[SUVForRent.length+1];
		
	    for (int i = 0; i < SUVForRent.length; i++) {
	    	new_suvs_rent[i] = SUVForRent[i];
	    }

	    new_suvs_rent[SUVForRent.length] = new SUVForRent(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color, tractionType, SUVBrands );
	    SUVForRent = new_suvs_rent;
	    RentSuv.add(SUVForRent[SUVForRent.length-1].getSUVBrands().get(0)+"-"+SUVForRent[SUVForRent.length-1].getModel()+"-"+SUVForRent[SUVForRent.length-1].getPrice()+"-"+SUVForRent[SUVForRent.length-1].getYear()+"-"+SUVForRent[SUVForRent.length-1].getLocation()+"-"+SUVForRent[SUVForRent.length-1].getTransmission()+"-"+SUVForRent[SUVForRent.length-1].getFuel()+"-"+SUVForRent[SUVForRent.length-1].getColor()+"-"+SUVForRent[SUVForRent.length-1].getTractionType()+"-"+SUVForRent[SUVForRent.length-1].getVehicleSaleNo()+"-"+SUVForRent[SUVForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentSuv);
	 }

	public void addAdvertCarSale(ArrayList<String> carBrands, String model, int price,int year,String location,String transmission,String fuel,String color,String safeType,int vehicleSaleNo,Date advertDate){
		CarsForSale[] carsForSale= {};
		String filename="CarsForSale.txt";
		ArrayList<String> SaleCar = storage(filename);
		CarsForSale[] new_cars_sale = new CarsForSale[carsForSale.length+1];
		
	    for (int i = 0; i < carsForSale.length; i++) {
	    	new_cars_sale[i] = carsForSale[i];
	    }

	    new_cars_sale[carsForSale.length] = new CarsForSale(price,advertDate,location,vehicleSaleNo,model,year,transmission,fuel, color,carBrands,safeType);
	    carsForSale = new_cars_sale;
	    SaleCar.add(carsForSale[carsForSale.length-1].getCarsBrands().get(0)+"-"+carsForSale[carsForSale.length-1].getModel()+"-"+carsForSale[carsForSale.length-1].getPrice()+"-"+carsForSale[carsForSale.length-1].getYear()+"-"+carsForSale[carsForSale.length-1].getLocation()+"-"+carsForSale[carsForSale.length-1].getTransmission()+"-"+carsForSale[carsForSale.length-1].getFuel()+"-"+carsForSale[carsForSale.length-1].getColor()+"-"+carsForSale[carsForSale.length-1].getSafeType()+"-"+carsForSale[carsForSale.length-1].getVehicleSaleNo()+"-"+carsForSale[carsForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleCar);
	 }
	
	public void addAdvertCarRent(ArrayList<String> carBrands, String model, int price,int year,String location,String transmission,String fuel,String color,String safeType,int vehicleSaleNo,Date advertDate){
		CarsForRent[] carsForRent= {};
		String filename="CarsForRent.txt";
		ArrayList<String> RentCar = storage(filename);
		CarsForRent[] new_cars_rent = new CarsForRent[carsForRent.length+1];
		
	    for (int i = 0; i < carsForRent.length; i++) {
	    	new_cars_rent[i] = carsForRent[i];
	    }

	    new_cars_rent[carsForRent.length] = new CarsForRent(price,advertDate,location,vehicleSaleNo,model,year,transmission,fuel, color,carBrands,safeType);
	    carsForRent = new_cars_rent;
	    RentCar.add(carsForRent[carsForRent.length-1].getCarsBrands().get(0)+"-"+carsForRent[carsForRent.length-1].getModel()+"-"+carsForRent[carsForRent.length-1].getPrice()+"-"+carsForRent[carsForRent.length-1].getYear()+"-"+carsForRent[carsForRent.length-1].getLocation()+"-"+carsForRent[carsForRent.length-1].getTransmission()+"-"+carsForRent[carsForRent.length-1].getFuel()+"-"+carsForRent[carsForRent.length-1].getColor()+"-"+carsForRent[carsForRent.length-1].getSafeType()+"-"+carsForRent[carsForRent.length-1].getVehicleSaleNo()+"-"+carsForRent[carsForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentCar);
	 }
	
	public void addAdvertSaleVan(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,String vanType,int bedCapacity,ArrayList<String> VanBrands){
		VanForSale[] vanForSale= {};
		String filename="VansForSale.txt";
		ArrayList<String> SaleVan = storage(filename);
		VanForSale[] new_vans_sale = new VanForSale[vanForSale.length+1];
		
	    for (int i = 0; i < vanForSale.length; i++) {
	    	new_vans_sale[i] = vanForSale[i];
	    }

	    new_vans_sale[vanForSale.length] = new VanForSale(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, vanType, color, bedCapacity,VanBrands);
	    vanForSale = new_vans_sale;
	    SaleVan.add(vanForSale[vanForSale.length-1].getVanBrands().get(0)+"-"+vanForSale[vanForSale.length-1].getModel()+"-"+vanForSale[vanForSale.length-1].getPrice()+"-"+vanForSale[vanForSale.length-1].getYear()+"-"+vanForSale[vanForSale.length-1].getLocation()+"-"+vanForSale[vanForSale.length-1].getTransmission()+"-"+vanForSale[vanForSale.length-1].getFuel()+"-"+vanForSale[vanForSale.length-1].getColor()+"-"+vanForSale[vanForSale.length-1].getVanType()+"-"+vanForSale[vanForSale.length-1].getBedCapacity()+"-"+vanForSale[vanForSale.length-1].getVehicleSaleNo()+"-"+vanForSale[vanForSale.length-1].getAdvertDate());
	    write_to_file(filename, SaleVan);
	 }
	
	public void addAdvertRentVan(int price, Date advertDate, String location, int vehicleSaleNo, String model, int year,String transmission, String fuel, String color,String vanType,int bedCapacity,ArrayList<String> VanBrands){
		VanForRent[] vanForRent= {};
		String filename="VansForRent.txt";
		ArrayList<String> RentVan = storage(filename);
		VanForRent[] new_vans_rent = new VanForRent[vanForRent.length+1];
		
	    for (int i = 0; i < vanForRent.length; i++) {
	    	new_vans_rent[i] = vanForRent[i];
	    }

	    new_vans_rent[vanForRent.length] = new VanForRent(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, vanType, color, bedCapacity,VanBrands);
	    vanForRent = new_vans_rent;
	    RentVan.add(vanForRent[vanForRent.length-1].getVanBrands().get(0)+"-"+vanForRent[vanForRent.length-1].getModel()+"-"+vanForRent[vanForRent.length-1].getPrice()+"-"+vanForRent[vanForRent.length-1].getYear()+"-"+vanForRent[vanForRent.length-1].getLocation()+"-"+vanForRent[vanForRent.length-1].getTransmission()+"-"+vanForRent[vanForRent.length-1].getFuel()+"-"+vanForRent[vanForRent.length-1].getColor()+"-"+vanForRent[vanForRent.length-1].getVanType()+"-"+vanForRent[vanForRent.length-1].getBedCapacity()+"-"+vanForRent[vanForRent.length-1].getVehicleSaleNo()+"-"+vanForRent[vanForRent.length-1].getAdvertDate());
	    write_to_file(filename, RentVan);
	 }
	
	private static ArrayList<String> storage(String name_of_file) {
		ArrayList<String> alldata = new ArrayList<>();
		String data;
		
		try {
			Scanner input = new Scanner(new File(name_of_file));
			while (input.hasNext()) {
				data=input.nextLine();
				alldata.add(data);
			}
			return alldata;
		}
		catch(IOException e) {
			
		}
		return null;
	}
	
	private static void write_to_file(String name, ArrayList<String> data) {
		try {
			FileWriter f = new FileWriter(new File(name));
			BufferedWriter w = new BufferedWriter(f);
			for ( String x : data) {
				w.write(x + "\r\n");
			}
			w.close();
		}
		catch(IOException e) {
			System.out.printf("error : %s" , e);
		}
	}
	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public static void signUp() {
		ArrayList<String> customers = storage("Customers.txt");
		Scanner input = new Scanner(System.in);
		String customerName, address , phone , email,password ;
		System.out.println("Please enter your name");
		customerName=input.nextLine();
		System.out.println("Please enter your address");
		address=input.nextLine();
		System.out.println("Please enter your phone");
		phone=input.nextLine();
		System.out.println("Please enter your email");
		email=input.nextLine();
		System.out.println("Please enter your password");
		password=input.nextLine();
		customers.add(customerName + "-" + address + "-" + phone + "-" + email + "-" + password);
		write_to_file("Customers.txt", customers);
	}
	public static void view(String customerID,String password) {
		File f = new File("Customers.txt");
		try
		{
			Scanner input = new Scanner(f);
			String data;
			String [] subdata;
			StringBuilder view = new StringBuilder();
			while(input.hasNext())
			{
				data=input.nextLine();
				subdata=data.split("-");
				if(subdata [4].equals(customerID)&&subdata [0].equals(password))
				{
					 view.append("Customer ID : " + subdata[0]+ "\n" + "Address : " + subdata[1]+ "\n" + "Phone : "+ subdata[2]+ "\n" + "E-Mail : " + subdata[3]+ "\n" +"Password : ******* \n" );		
				}	
			}
		System.out.println(view);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();			
		}		
	}
	public static void edit(String customerID,String password) {
		ArrayList<String> customers = storage("Customers.txt");
		Scanner input = new Scanner(System.in);
		String customerName, address , phone , email;
		int pswrd;
		String [] subusers ;
		System.out.println("Please enter a new ID");
		customerName=input.nextLine();
		System.out.println("Please enter a new address");
		address=input.nextLine();
		System.out.println("Please enter a new phone");
		phone=input.nextLine();
		System.out.println("Please enter a new email");
		email=input.nextLine();
		System.out.println("Please enter a new password");
		pswrd=input.nextInt();
		
		for(int i = 0;i< customers.size(); i++) {
			subusers=customers.get(i).split("-");
			if(subusers[4].equals(customerID)&&subusers[0].equals(password)) {
				customers.set(i,customerName + "-" + address + "-" + phone + "-" + email + "-" + pswrd);
				write_to_file("Customers.txt", customers);
			}
		}
	}
	public static void delete(String customerID,String password) {
		ArrayList<String> customers = storage("Customers.txt");
		String [] subdatauser;
		
		for (int i = 0; i < customers.size(); i++) {
			subdatauser=customers.get(i).split("-");
			if(subdatauser[4].equals(customerID)&&subdatauser[0].equals(password)) {
				customers.remove(i); 
				write_to_file("Customers.txt", customers);
			}
		}
	}
	public static void deleteAdvert() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("1-Vehicles\n2-Real Estates");
		String choose=scanner.next();
		switch(Integer.parseInt(choose)) {
		case 1:
			viewAllAdvertAdmin();
			ArrayList<String> carsSale = storage("CarsForSale.txt");
			ArrayList<String> carsRent = storage("CarsForRent.txt");
			ArrayList<String> SUVsSale = storage("SUVsForSale.txt");
			ArrayList<String> SUVsRent = storage("SUVsForRent.txt");
			ArrayList<String> VansSale = storage("VansForSale.txt");
			ArrayList<String> VansRent = storage("VansForRent.txt");
			Scanner input = new Scanner(System.in);
			viewAllAdvertAdmin();
			System.out.println("Type the brand of the car you want to delete:");
			String carBrand=input.nextLine();
			System.out.println("Type the model of the car you want to delete:");
			String carModel=input.nextLine();
			System.out.println("Type the price of the car you want to delete");
			int carPrice=input.nextInt();
			String [] subdatacars;
			for (int i = 0; i < carsSale.size(); i++) {
				subdatacars=carsSale.get(i).split("-");
				if(subdatacars[0].equals(carBrand)&&subdatacars[1].equals(carModel)&&subdatacars[2].equals(Integer.toString(carPrice))) {
					carsSale.remove(i); 
					write_to_file("CarsForSale.txt", carsSale);
				}
			}
			for (int i = 0; i < carsRent.size(); i++) {
				subdatacars=carsRent.get(i).split("-");
				if(subdatacars[0].equals(carBrand)&&subdatacars[1].equals(carModel)&&subdatacars[2].equals(Integer.toString(carPrice))) {
					carsRent.remove(i); 
					write_to_file("CarsForRent.txt", carsRent);
				}
			}
			for (int i = 0; i < SUVsSale.size(); i++) {
				subdatacars=SUVsSale.get(i).split("-");
				if(subdatacars[0].equals(carBrand)&&subdatacars[1].equals(carModel)&&subdatacars[2].equals(Integer.toString(carPrice))) {
					SUVsSale.remove(i); 
					write_to_file("SUVsForSale.txt", SUVsSale);
				}
			}
			for (int i = 0; i < SUVsRent.size(); i++) {
				subdatacars=SUVsRent.get(i).split("-");
				if(subdatacars[0].equals(carBrand)&&subdatacars[1].equals(carModel)&&subdatacars[2].equals(Integer.toString(carPrice))) {
					SUVsRent.remove(i); 
					write_to_file("SUVsForRent.txt", SUVsRent);
				}
			}
			for (int i = 0; i < VansSale.size(); i++) {
				subdatacars=VansSale.get(i).split("-");
				if(subdatacars[0].equals(carBrand)&&subdatacars[1].equals(carModel)&&subdatacars[2].equals(Integer.toString(carPrice))) {
					VansSale.remove(i); 
					write_to_file("VansForSale.txt", VansSale);
				}
			}
			for (int i = 0; i < VansRent.size(); i++) {
				subdatacars=VansRent.get(i).split("-");
				if(subdatacars[0].equals(carBrand)&&subdatacars[1].equals(carModel)&&subdatacars[2].equals(Integer.toString(carPrice))) {
					VansRent.remove(i); 
					write_to_file("VansForRent.txt", VansRent);
				}
			}
			break;
		case 2:
			viewAllAdvertAdmin2();
			ArrayList<String> DetachedhousesSale = storage("DetachedhousesForSale.txt");
			ArrayList<String> DetachedhousesRent = storage("DetachedhousesForRent.txt");
			ArrayList<String> FarmhousesSale = storage("FarmhousesForSale.txt");
			ArrayList<String> FarmhousesRent = storage("FarmhousesForRent.txt");
			ArrayList<String> MansionsSale = storage("MansionsForSale.txt");
			ArrayList<String> MansionsRent = storage("MansionsForRent.txt");
			ArrayList<String> TerrainsSale = storage("TerrainsForSale.txt");
			ArrayList<String> VillasSale = storage("VillasForSale.txt");
			ArrayList<String> VillasRent = storage("VillasForRent.txt");
			ArrayList<String> WorkplacesSale = storage("WorkplacesForSale.txt");
			ArrayList<String> WorkplacesRent = storage("WorkplacesForRent.txt");
			Scanner input2 = new Scanner(System.in);
			System.out.println("Type the location of the estate you want to delete:");
			String estateLocation=input2.nextLine();
			System.out.println("Type the price of the estate you want to delete:");
			int estatePrice=input2.nextInt();
			System.out.println("Type the square meters of the estate you want to delete");
			int estateSquareMeters=input2.nextInt();
			String [] subdataestates;
			for (int i = 0; i < DetachedhousesSale.size(); i++) {
				subdataestates=DetachedhousesSale.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					DetachedhousesSale.remove(i); 
					write_to_file("DetachedhousesForSale.txt", DetachedhousesSale);
				}
			}
			for (int i = 0; i < DetachedhousesRent.size(); i++) {
				subdataestates=DetachedhousesRent.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					DetachedhousesRent.remove(i); 
					write_to_file("DetachedhousesForRent.txt", DetachedhousesRent);
				}
			}
			for (int i = 0; i < FarmhousesSale.size(); i++) {
				subdataestates=FarmhousesSale.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					FarmhousesSale.remove(i); 
					write_to_file("FarmhousesForSale.txt", FarmhousesSale);
				}
			}
			for (int i = 0; i < FarmhousesRent.size(); i++) {
				subdataestates=FarmhousesRent.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					FarmhousesRent.remove(i); 
					write_to_file("FarmhousesForRent.txt", FarmhousesRent);
				}
			}
			for (int i = 0; i < MansionsSale.size(); i++) {
				subdataestates=MansionsSale.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					MansionsSale.remove(i); 
					write_to_file("MansionsForSale.txt", MansionsSale);
				}
			}
			for (int i = 0; i < MansionsRent.size(); i++) {
				subdataestates=MansionsRent.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					MansionsRent.remove(i); 
					write_to_file("MansionsForRent.txt", MansionsRent);
				}
			}
			for (int i = 0; i < TerrainsSale.size(); i++) {
				subdataestates=TerrainsSale.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					TerrainsSale.remove(i); 
					write_to_file("TerrainsForSale.txt", TerrainsSale);
				}
			}
			for (int i = 0; i < VillasSale.size(); i++) {
				subdataestates=VillasSale.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					VillasSale.remove(i); 
					write_to_file("VillasForSale.txt", VillasSale);
				}
			}
			for (int i = 0; i < VillasRent.size(); i++) {
				subdataestates=VillasRent.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[1].equals(Integer.toString(estatePrice))&&subdataestates[2].equals(Integer.toString(estateSquareMeters))) {
					VillasRent.remove(i); 
					write_to_file("VillasForRent.txt", VillasRent);
				}
			}
			for (int i = 0; i < WorkplacesSale.size(); i++) {
				subdataestates=WorkplacesSale.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[2].equals(Integer.toString(estatePrice))&&subdataestates[1].equals(Integer.toString(estateSquareMeters))) {
					WorkplacesSale.remove(i); 
					write_to_file("WorkplacesForSale.txt", WorkplacesSale);
				}
			}
			for (int i = 0; i < WorkplacesRent.size(); i++) {
				subdataestates=WorkplacesRent.get(i).split("-");
				if(subdataestates[0].equals(estateLocation)&&subdataestates[2].equals(Integer.toString(estatePrice))&&subdataestates[1].equals(Integer.toString(estateSquareMeters))) {
					WorkplacesRent.remove(i); 
					write_to_file("WorkplacesForRent.txt", WorkplacesRent);
				}
			}
			break;
		default:
			System.out.println("Invalid key!!!");
			deleteAdvert();
			break;
		}
	}
	
	public static void viewAllAdvertAdmin() {
		String data;
		String [] subdata;
		StringBuilder view = new StringBuilder();
		StringBuilder view2 = new StringBuilder();
		System.out.println("VEHICLES: ");
		try {
			File carsforsale = new File("CarsForSale.txt");
			File carsforrent = new File("CarsForRent.txt");
			Scanner input = new Scanner(carsforsale);
			Scanner input2 = new Scanner(carsforrent);
			while(input.hasNext())
			{
				data=input.nextLine();
				subdata=data.split("-");
				view.append("For Sale\t\tCar\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			while(input2.hasNext())
			{
				data=input2.nextLine();
				subdata=data.split("-");
				view.append("For Rent\t\tCar\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			File suvsforsale = new File("SUVsForSale.txt");
			File suvsforrent = new File("SUVsForRent.txt");
			Scanner input3 = new Scanner(suvsforsale);
			Scanner input4 = new Scanner(suvsforrent);
			while(input3.hasNext())
			{
				data=input3.nextLine();
				subdata=data.split("-");
				view.append("For Sale\t\tSUV\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			while(input4.hasNext())
			{
				data=input4.nextLine();
				subdata=data.split("-");
				view.append("For Rent\t\tSUV\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			File vansforsale = new File("VansForSale.txt");
			File vansforrent = new File("VansForRent.txt");
			Scanner input5 = new Scanner(vansforsale);
			Scanner input6 = new Scanner(vansforrent);
			while(input5.hasNext())
			{
				data=input5.nextLine();
				subdata=data.split("-");
				view.append("For Sale\t\tVan\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+ subdata[11]+"\n");
			}
			while(input6.hasNext())
			{
				data=input6.nextLine();
				subdata=data.split("-");
				view.append("For Rent\t\tVan\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+ subdata[11]+"\n");
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}	
		System.out.println(view);
	}
	
	public static void viewAllAdvertAdmin2() {
		String data;
		String [] subdata;
		StringBuilder view2 = new StringBuilder();
		System.out.println("REAL ESTATES: ");
		try {
			File terrainsforsale = new File("TerrainsForSale.txt");
			Scanner input = new Scanner(terrainsforsale);
			while(input.hasNext())
			{
				data=input.nextLine();
				subdata=data.split("-");
				view2.append("For Sale\t\tTerrain\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+"\n");
			}
			File workplacesforsale = new File("WorkplacesForSale.txt");
			File workplacesforrent = new File("WorkplacesForRent.txt");
			Scanner input3 = new Scanner(workplacesforsale);
			Scanner input4 = new Scanner(workplacesforrent);
			while(input3.hasNext())
			{
				data=input3.nextLine();
				subdata=data.split("-");
				view2.append("For Sale\t\tWorkplace\t\t"+ subdata[0]+ "\t\t" + subdata[2]+ "\t\t"+ subdata[1]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			while(input4.hasNext())
			{
				data=input4.nextLine();
				subdata=data.split("-");
				view2.append("For Rent\t\tWorkplace\t\t"+ subdata[0]+ "\t\t" + subdata[2]+ "\t\t"+ subdata[1]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
		
			File mansionforsale = new File("MansionsForSale.txt");
			File mansionforrent = new File("MansionsForRent.txt");
			input3 = new Scanner(mansionforsale);
			input4 = new Scanner(mansionforrent);
			while(input3.hasNext())
			{
				data=input3.nextLine();
				subdata=data.split("-");
				view2.append("For Sale\t\tMansion\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			while(input4.hasNext())
				{
				data=input4.nextLine();
				subdata=data.split("-");
				view2.append("For Rent\t\tMansion\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
		
			File farmhouseforsale = new File("FarmhousesForSale.txt");
			File farmhouseforrent = new File("FarmhousesForRent.txt");
			input3 = new Scanner(farmhouseforsale);
			input4 = new Scanner(farmhouseforrent);
			while(input3.hasNext())
			{
				data=input3.nextLine();
				subdata=data.split("-");
				view2.append("For Sale\t\tFarm House\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+subdata[11]+"\n");
			}
			while(input4.hasNext())
			{
				data=input4.nextLine();
				subdata=data.split("-");
				view2.append("For Rent\t\tFarm House\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+subdata[11]+"\n");
			}

			File detachedhouseforsale = new File("DetachedhousesForSale.txt");
			File detachedhouseforrent = new File("DetachedhousesForRent.txt");
			input3 = new Scanner(detachedhouseforsale);
			input4 = new Scanner(detachedhouseforrent);
			while(input3.hasNext())
			{
				data=input3.nextLine();
				subdata=data.split("-");
				view2.append("For Sale\t\tDetached House\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			while(input4.hasNext())
			{
				data=input4.nextLine();
				subdata=data.split("-");
				view2.append("For Rent\t\tDetached House\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}

			File villaforsale = new File("VillasForSale.txt");
			File villaforrent = new File("VillasForRent.txt");
			input3 = new Scanner(villaforsale);
			input4 = new Scanner(villaforrent);
			while(input3.hasNext())
			{
				data=input3.nextLine();
				subdata=data.split("-");
				view2.append("For Sale\t\tVilla\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
			while(input4.hasNext())
			{
				data=input4.nextLine();
				subdata=data.split("-");
				view2.append("For Rent\t\tVilla\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
			}
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println(view2);
	}
	
	
	public static boolean passwordMatch(String customerName, String customerID) {
		File file = new File("Customers.txt");
		try
		{
			Scanner input = new Scanner(file);
			String data;
			String [] subdata;
			
			while(input.hasNext())
			{
				data=input.nextLine();
				subdata=data.split("-");
				if(subdata[0].contains(customerName) && subdata [4].equals(customerID))
				{
					return true;
				}
			}
		}
		catch(IOException e)
		{
			System.out.println("Error : %s" +e);
			
		}
		return false;
	}
}
