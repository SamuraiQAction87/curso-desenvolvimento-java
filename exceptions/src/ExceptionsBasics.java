import java.util.ArrayList;
import java.util.List;

public class ExceptionsBasics {
    public static void main(String[] args) {
        // Chamando o metodo getNome:
        getNome();
    }
    // Metodo static 'getNome':
    private static void getNome() {
        // Lista com ArrayList:
        List<String> nomes = new ArrayList<>();
        // Adicionando O Nome à lista:
        nomes.add("Ashem");
        // Imprimindo:
        System.out.println(nomes.getFirst());
    }
}

















