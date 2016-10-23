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
public class ControlAeronaves {
    
    public Aeronaves CrearAeronave(long numeroMatricula, int numeroPasajeros, int numeroTripulantes,
                                   int horasVuelo, Date fechaUltimaRevision, int primeraClase,
                                   int ejecutiva, int negocios, long numeroRegistro) {
        
        Aeronaves aeronaves = new Aeronaves();
        aeronaves.setNumeroRegistro(numeroRegistro);
        aeronaves.setNumeroMatricula(numeroMatricula);
        aeronaves.setNumeroPasajeros(numeroPasajeros);
        aeronaves.setNumeroTripulantes(numeroTripulantes);
        aeronaves.setHorasVuelo(horasVuelo);
        aeronaves.setFechaUltimaRevision(fechaUltimaRevision);
        aeronaves.setNumeroSillasPrimeraClase(primeraClase);
        aeronaves.setNumeroSillasClaseEjecutiva(ejecutiva);
        aeronaves.setNumeroSillasClaseNegocios(negocios);
        
        ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
        boolean conectado = contexto.Conectar();
        
        if (conectado) {
            return aeronaves;
        }
       
        else {
           return null;
        }
    }       
}
