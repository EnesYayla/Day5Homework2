package JupiterRegistrationJavaBackend.jGoogleUser;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public class jGoogleUserManager {

	public void withGoogle(User user) {

		if (user.getJupiterId() <= 200 && 0 <= user.getJupiterId()) {

			System.out.println("Google ile üye olabilmek için bir google hesabý seçiniz.");
			System.out.println("Veriler Ýþleniyor Lütfen bekleyiniz... ");
			System.out.println(" ");
			System.out.println("Ýþlem baþarýyla tamamlandý, devam edebilirsiniz.");

		} else {
			System.out.println("Geçersiz Id");
			System.out.println("Ýþlem gerçekleþtirilemiyor");
		}
	}

}
