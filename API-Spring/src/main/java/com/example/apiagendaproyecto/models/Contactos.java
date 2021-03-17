package com.example.apiagendaproyecto.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;
@Entity
@Table(name="contactos")
public class Contactos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idContacto;
	@Column(name="nombre", nullable=false, length=50)
	private String nombre;
	@Column(name="apellido", nullable=false, length=50)
	private String apellido;
	@Column(name="telefono", nullable=false, length=10)
	private String telefono;
	@Column(name="email", nullable=false, length=50)
	private String email;
	
	//GET AND SET	
		public Integer getIdCliente() {
			return idContacto;
		}
		public void setIdCliente(Integer idContacto) {
			this.idContacto = idContacto;
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public String getApellido() {
			return apellido;
		}
		public void setApellido(String apellido) {
			this.apellido = apellido;
		}
		
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
	
}
