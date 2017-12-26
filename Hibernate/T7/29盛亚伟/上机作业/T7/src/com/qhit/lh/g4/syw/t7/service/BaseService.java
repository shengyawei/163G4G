package com.qhit.lh.g4.syw.t7.service;

import java.util.List;

import com.qhit.lh.g4.syw.t7.bean.Emp;

public interface BaseService {
	public void add(Object obj);
	public void delete(Object obj);
	public void update(Object obj);
	public List<Object> queryAll(String tableName);
	Object getObjectById(Class class1, int i);
	public List<Emp> getEmpByName(String name);
}
