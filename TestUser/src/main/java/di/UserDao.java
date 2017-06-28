package di;

import org.springframework.stereotype.Component;

import di.User;

@Component
public class UserDao {

	public User getUser() {

		System.out.println("UserDao : getUser()");

		User user = new User();

		user.setId("알로하");
		user.setPw("안알랴줌");

		String temp = user.toString();
		System.out.println("UserDao : " + temp);

		return user;
	}

}
