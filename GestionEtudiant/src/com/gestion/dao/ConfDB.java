package com.gestion.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConfDB {
	private static ConfDB unique;

	private ConfDB() {

	}

	public static ConfDB getUnique() {
		if (unique == null)
			unique = new ConfDB();
		return unique;
	}

	public Connection getConnectin() {
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionetudiant", "root", "");

		} catch (Exception ex) {
			System.err.println("Erreur : problème du pilote " + ex.getMessage());
		}
		return conn;
	}
}