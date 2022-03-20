import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class ProjectClass {

	public static void main(String[] args) {
		loginmenu();
	}
	
	private static void loginmenu() {
		Scanner input2 = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		System.out.println("WELCOME ...\n1- Login\n2- Register\n3- Exit");
		String choose1=input2.next();
		switch(Integer.parseInt(choose1)) {
			case 1:
				System.out.println("Pls enter your name");
				String customerName = input.nextLine();
				System.out.println("Pls enter your password");
				String customerID =input2.next();
				if(customerID.equals("12345") && customerName.equals("admin")) {//ADMÝN ÝÞLEM
					admin(customerName,customerID);
				}
				else {
					boolean validate = Customer.passwordMatch(customerName,customerID);
					if(validate==true) {
						mainmenu(customerID,customerName);
					}
					else
					{
						System.out.println("Invalid name or serial number");
						loginmenu();
					}
				}
					break;
				case 2:
					Customer.signUp();
					loginmenu();
					break;
				case 3:
					return;
				default:
					System.out.println("invalid key");
					loginmenu();
					break;	
			}
	}
	
	private static void admin(String customerID,String password) {
		System.out.println("1-View all advert\n2-Delete advert\n3-Back to login");
		Customer newadmin=new Admin(password,customerID);
		Scanner scnr=new Scanner(System.in);
		String chs=scnr.next();
		switch(Integer.parseInt(chs)){
		case 1:
			Customer.viewAllAdvertAdmin();
			Customer.viewAllAdvertAdmin2();
			admin(customerID,password);
			break;
		case 2:
			Customer.deleteAdvert();
			admin(customerID,password);
			break;
		case 3:
			loginmenu();
			break;
		default:
			System.out.println("Invalid key!!!");
			loginmenu();
			break;
		}
	}
	
	private static void mainmenu(String customerID,String password) {		
		Scanner input = new Scanner(System.in);
		System.out.println("1- View our advert\n2- View all advert\n3- Add new advert\n4- Edit your data\n5- Remove your data\n6- View your data\n7- Back to login");
		String choose=input.next();
			if(Integer.parseInt(choose)==1) 
			{
				System.out.println("\n1- Edit your advert\n2- Delete your advert");
				int choose2=input.nextInt();
				if(choose2==1) {
					
					mainmenu(customerID,password);
				}
				else if(choose2==2) {
					
					mainmenu(customerID,password);
				}
				else {
					System.out.println("Invalid key!!!");
					mainmenu(customerID,password);
				}
			}
			else if (Integer.parseInt(choose)==2) 
			{
				viewAllAdvert();
				mainmenu(customerID,password);
			}	
			else if (Integer.parseInt(choose)==3) 
			{
				addAdvert(customerID,password);
				mainmenu(customerID,password);
			}				
			else if(Integer.parseInt(choose)==4)
			{
				Customer.edit(customerID,password);
				loginmenu();
			}
			else if(Integer.parseInt(choose)==5) {
				Customer.delete(customerID,password);
				loginmenu();
			}
			else if(Integer.parseInt(choose)==6) {
				Customer.view(customerID,password);
				mainmenu(customerID,password);
			}
			else if(Integer.parseInt(choose)==7) {
				loginmenu();
			}		
			else
			{
				System.out.println("Invalid key");
				mainmenu(customerID,password);
			}
	}
	
	private static void viewAllAdvert() {
		String data;
		String [] subdata;
		StringBuilder view = new StringBuilder();

		System.out.println("1- Vehicles \n2- Real Estates");
		Scanner chs=new Scanner(System.in);
		String choose=chs.next();
		if(Integer.parseInt(choose)==1) {
			System.out.println("1- Cars \n2- SUVs \n3- Vans");
			Scanner chs2=new Scanner(System.in);
			String choose2=chs2.next();
			if(Integer.parseInt(choose2)==1) {
				System.out.println("Condition\t\tBrands\t\tModel\t\tPrice\t\tYear\t\tCity\t\tTransmission\t\tFuel\t\tColor\t\tSafe\t\tAdvert No\t\t\tDate");
				try {
					File carsforsale = new File("CarsForSale.txt");
					File carsforrent = new File("CarsForRent.txt");
					Scanner input = new Scanner(carsforsale);
					Scanner input2 = new Scanner(carsforrent);
					while(input.hasNext())
					{
						data=input.nextLine();
						subdata=data.split("-");
						view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
					}
					while(input2.hasNext())
					{
						data=input2.nextLine();
						subdata=data.split("-");
						view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
					}
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(Integer.parseInt(choose2)==2) {
				System.out.println("Condition\t\tBrands\t\tModel\t\tPrice\t\tYear\t\tCity\t\tTransmission\t\tFuel\t\tColor\t\tTractionType\t\tAdvert No\t\tDate");
				try {
					File suvsforsale = new File("SUVsForSale.txt");
					File suvsforrent = new File("SUVsForRent.txt");
					Scanner input3 = new Scanner(suvsforsale);
					Scanner input4 = new Scanner(suvsforrent);
					while(input3.hasNext())
					{
						data=input3.nextLine();
						subdata=data.split("-");
						view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
					}
					while(input4.hasNext())
					{
						data=input4.nextLine();
						subdata=data.split("-");
						view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
					}
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(Integer.parseInt(choose2)==3) {
				System.out.println("Condition\t\tBrands\t\tModel\t\tPrice\t\tYear\t\tCity\t\tTransmission\t\tFuel\t\tColor\t\tVan Type\t\tBed Capacity\t\tAdvert No\t\tDate");
				try {
					File vansforsale = new File("VansForSale.txt");
					File vansforrent = new File("VansForRent.txt");
					Scanner input5 = new Scanner(vansforsale);
					Scanner input6 = new Scanner(vansforrent);
					while(input5.hasNext())
					{
						data=input5.nextLine();
						subdata=data.split("-");
						view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+ subdata[11]+"\n");
					}
					while(input6.hasNext())
					{
						data=input6.nextLine();
						subdata=data.split("-");
						view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+ subdata[11]+"\n");
					}
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Invalid key!!!");
				viewAllAdvert();
			}
		}
		else if(Integer.parseInt(choose)==2) {	
			System.out.println("1- Terrains \n2- Apartments");
			Scanner chs2=new Scanner(System.in);
			String choose2=chs2.next();
			if(Integer.parseInt(choose2)==1) {
				try {
					File terrainsforsale = new File("TerrainsForSale.txt");
				
					Scanner input = new Scanner(terrainsforsale);
					System.out.println("Condition\t\tLocation\t\tPrice\t\tSquare Meter\t\tEstate No\t\tDate");
					while(input.hasNext())
					{
						data=input.nextLine();
						subdata=data.split("-");
						view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+"\n");
					}
				}
				catch(FileNotFoundException e)
				{
					e.printStackTrace();
				}
			}
			else if(Integer.parseInt(choose2)==2) {
				System.out.println("1- Workplaces \n2- Housing");
				Scanner chs3=new Scanner(System.in);
				String choose3=chs3.next();
				if(Integer.parseInt(choose3)==1) {
					try {
						File workplacesforsale = new File("WorkplacesForSale.txt");
						File workplacesforrent = new File("WorkplacesForRent.txt");
						Scanner input3 = new Scanner(workplacesforsale);
						Scanner input4 = new Scanner(workplacesforrent);
						System.out.println("Condition\t\tLocation\t\tPrice\t\tSquare Meter\t\tDues\t\tMax Quota\t\tFloor Number\t\tNumber of Rooms\t\tHeating\t\tBalcony\t\tEstate No\t\tDate");
						while(input3.hasNext())
						{
							data=input3.nextLine();
							subdata=data.split("-");
							view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[2]+ "\t\t"+ subdata[1]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
						}
						while(input4.hasNext())
						{
							data=input4.nextLine();
							subdata=data.split("-");
							view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[2]+ "\t\t"+ subdata[1]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
						}
					}
					catch(FileNotFoundException e)
					{
						e.printStackTrace();
					}
				}
				
				else if(Integer.parseInt(choose3)==2) {
					System.out.println("1- Mansion\n2- Farm House\n3- Detached House\n4- Villa");
					Scanner chs4=new Scanner(System.in);
					String choose4=chs4.next();
					if(Integer.parseInt(choose4)==1) {
						try {
							File mansionforsale = new File("MansionsForSale.txt");
							File mansionforrent = new File("MansionsForRent.txt");
							Scanner input3 = new Scanner(mansionforsale);
							Scanner input4 = new Scanner(mansionforrent);
							System.out.println("Condition\t\tLocation\t\tPrice\t\tSquare Meter\t\tFloor Number\t\tNumber of Rooms\t\tDues\t\tHeating\t\tBalcony\t\tFurnished\t\tEstate No\t\tDate");
							while(input3.hasNext())
							{
								data=input3.nextLine();
								subdata=data.split("-");
								view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
							}
							while(input4.hasNext())
							{
								data=input4.nextLine();
								subdata=data.split("-");
								view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
							}
						}
						catch(FileNotFoundException e)
						{
							e.printStackTrace();
						}
					}
					else if(Integer.parseInt(choose4)==2) {
						try {
							File farmhouseforsale = new File("FarmhousesForSale.txt");
							File farmhouseforrent = new File("FarmhousesForRent.txt");
							Scanner input3 = new Scanner(farmhouseforsale);
							Scanner input4 = new Scanner(farmhouseforrent);
							System.out.println("Condition\t\tLocation\t\tPrice\t\tSquare Meter\t\tFloor Number\t\tNumber of Rooms\t\tDues\t\tHeating\t\tBalcony\t\tFurnished\t\tBarn\t\tEstate No\t\tDate");
							while(input3.hasNext())
							{
								data=input3.nextLine();
								subdata=data.split("-");
								view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+subdata[11]+"\n");
							}
							while(input4.hasNext())
							{
								data=input4.nextLine();
								subdata=data.split("-");
								view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\t\t"+subdata[11]+"\n");
							}
						}
						catch(FileNotFoundException e)
						{
							e.printStackTrace();
						}
					}
					else if(Integer.parseInt(choose4)==3) {
						try {
							File detachedhouseforsale = new File("DetachedhousesForSale.txt");
							File detachedhouseforrent = new File("DetachedhousesForRent.txt");
							Scanner input3 = new Scanner(detachedhouseforsale);
							Scanner input4 = new Scanner(detachedhouseforrent);
							System.out.println("Condition\t\tLocation\t\tPrice\t\tSquare Meter\t\tFloor Number\t\tNumber of Rooms\t\tDues\t\tHeating\t\tBalcony\t\tFurnished\t\tEstate No\t\tDate");
							while(input3.hasNext())
							{
								data=input3.nextLine();
								subdata=data.split("-");
								view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
							}
							while(input4.hasNext())
							{
								data=input4.nextLine();
								subdata=data.split("-");
								view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
							}
						}
						catch(FileNotFoundException e)
						{
							e.printStackTrace();
						}
					}
					else if(Integer.parseInt(choose4)==4) {
						try {
							File villaforsale = new File("VillasForSale.txt");
							File villaforrent = new File("VillasForRent.txt");
							Scanner input3 = new Scanner(villaforsale);
							Scanner input4 = new Scanner(villaforrent);
							System.out.println("Condition\t\tLocation\t\tPrice\t\tSquare Meter\t\tFloor Number\t\tNumber of Rooms\t\tDues\t\tHeating\t\tBalcony\t\tFurnished\t\tEstate No\t\tDate");
							while(input3.hasNext())
							{
								data=input3.nextLine();
								subdata=data.split("-");
								view.append("For Sale\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
							}
							while(input4.hasNext())
							{
								data=input4.nextLine();
								subdata=data.split("-");
								view.append("For Rent\t\t"+ subdata[0]+ "\t\t" + subdata[1]+ "\t\t"+ subdata[2]+ "\t\t" + subdata[3]+ "\t\t" + subdata[4]+ "\t\t" + subdata[5]+ "\t\t"+ subdata[6]+ "\t\t"+ subdata[7]+ "\t\t"+ subdata[8]+ "\t\t"+ subdata[9]+ "\t\t"+ subdata[10]+"\n");
							}
						}
						catch(FileNotFoundException e)
						{
							e.printStackTrace();
						}
					}
				}
			}
		}
		else {
			System.out.println("Invalid key!!!");
			viewAllAdvert();
		}		
			System.out.println(view);
	}
	
	private static void addAdvert(String customerID,String password) {
		Scanner input=new Scanner(System.in);
		System.out.println("1- Vehicles\n2- Real Estate");
		String choose=input.next();
		if(Integer.parseInt(choose)==1) {
			System.out.println("1- Sale\n2- Rent");
			Scanner input2=new Scanner(System.in);
			choose=input2.next();
			if(Integer.parseInt(choose)==1) {
				System.out.println("1- Car\n2- SUV\n3- Van");
				Scanner input3=new Scanner(System.in);
				choose=input3.next();
				if(Integer.parseInt(choose)==1) {
					String dosyaadi="CarsForSale.txt";
					addAdvertSaleCars(dosyaadi,customerID,password);
				}
				else if(Integer.parseInt(choose)==2) {
					String dosyaadi="SUVsForSale.txt";
					addAdvertSaleSUVs(dosyaadi,customerID,password);
				}
				else if(Integer.parseInt(choose)==3) {
					String dosyaadi="VansForSale.txt";
					addAdvertSaleVans(dosyaadi,customerID,password);
				}
				else {
					System.out.println("Invalid key...");
					addAdvert(customerID,password);
				}
			}
			else if(Integer.parseInt(choose)==2) {
				System.out.println("1- Car\n2- SUV\n3- Van");
				Scanner input3=new Scanner(System.in);
				choose=input3.next();
				if(Integer.parseInt(choose)==1) {
					String dosyaadi="CarsForRent.txt";
					addAdvertRentCars(dosyaadi,customerID,password);
				}
				else if(Integer.parseInt(choose)==2) {
					String dosyaadi="SUVsForRent.txt";
					addAdvertRentSUVs(dosyaadi,customerID,password);
				}
				else if(Integer.parseInt(choose)==3) {
					String dosyaadi="VansForRent.txt";
					addAdvertRentVans(dosyaadi,customerID,password);
				}
				else {
					System.out.println("Invalid key...");
					addAdvert(customerID,password);
				}
			}
			else {
				System.out.println("Invalid key...");
			}
			
		}
		else if(Integer.parseInt(choose)==2) {
			System.out.println("1- Sale\n2- Rent");
			Scanner input2=new Scanner(System.in);
			choose=input2.next();
			if(Integer.parseInt(choose)==1) {//SaleRealEstate
				System.out.println("1- Terrain\n2- Apartment");
				Scanner input3=new Scanner(System.in);
				choose=input3.next();
				if(Integer.parseInt(choose)==1) { 
					String dosyaadi="TerrainsForSale.txt";
					addAdvertSaleTerrains(dosyaadi,customerID,password);
				}
				else if(Integer.parseInt(choose)==2) {
					System.out.println("1- Workplace\n2- Housing");
					Scanner input4=new Scanner(System.in);
					choose=input4.next();
					if(Integer.parseInt(choose)==1) {
						String dosyaadi="WorkplacesForSale.txt";
						addAdvertSaleWorkplaces(dosyaadi,customerID,password);
					}
					else if(Integer.parseInt(choose)==2) {
						System.out.println("1- Mansion\n2- Farm House\n3- Detached House\n4- Villa");
						Scanner input5=new Scanner(System.in);
						choose=input5.next();
						if(Integer.parseInt(choose)==1) {
							String dosyaadi="MansionsForSale.txt";
							addAdvertSaleMansions(dosyaadi,customerID,password);
						}
						else if(Integer.parseInt(choose)==2) {
							String dosyaadi="FarmhousesForSale.txt";
							addAdvertSaleFarmhouses(dosyaadi,customerID,password);
						}
						else if(Integer.parseInt(choose)==3) {
							String dosyaadi="DetachedhousesForSale.txt";
							addAdvertSaleDetachedhouses(dosyaadi,customerID,password);
						}
						else if(Integer.parseInt(choose)==4) {
							String dosyaadi="VillasForSale.txt";
							addAdvertSaleVillas(dosyaadi,customerID,password);
						}
						else {
							System.out.println("Invalid key...");
						}
					}
					else {
						System.out.println("Invalid key...");
					}
				}
			}
			else if(Integer.parseInt(choose)==2) { //RentRealEstate
				System.out.println("1- Workplace\n2- Housing");
				Scanner input4=new Scanner(System.in);
				choose=input4.next();
				if(Integer.parseInt(choose)==1) {
					String dosyaadi="WorkplacesForRent.txt";
					addAdvertRentWorkplaces(dosyaadi,customerID,password);
				}
				else if(Integer.parseInt(choose)==2) {
					System.out.println("1- Mansion\n2- Farm House\n3- Detached House\n4- Villa");
					Scanner input5=new Scanner(System.in);
					choose=input5.next();
					if(Integer.parseInt(choose)==1) {
						String dosyaadi="MansionsForRent.txt";
						addAdvertRentMansions(dosyaadi,customerID,password);
					}
					else if(Integer.parseInt(choose)==2) {
						String dosyaadi="FarmhousesForRent.txt";
						addAdvertRentFarmhouses(dosyaadi,customerID,password);
					}
					else if(Integer.parseInt(choose)==3) {
						String dosyaadi="DetachedhousesForRent.txt";
						addAdvertRentDetachedhouses(dosyaadi,customerID,password);
					}
					else if(Integer.parseInt(choose)==4) {
						String dosyaadi="VillasForRent.txt";
						addAdvertRentVillas(dosyaadi,customerID,password);
					}
					else {
						System.out.println("Invalid key...");
					}
				}
			}
			else {
				System.out.println("Invalid key...");
			}
		}
		else {
		System.out.println("Invalid key...");
		}
	}
	
	private static void addAdvertRentVillas(String filename,String customerID,String password) {//RENT VILLA
		ArrayList<String> Villas = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int apartmentRentNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished : ");
		boolean furnished=input4.nextBoolean();
		
		ApartmentForRent newApartmentForRent=new ApartmentForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newApartmentForRent.dailyRent(price);
			break;
		case 2:
			price=newApartmentForRent.weeklyRent(price);
			break;
		default:
			price=newApartmentForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertVillaRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters,furnished);
	}
	
	private static void addAdvertRentDetachedhouses(String filename,String customerID,String password) {//RENT DETACHED
		ArrayList<String> DetachedHouses = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int apartmentRentNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished : ");
		boolean furnished=input4.nextBoolean();
		
		ApartmentForRent newApartmentForRent=new ApartmentForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newApartmentForRent.dailyRent(price);
			break;
		case 2:
			price=newApartmentForRent.weeklyRent(price);
			break;
		default:
			price=newApartmentForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertDetachedhouseRent(price,advertDate,location, floorNumber,numberOfRooms,heating,balcony, dues,apartmentRentNo,squareMeters,furnished);
	}
	
	private static void addAdvertRentFarmhouses(String filename,String customerID,String password) {//RENT FARMHOUSE
		ArrayList<String> FarmHouses = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int apartmentRentNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished(True-False) : ");
		boolean furnished=input4.nextBoolean();
		
		System.out.println("Have Barn(True-False) : ");
		boolean haveBarn=input4.nextBoolean();
		
		ApartmentForRent newApartmentForRent=new ApartmentForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newApartmentForRent.dailyRent(price);
			break;
		case 2:
			price=newApartmentForRent.weeklyRent(price);
			break;
		default:
			price=newApartmentForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertFarmHouseRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters,furnished,haveBarn);
	}
	
	private static void addAdvertRentMansions(String filename,String customerID,String password) {
		ArrayList<String> Mansions = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int apartmentRentNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished(True-False) : ");
		boolean furnished=input4.nextBoolean();
		
		ApartmentForRent newApartmentForRent=new ApartmentForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newApartmentForRent.dailyRent(price);
			break;
		case 2:
			price=newApartmentForRent.weeklyRent(price);
			break;
		default:
			price=newApartmentForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertMansionRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters,furnished);
	}
	
	private static void addAdvertRentWorkplaces(String filename,String customerID,String password) {//RENT WORKPLACES
		ArrayList<String> Workplaces = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int apartmentRentNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Maxquota: ");
		int maxquota=input4.nextInt();
		
		ApartmentForRent newApartmentForRent=new ApartmentForRent(price,advertDate,location,floorNumber,numberOfRooms,heating,balcony,dues,apartmentRentNo,squareMeters);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newApartmentForRent.dailyRent(price);
			break;
		case 2:
			price=newApartmentForRent.weeklyRent(price);
			break;
		default:
			price=newApartmentForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertWorkplaceRent(price, advertDate, location, apartmentRentNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,maxquota);
	}
	
	private static void addAdvertSaleVillas(String filename,String customerID,String password) {
		ArrayList<String> Villas = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int apartmentRentNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished : ");
		boolean furnished=input4.nextBoolean();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertVillaSale(price,advertDate,location,apartmentRentNo,squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished);
	}
	private static void addAdvertSaleDetachedhouses(String filename,String customerID,String password) {
		ArrayList<String> DetachedHouses = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int estateSaleNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished : ");
		boolean furnished=input4.nextBoolean();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertDetachedhouseSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished);
	}
	
	private static void addAdvertSaleFarmhouses(String filename,String customerID,String password) {
		ArrayList<String> FarmHouses = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int estateSaleNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished : ");
		boolean furnished=input4.nextBoolean();
		
		System.out.println("haveBarn : ");
		boolean haveBarn=input4.nextBoolean();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertFarmHouseSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished, haveBarn);
	}
	
	private static void addAdvertSaleMansions(String filename,String customerID,String password) {
		ArrayList<String> Mansions = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int estateSaleNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Furnished : ");
		boolean furnished=input4.nextBoolean();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertMansionSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,furnished);
	}
	private static void addAdvertSaleWorkplaces(String filename,String customerID,String password) {
		ArrayList<String> Workplaces = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int estateSaleNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		System.out.println("Floor Number: ");
		int floorNumber=input4.nextInt();
		
		System.out.println("Number of Rooms : ");
		String numberOfRooms=input4.next();
		
		System.out.println("Heating : ");
		String heating=input4.next();
		
		System.out.println("Balcony(True-False) : ");
		boolean balcony=input4.nextBoolean();
		
		System.out.println("Dues: ");
		int dues=input4.nextInt();
		
		System.out.println("Maxquota: ");
		int maxquota=input4.nextInt();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertWorkplaceSale(price, advertDate, location, estateSaleNo, squareMeters,floorNumber,numberOfRooms,heating,balcony,dues,maxquota);
	}
	
	private static void addAdvertSaleTerrains(String filename,String customerID,String password) {
		ArrayList<String> Terrains = storage(filename);
		Scanner input4=new Scanner(System.in);
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int estateSaleNo=rnd.nextInt(10000);
		
		System.out.println("Square Meters : ");
		int squareMeters=input4.nextInt();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertTerrainSale(price, advertDate, location, estateSaleNo, squareMeters);
	}
	
	private static void addAdvertRentVans(String filename,String customerID,String password) {
		ArrayList<String> Vans = storage(filename);
		Scanner input4=new Scanner(System.in);
		System.out.println("Brand : ");
		ArrayList<String> VanBrands=new ArrayList<String>();
		VanBrands.add(input4.next());
		
		System.out.println("Model : ");
		String model=input4.next();
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		System.out.println("Year : ");
		int year=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int vehicleSaleNo=rnd.nextInt(10000);
		
		System.out.println("Transmission : ");
		String transmission=input4.next();
		
		System.out.println("Fuel : ");
		String fuel=input4.next();
		
		System.out.println("Color : ");
		String color=input4.next();
		
		System.out.println("Van Type  : ");
		String vanType =input4.next();
		
		System.out.println("Bed Capacity : ");
		int bedCapacity  =input4.nextInt();
		
		VehicleForRent newVehicleForRent=new VehicleForRent(price,advertDate,location,vehicleSaleNo,model,year,transmission,fuel,color);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newVehicleForRent.dailyRent(price);
			break;
		case 2:
			price=newVehicleForRent.weeklyRent(price);
			break;
		default:
			price=newVehicleForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertRentVan(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, vanType, color, bedCapacity,VanBrands);
	}
	
	private static void addAdvertRentSUVs(String filename,String customerID,String password) {
		ArrayList<String> SUVs = storage(filename);
		Scanner input4=new Scanner(System.in);
		System.out.println("Brand : ");
		ArrayList<String> suvBrands=new ArrayList<String>();
		suvBrands.add(input4.next());
		
		System.out.println("Model : ");
		String model=input4.next();
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		System.out.println("Year : ");
		int year=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int vehicleSaleNo=rnd.nextInt(10000);
		
		System.out.println("Transmission : ");
		String transmission=input4.next();
		
		System.out.println("Fuel : ");
		String fuel=input4.next();
		
		System.out.println("Color : ");
		String color=input4.next();
		
		System.out.println("Traction Type : ");
		String tractionType=input4.next();
		
		VehicleForRent newVehicleForRent=new VehicleForRent(price,advertDate,location,vehicleSaleNo,model,year,transmission,fuel,color);
		System.out.println("1-Daily Rent\n2-Weekly Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newVehicleForRent.dailyRent(price);
			break;
		case 2:
			price=newVehicleForRent.weeklyRent(price);
			break;
		default:
			price=newVehicleForRent.monthlyRent(price);
			break;
		}
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertSUVRent(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color, tractionType, suvBrands);
	}
	
	private static void addAdvertRentCars(String filename,String id,String password) {
		ArrayList<String> cars = storage(filename);
		Scanner input4=new Scanner(System.in);
		System.out.println("Brand : ");
		ArrayList<String> carBrands=new ArrayList<String>();
		carBrands.add(input4.next());
		
		System.out.println("Model : ");
		String model=input4.next();
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		System.out.println("Year : ");
		int year=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int vehicleSaleNo=rnd.nextInt(10000);
		
		System.out.println("Transmission : ");
		String transmission=input4.next();
		
		System.out.println("Fuel : ");
		String fuel=input4.next();
		
		System.out.println("Color : ");
		String color=input4.next();
		
		System.out.println("Safe Type : ");
		String safeType=input4.next();
		
		VehicleForRent newVehicleForRent=new VehicleForRent(price,advertDate,location,vehicleSaleNo,model,year,transmission,fuel,color);
		System.out.println("1-Daily  Rent\n2-Weekly  Rent\n3-Monthly Rent");
		String menuChoose=input4.next();
		switch(Integer.parseInt(menuChoose)) {
		case 1:
			price=newVehicleForRent.dailyRent(price);
			break;
		case 2:
			price=newVehicleForRent.weeklyRent(price);
			break;
		default:
			price=newVehicleForRent.monthlyRent(price);
			break;
		}
		Customer newcustomer=new Customer(id,password);
		newcustomer.addAdvertCarRent(carBrands, model, price, year, location, transmission, fuel, color, safeType, vehicleSaleNo, advertDate);
	}
	
	private static void addAdvertSaleVans(String filename,String customerID,String password) {
		ArrayList<String> Vans = storage(filename);
		Scanner input4=new Scanner(System.in);
		System.out.println("Brand : ");
		ArrayList<String> VanBrands=new ArrayList<String>();
		VanBrands.add(input4.next());
		
		System.out.println("Model : ");
		String model=input4.next();
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		System.out.println("Year : ");
		int year=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int vehicleSaleNo=rnd.nextInt(10000);
		
		System.out.println("Transmission : ");
		String transmission=input4.next();
		
		System.out.println("Fuel : ");
		String fuel=input4.next();
		
		System.out.println("Color : ");
		String color=input4.next();
		
		System.out.println("Van Type  : ");
		String vanType =input4.next();
		
		System.out.println("Bed Capacity : ");
		int bedCapacity  =input4.nextInt();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertSaleVan(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, vanType, color, bedCapacity,VanBrands);
	}
	
	private static void addAdvertSaleSUVs(String filename,String customerID,String password) {
		ArrayList<String> SUVs = storage(filename);
		Scanner input4=new Scanner(System.in);
		System.out.println("Brand : ");
		ArrayList<String> suvBrands=new ArrayList<String>();
		suvBrands.add(input4.next());
		
		System.out.println("Model : ");
		String model=input4.next();
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		System.out.println("Year : ");
		int year=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int vehicleSaleNo=rnd.nextInt(10000);
		
		System.out.println("Transmission : ");
		String transmission=input4.next();
		
		System.out.println("Fuel : ");
		String fuel=input4.next();
		
		System.out.println("Color : ");
		String color=input4.next();
		
		System.out.println("Traction Type : ");
		String tractionType=input4.next();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertSUVSale(price, advertDate, location, vehicleSaleNo, model, year, transmission, fuel, color, tractionType, suvBrands);
	}
	
	private static void addAdvertSaleCars(String filename,String customerID,String password) {
		ArrayList<String> cars = storage(filename);
		Scanner input4=new Scanner(System.in);
		System.out.println("Brand : ");
		ArrayList<String> carBrands=new ArrayList<String>();
		carBrands.add(input4.next());
		
		System.out.println("Model : ");
		String model=input4.next();
		
		System.out.println("Price : ");
		int price=input4.nextInt();
		
		System.out.println("Year : ");
		int year=input4.nextInt();
		
		Date advertDate=new Date();
		
		System.out.println("Location : ");
		String location=input4.next();
		Random rnd=new Random();
		
		int vehicleSaleNo=rnd.nextInt(10000);
		
		System.out.println("Transmission : ");
		String transmission=input4.next();
		
		System.out.println("Fuel : ");
		String fuel=input4.next();
		
		System.out.println("Color : ");
		String color=input4.next();
		
		System.out.println("Safe Type : ");
		String safeType=input4.next();
		
		Customer newcustomer=new Customer(customerID,password);
		newcustomer.addAdvertCarSale(carBrands, model, price, year, location, transmission, fuel, color, safeType, vehicleSaleNo, advertDate);
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
}
