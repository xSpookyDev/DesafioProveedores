package cl.praxis.model.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

	private static Connection con = null;

	private Conexion() {

		try {
			Class.forName("org.postgresql.Driver");

			con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/DesafioJSP", "postgres", "claveFalsaCambiar");
			boolean isValid = con.isValid(50000);
			System.out.println(isValid ? "Test OK POSTGRESQL" : "Test Failes POSTGRESQL");
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error al conectar con la base de datos" + e.getMessage());

		}
	}

	public static Connection getCon() {
		if (con == null) {

			new Conexion();
		}
		return con;
	}

}
