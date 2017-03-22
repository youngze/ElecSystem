package com.young.elec.dao;

import java.io.Serializable;

import com.young.elec.domain.ElecText;

public interface ICommonDao<T> {

	public void save(T entity);
	void update(T entity);
	T findObjectByID(Serializable id);
	
}
