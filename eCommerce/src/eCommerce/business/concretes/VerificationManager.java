package eCommerce.business.concretes;

import java.util.ArrayList;
import java.util.List;

import eCommerce.business.abstracts.VerificationService;

public class VerificationManager implements VerificationService {

	UserCheckManager userCheckManager;

	List<String> mailList = new ArrayList<String>();

	// simülasyon mail doðrulama
	@Override
	public void sendToVerifyMail(String mail) {
		mailList.add(mail);
		System.out.println(mail + " baþarýyla doðrulandý");

	}

	// simülasyon doðrulama maili gönderme
	@Override
	public void verifyMail(String mail) {
		System.out.println(mail + " kullanýcýya doðrulama maili gönderldi ");

	}

	@Override
	public boolean checkVerifyAccount(String mail) {
		if (mailList.contains(mail)) {
			return true;
		}
		return false;
	}

}
