package JupiterRegistrationJavaBackend.jFacebookUser;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public class jFacebookUserManager {

	public void withFacebook(User user) {
		if (user.getJupiterId() <= 100 && 0 <= user.getJupiterId()) {

			System.out.println("Facebook ile üye olabilmek için bir facebook hesabý seçiniz.");
			System.out.println("Veriler Ýþleniyor Lütfen bekleyiniz... ");
			System.out.println(" ");
			System.out.println("Ýþlem baþarýyla tamamlandý, devam edebilirsiniz.");

		} else {
			System.out.println("Geçersiz Id");
			System.out.println("Ýþlem gerçekleþtirilemiyor");
		}
	}
}