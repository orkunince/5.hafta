import eCommerce.business.concretes.UserCheckManager;
import eCommerce.business.concretes.UserManager;
import eCommerce.business.concretes.VerificationManager;
import eCommerce.dataAccess.concretes.HibernateUserDao;
import eCommerce.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Orkun", "Ýnce", "orkun@gmail.com", "1234885");

		User user2 = new User(2, "Soner", "Sarýkabadayý", "soner@mail.com", "678910");

		User user3 = new User(3, "Murat", "Boz", "murat@acun.com", "56743");

		UserManager userManager = new UserManager(new UserCheckManager(), new VerificationManager(),
				new HibernateUserDao());
		
		userManager.add(user1);
		
		userManager.signIn(user1);

	}

}
