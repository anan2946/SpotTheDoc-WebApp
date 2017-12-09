package SpotTheDoc;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class LoginController {
	@RequestMapping(method=RequestMethod.POST , value="/login")
	public RoleType loginRequest(@RequestBody User user) {
		//to do authenticate User		
		System.out.println("login Request:"+user.getPassword()+"  user name"+user.getUserName());
		return user.login();
	}
	
	@RequestMapping("/register")
	public Boolean registerRequest() {
		//to do authenticate User
		System.out.println(" register user reuqest ");
		return true;
	}
	
	@RequestMapping("/test")
	public String testCall() {
		//to do authenticate User
		System.out.println(" register user reuqest ");
		return "Hello";
	}
	
	
}
