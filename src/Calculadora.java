package Calculadora;

public class Calculadora {
    private int a, b;

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public int suma(){
        return a + b;
    }

    public int resta(){
        return a - b;
    }

    public int multiplicar(){
        return a * b;
    }

    public float dividir(){
        return a / b;
    }


}