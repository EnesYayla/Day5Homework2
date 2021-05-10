package JupiterRegistrationJavaBackend.dataAccess.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import JupiterRegistrationJavaBackend.dataAccess.abstracts.UserDao;
import JupiterRegistrationJavaBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void firstNameSet(User user) {

		if (user.getName().length() < 2) {

			System.out.println("*Uyar� : En az 2 karakter girilmelidir");

		} else {
			System.out.println("�sim Kullan�labilir  -  " + user.getName());
		}

	}

	@Override
	public void lastNameSet(User user) {
		if (user.getLastName().length() < 2) {
			System.out.println("*Uyar� : En az 2 karakter girilmelidir");
			return;

		} else {
			System.out.println("Soyad Kullan�labilir  -  " + user.getLastName());
		}

	}

	@Override
	public void eMailSet(User user) {
		Pattern pattern = Pattern.compile("@gmail.com");
		Matcher matcher = pattern.matcher(user.geteMail());

		int sayac = 0;
		while (matcher.find())
			sayac++;
		if (sayac != 1 && user.geteMail() == user.geteMail()) // 1.eposta bi�imide de�il ise &&
																// 2.daha �nce kullan�lm�� ise
		{
			System.out.println("*Uyar� : Ge�ersiz E-posta format�");

		} else if (sayac == 1) {
			System.out.println("E-posta kullan�labilir  -  " + user.geteMail());

		}
	}

	@Override
	public void passwordSet(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("*Uyar� : En az 6 karakter girilmelidir");

		} else {
			System.out.println("Parola Kullan�labilir  -  " + user.getPassword());

		}

	}

	@Override
	public void sendVerification(User user) {
		Pattern pattern2 = Pattern.compile("@gmail.com");
		Matcher matcher2 = pattern2.matcher(user.geteMail());

		int sayac = 0;
		while (matcher2.find())
			sayac++;

		if (user.getName().length() < 2 || user.getLastName().length() < 2 || user.getPassword().length() < 6) {
			System.out.println("Hata tespit edildi.");

		}

		else if (sayac != 1 && user.geteMail() == user.geteMail()) // 1.eposta bi�imide de�il ise &&
																	// 2.daha �nce kullan�lm�� ise
		{
			System.out.println("Hata tespit edildi.");

		} else {
			System.out.println("E-postan�za do�rulama linki g�nderildi.");
			System.out.println("�yeli�inizi tamamlamak i�in l�tfen linke t�klay�n�z.");
			System.out.println("Veriler ��leniyor L�tfen bekleyiniz... ");
			System.out.println("��lem ba�ar�yla tamamland�, devam etmek i�in giri� yap�n�z.");
		}

	}

	@Override
	public void add(User user) {
		if (user.getName().length() < 2 || user.getLastName().length() < 2 || user.getPassword().length() < 6) {

		} else {
			System.out.println(
					"<Kullan�c�" + " " + user.getName() + " " + user.getLastName() + " Hibernate ile eklendi>");
		}

	}

	@Override
	public void loginToSystem(User user) {
		if (user.geteMail() == user.geteMail() && user.getPassword() == user.getPassword()) {
			System.out.println("Sisteme ba�ar�yla giri� yap�lm��t�r, J�pitere Ho�geldiniz " + user.getName() + " "
					+ user.getLastName() + " " + user.getJupiterId() + " !");

		} else {
			System.out.println("E-posta veya parola ge�ersiz, l�tfen tekrar deneyin");
		}

	}
}
