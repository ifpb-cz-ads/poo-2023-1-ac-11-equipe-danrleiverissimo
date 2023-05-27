package DocAnexo.q1;

public class Edificio implements PegadaDeCarbono{
    private String endereco;
    private int numeroDePessoas;
    private double consumoEnergia;

    public Edificio(String endereco, int numeroDePessoas, double consumoEnergia) {
        this.endereco = endereco;
        this.numeroDePessoas = numeroDePessoas;
        this.consumoEnergia = consumoEnergia;
    }

    public double getPegadaDeCarbono() {
        // Cálculo da pegada de carbono para um edifício
        return consumoEnergia * 0.5; // Exemplo de cálculo simplificado
    }

    public String toString() {
        return "Edifício - Endereço: " + endereco + ", Número de Pessoas: " + numeroDePessoas;
    }
}
