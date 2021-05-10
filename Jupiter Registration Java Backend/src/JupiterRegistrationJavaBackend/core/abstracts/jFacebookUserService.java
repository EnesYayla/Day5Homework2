package JupiterRegistrationJavaBackend.core.abstracts;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public interface jFacebookUserService {

	void signWithFacebook(User user);
}
