import Geometria.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FiguraGeometrica figuraGeometrica = new FiguraGeometrica("black");

        int opcion;
        do {
            System.out.println("ingrese una opcion");
            System.out.println("1- Figura Circulo");
            System.out.println("2- Figura Rectangulo");
            System.out.println("3- Figura Triangulo");
            System.out.println("4- Figura Cuadrado");
            System.out.println("0 salir");
            opcion =sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("1- Figura Circulo");
                    System.out.println("ingrese el radio ");
                    double radio = sc.nextDouble();
                    Circulo circulo1 = new Circulo("rojo",radio);
                    circulo1.imprimirDatos();
                    break;
                case 2:
                    System.out.println("2- Figura Rectangulo");
                    System.out.println("ingrese la base ");
                    double base = sc.nextDouble();
                    System.out.println("ingrese el lado ");
                    double altura = sc.nextDouble();
                    Rectangulo rectangulo1 = new Rectangulo("cafe",base,altura);
                    rectangulo1.imprimirDatos();
                    break;
                case 3:

                    System.out.println("3- Figura Triangulo");
                    System.out.println("ingrese la base ");
                    double base1 = sc.nextDouble();
                    System.out.println("ingrese el lado ");
                    double lado = sc.nextDouble();
                    Triangulo triangulo1 = new Triangulo("amarillo",base1,lado);
                    triangulo1.imprimirDatos();
                    break;

                case 4:
                    System.out.println("3- Figura Cuadrado");
                    System.out.println("ingrese el lado ");
                    double lado1 = sc.nextDouble();
                    Cuadrado cuadrado1 = new Cuadrado("blanck",lado1);
                    cuadrado1.imprimirDatos();
                    break;


            }



        }while (opcion!=0);


    }
}