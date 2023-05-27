package DocAnexo.q1;

public class Bicicleta implements PegadaDeCarbono{
    private String marca;

    public Bicicleta(String marca) {
        this.marca = marca;
    }

    public double getPegadaDeCarbono() {
        // Cálculo da pegada de carbono para uma bicicleta
        return 0; // Bicicletas não emitem dióxido de carbono
    }

    public String toString() {
        return "Bicicleta - Marca: " + marca;
    }
}
