package transfer;

public class Employee {

	private int empID;
	private String name;
	private String address;
	private static String username;
	private int password;

	public Employee(int empID, String name, String address, String username, int password) {
		this.empID = empID;
		this.name = name;
		this.address = address;
		Employee.username = username;
		this.password = password;
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public static String getUsername() {
		return username;
	}

	public int getPassword() {
		return password;
	}

}
