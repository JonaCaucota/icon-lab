package com.alkemy.icons.icons.service;

import org.springframework.stereotype.Service; 

import com.alkemy.icons.icons.dto.ContinenteDTO;

@Service
public class ContinenteService {
	
	public ContinenteDTO save(ContinenteDTO dto) {
		System.out.println("GUARDAR CONTINENTE");
		return dto;
	}
}
