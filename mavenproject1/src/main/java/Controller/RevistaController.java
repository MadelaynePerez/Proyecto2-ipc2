/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Exceptions.InvalidDataException;
import Modelos.Revistaa;
import Querys.QueryRevista;
import java.sql.SQLException;

/**
 *
 * @author DELL
 */
public class RevistaController {
    Querys.QueryRevista revista = new QueryRevista();
    
    public boolean CrearRevista (Revistaa obtenerRevista) throws InvalidDataException, SQLException{
        Validar(obtenerRevista);
        return revista.crear(obtenerRevista);
        
    }
    private void Validar (Revistaa revista) throws InvalidDataException{
        if (revista.getAutor()== null){
            throw new InvalidDataException("El autor no existe");
        }
    }
}
