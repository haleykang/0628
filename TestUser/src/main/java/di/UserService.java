package di;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

	@Autowired
	private UserDao userDao;
	
	// @Autowired를 추가했기 때문에 자동 대입
	/*
	 * public void setUserDao(UserDao userDao) { this.userDao = userDao;
	 * System.out.println("UserService : " + userDao);
	 * System.out.println("3.UserService : setUserDao(UserDao userDao)"); }
	 */

	public User getUser() {
		System.out.println("4.UserService : getUser()");
		return userDao.getUser();
	}

}
