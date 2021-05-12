package com.bitwaret.bitwaretestt.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bitwaret.bitwaretestt.entity.ClienteEntity;
import com.bitwaret.bitwaretestt.service.ClienteService;

@RestController
@RequestMapping("cliente")
public class ClienteController {
	
	@Autowired
	private ClienteService service;

	@GetMapping("/")
	private ResponseEntity<String> test(){
		return new ResponseEntity<String>("test",HttpStatus.OK);
	}
	
	@PostMapping("/agregar")
	private ResponseEntity<String> agregar(@RequestBody ClienteEntity cliente){
		cliente.setFecha_creacion(new Date());
		if(validateClient(cliente.getCorreo_electronico()) == false) {
			service.addCliente(cliente);
		} else {
			return new ResponseEntity<String>("Ya esta agregado el cliente",HttpStatus.OK);
		}
		return new ResponseEntity<String>("agregado",HttpStatus.OK);
	}
	
	@GetMapping("/consultar")
	private ResponseEntity<ClienteEntity> consultar(@RequestParam("correo") String email){
		ClienteEntity cliente = new ClienteEntity();
		cliente.setCorreo_electronico(email);
		cliente = service.getCliente(cliente);
		return new ResponseEntity<ClienteEntity>(cliente,HttpStatus.OK);
	}
	
	@PostMapping("/actualizar")
	private ResponseEntity<String> actualizar(@RequestBody ClienteEntity cliente){
		cliente.setFecha_actualizacion(new Date());
		service.updateCliente(cliente);
		return new ResponseEntity<String>("actualizado",HttpStatus.OK);
	}
	
	private Boolean validateClient(String email) {
		ClienteEntity cliente = new ClienteEntity();
		cliente.setCorreo_electronico(email);
		cliente = service.getCliente(cliente);
		if(cliente != null) return true;
		return false;
	}
}
