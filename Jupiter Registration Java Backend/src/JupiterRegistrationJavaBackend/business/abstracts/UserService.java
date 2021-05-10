package JupiterRegistrationJavaBackend.business.abstracts;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public interface UserService {

	void register(User user);

	void registerWithExternalGoogle(User user);

	void registerWithExternalFacebook(User user);

	void login(User user);

}
