package local.myjsp.persist.dao;

import java.util.List;

import local.myjsp.entity.User;
import local.myjsp.persist.dao.UserDAO;


//Question疑问：
//	这里把访问DAO的服务封装成静态的方法都有什么坏处？
//	好处：	用起来更简单优雅
//	坏处：	难以调试
//但是还有没有别的坏处呢?
public class UserService {
	
	private static final UserDAO dao= new UserDAO(); 
 
	public static User findById(int id) {
		dao.openCurrentSession(); 
	    User u = dao.findById(id); 
	    dao.closeCurrentSession();
	    return u;
	}

    public static List<User> findAll() {
        dao.openCurrentSession();
        List<User> uList = dao.findAll();
        //dao.closeCurrentSession();
        return uList;
    }

    public static void save(User u) {
        dao.openCurrentSessionWithTransaction();
        dao.save(u);
        //dao.closeCurrentSessionWithTransaction();
    }

    public static void update(User u) {
        dao.openCurrentSessionWithTransaction();
        dao.update(u);
        //dao.closeCurrentSessionWithTransaction();
    }

    public static void delete(int id) {
        dao.openCurrentSessionWithTransaction();
        User u = dao.findById(id);
        dao.delete(u);
        //dao.closeCurrentSessionWithTransaction();
    }

    public static void deleteAll() {
        dao.openCurrentSessionWithTransaction();
        dao.deleteAll();
        // dao.closeCurrentSessionWithTransaction();
    }
}
