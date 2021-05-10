package JupiterRegistrationJavaBackend.entities.concretes;

public class User {
	private String firstName;
	private String lastName;
	private String eMail;
	private String password;
	private int jupiterId;

	public User(String name, String lastName, String eMail, String password, int jupiterId) {
		super();
		this.firstName = name;
		this.lastName = lastName;
		this.eMail = eMail;
		this.password = password;
		this.jupiterId = jupiterId;
	}

	public String getName() {
		return firstName;
	}

	public void setName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getJupiterId() {
		return jupiterId;
	}

	public void setJupiterId(int jupiterId) {
		this.jupiterId = jupiterId;
	}

}
