package com.estudiante.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudiante.Model.Tema;
import com.estudiante.Service.ITemaService;
@RestController
public class TemaController {
	@Autowired
	ITemaService temaService;
	
	
	@PostMapping("/cursos/crearTema")
	public void saveTema(@RequestBody Tema tema) {
		temaService.saveTema(tema);
	}
	@PutMapping("/cursos/modificarTema")
	public void updateTema(@RequestBody Tema tema) {
		Tema temaModificar = temaService.findTema(tema.getId());
		
		temaModificar.setNombre(tema.getNombre());
		temaModificar.setDescripcion(tema.getDescripcion());
		
		this.saveTema(temaModificar);
	}

}
