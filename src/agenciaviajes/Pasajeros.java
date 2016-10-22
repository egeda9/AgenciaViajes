/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

import agenciaviajes.dbconector.ContextoDatos;

/**
 *
 * @author juarojas
 */
public class Pasajeros {
    public long Identificacion;
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public int Telefono; 
    
    public Pasajeros(long identificacion, String nombre, String apellido, String direccion, int telefono) {
        this.Identificacion = identificacion;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Direccion = direccion;
        this.Telefono = telefono;
    }
    
    public Pasajeros(long identificacion){
         Pasajeros pasajero = getPasajero(identificacion);
         
         if (pasajero != null) {
             this.Identificacion = identificacion;
             this.Nombre = pasajero.Nombre;
             this.Apellido = pasajero.Apellido;
             this.Direccion = pasajero.Direccion;
             this.Telefono = pasajero.Telefono;
         }   
    }

    public long getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(long Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }
    
    private Pasajeros getPasajero(long identificacion) {
        
       ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
       boolean conectado = contexto.Conectar();
       
       if (conectado) {
            return new Pasajeros(identificacion, "Juan", "Rojas", "St fake # 123", 1234567);
       }
       
       else {
           return null;
       }
    }
}
