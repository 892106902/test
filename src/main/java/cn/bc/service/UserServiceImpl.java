package cn.bc.service;

import cn.bc.domain.User;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by bcsoft on 2015/12/3.
 */
@Service
public class UserServiceImpl implements UserService {
	//获取管理工具类
	private static EntityManagerFactory entityManagerFactory = null;

	private static EntityManager openEntityManager() {
		if (entityManagerFactory == null) {
			entityManagerFactory = Persistence.createEntityManagerFactory("mypostgres");
		}
		return entityManagerFactory.createEntityManager();
	}

	//插入数据
	private void insertUser(User user) throws Exception {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		User user1 = new User();
		user.setId(1);
		user.setCode("001");
		user.setName("小明");
		//持久化实体
		entityManager.persist(user); // cascades the tool & skill relationships
		entityManager.getTransaction().commit();
	}

	//更新
	public void update() {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, 1);
		user.setName("hmk"); //user为托管状态
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void update2() {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, 1);
		entityManager.clear(); //把实体管理器中的所有实体变为脱管状态
		user.setName("hmk2");
		entityManager.merge(user); //把脱管状态变为托管状态,merge可以自动选择insert or update 数据
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	//删除
	public void remove() {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, 1);
		entityManager.remove(user); //删除实体
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void find() {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		User user = entityManager.find(User.class, 1);
	}

	public void find2() {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		User user = entityManager.getReference(User.class, 2); //类似于hibernate的load方法,延迟加载.没相应数据时会出现异常
		System.out.println(user.getName()); //真正调用时才查找数据

	}

	public List<User> findAll() {
		EntityManager entityManager = openEntityManager();
		//开启事务
		entityManager.getTransaction().begin();
		Query query = entityManager.createQuery("from User", User.class);
		List<User> list = query.getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return list;
	}

}
