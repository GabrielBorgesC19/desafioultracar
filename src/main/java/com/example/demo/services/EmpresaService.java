package com.example.demo.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.EmpresaDTO;
import com.example.demo.entities.Empresa;
import com.example.demo.repositories.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository repository;

	@Transactional(readOnly = true)
	public List<EmpresaDTO> findAll() {
		List<Empresa> list = repository.findAll();
		List<EmpresaDTO> listDTO = list.stream().map(x -> new EmpresaDTO(x)).collect(Collectors.toList());
		return listDTO;
	}

}
