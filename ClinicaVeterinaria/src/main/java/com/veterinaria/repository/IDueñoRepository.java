package com.veterinaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.veterinaria.model.Dueño;

@Repository
public interface IDueñoRepository extends JpaRepository<Dueño,Long>{
}
