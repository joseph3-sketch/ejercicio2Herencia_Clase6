package Geometria;

public class FiguraGeometrica {
private String color;

    public FiguraGeometrica(String color) {
        this.color = color;
    }

    public FiguraGeometrica() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double calcularArea(){
        return 0;
    }
    public double calcularPerimetro(){
        return 0;
    }

    public void imprimirDatos(){
        System.out.println("color: "+this.color);
    }
}
