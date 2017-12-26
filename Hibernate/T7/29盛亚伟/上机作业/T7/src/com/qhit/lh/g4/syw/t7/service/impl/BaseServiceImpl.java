package com.qhit.lh.g4.syw.t7.service.impl;

import java.util.List;

import javax.xml.registry.infomodel.User;

import com.qhit.lh.g4.syw.t7.bean.Emp;
import com.qhit.lh.g4.syw.t7.dao.BaseDao;
import com.qhit.lh.g4.syw.t7.dao.impl.BaseDaoImpl;
import com.qhit.lh.g4.syw.t7.service.BaseService;

public class BaseServiceImpl implements BaseService {
	private BaseDao baseDao = new BaseDaoImpl();
	public void add(Object obj) {
		baseDao.add(obj);
	}

	public void delete(Object obj) {
		baseDao.delete((User) obj);
	}

	public void update(Object obj) {
		baseDao.update((User) obj);
	}

	public List<Object> queryAll(String tableName) {
		return baseDao.queryAll(tableName);
	}

	@Override
	public Object getObjectById(Class class1, int i) {
		// TODO Auto-generated method stub
		return baseDao.getObjectById(class1, i);
	}

	@Override
	public List<Emp> getEmpByName(String name) {
		// TODO Auto-generated method stub
		return baseDao.getEmpByName(name);
	}
}
