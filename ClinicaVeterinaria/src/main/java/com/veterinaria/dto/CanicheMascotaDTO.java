package com.veterinaria.dto;

public class CanicheMascotaDTO {
	private String nombre_mascota;
	private String especie;
	private String raza;
	private String nombre_dueño;
	private String apellido_dueño;
	
	public CanicheMascotaDTO() {
		
	}
	
	public CanicheMascotaDTO(String nombre_mascota, String especie, String raza, String nombre_dueño,
			String apellido_dueño) {
		super();
		this.nombre_mascota = nombre_mascota;
		this.especie = especie;
		this.raza = raza;
		this.nombre_dueño = nombre_dueño;
		this.apellido_dueño = apellido_dueño;
	}

	public String getNombre_mascota() {
		return nombre_mascota;
	}

	public void setNombre_mascota(String nombre_mascota) {
		this.nombre_mascota = nombre_mascota;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre_dueño() {
		return nombre_dueño;
	}

	public void setNombre_dueño(String nombre_dueño) {
		this.nombre_dueño = nombre_dueño;
	}

	public String getApellido_dueño() {
		return apellido_dueño;
	}

	public void setApellido_dueño(String apellido_dueño) {
		this.apellido_dueño = apellido_dueño;
	}
	
	

}
