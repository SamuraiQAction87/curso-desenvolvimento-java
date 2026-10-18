import java.util.ArrayList;
import java.util.List;

public class CollectionsBasics {
    public static void main(String[] args) {
        // Criando um array com tamanho fixo:
        String[] nomes = {"Tiago", "Atom", "Hórus"};
        // Criando um arrayList sem tamanho especificado:
        List<String> nomesArrayList = new ArrayList<>(){
            {
                // Adicnando sem informar o objeto, pois já estamos nele:
                add("1");
                add("2");
                add("3"); // Ordem de impressão [1, 2, 3]
            }};

        //Imprimindo a lista:
        System.out.println(nomesArrayList);
    }
}
