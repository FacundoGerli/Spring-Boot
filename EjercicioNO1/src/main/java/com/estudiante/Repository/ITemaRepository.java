package com.estudiante.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.estudiante.Model.Tema;
@Repository
public interface ITemaRepository extends JpaRepository<Tema,Long> {
	
}
