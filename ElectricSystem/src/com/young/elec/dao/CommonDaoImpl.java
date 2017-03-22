package com.young.elec.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.young.elec.domain.ElecText;

public class CommonDaoImpl<T> extends HibernateDaoSupport implements ICommonDao<T> {

	public void save(T entity) {
		this.getHibernateTemplate().save(entity);
	}

	@Resource(name="sessionFactory")
	public final void setSessionFactoryDi(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(entity);
	}

	@Override
	public T findObjectByID(Serializable id) {
		ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
		Class entity = (Class)pt.getActualTypeArguments()[0];		
		return (T) this.getHibernateTemplate().get(ElecText.class, id);
	}
	
}
