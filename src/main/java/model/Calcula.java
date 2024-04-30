
package model;

public class Calcula {
    private double valorA;
    private double valorB;

    public Calcula() {
        this(0,0);
    }

    public Calcula(double valorA, double valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public double getValorA() {
        return valorA;
    }

    public void setValorA(double valorA) {
        this.valorA = valorA;
    }

    public double getValorB() {
        return valorB;
    }

    public void setValorB(double valorB) {
        this.valorB = valorB;
    }
    public double getSoma(){
        return valorA+valorB;
    }
    public double getDiferenca(){
        return valorA-valorB;
    }
    public double getProduto(){
        return valorA*valorB;
    }
    public double getCociente(){
        return valorA/valorB;
    }
}
