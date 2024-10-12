/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.InvalidDataException;
import Modelos.Usuario;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class UsuarioController {
    Querys.QueryUsuario queryUsuario = new Querys.QueryUsuario();

public boolean crearUsuario(Usuario obtenerUsuario) throws InvalidDataException, SQLException {
    // Validar los datos del usuario antes de crear
    validar(obtenerUsuario);
    return queryUsuario.crearUsuario(obtenerUsuario);
}

private void validar(Usuario usuario) throws InvalidDataException {
    // Validar que los campos clave no sean nulos o vacíos
    if (usuario.getNombre() == null || usuario.getNombre().isEmpty()) {
        throw new InvalidDataException("El nombre no puede estar vacío");
    }
    if (usuario.getCorreoElectronico() == null || usuario.getCorreoElectronico().isEmpty()) {
        throw new InvalidDataException("El correo electrónico no puede estar vacío");
    }
    if (usuario.getContrasena() == null || usuario.getContrasena().isEmpty()) {
        throw new InvalidDataException("La contraseña no puede estar vacía");
    }
    if (usuario.getTipoUsuario() == null) {
        throw new InvalidDataException("El tipo de usuario no puede estar vacío");
    }
}

}
