package com.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssh.dao.PlayerDao;
import com.ssh.entity.Player;
import com.ssh.service.TestService;
@Service
public class TestServiceImpl implements TestService {

	@Autowired
	private PlayerDao pd;
	
	
	@Override
	public Long save() {
		Player pl = new Player();
		pl.setId("");
		pl.setName("����˹.����ŵ.���ɶ���");
		pl.setNum(7);
		return pd.save(pl);
	}

}
