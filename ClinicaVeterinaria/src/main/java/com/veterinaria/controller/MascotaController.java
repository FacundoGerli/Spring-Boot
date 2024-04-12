package com.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.veterinaria.dto.CanicheMascotaDTO;
import com.veterinaria.model.Mascota;
import com.veterinaria.service.IMascotaService;

@RestController
public class MascotaController {
	@Autowired
	IMascotaService mascotaServ;
	@PostMapping("/veterinaria/alta")
	public void altaMascota(@RequestBody Mascota mascota) {
		mascotaServ.altaMascota(mascota);
	}
	@DeleteMapping("/veterinaria/baja")
	public void bajaMascota(@RequestParam Long id) {
		mascotaServ.eliminarMascota(id);
	}
	@PutMapping("/veterinaria/modificar")
	public void modificarMascota(@RequestBody Mascota mascota) {
		mascotaServ.modificarMascota(mascota);
	}
	@GetMapping("/veterinaria/mostrarCaniches")
	public List<Mascota> mostrarCaniches(){
		return mascotaServ.buscarCaniches();
	}
	@GetMapping("/veterinaria/buscar/{id}")
	public CanicheMascotaDTO dtobuscar(@PathVariable Long id) {
		return mascotaServ.busquedaPaciente(id);
	}
	@GetMapping("/veterinaria/traerTodos")
	public List<Mascota> traerTodos(){
		return mascotaServ.traerTodos();
	}

}
