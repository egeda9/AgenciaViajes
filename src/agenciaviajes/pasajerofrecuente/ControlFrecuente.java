/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.pasajerofrecuente;

import agenciaviajes.Vuelos;
import agenciaviajes.administracion.Aeronaves;
import agenciaviajes.dbconector.ContextoDatos;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author JuanFernando
 */
public class ControlFrecuente {
    public ArrayList<Vuelos> RetornarDetalleMillas(int numeroPasajeroFrecuente, String aerolinea) {
        
        ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
        boolean conectado = contexto.Conectar();
        
        if (conectado) {
            return new ArrayList<>();
        }
       
        else {
           return null;
        }
    }
    
    public int RetornarTotalMillas(int numeroPasajeroFrecuente, String aerolinea) {
        
        ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
        boolean conectado = contexto.Conectar();
        
        if (conectado) {
            return 1;
        }
       
        else {
           return 0;
        }
    }
    
    public Frecuentes CrearFrecuente(int numeroPasajeroFrecuente, int identificacion, String nombre,
                                   String apellido, String direccion, int telefono,
                                   Date fechaNacimiento) {
        
        Frecuentes frecuentes = new Frecuentes();
        frecuentes.setNumeroPasajeroFrecuente(numeroPasajeroFrecuente);
        frecuentes.setIdentificacion(identificacion);
        frecuentes.setNombre(nombre);
        frecuentes.setApellido(apellido);
        frecuentes.setDireccion(direccion);
        frecuentes.setTelefono(telefono);
        frecuentes.setFechaNacimiento(fechaNacimiento);
        
        ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
        boolean conectado = contexto.Conectar();
        
        if (conectado) {
            return frecuentes;
        }
       
        else {
           return null;
        }
    }
}
