package JupiterRegistrationJavaBackend.jGoogleUser;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public class jGoogleUserManager {

	public void withGoogle(User user) {

		if (user.getJupiterId() <= 200 && 0 <= user.getJupiterId()) {

			System.out.println("Google ile �ye olabilmek i�in bir google hesab� se�iniz.");
			System.out.println("Veriler ��leniyor L�tfen bekleyiniz... ");
			System.out.println(" ");
			System.out.println("��lem ba�ar�yla tamamland�, devam edebilirsiniz.");

		} else {
			System.out.println("Ge�ersiz Id");
			System.out.println("��lem ger�ekle�tirilemiyor");
		}
	}

}
