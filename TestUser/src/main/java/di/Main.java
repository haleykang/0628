package di;

import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String args[]) {

		System.out.println("1.Main 클래스 시작");
		GenericXmlApplicationContext context = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		UserService service = context.getBean("create", UserService.class);
		// UserDao에 의존성 주입해서 생략 가능
		/*
		 * UserDao userDao = new UserDao(); 
		 * service.setUserDao(userDao);
		 */
		System.out.println("6.Main : " + service.getUser());
		context.close();
	}
}
