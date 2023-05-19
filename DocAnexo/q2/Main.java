package DocAnexo.q2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        Quadrado quadrado1 = new Quadrado(5);
        Quadrado quadrado2 = new Quadrado(7);

        Retangulo retangulo1 = new Retangulo(4, 6);
        Retangulo retangulo2 = new Retangulo(8, 3);

        Circulo circulo1 = new Circulo(3);
        Circulo circulo2 = new Circulo(6);

        formas.add(quadrado1);
        formas.add(quadrado2);
        formas.add(retangulo1);
        formas.add(retangulo2);
        formas.add(circulo1);
        formas.add(circulo2);

        for (FormaGeometrica forma : formas) {
            if (forma instanceof Retangulo) {
                System.out.println("Retangulo:");
                System.out.println("Base: " + ((Retangulo)forma).getBase());
                System.out.println("Altura: " + ((Retangulo)forma).getAltura());
                System.out.println("Área: " + forma.calcularArea());
                System.out.println("Perímetro: " + forma.calcularPerimetro());
            } else if (forma instanceof Quadrado) {
                System.out.println("Quadrado:");
                System.out.println("Lado: " + ((Quadrado)forma).getLado());
                System.out.println("Área: " + forma.calcularArea());
                System.out.println("Perímetro: " + forma.calcularPerimetro());
            } else if (forma instanceof Circulo) {
                System.out.println("Círculo:");
                System.out.println("Raio: " + ((Circulo)forma).getRaio());
                System.out.println("Área: " + forma.calcularArea());
                System.out.println("Perímetro: " + forma.calcularPerimetro());
            }
            System.out.println();
        }
    }
}
