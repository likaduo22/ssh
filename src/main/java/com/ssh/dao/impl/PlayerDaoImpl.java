package com.ssh.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ssh.dao.PlayerDao;
import com.ssh.entity.Player;
@Repository
public class PlayerDaoImpl implements PlayerDao{

	 @Autowired
	 private SessionFactory sessionFactory;
	 private Session getCurrentSession() {
	        return this.sessionFactory.openSession();
	    }

	
	@Override
	public List<Player> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long save(Player entity) {
		// TODO Auto-generated method stub
		return (Long)getCurrentSession().save(entity);
	}

}
