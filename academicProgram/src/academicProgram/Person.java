package academicProgram;

public class Person {

	private String fname, lname, address;

	public Person() {
	}

	public Person(String fname, String lname, String address) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.address = address;
	}

	public String getFullName() {
		return fname + " " + lname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}
	
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
