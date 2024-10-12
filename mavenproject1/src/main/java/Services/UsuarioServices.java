/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Controller.UsuarioController;
import Exceptions.InvalidDataException;
import Modelos.Usuario;
import Utileria.JsonUtil;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class UsuarioServices {
      JsonUtil jsonU = new JsonUtil();  // Utilidad para trabajar con JSON
    UsuarioController usuarioController = new UsuarioController(); // Controlador para manejar la lógica de usuario

    public void crearUsuario(String body, HttpServletResponse response) throws IOException, InvalidDataException, SQLException {
        // Deserializar el JSON en un objeto Usuario
        Usuario usuario = (Usuario) jsonU.JsonStringAObjeto(body, Usuario.class);

        // Validar y crear el usuario a través del controlador
        usuarioController.crearUsuario(usuario);

        // Responder con el estado HTTP 200 si se creó correctamente
        response.setStatus(HttpServletResponse.SC_OK);
    }
}

