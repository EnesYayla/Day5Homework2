package JupiterRegistrationJavaBackend.core.concretes;

import JupiterRegistrationJavaBackend.core.abstracts.jGoogleUserService;
import JupiterRegistrationJavaBackend.entities.concretes.User;
import JupiterRegistrationJavaBackend.jGoogleUser.jGoogleUserManager;

public class jGoogleUserManagerAdaptor implements jGoogleUserService {

	@Override
	public void signWithGoogle(User user) {
		jGoogleUserManager jjGoogleUserManager = new jGoogleUserManager();
		jjGoogleUserManager.withGoogle(user);

	}

}
