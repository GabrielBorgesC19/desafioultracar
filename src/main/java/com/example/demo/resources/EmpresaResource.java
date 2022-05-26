package com.example.demo.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.EmpresaDTO;
import com.example.demo.services.EmpresaService;

@RestController
@RequestMapping(value = "/empresas")

public class EmpresaResource {
	
	@Autowired
	private EmpresaService service;
	
	@GetMapping
	public ResponseEntity<List<EmpresaDTO>> findAll() {
		List<EmpresaDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);

	}
	
	

}