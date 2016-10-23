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
public class Aeronaves {
    public long NumeroMatricula;
    public int NumeroPasajeros;
    public int NumeroTripulantes;
    public int HorasVuelo;
    public Date FechaUltimaRevision;
    public int NumeroSillasPrimeraClase;
    public int NumeroSillasClaseEjecutiva;
    public int NumeroSillasClaseNegocios;
    public long NumeroRegistro;

    public long getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(long NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    public int getNumeroPasajeros() {
        return NumeroPasajeros;
    }

    public void setNumeroPasajeros(int NumeroPasajeros) {
        this.NumeroPasajeros = NumeroPasajeros;
    }

    public int getNumeroTripulantes() {
        return NumeroTripulantes;
    }

    public void setNumeroTripulantes(int NumeroTripulantes) {
        this.NumeroTripulantes = NumeroTripulantes;
    }

    public int getHorasVuelo() {
        return HorasVuelo;
    }

    public void setHorasVuelo(int HorasVuelo) {
        this.HorasVuelo = HorasVuelo;
    }

    public Date getFechaUltimaRevision() {
        return FechaUltimaRevision;
    }

    public void setFechaUltimaRevision(Date FechaUltimaRevision) {
        this.FechaUltimaRevision = FechaUltimaRevision;
    }

    public int getNumeroSillasPrimeraClase() {
        return NumeroSillasPrimeraClase;
    }

    public void setNumeroSillasPrimeraClase(int NumeroSillasPrimeraClase) {
        this.NumeroSillasPrimeraClase = NumeroSillasPrimeraClase;
    }

    public int getNumeroSillasClaseEjecutiva() {
        return NumeroSillasClaseEjecutiva;
    }

    public void setNumeroSillasClaseEjecutiva(int NumeroSillasClaseEjecutiva) {
        this.NumeroSillasClaseEjecutiva = NumeroSillasClaseEjecutiva;
    }

    public int getNumeroSillasClaseNegocios() {
        return NumeroSillasClaseNegocios;
    }

    public void setNumeroSillasClaseNegocios(int NumeroSillasClaseNegocios) {
        this.NumeroSillasClaseNegocios = NumeroSillasClaseNegocios;
    }

    public long getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(long NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }   
}
