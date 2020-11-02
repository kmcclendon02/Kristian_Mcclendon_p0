package SixthThirdBank;

public class UserInfo {
	
	final private int customerID;
	
	final private String customerUsername;
	
	private int  customerPin;
	
	private String customerAddress;

	//Class constructor
	public UserInfo(int customerID, String customerUsername, int customerPin, int customerAddress) {
		this.customerID = customerID;
		this.customerUsername = customerUsername;
		this.customerPin = customerPin;
		this.customerAddress = customerAddress;
	}

	public int getCustomerPin() {
		return customerPin;
	}

	public void setCustomerPin(int customerPin) {
		this.customerPin = customerPin;
	}

	public int getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(int customerAddress) {
		this.customerAddress = customerAddress;
	}

	public int getCustomerID() {
		return customerID;
	}

	public String getCustomerUsername() {
		return customerUsername;
	}
	// Updating address on file
	 void String updateAdress(String newAddress) {
		 System.out.println("Please enter new Adress");
		 if (customerAddress != newAddress) {
			 customerAddress = newAddress;
			 System.out.println("Address is " + customerAddress);
		 }
		 else {
			 System.out.println("Address is unchanged");
		 }
		 
	 }
	
	
	
	
	
	

}
