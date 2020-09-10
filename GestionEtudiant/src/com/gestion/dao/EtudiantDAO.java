package com.gestion.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.gestion.entities.Etudiant;
import com.gestion.metier.IEtudiant;
public class EtudiantDAO implements IEtudiant{

	
	
	
	@Override
	public Etudiant getEtudiant(long idt) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM etudiant WHERE id = ?");
			stmt.setLong(1, idt);
			ResultSet result = stmt.executeQuery();
			if(result.next()) {
				long id = result.getLong("id");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String email = result.getString("email");
				long cne = result.getLong("cne");
				long apogee= result.getLong("apogee");
				int idFiliere= result.getInt("idFiliere");
				Etudiant etudiant = new Etudiant(id, nom, prenom,email,cne,apogee,idFiliere);
				return etudiant;
			}
			else {
				return null;
			}
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		return null;
	}
	@Override
	public Collection<Etudiant> getAllEtudiant() {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM etudiant");			
			Collection<Etudiant> list = new ArrayList<Etudiant>();
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				long id = result.getLong("id");
				String nom = result.getString("nom");
				String prenom = result.getString("prenom");
				String email = result.getString("email");
				long cne = result.getLong("cne");
				long apogee= result.getLong("apogee");
				int idFiliere= result.getInt("idFiliere");
				Etudiant etudiant = new Etudiant(id, nom, prenom,email,cne,apogee,idFiliere);
				
				list.add(etudiant);	
			}
			return list;
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		return null;
	}
	@Override
	public void addEtudiant(Etudiant etudiant) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO etudiant VALUES(NULL , ? , ? , ? , ? , ? , ? )");
			stmt.setString(1, etudiant.getNom());
			stmt.setString(2, etudiant.getPrenom());
			stmt.setString(3, etudiant.getEmail());
			stmt.setLong(4, etudiant.getCne());
			stmt.setLong(5, etudiant.getApogee());
			stmt.setInt(6, etudiant.getIdFiliere());
			
			stmt.execute();
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void updateEtudiant(Etudiant etudiant) {
		
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("UPDATE etudiant SET nom=?, prenom=?, email=?, cne=?, apogee=?, idFiliere=? WHERE id=?");
			stmt.setString(1, etudiant.getNom());
			stmt.setString(2, etudiant.getPrenom());
			stmt.setString(3, etudiant.getEmail());
			stmt.setLong(4, etudiant.getCne());
			stmt.setLong(5, etudiant.getApogee());
			stmt.setInt(6, etudiant.getIdFiliere());
			stmt.setLong(7, etudiant.getId());
			stmt.execute();
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		
	}
	@Override
	public void deleteEtudiant(long id) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM etudiant WHERE id=?");
			stmt.setLong(1, id);
			stmt.execute();
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		
	}


}
