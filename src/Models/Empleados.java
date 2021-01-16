/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;

/**
 *
 * @author Mauro
 */
public class Empleados implements Serializable {
    
    private String PrimerN;
    private String SegundoN;
    private String PrimerA;
    private String SegundoA;
    private String FechaN;
    private String Oficio;
    private String FechaC;
    private String AñosE;
;
    
    public Empleados(){
    
    }

    public String getPrimerN() {
        return PrimerN;
    }

    public void setPrimerN(String PrimerN) {
        this.PrimerN = PrimerN;
    }

    public String getSegundoN() {
        return SegundoN;
    }

    public void setSegundoN(String SegundoN) {
        this.SegundoN = SegundoN;
    }

    public String getPrimerA() {
        return PrimerA;
    }

    public void setPrimerA(String PrimerA) {
        this.PrimerA = PrimerA;
    }

    public String getSegundoA() {
        return SegundoA;
    }

    public void setSegundoA(String SegundoA) {
        this.SegundoA = SegundoA;
    }

    public String getFechaN() {
        return FechaN;
    }

    public void setFechaN(String FechaN) {
        this.FechaN = FechaN;
    }

    public String getOficio() {
        return Oficio;
    }

    public void setOficio(String Oficio) {
        this.Oficio = Oficio;
    }

    public String getFechaC() {
        return FechaC;
    }

    public void setFechaC(String FechaC) {
        this.FechaC = FechaC;
    }

    public String getAñosE() {
        return AñosE;
    }

    public void setAñosE(String AñosE) {
        this.AñosE = AñosE;
    } 
    
}
