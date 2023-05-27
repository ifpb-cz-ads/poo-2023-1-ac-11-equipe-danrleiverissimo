package DocAnexo.q2;

public class Quadrado extends Quadrilatero {
    private double lado;

    public Quadrado(double lado) {
        super(lado, lado, lado, lado);
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double calcularArea() {
        return lado * lado;
    }
}
