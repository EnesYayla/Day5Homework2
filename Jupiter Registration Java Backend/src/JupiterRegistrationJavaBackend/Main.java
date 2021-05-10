package JupiterRegistrationJavaBackend;

import JupiterRegistrationJavaBackend.business.abstracts.UserService;
import JupiterRegistrationJavaBackend.business.concretes.UserManager;
import JupiterRegistrationJavaBackend.core.concretes.jFacebookUserManagerAdaptor;
import JupiterRegistrationJavaBackend.core.concretes.jGoogleUserManagerAdaptor;
import JupiterRegistrationJavaBackend.dataAccess.concretes.HibernateUserDao;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		UserService userservice = new UserManager(new HibernateUserDao());
		UserService userservice2 = new UserManager(new jFacebookUserManagerAdaptor());
		UserService userservice3 = new UserManager(new jGoogleUserManagerAdaptor());

		User user = new User("Bengi", "Apak", "bengiapak@gmail.com", "bengiap3", 42);

		userservice.register(user);
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(" ");
		userservice2.registerWithExternalFacebook(user);
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(" ");
		userservice3.registerWithExternalGoogle(user);
		System.out.println(" ");
		System.out.println("-------------------------------------------------------------------");
		System.out.println(" ");
		userservice.login(user);

	}

}
