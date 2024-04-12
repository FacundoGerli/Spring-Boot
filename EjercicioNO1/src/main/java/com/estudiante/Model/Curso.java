package com.estudiante.Model;

import java.util.Date;
import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	private Modalidad modalidad;
	private String fecha_finalizacion;
	@OneToMany(mappedBy="curso")
	private List<Tema> listaTemas;
	
	public Curso() {
	}

	public Curso(Long id, String nombre, Modalidad modalidad, String fecha_finalizacion, List<Tema> listaTemas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.modalidad = modalidad;
		this.fecha_finalizacion = fecha_finalizacion;
		this.listaTemas = listaTemas;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Modalidad getModalidad() {
		return modalidad;
	}

	public void setModalidad(Modalidad modalidad) {
		this.modalidad = modalidad;
	}

	public String getFecha_finalizacion() {
		return fecha_finalizacion;
	}

	public void setFecha_finalizacion(String fecha_finalizacion) {
		this.fecha_finalizacion = fecha_finalizacion;
	}

	public List<Tema> getListaTemas() {
		return listaTemas;
	}

	public void setListaTemas(List<Tema> listaTemas) {
		this.listaTemas = listaTemas;
	}
	
}
