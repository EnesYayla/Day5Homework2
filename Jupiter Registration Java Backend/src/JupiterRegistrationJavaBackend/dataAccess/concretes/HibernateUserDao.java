package JupiterRegistrationJavaBackend.dataAccess.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import JupiterRegistrationJavaBackend.dataAccess.abstracts.UserDao;
import JupiterRegistrationJavaBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	@Override
	public void firstNameSet(User user) {

		if (user.getName().length() < 2) {

			System.out.println("*Uyarý : En az 2 karakter girilmelidir");

		} else {
			System.out.println("Ýsim Kullanýlabilir  -  " + user.getName());
		}

	}

	@Override
	public void lastNameSet(User user) {
		if (user.getLastName().length() < 2) {
			System.out.println("*Uyarý : En az 2 karakter girilmelidir");
			return;

		} else {
			System.out.println("Soyad Kullanýlabilir  -  " + user.getLastName());
		}

	}

	@Override
	public void eMailSet(User user) {
		Pattern pattern = Pattern.compile("@gmail.com");
		Matcher matcher = pattern.matcher(user.geteMail());

		int sayac = 0;
		while (matcher.find())
			sayac++;
		if (sayac != 1 && user.geteMail() == user.geteMail()) // 1.eposta biçimide deðil ise &&
																// 2.daha önce kullanýlmýþ ise
		{
			System.out.println("*Uyarý : Geçersiz E-posta formatý");

		} else if (sayac == 1) {
			System.out.println("E-posta kullanýlabilir  -  " + user.geteMail());

		}
	}

	@Override
	public void passwordSet(User user) {
		if (user.getPassword().length() < 6) {
			System.out.println("*Uyarý : En az 6 karakter girilmelidir");

		} else {
			System.out.println("Parola Kullanýlabilir  -  " + user.getPassword());

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

		else if (sayac != 1 && user.geteMail() == user.geteMail()) // 1.eposta biçimide deðil ise &&
																	// 2.daha önce kullanýlmýþ ise
		{
			System.out.println("Hata tespit edildi.");

		} else {
			System.out.println("E-postanýza doðrulama linki gönderildi.");
			System.out.println("Üyeliðinizi tamamlamak için lütfen linke týklayýnýz.");
			System.out.println("Veriler Ýþleniyor Lütfen bekleyiniz... ");
			System.out.println("Ýþlem baþarýyla tamamlandý, devam etmek için giriþ yapýnýz.");
		}

	}

	@Override
	public void add(User user) {
		if (user.getName().length() < 2 || user.getLastName().length() < 2 || user.getPassword().length() < 6) {

		} else {
			System.out.println(
					"<Kullanýcý" + " " + user.getName() + " " + user.getLastName() + " Hibernate ile eklendi>");
		}

	}

	@Override
	public void loginToSystem(User user) {
		if (user.geteMail() == user.geteMail() && user.getPassword() == user.getPassword()) {
			System.out.println("Sisteme baþarýyla giriþ yapýlmýþtýr, Jüpitere Hoþgeldiniz " + user.getName() + " "
					+ user.getLastName() + " " + user.getJupiterId() + " !");

		} else {
			System.out.println("E-posta veya parola geçersiz, lütfen tekrar deneyin");
		}

	}
}
