package com.veterinaria.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import com.veterinaria.model.Dueño;
import com.veterinaria.service.IDueñoService;
@RestController
public class DueñoController {
	@Autowired
	IDueñoService dueñoServ;
	@PostMapping("/dueño/alta")
	public void altaDueño(@RequestBody Dueño dueño) {
		dueñoServ.altaDueño(dueño);
	}
	@DeleteMapping("/dueño/baja")
	public void bajaDueño(@RequestParam Long id) {
		dueñoServ.bajaDueño(id);
	}
	@PutMapping("/dueño/modificar")
	public void modificarDueño(@RequestBody Dueño dueño) {
		dueñoServ.modificacionDueño(dueño);
	}
	@GetMapping("/dueño/buscar")
	public Dueño traerDueño(@RequestParam Long id){
		return dueñoServ.buscarDueño(id);
	}
}
