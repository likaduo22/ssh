package com.ssh.dao;

import java.io.Serializable;
import java.util.List;

public interface DoMainDao<T,PK extends Serializable> {
	
	List<T> findAll();
	
	PK save(T entity);
	

}
