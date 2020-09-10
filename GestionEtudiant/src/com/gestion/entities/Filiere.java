package com.gestion.entities;

public class Filiere {

	private int id;
	private String intitule;
	
	public Filiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Filiere(int id, String intitule) {
		super();
		this.id = id;
		this.intitule = intitule;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	@Override
	public String toString() {
		return "Filiere [id=" + id + ", intitule=" + intitule + "]";
	}
	
	
	
	
}
