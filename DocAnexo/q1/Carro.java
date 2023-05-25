package DocAnexo.q1;

public class Carro implements PegadaDeCarbono{
    private String modelo;
    private double consumoCombustivel;

    public Carro(String modelo, double consumoCombustivel) {
        this.modelo = modelo;
        this.consumoCombustivel = consumoCombustivel;
    }

    public double getPegadaDeCarbono() {
        // Cálculo da pegada de carbono para um carro
        return consumoCombustivel * 2.3; // Exemplo de cálculo simplificado
    }

    public String toString() {
        return "Carro - Modelo: " + modelo;
    }
}
