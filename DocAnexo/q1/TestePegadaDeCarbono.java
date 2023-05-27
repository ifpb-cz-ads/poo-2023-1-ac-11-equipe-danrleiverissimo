package DocAnexo.q1;
import java.util.ArrayList;

public class TestePegadaDeCarbono {
    public static void main(String[] args) {
        Edificio edificio = new Edificio("Rua José Antônio da Silva, 300", 10, 1000);
        Carro carro = new Carro("Fusca", 10);
        Bicicleta bicicleta = new Bicicleta("Caloi");

        ArrayList<PegadaDeCarbono> lista = new ArrayList<>();
        lista.add(edificio);
        lista.add(carro);
        lista.add(bicicleta);

        for (PegadaDeCarbono item : lista) {
            System.out.println(item.toString());
            System.out.println("Pegada de Carbono: " + item.getPegadaDeCarbono());
            System.out.println();
        }
    }
}
