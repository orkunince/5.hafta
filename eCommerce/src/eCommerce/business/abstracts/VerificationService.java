package eCommerce.business.abstracts;

public interface VerificationService {

	void sendToVerifyMail(String mail);
	void verifyMail(String mail);
	boolean checkVerifyAccount(String mail);
}
