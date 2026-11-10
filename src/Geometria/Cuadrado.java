package Geometria;

public class Cuadrado extends FiguraGeometrica{
    private double lado;

    public Cuadrado(String color, double lado){
        super(color);
        this.lado =lado;
    }

    public void setRadio(double radio) {
        if(radio<0) System.out.println("radio incorrecto");
        else this.lado = lado;
    }

    public double getRadio() {
        return lado;
    }

    @Override
    public double calcularArea(){
        return  Math.pow(lado,2);
    }

    @Override
    public double calcularPerimetro(){
        return 4 * lado;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("lado: " + this.lado);
        System.out.println("Area: " +calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

}
