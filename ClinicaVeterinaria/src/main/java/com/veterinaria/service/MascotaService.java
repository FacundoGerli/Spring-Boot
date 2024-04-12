package com.veterinaria.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veterinaria.dto.CanicheMascotaDTO;
import com.veterinaria.model.Mascota;
import com.veterinaria.repository.IMascotaRepository;
@Service
public class MascotaService implements IMascotaService{
	@Autowired
	IMascotaRepository mascotaRepo;
	@Override
	public void altaMascota( Mascota mascota) {
		mascotaRepo.save(mascota);
	}

	@Override
	public void eliminarMascota(Long id) {
		mascotaRepo.deleteById(id);
	}

	@Override
	public void modificarMascota(Mascota mascota) {
		Mascota mascotaModificar = this.buscarMascota(mascota.getId());
		
		mascotaModificar.setColor(mascota.getColor());
		mascotaModificar.setDueño(mascota.getDueño());
		mascotaModificar.setEspecie(mascota.getEspecie());
		mascotaModificar.setNombre(mascota.getNombre());
		mascotaModificar.setRaza(mascota.getRaza());
		
		this.altaMascota(mascotaModificar);
	}

	@Override
	public Mascota buscarMascota(Long id) {
		return mascotaRepo.findById(id).orElse(null);
	}
	public List<Mascota> buscarTodos(){
		return mascotaRepo.findAll();
	}
	public List<Mascota> buscarCaniches(){
		List<Mascota> mascotas = new ArrayList<Mascota>();
		List<Mascota> caniches = new ArrayList<Mascota>();
 		mascotas = this.buscarTodos();
		
		for(Mascota mascota:mascotas) {
			if((mascota.getEspecie().contentEquals("perro"))&&(mascota.getRaza().contentEquals("caniche"))) {
				caniches.add(mascota);
			}
		}
		return caniches;
	}
	public CanicheMascotaDTO busquedaPaciente(Long id_mascota) {
		CanicheMascotaDTO dto = new CanicheMascotaDTO();
		Mascota mascotaBuscada = this.buscarMascota(id_mascota);
		
		dto.setNombre_mascota(mascotaBuscada.getNombre());
		dto.setEspecie(mascotaBuscada.getEspecie());
		dto.setRaza(mascotaBuscada.getRaza());
		dto.setNombre_dueño(mascotaBuscada.getDueño().getNombre());
		dto.setApellido_dueño(mascotaBuscada.getDueño().getApellido());
		return dto;
	}

	@Override
	public List<Mascota> traerTodos() {
		return mascotaRepo.findAll();
	}

}
