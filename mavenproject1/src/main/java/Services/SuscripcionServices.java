/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Modelos.Suscripcion;
import Querys.QueryRevista;
import Querys.QuerySuscripcion;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class SuscripcionServices {
     private QueryRevista queryRevista = new QueryRevista();
    private QuerySuscripcion querySuscripcion = new QuerySuscripcion();

    public String crearSuscripcion(Suscripcion suscripcion) throws SQLException {
        // Verificar si la revista existe
        if (!queryRevista.existeRevista(suscripcion.getIdRevista())) {
            return "La revista no existe"; // RetornaMOOS un mensaje si no existe
        }

        // Crear la suscripción
        boolean resultado = querySuscripcion.crear(suscripcion);
        return resultado ? "Suscripción creada con éxito" : "Error al crear la suscripción"; // Mensaje de resultado
    }
}
