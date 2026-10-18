import java.util.ArrayList;
import java.util.List;

public class CollectionsBasics {
    public static void main(String[] args) {
        // Criando um array com tamanho fixo:
        String[] nomes = {"Tiago", "Atom", "Hórus"};
        // Criando um arrayList sem tamanho especificado:
        List<String> nomesArrayList = new ArrayList<>();

        // Invicando o metodo 'add' a paritr do objeto:
        nomesArrayList.add("1");
        nomesArrayList.add("2");
        nomesArrayList.add("3"); // Ordem de impressão [1, 2, 3]

        //Imprimindo a lista:
        System.out.println(nomesArrayList);
    }
}
