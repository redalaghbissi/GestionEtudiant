package com.gestion.entities;

public class Etudiant {
	private long id;
	private String nom;
	private String prenom;
	private String email;
	private long cne;
	private long apogee;
	private int idFiliere;
	
	public Etudiant() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Etudiant(long id, String nom, String prenom, String email, long cne, long apogee, int idFiliere) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.cne = cne;
		this.apogee = apogee;
		this.idFiliere = idFiliere;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getCne() {
		return cne;
	}
	public void setCne(long cne) {
		this.cne = cne;
	}
	public long getApogee() {
		return apogee;
	}
	public void setApogee(long apogee) {
		this.apogee = apogee;
	}
	public int getIdFiliere() {
		return idFiliere;
	}
	public void setIdFiliere(int idFiliere) {
		this.idFiliere = idFiliere;
	}

	@Override
	public String toString() {
		return "Etudiant [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", cne=" + cne
				+ ", apogee=" + apogee + ", idFiliere=" + idFiliere + "]";
	}
	
	
	
}
