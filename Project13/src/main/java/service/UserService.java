package service;

import java.util.List;

import entity.User;

public interface UserService {

	List<User> list(String text);
	
	void add(User user);
	
	void update(User user);
	
	void delete(String id);

	User getById(String id);
	
}
