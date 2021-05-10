package JupiterRegistrationJavaBackend.core.abstracts;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public interface jGoogleUserService {

	void signWithGoogle(User user);

}
