/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Querys;

import Modelos.Coneccion;
import Modelos.Revistaa;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class QueryRevista {
    public boolean crear(Revistaa entidad) throws SQLException {
    
    Connection connection = null;
    PreparedStatement pstmt = null;

 
        connection = Coneccion.getConnection();
        String sql = "INSERT INTO revista (id_categoria, descripcion, autor, fecha_de_creacion, costo_por_dia, precio, ruta, acepar_comentario , aceptar_me_gusta) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        pstmt = connection.prepareStatement(sql);

        pstmt.setLong(1, entidad.getIdCategoria());
        pstmt.setString(2, entidad.getDescripcion());
        pstmt.setString(3, entidad.getAutor());
        pstmt.setString(4, entidad.getFechaDeCreacion()); 
        pstmt.setDouble(5, entidad.getCostoPorDia());
        pstmt.setDouble(6, entidad.getPrecio());
        pstmt.setString(7, entidad.getRuta());
        pstmt.setBoolean(8, entidad.isAceptarComentario());
        pstmt.setBoolean(9, entidad.isAceptarMeGusta());

        int filasInsertadas = pstmt.executeUpdate();
        if (filasInsertadas > 0){
            return true;
        }
    
    return false;
}
}
