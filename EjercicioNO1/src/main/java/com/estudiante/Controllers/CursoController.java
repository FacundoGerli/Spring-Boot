package com.estudiante.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.estudiante.Model.Curso;
import com.estudiante.Model.Tema;
import com.estudiante.Service.ICursoService;

@RestController
public class CursoController {
@Autowired
ICursoService cursoService;
	//Crear un nuevo curso
	@PostMapping("/cursos/save")
	public void saveCurso(@RequestBody Curso curso) {
		cursoService.saveCurso(curso);
	}
	@GetMapping("/cursos/mostrarTemas/{id}")
	public List<Tema> traerTemas(@PathVariable Long id){
		return cursoService.findCurso(id).getListaTemas();
	}
	//obtener todos los cursos
	@GetMapping("/cursos/findAll")
	public List<Curso> findAllCurso(){
		return cursoService.findAllCurso();
	}
	@GetMapping("/cursos/java")
	//obtener todos los cursos que incluyan en su nombre "Java"
	public List<Curso> findJavaCurso(){
		return cursoService.findName("Java");
	}
	@PutMapping("/cursos/modificar/")
	//Modificar los datos de un curso
	public void updateCurso(@RequestBody Curso curso) {
		cursoService.updateCurso(curso);
		return;
	}	
	
}
