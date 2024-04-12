package com.estudiante.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudiante.Model.Curso;
import com.estudiante.Repository.ICursoRepository;
@Service
public class CursoService implements ICursoService{
	@Autowired
	ICursoRepository cursoRepo;

	@Override
	public void saveCurso(Curso curso) {
		cursoRepo.save(curso);
	}

	@Override
	public void deleteCurso(Long id) {
		cursoRepo.deleteById(id);
	}

	@Override
	public void updateCurso(Curso curso) {
		Curso cursoActual = this.findCurso(curso.getId());
		
		cursoActual.setNombre(curso.getNombre());
		cursoActual.setModalidad(curso.getModalidad());
		cursoActual.setListaTemas(curso.getListaTemas());
		cursoActual.setFecha_finalizacion(curso.getFecha_finalizacion());
		
		this.saveCurso(cursoActual);
		
	}

	@Override
	public List<Curso> findAllCurso() {
		return cursoRepo.findAll();
	}

	@Override
	public Curso findCurso(Long id) {
		return cursoRepo.findById(id).orElse(null);
	}

	@Override
	public List<Curso> findName(String name) {

		
		List<Curso> cursos = new ArrayList<Curso>();
		cursos = this.findAllCurso();
		
		List<Curso> cursosCompatibles = new ArrayList<Curso>();
		
		for(Curso cursoComparar:cursos) {
			if(cursoComparar.getNombre().contains(name)) {
				cursosCompatibles.add(cursoComparar);
			}
		}
		return null;
	}

}
