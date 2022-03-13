package eCommerce.business.concretes;

import java.util.List;

import eCommerce.business.abstracts.UserCheckService;
import eCommerce.business.abstracts.UserService;
import eCommerce.business.abstracts.VerificationService;
import eCommerce.dataAccess.abstratcs.UserDao;
import eCommerce.entities.concretes.User;

public class UserManager implements UserService {
	
	private UserCheckService userCheckService;
	private VerificationService verificationService;
	private UserDao userDao;
	
	
	public UserManager(UserCheckService userCheckService, VerificationService verificationService, UserDao userDao) {
		super();
		this.userCheckService = userCheckService;
		this.verificationService = verificationService;
		this.userDao = userDao;
	}

	@Override
	public void add(User user) {
		//UserCheckManager'da bulunan isValid operasyonu, tüm bilgiler doðruysa true oluyor.
		//Hepsinin doðru olmasý durumunda kullanýcý ekleniyor ve mail gönderiliyor.
		
		if(userCheckService.isValid(user)) {
			userDao.add(user);
			System.out.println(user.getFirstName() + " kullanýcýsý baþarýyla eklendi.");
			verificationService.sendToVerifyMail(user.getMail()); //kayýt baþarýlýysa kullanýcýya onay maili gönderme
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+ " bilgileri güncellendi.");
	}

	@Override
	public void delete(User user) {
		
	}

	@Override
	public User get(int id) {
		return null;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getMail(String mail) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void signUp(User user) {
		
	}

	@Override
	public void signIn(User user) {
		System.out.println(user.getFirstName()+ " baþarýyla giriþ yaptý.");
		
	}

}
