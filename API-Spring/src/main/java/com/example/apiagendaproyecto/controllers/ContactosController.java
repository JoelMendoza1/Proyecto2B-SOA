package com.example.apiagendaproyecto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.apiagendaproyecto.models.Contactos;
import com.example.apiagendaproyecto.services.ContactosService;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/contactos")

public class ContactosController {
	@Autowired
	private ContactosService contactosservice;
	
	@GetMapping
	public List<Contactos> findAll(){
		return contactosservice.findall();
	}
	
	@PostMapping
	public Contactos create ( @RequestBody Contactos c) {
		return contactosservice.create(c);
	}
	
	
		
	@GetMapping("/{id}")
	public  Contactos findById (@PathVariable("id") Integer id) {
		return contactosservice.findById(id);
	}
	
	
	@PutMapping ("/{id}")
	public Contactos update ( @RequestBody Contactos c, @PathVariable("id") Integer id) {
		c.setIdCliente(id);
		return contactosservice.update(c);
	}
	
	
	
	@DeleteMapping ("/{IdCliente}")
	public void delete (@PathVariable("IdCliente") Integer IdCliente) {
		contactosservice.delete(IdCliente);
	}
}
