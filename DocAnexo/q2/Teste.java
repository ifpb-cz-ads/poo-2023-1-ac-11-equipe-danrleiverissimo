package DocAnexo.q2;

public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(3, 7);
        System.out.println("Área do retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
        
        Quadrado quadrado = new Quadrado(9);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
        
    }
}
