package cn.bc.web.struts2;

import cn.bc.domain.User;
import cn.bc.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by bcsoft on 2015/12/4.
 */
@Controller
public class UserViewAction extends ActionSupport {
	public List<User> users;

	@Autowired
	private UserService userService;
	@Override
	public String execute() throws Exception {

		this.users = userService.findAll();

		return SUCCESS;
	}
}
