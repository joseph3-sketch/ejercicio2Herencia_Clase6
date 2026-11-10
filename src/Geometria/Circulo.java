package Geometria;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(String color, double radio){
        super(color);
        this.radio =radio;
    }

    public void setRadio(double radio) {
        if(radio<0) System.out.println("radio incorrecto");
        else this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(radio,2);
    }

    @Override
    public double calcularPerimetro(){
        return 2 * Math.PI * radio;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("radio: " + this.radio);
        System.out.println("Area: " +calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

}
