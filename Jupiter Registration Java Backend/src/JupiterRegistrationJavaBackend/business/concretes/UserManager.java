package JupiterRegistrationJavaBackend.business.concretes;

import JupiterRegistrationJavaBackend.business.abstracts.UserService;
import JupiterRegistrationJavaBackend.core.abstracts.jFacebookUserService;
import JupiterRegistrationJavaBackend.core.abstracts.jGoogleUserService;
import JupiterRegistrationJavaBackend.dataAccess.abstracts.UserDao;
import JupiterRegistrationJavaBackend.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userdao;
	jFacebookUserService jjFacebookUserService;
	jGoogleUserService jjGoogleUserService;

	public UserManager(UserDao userdao) {

		this.userdao = userdao;
	}

	public UserManager(jFacebookUserService jjFacebookUserService) {

		this.jjFacebookUserService = jjFacebookUserService;
	}

	public UserManager(jGoogleUserService jjGoogleUserService) {

		this.jjGoogleUserService = jjGoogleUserService;
	}

	@Override
	public void register(User user) {
		System.out.println("---__---  Sisteme üye olabilmek için tüm kutularý uygun þekilde doldurunuz  ---__---");
		System.out.println(" ");
		this.userdao.firstNameSet(user);
		this.userdao.lastNameSet(user);
		this.userdao.eMailSet(user);
		this.userdao.passwordSet(user);
		this.userdao.add(user);
		System.out.println(" ");
		this.userdao.sendVerification(user);

	}

	@Override
	public void login(User user) {
		this.userdao.loginToSystem(user);

	}

	@Override
	public void registerWithExternalGoogle(User user) {
		this.jjGoogleUserService.signWithGoogle(user);

	}

	@Override
	public void registerWithExternalFacebook(User user) {
		this.jjFacebookUserService.signWithFacebook(user);

	}

}
