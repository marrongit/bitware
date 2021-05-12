package com.bitwaret.bitwaretestt.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitwaret.bitwaretestt.dao.ClienteDao;
import com.bitwaret.bitwaretestt.entity.ClienteEntity;
import com.bitwaret.bitwaretestt.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	ClienteDao clienteDao;

	@Override
	public ClienteEntity getCliente(ClienteEntity cte) {
		// TODO Auto-generated method stub
		return clienteDao.getCliente(cte);
	}

	@Override
	public void addCliente(ClienteEntity cte) {
		// TODO Auto-generated method stub
		clienteDao.addCliente(cte);
		
	}

	@Override
	public void updateCliente(ClienteEntity cte) {
		// TODO Auto-generated method stub
		clienteDao.updateCliente(cte);
	}

}
