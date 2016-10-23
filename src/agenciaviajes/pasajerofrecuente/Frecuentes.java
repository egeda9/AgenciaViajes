/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.pasajerofrecuente;

import java.util.Date;

/**
 *
 * @author JuanFernando
 */
public class Frecuentes {
    public int NumeroPasajeroFrecuente;
    public long Identificacion;
    public String Nombre;
    public String Apellido;
    public String Direccion;
    public int Telefono;
    public Date FechaNacimiento;

    public int getNumeroPasajeroFrecuente() {
        return NumeroPasajeroFrecuente;
    }

    public void setNumeroPasajeroFrecuente(int NumeroPasajeroFrecuente) {
        this.NumeroPasajeroFrecuente = NumeroPasajeroFrecuente;
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

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
}
