package com.veterinaria.service;

import org.springframework.stereotype.Service;

import com.veterinaria.model.Dueño;

@Service
public interface IDueñoService {
	public void altaDueño(Dueño dueño);
	public void bajaDueño(Long id);
	public void modificacionDueño(Dueño dueño);
	public Dueño buscarDueño(Long id);
}
