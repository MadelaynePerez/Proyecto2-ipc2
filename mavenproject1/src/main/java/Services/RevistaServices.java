/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Controller.RevistaController;
import Exceptions.InvalidDataException;
import Modelos.Revistaa;
import Utileria.JsonUtil;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author DELL
 */
public class RevistaServices {
    JsonUtil jsonR = new JsonUtil();
    RevistaController revistaController = new RevistaController();
    
  public void CrearRevista(String body, HttpServletResponse response) throws IOException, InvalidDataException, SQLException {
     // Deserializa el JSON en un objeto Revista
    Revistaa revista = (Revistaa) jsonR.JsonStringAObjeto(body, Revistaa.class);

    // Obtener la fecha de creación desde el objeto revista (que ya se debería estar en formato correcto)
      String fechaDeCreacion = revista.getFechaDeCreacion(); // Esta ya es un java.sql.Date

    // Aquí puedes llamar a tu método de inserción en la base de datos
    revistaController.CrearRevista(revista); // No es necesario cambiar el método

    response.setStatus(HttpServletResponse.SC_OK);
    }
}
