/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelos.Suscripcion;
import Services.SuscripcionServices;

/**
 *
 * @author DELL
 */
public class SuscripcionController {
   private SuscripcionServices suscripcionService = new SuscripcionServices();

    public String crearSuscripcion(Suscripcion suscripcion) throws Exception {
        // Validar la existencia de la revista
        String mensaje = suscripcionService.crearSuscripcion(suscripcion);
        
        if (mensaje.equals("La revista no existe")) {
            throw new Exception("La revista no existe.");
        }
        
        return mensaje; // Mensaje de éxito o error
    }
}
