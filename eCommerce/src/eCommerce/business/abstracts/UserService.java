package eCommerce.business.abstracts;

import java.util.List;

import eCommerce.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User get(int id);
	List<User> getAll();
	boolean getMail(String mail);
	boolean getPassword(String password);
	void signUp(User user);
	void signIn(User user);

}
