package MvcTest;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController {

	protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {
		List<User> userList = new ArrayList<User>();
		User userA = new User();
		User userB = new User();
		User userC = new User();
		userA.setName("zl");
		userA.setAge(21);
		userB.setName("zz");
		userB.setAge(22);
		userC.setName("zt");
		userC.setAge(23);
		userList.add(userA);
		userList.add(userB);
		userList.add(userC);
		return new ModelAndView("userlist", "users", userList);
	}
}
