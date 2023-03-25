/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conversor;

/**
 *
 * @author USER
 */
public class Longitudes {
    private double medida;
    private double resultadoMedida;
    private boolean divisible;
    
    public Longitudes(){
        this.medida = 0;
    }

    public double getMedida() {
        return medida;
    }

    public void setMedida(double medida) {
        this.medida = medida;
    }

    public double getResultadoMedida() {
        return resultadoMedida;
    }

    public void setResultadoMedida(double longitud, double valorConversor) {
        if(!isDivisible()) this.resultadoMedida = longitud * valorConversor;
        else this.resultadoMedida = longitud/valorConversor;
    }

    public boolean isDivisible() {
        return divisible;
    }

    public void setDivisible(boolean divisible) {
        this.divisible = divisible;
    }
    
}
