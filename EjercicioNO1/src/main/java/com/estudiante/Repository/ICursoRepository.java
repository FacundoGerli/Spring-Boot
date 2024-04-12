package com.estudiante.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.estudiante.Model.Curso;

@Repository
public interface ICursoRepository extends JpaRepository<Curso,Long> {
	
}
