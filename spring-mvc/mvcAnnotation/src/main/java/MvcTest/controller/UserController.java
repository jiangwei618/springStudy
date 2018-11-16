package MvcTest.controller;

import MvcTest.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController  {
	@RequestMapping(value = "user.html",method = {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView handleRequestInternal() throws Exception {
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

