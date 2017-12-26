package com.qhit.lh.g4.syw.t8.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.qhit.lh.g4.syw.t8.dao.BaseDao;
import com.qhit.lh.g4.syw.t8.utils.HibernateSessionFactory;


public class BaseDaoImpl<Emp> implements BaseDao {
	
	private  Session session = HibernateSessionFactory.getSession();
	private  Transaction tx=session.beginTransaction();
	
	public void add(Object obj) {
		session.save(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public void delete(Object obj) {
		session.delete(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public void update(Object obj) {
		session.update(obj);
		tx.commit();
		HibernateSessionFactory.closeSession();
	}

	public List<Object> queryAll(String  tableName) {
		List<Object> list = new ArrayList<Object>();
		list = session.createQuery(tableName).list();
		tx.commit();
		HibernateSessionFactory.closeSession();
		return list;
	}


	@Override
	public Object getObjectById(Class class1, int i) {
		// TODO Auto-generated method stub
		Object obj = session.get(class1, i);
		tx.commit();
		HibernateSessionFactory.closeSession();
		return obj;
	}

	@Override
	public List<Emp> getEmpByName(String name) {
		Session session = HibernateSessionFactory.getSession();
		
		String hql = "select e from Emp e where e.ename like ?";
		Query query = session.createQuery(hql);
		query.setString(0, name);
		
		return query.list();
	}

}
