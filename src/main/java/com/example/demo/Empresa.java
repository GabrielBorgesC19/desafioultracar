package com.example.demo;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table (name = "empresa")
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String cnpj;
	
	@OneToMany(mappedBy = "empresa", fetch = FetchType.EAGER)
	@Cascade(CascadeType.ALL)
	private List<Meta> meta;
	
	@OneToMany(mappedBy = "empresa")
	@Cascade(CascadeType.ALL)
	private List<Funcionario> funcionario;
	
	
	
}
