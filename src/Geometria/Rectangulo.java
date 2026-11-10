package Geometria;

public class Rectangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Rectangulo(String color, double base ,double altura){
        super(color);
        this.base=base;
        this.altura = altura;
    }

    public void setBase(double base) {
        if(base<0) System.out.println("la es incorrecta");
        else this.base = base;
    }

    public double getBase() {
        return base;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }

    @Override
    public double calcularPerimetro(){
        return 2 * (base+ altura);
    }
    @Override
    public void imprimirDatos(){
        System.out.println("base y altura: " + this.base +" "+ this.altura);
        System.out.println("Area: " +calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

}



