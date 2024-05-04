package ch07.ex03.dao;

import ch07.ex03.domain.User;

public interface UserDao {
	public User selectUser(); // reading
	public void insertUser(User user); // writing (추가, 수정, 삭제)
	public void updateUser(String userName);
	public void deleteUser();
}
