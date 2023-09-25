package Exception;

public class LoginExc {
 public static void main(String[] args) throws LoginException{
	auth("Kartik","1234");
}

public static void auth(String login, String pwd) throws LoginException{
	if(!"admin".equals(login) && !"admin".equals(pwd) ) {
		LoginException l = new LoginException();
		throw l;
	}else {
		System.out.println("User login success");
	}
	
}

}