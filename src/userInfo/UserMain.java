package userInfo;

public class UserMain {

	@SuppressWarnings("resource")
	public static void main(String[] args) {


		User user=new User ();
		
		user.setUsername("Ali");
		user.setPassword("aaa");
		user.setActive(false);
		user.setSignedIn(false);
		System.out.println( user.getId() + user.getUsername() + user.getPassword() + user.isActive() + user.isSignedIn() );
		
	}

}
