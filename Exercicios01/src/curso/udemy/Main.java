package curso.udemy;

import entidades.Retangulo;

import java.awt.geom.Area;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo x;
        x = new Retangulo();

        System.out.println("Entre com a altura e a largura do retângulo: ");
        x.altura = sc.nextDouble();
        x.largura = sc.nextDouble();

        System.out.printf("Area = %.2f%n", x.area());
        System.out.printf("Perimetro = %.2f%n", x.perimetro());
        System.out.printf("Diagonal = %.2f%n", x.diagonal());
        sc.close();

    }
}
