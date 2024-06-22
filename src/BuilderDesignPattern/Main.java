package BuilderDesignPattern;

public class Main {
	
	public static void main(String[] args) {
		User user = new User.UserBuilder().setUserId("123").setUserName("ABC").setUserEmailId("abc@abc.com").build();
		System.out.println(user);
	}

}
