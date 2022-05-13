package com.alkemy.icons.icons.entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "icon")
@Getter
@Setter
public class IconEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String imagen;
	
	private String denominacion;
	
	
	@Column(name = "fecha_creacion")
	@DateTimeFormat(pattern = "yyyy/MM/dd")
	private LocalDate fechaCreacion;
	
	private Long altura;
	
	private String historia;
	
	@ManyToMany(mappedBy = "icons", cascade = CascadeType.ALL )
	private List<PaisEntity> paises = new ArrayList<>();
	
	//add and remove paises
	
	public void addPais(PaisEntity pais) {
		this.paises.add(pais);
	}
	
	public void removePais(PaisEntity pais) {
		this.paises.remove(pais);
	}
	
}
