package com.estudiante.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.estudiante.Model.Tema;
@Service
public interface ITemaService {
	
	public void saveTema(Tema tema);
	public void deleteTema(Long id);
	public void updateTema(Long id,String nombre,String descripcion);
	public List<Tema> findAllTema();
	public Tema findTema(Long id);

}
