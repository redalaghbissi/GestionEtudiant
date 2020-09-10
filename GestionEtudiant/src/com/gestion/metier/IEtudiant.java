package com.gestion.metier;


import java.util.Collection;

import com.gestion.entities.Etudiant;

public interface IEtudiant {
	
	public Etudiant getEtudiant(long id);
	public Collection<Etudiant> getAllEtudiant();
	public void addEtudiant(Etudiant etudiant);
	public void updateEtudiant(Etudiant etudiant);
	public void deleteEtudiant(long id);

}
