/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes;

import java.util.ArrayList;

/**
 *
 * @author juarojas
 */
public class Vuelos {
    
    public String Numero;
    public int Hora;
    public int Minuto;
    
    public Vuelos(String numero, int hora, int minuto) {
        this.Numero = numero;
        this.Hora = hora;
        this.Minuto = minuto;
    }
    
    public Vuelos(String numero) {
        Vuelos vuelo = getVuelo(numero);
         
         if (vuelo != null) {
             this.Numero = numero;
             this.Hora = vuelo.Hora;
             this.Minuto = vuelo.Minuto;
         }  
    }
    
    public Vuelos() {        
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }

    public int getMinuto() {
        return Minuto;
    }

    public void setMinuto(int Minuto) {
        this.Minuto = Minuto;
    }
    
    private Vuelos getVuelo(String numero) {
       
       ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
       boolean conectado = contexto.Conectar();
       
       if (conectado) {
            return new Vuelos(numero, 20, 35);
       }
       
       else {
           return null;
       }
    }
    
    private ArrayList<Vuelos> getVuelos() {
       
       ContextoDatos contexto = new ContextoDatos("temp", "temp", "", "");
       boolean conectado = contexto.Conectar();
       
       if (conectado) {
            return new ArrayList<>();
       }
       
       else {
           return null;
       }
    }
}
