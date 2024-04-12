package com.estudiante.Service;


import java.util.List;
import org.springframework.stereotype.Service;
import com.estudiante.Model.Curso;

@Service
public interface ICursoService {
	
	public void saveCurso(Curso curso);
	public void deleteCurso(Long id);
	public void updateCurso(Curso curso);
	public List<Curso> findAllCurso();
	public Curso findCurso(Long id);
	public List<Curso> findName(String name);
}
