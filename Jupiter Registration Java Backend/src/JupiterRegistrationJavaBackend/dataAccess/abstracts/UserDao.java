package JupiterRegistrationJavaBackend.dataAccess.abstracts;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public interface UserDao {
	void add(User user);

	void firstNameSet(User user);

	void lastNameSet(User user);

	void eMailSet(User user);

	void passwordSet(User user);

	void sendVerification(User user);

	void loginToSystem(User user);

}
