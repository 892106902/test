package cn.bc.test;

import static org.junit.Assert.assertEquals;

import cn.bc.domain.User;
import cn.bc.service.UserServiceImpl;
import org.junit.Test;

import java.util.List;


public class MainTest {
	//测试plus方法
	@Test
	public void testPlus() {
		assertEquals(7,Main.plus(3,4));
	}
	@Test
	public void testFindAll(){
		UserServiceImpl usi= new UserServiceImpl();
		List<User> list =usi.findAll();
		for(User user:list){
			System.out.println(user);
		}
	}
}
