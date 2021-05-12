package com.bitwaret.bitwaretestt.service;


import com.bitwaret.bitwaretestt.entity.ClienteEntity;

public interface ClienteService {

	ClienteEntity getCliente(ClienteEntity cte);
	void addCliente(ClienteEntity cte);
	void updateCliente(ClienteEntity cte);
}
