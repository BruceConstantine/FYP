package local.myjsp.persist.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import local.myjsp.entity.User;
import local.myjsp.persist.DBHelper;

import java.io.Serializable;
import java.util.List;

import javax.persistence.criteria.*;
/*
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
*/
import javax.persistence.criteria.Root;

// 接口GenericDAO的类型为：GenericDAO<T, Id extends Serializable>
//											但是在实现时，必须给出类型
class UserDAO implements GenericDAO< User , Integer >{ //Integer extends form Number, and Number implements Serializable

	private Session currentSession ;
	private Transaction currentTransaction ;
	
	public UserDAO() {
		currentSession 		= DBHelper.getSession();
		currentTransaction 	= null;
	}
	 
	//-------- getter and setter ---------
	public Session getCurrentSession() {
		return currentSession;
	}
	//currentSession setter is Useful?
	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	} 

	
	// ----open current session for R (read)-----
	public void openCurrentSession() { 
		if (currentSession == null){
			currentSession = DBHelper.getSession();
		}
	}
	
	public void closeCurrentSession() {
		currentSession.close();
	}
 
	// ----open current session and transaction for CUD (Create Update Delete)-----
	public Session openCurrentSessionWithTransaction() {
        openCurrentSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSessionWithTransaction() {
    	try{
    		currentTransaction.commit();
    	} catch(Exception e) {
    		if (currentTransaction != null)
    			currentTransaction.rollback();
        	e.printStackTrace();
        } finally {
        	currentSession.close();
		}
    }

	// -------- Override Method From Subclass --------
	public User findById(Integer id) {
		//根据主键查询：
		return getCurrentSession().get(User.class, id);
	}
	
	public List<User> findAll() {
        CriteriaBuilder builder = getCurrentSession().getCriteriaBuilder();
        System.err.println("!!!!!!!!!!");
        CriteriaQuery<User> query = builder.createQuery(User.class);
        System.err.println("####### ");
        Root<User> uRoot = query.from(User.class);
        query.select(uRoot);
        List<User> uList = getCurrentSession().createQuery(query)
                								.getResultList();
        return uList;
	}
	
	public void save(User entity) {
        getCurrentSession().save(entity);
	}
	
	public void update(User entity) {
		 getCurrentSession().update(entity);
	}
	
	public void delete(User entity) {
		 getCurrentSession().delete(entity);
	}
	
	public void deleteAll() {
		List<User> uList = findAll();
		for(User u : uList) {
	        delete(u);
	    }
	}
	
}
