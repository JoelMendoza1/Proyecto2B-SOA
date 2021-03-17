package com.example.apiagendaproyecto.services;

import java.util.List;

import com.example.apiagendaproyecto.models.Contactos;

public interface IContactosService {
	Contactos create (Contactos c);
	
	Contactos update (Contactos c);
	
	Contactos findById (Integer id);
	
	List<Contactos> findall ();
	
	void delete(Integer id);
}
