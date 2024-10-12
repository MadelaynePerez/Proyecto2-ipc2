/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Querys;

import Modelos.Coneccion;
import Modelos.Suscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class QuerySuscripcion {
   public boolean crear(Suscripcion suscripcion) throws SQLException {
        Connection connection = null;
        PreparedStatement pstmt = null;

        try {
            connection = Coneccion.getConnection();
            String sql = "INSERT INTO suscripcion (fecha_de_suscripcion, id_revista, id_usuario, activo, me_gusta) VALUES (?, ?, ?, ?, ?)";
            pstmt = connection.prepareStatement(sql);

            pstmt.setDate(1, java.sql.Date.valueOf(suscripcion.getFechaDeSuscripcion().toString()));
            pstmt.setLong(2, suscripcion.getIdRevista());
            pstmt.setLong(3, suscripcion.getIdUsuario());
            pstmt.setBoolean(4, suscripcion.isActivo());
            pstmt.setBoolean(5, suscripcion.isMeGusta());

            int filasInsertadas = pstmt.executeUpdate();
            return filasInsertadas > 0; 
        } finally {
            if (pstmt != null) {
                pstmt.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
    }

   
}
