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
                add("3"); // Ordem de adição [1, 2, 3]. Saída [1, 2, 3]
            }};
        System.out.println("==================================");
        //Metodo moderno do interface List para pegar o 1º elemento:
        System.out.println(nomesArrayList.getFirst());
        //Metodo moderno do interface List para pegar o -1 elemento:
        System.out.println(nomesArrayList.getLast());
        //Metodo antigo e genérico da interface List. Acessando o 2º elemento:
        System.out.println(nomesArrayList.get(1));

        // Usando o set para alterar elementos a partir de suas posições:
        nomesArrayList.set(0, "0");
        nomesArrayList.set(1, "1");
        nomesArrayList.set(2, "2");
        // Adicionando mais um elemento ao final:
        nomesArrayList.add("3");
        // Imprimindo:
        System.out.println("==================================");
        System.out.println(nomesArrayList); // Saída [0, 1, 2, 3]

        // Removendo elemento por meio do índice com o 'remove':
        nomesArrayList.remove(1);
        // Imprimindo:
        System.out.println("==================================");
        System.out.println(nomesArrayList); // Saída [0, 2, 3]

        // Removendo elemento por meio do valor direto com o 'remove':
        nomesArrayList.remove("3");
        // Imprimindo:
        System.out.println("==================================");
        System.out.println(nomesArrayList); // Saída [0, 2]
    }
}
