/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.administracion;

/**
 *
 * @author JuanFernando
 */
public class Rutas {
    public String CiudadOrigen;
    public String CiudadDestino;
    public long NumeroRegistro;
    public String TipoVuelo;
    public int NumeroMillas;

    public String getCiudadOrigen() {
        return CiudadOrigen;
    }

    public void setCiudadOrigen(String CiudadOrigen) {
        this.CiudadOrigen = CiudadOrigen;
    }

    public String getCiudadDestino() {
        return CiudadDestino;
    }

    public void setCiudadDestino(String CiudadDestino) {
        this.CiudadDestino = CiudadDestino;
    }

    public long getNumeroRegistro() {
        return NumeroRegistro;
    }

    public void setNumeroRegistro(long NumeroRegistro) {
        this.NumeroRegistro = NumeroRegistro;
    }

    public String getTipoVuelo() {
        return TipoVuelo;
    }

    public void setTipoVuelo(String TipoVuelo) {
        this.TipoVuelo = TipoVuelo;
    }

    public int getNumeroMillas() {
        return NumeroMillas;
    }

    public void setNumeroMillas(int NumeroMillas) {
        this.NumeroMillas = NumeroMillas;
    }
}
