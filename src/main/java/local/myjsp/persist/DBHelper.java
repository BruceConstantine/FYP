package local.myjsp.persist;  

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBHelper {

	/* 单例模式*/
	private static final SessionFactory sessionFactory = initHibernateConfig();
	
	private DBHelper(){	}
	
	private static SessionFactory initHibernateConfig(){ 
		//1. 创建配置主文件对象hibernate.hbm.xml
		Configuration config = new Configuration().configure(); // configure()方法加载配置文件
		//2. 加载配置文件之后就可以创建sessionFactory了
		SessionFactory sessionFactory = config.buildSessionFactory(); //  
		return sessionFactory ;
	}

	public static Session getSession(){ 
		if (sessionFactory == null) {
			throw new NullPointerException();
		}
		//3. “获取” session对象 
		return sessionFactory.openSession();//getCurrentSession();与openSession()的区别？	  // 这里的就是在配置文件中配置的thread类型的session
	}

	public static synchronized SessionFactory getSessionFactory(){
		return sessionFactory;
	}

	public static synchronized void closeSessionFactory(){
		sessionFactory.close();
	} 
	
}
