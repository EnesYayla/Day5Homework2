package JupiterRegistrationJavaBackend.core.concretes;

import JupiterRegistrationJavaBackend.core.abstracts.jFacebookUserService;
import JupiterRegistrationJavaBackend.entities.concretes.User;
import JupiterRegistrationJavaBackend.jFacebookUser.jFacebookUserManager;

public class jFacebookUserManagerAdaptor implements jFacebookUserService {

	public void signWithFacebook(User user) {
		jFacebookUserManager jjFacebookUsermanager = new jFacebookUserManager();
		jjFacebookUsermanager.withFacebook(user);
	}

}
