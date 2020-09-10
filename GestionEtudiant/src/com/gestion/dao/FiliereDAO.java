package com.gestion.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

import com.gestion.entities.Filiere;
import com.gestion.metier.IFiliere;

public class FiliereDAO  implements IFiliere{
	@Override
	public Filiere getFiliere(int id) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM filiere WHERE id = ?");
			stmt.setInt(1, id);
			ResultSet result = stmt.executeQuery();
			if(result.next()) {
				String intitule = result.getString("intitule");
			
				Filiere filiere = new Filiere(id, intitule);
				return filiere;
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
	public Collection<Filiere> getAllFiliere() {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM filiere");			
			Collection<Filiere> list = new ArrayList<Filiere>();
			ResultSet result = stmt.executeQuery();
			while(result.next()) {
				int id = result.getInt("id");
				String intitule = result.getString("intitule");
			
				Filiere filiere = new Filiere(id, intitule);
				
				list.add(filiere);	
			}
			return list;
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		return null;
	}

	@Override
	public void addFiliere(Filiere filiere) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("INSERT INTO filiere VALUES(NULL, ?)");
			stmt.setString(1, filiere.getIntitule());
			
			stmt.execute();
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		
		
	}

	@Override
	public void updateFiliere(Filiere filiere) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("UPDATE filiere SET intitule=? WHERE id=?");
			stmt.setString(1, filiere.getIntitule());
			stmt.setInt(2, filiere.getId());
			stmt.execute();
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		
		
	}

	@Override
	public void deleteFiliere(int id) {
		try {
			Connection conn = ConfDB.getUnique().getConnectin();
			PreparedStatement stmt = conn.prepareStatement("DELETE FROM filiere WHERE id=?");
			stmt.setInt(1, id);
			stmt.execute();
		} catch (SQLException ex) {
			System.err.println("Erreur : " + ex.getMessage());
		}
		
	}	
}
