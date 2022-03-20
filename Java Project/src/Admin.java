
public class Admin extends Customer{

	public Admin(String customerID, String password, String customerName, String address, String phone, String email) {
		super(customerID, password, customerName, address, phone, email);
	}

	public Admin(String customerID,String password) {
		super(customerID,password);
	}

}
