package cl.praxis.model.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cl.praxis.model.conexion.Conexion;
import cl.praxis.model.dto.Proveedores;

public class ProveedoresDAO {
    
    public void create(Proveedores p) {
      
    }
    
    public Proveedores read(int id) {
       
        return new Proveedores();
    }
    
    public List<Proveedores> read() {
        List<Proveedores> proveedorList = new ArrayList<>();
        
        try {
        	Connection c = Conexion.getCon();
             Statement s = c.createStatement();
        		String sql = "SELECT id, nombre, rut, direccion, correo, telefono, contacto, telefono_contacto FROM proveedores";
             ResultSet rs = s.executeQuery(sql);
            
            while (rs.next()) {
                Proveedores p = new Proveedores(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getString("rut"),
                    rs.getString("direccion"),
                    rs.getString("correo"),
                    rs.getString("telefono"),
                    rs.getString("contacto"),
                    rs.getString("telefono_contacto")
                );
                
                proveedorList.add(p);
            }
        } catch (SQLException e) {
            System.out.println("Error en método read list");
            e.printStackTrace();
        }
    
        return proveedorList;
    }
    
    public void update(Proveedores p) {
       
    }
    
    public void delete(int id) {
       
    }
}
