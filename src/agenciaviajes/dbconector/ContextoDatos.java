/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciaviajes.dbconector;

/**
 *
 * @author juarojas
 */
public class ContextoDatos {
     public String Driver;
     public String ConnectString;
     public String User;
     public String Password;
     
    public ContextoDatos(String driver, String connectString, String user, String password) {
        this.Driver = driver;
        this.ConnectString = connectString;
        this.User = user;
        this.Password = password;
    }

    public String getDriver() {
        return Driver;
    }

    public void setDriver(String driver) {
        this.Driver = driver;
    }

    public String getConnectString() {
        return ConnectString;
    }

    public void setConnectString(String connectString) {
        this.ConnectString = connectString;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        this.User = user;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }
     
    public boolean Conectar() {
        return true;
    }
}
