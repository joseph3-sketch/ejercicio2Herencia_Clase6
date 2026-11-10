package Geometria;

public class Triangulo  extends FiguraGeometrica{
    private double base;
    private double lado;

    public Triangulo(String color, double base ,double lado){
        super(color);
        this.base=base;
        this.lado = lado;
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
        return (base * lado)/2;
    }

    @Override
    public double calcularPerimetro(){
        return 3 * lado ;
    }
    @Override
    public void imprimirDatos(){
        System.out.println("base y lado: " + this.base +" "+ this.lado);
        System.out.println("Area: " +calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }

}
