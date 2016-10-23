/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.administracion;

import agenciaviajes.dbconector.ContextoDatos;

/**
 *
 * @author JuanFernando
 */
public class ControlRutas {
    public Rutas CrearRutas(String ciudadOrigen, String ciudadDestino, String tipoVuelo, int numeroMillas, long numeroRegistro) {
        Rutas ruta = new Rutas();
        ruta.setCiudadDestino(ciudadDestino);
        ruta.setCiudadOrigen(ciudadOrigen);
        ruta.setNumeroMillas(numeroMillas);
        ruta.setNumeroRegistro(numeroRegistro);
        ruta.setTipoVuelo(tipoVuelo);
        
        ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
        boolean conectado = contexto.Conectar();
        
        if (conectado) {
            return ruta;
        }
       
        else {
           return null;
        }
    }  
}
