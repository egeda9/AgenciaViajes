/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.administracion;

import agenciaviajes.dbconector.ContextoDatos;
import java.util.Date;

/**
 *
 * @author JuanFernando
 */
public class ControlAerolineas {
    
    public Aerolineas CrearAerolinea(long numeroRegistro, String nombre, Date fechafinVigencia) {
        Aerolineas aerolinea = new Aerolineas();
        aerolinea.setNumeroRegistro(numeroRegistro);
        aerolinea.setNombre(nombre);
        aerolinea.setFechaFinVigencia(fechafinVigencia);
        
        ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
        boolean conectado = contexto.Conectar();
        
        if (conectado) {
            return aerolinea;
        }
       
        else {
           return null;
        }
    }            
}
