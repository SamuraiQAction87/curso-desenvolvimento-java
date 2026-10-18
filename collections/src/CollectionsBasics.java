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
                add("3"); // Ordem de adição [1, 2, 3]
            }};
        System.out.println("==================================");
        //Metodo moderno do interface List para pegar o 1º elemento:
        System.out.println(nomesArrayList.getFirst());
        //Metodo moderno do interface List para pegar o -1 elemento:
        System.out.println(nomesArrayList.getLast());
        //Metodo antigo e genérico da interface List. Acessando o 2º elemento:
        System.out.println(nomesArrayList.get(1));
    }
}
