package com.dordox.delivery.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dordox.delivery.entity.Clients;

@RestController
public class ClientsController {
	
	@PersistenceContext
	private EntityManager manager;
	
	@GetMapping("/clientes")
	public List<Clients> listar() {
		return manager.createQuery("from Clients", Clients.class).getResultList();
	}
}
