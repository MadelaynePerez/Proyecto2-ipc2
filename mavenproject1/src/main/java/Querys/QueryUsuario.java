/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Querys;

import Modelos.Coneccion;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class QueryUsuario {
    public boolean crearUsuario(Usuario usuario) throws SQLException {
    Connection connection = null;
    PreparedStatement pstmt = null;

    try {
    
        connection = Coneccion.getConnection();
        
       
        String sql = "INSERT INTO usuario (nombre, contrasena, correo_electronico, hobbie, descripcion, temas_de_interes, gustos, tipo_usuario, foto) "
                   + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        pstmt = connection.prepareStatement(sql);
        
      
        pstmt.setString(1, usuario.getNombre());
        pstmt.setString(2, usuario.getContrasena());
        pstmt.setString(3, usuario.getCorreoElectronico());
        pstmt.setString(4, usuario.getHobbie());
        pstmt.setString(5, usuario.getDescripcion());
        pstmt.setString(6, usuario.getTemasDeInteres());
        pstmt.setString(7, usuario.getGustos());
        pstmt.setLong(8, usuario.getTipoUsuario()); // Clave foránea
        pstmt.setString(9, usuario.getFoto());

        // Ejecutar la sentencia SQL y verificar si se insertó alguna fila
        int filasInsertadas = pstmt.executeUpdate();
        return filasInsertadas > 0;
        
    } finally {
        
        if (pstmt != null) pstmt.close();
        if (connection != null) connection.close();
    }
}
}
