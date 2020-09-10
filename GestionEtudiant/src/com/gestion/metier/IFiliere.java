package com.gestion.metier;

import java.util.Collection;

import com.gestion.entities.Filiere;

public interface IFiliere {

	
	public Filiere getFiliere(int id);
	public Collection<Filiere> getAllFiliere();
	public void addFiliere(Filiere filiere);
	public void updateFiliere(Filiere filiere);
	public void deleteFiliere(int id);
	
	
}
