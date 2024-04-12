package com.veterinaria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.veterinaria.model.Dueño;
import com.veterinaria.repository.IDueñoRepository;
@Service
public class DueñoService implements IDueñoService {
	@Autowired
	IDueñoRepository dueñoRepo;

	@Override
	public void altaDueño(@RequestBody Dueño dueño) {
		dueñoRepo.save(dueño);
	}

	@Override
	public void bajaDueño(Long id) {
		dueñoRepo.deleteById(id);
	}

	@Override
	public void modificacionDueño(Dueño dueño) {
		Dueño dueñoCambiar = buscarDueño(dueño.getId());
		
		dueñoCambiar.setApellido(dueño.getApellido());
		dueñoCambiar.setCelular(dueño.getCelular());
		dueñoCambiar.setDni(dueño.getDni());
		dueñoCambiar.setNombre(dueño.getNombre());
		
		this.altaDueño(dueñoCambiar);
		
	}

	@Override
	public Dueño buscarDueño(Long id) {
		return dueñoRepo.findById(id).orElse(null);
		
	}

}
