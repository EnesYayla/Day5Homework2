package JupiterRegistrationJavaBackend.jFacebookUser;

import JupiterRegistrationJavaBackend.entities.concretes.User;

public class jFacebookUserManager {

	public void withFacebook(User user) {
		if (user.getJupiterId() <= 100 && 0 <= user.getJupiterId()) {

			System.out.println("Facebook ile �ye olabilmek i�in bir facebook hesab� se�iniz.");
			System.out.println("Veriler ��leniyor L�tfen bekleyiniz... ");
			System.out.println(" ");
			System.out.println("��lem ba�ar�yla tamamland�, devam edebilirsiniz.");

		} else {
			System.out.println("Ge�ersiz Id");
			System.out.println("��lem ger�ekle�tirilemiyor");
		}
	}
}