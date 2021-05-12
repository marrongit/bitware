package com.bitwaret.bitwaretestt.dao;

import org.springframework.stereotype.Component;

import com.bitwaret.bitwaretestt.entity.ClienteEntity;

public interface ClienteDao {

	ClienteEntity getCliente(ClienteEntity cte);
	void addCliente(ClienteEntity cte);
	void updateCliente(ClienteEntity cte);
}
