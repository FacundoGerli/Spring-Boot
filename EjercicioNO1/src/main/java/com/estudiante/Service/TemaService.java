package com.estudiante.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.estudiante.Model.Tema;
import com.estudiante.Repository.ITemaRepository;
@Service
public class TemaService implements ITemaService {
	@Autowired
	ITemaRepository temaRepo;

	@Override
	public void saveTema(Tema tema) {
		temaRepo.save(tema);
	}

	@Override
	public void deleteTema(Long id) {
		temaRepo.deleteById(id);
	}

	@Override
	public void updateTema(Long id, String nombre, String descripcion) {
		Tema temaActual = this.findTema(id);
		
		temaActual.setDescripcion(descripcion);
		temaActual.setId(id);
		temaActual.setNombre(nombre);
		
		this.saveTema(temaActual);
	}

	@Override
	public List<Tema> findAllTema() {
		return temaRepo.findAll();
	}

	@Override
	public Tema findTema(Long id) {
		return temaRepo.findById(id).orElse(null);
	}

}
