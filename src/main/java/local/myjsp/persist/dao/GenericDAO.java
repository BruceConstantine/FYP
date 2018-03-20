package local.myjsp.persist.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import local.myjsp.persist.DBHelper;

interface GenericDAO<T, Id extends Serializable> {

	// --- contract ---
    public abstract T findById(Id id);

    public abstract List<T> findAll();

    public abstract void save(T entity);

    public abstract void update(T entity);

    public abstract void delete(T entity);

    public abstract void deleteAll();
   
	
}
