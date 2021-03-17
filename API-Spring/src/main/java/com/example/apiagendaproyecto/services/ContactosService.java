package com.example.apiagendaproyecto.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apiagendaproyecto.models.Contactos;
import com.example.apiagendaproyecto.repositories.ContactosRepository;
import com.example.apiagendaproyecto.services.IContactosService;
@Service
public class ContactosService implements IContactosService{

	@Autowired
	private ContactosRepository contactosRepo;
	@Override
	public Contactos create(Contactos c) {
		return contactosRepo.save(c);
	}

	@Override
	public Contactos update(Contactos c) {
		return contactosRepo.save(c);
	}

	@Override
	public Contactos findById(Integer id) {
		Optional<Contactos> contactosOptional = contactosRepo.findById(id);
		return contactosOptional.orElse(null);
	}

	@Override
	public List<Contactos> findall() {
		return contactosRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		contactosRepo.deleteById(id);
		
	}

}
