/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.administracion;

import java.util.Date;

/**
 *
 * @author JuanFernando
 */
public class Aerolineas {
    public long NumeroRegistro;
    public String Nombre;
    public Date FechaFinVigencia;    

    public long getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(long NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaFinVigencia() {
        return FechaFinVigencia;
    }

    public void setFechaFinVigencia(Date FechaFinVigencia) {
        this.FechaFinVigencia = FechaFinVigencia;
    }  
}
