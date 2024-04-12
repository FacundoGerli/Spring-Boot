package com.veterinaria.service;

import java.util.List;

import com.veterinaria.dto.CanicheMascotaDTO;
import com.veterinaria.model.Mascota;

public interface IMascotaService {
	public void altaMascota(Mascota mascota);
	public void eliminarMascota(Long id);
	public void modificarMascota(Mascota mascota);
	public Mascota buscarMascota(Long id);
	public List<Mascota> buscarCaniches();
	public CanicheMascotaDTO busquedaPaciente(Long id_mascota);
	public List<Mascota> traerTodos();
}
