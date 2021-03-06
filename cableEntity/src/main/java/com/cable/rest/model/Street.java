package com.cable.rest.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.cable.rest.constants.Status;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="street")
public class Street extends Audit implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter	@Setter	
	private Long streetId;
	
	@Column(nullable=false)
	@Getter	@Setter	
	private String streetName;
	
	@ManyToOne
	@JoinColumn(name="area_Id", nullable=false)
	@Getter	@Setter	
	private Area area;
	
	@Column(nullable=false)
	@Enumerated(EnumType.STRING)
	@Getter	@Setter	
	private Status status;
	
	
	
	

	
	
}
