import java.util.*;

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
        nomesArrayList.set(0, "3");
        nomesArrayList.set(1, "2");
        nomesArrayList.set(2, "1");
        // Adicionando mais um elemento ao final:
        nomesArrayList.add("0");
        // Imprimindo:
        System.out.println("==================================");
        System.out.println(nomesArrayList); // Saída [3, 2, 1, 0]

        // Removendo elemento por meio do índice com o 'remove':
        //nomesArrayList.remove(1);
        // Imprimindo:
        System.out.println("==================================");

        // Usando o metodo static 'sort' da classe Collections para ordenar a lista:
        Collections.sort(nomesArrayList);
        // Imprimindo a lista ordenada:
        System.out.println(nomesArrayList); // Saída [0, 1, 2, 3]

        // Removendo elemento por meio do valor direto com o 'remove':
        // nomesArrayList.remove("3");
        // Imprimindo:
        //System.out.println("==================================");
        //System.out.println(nomesArrayList); // Saída [0, 2]

        // Percorrendo a lista com o For-each
        System.out.println("================[Percorrido com For-each]==================");

        for (String nome: nomesArrayList) {
            System.out.println(nome);
        }

        // Percorrendo a lista com o Iterator
        System.out.println("================[Percorrido com Iterator]==================");
        // O Iterator nasce antes do 1º elemento:
        Iterator<String> it = nomesArrayList.iterator();
        // Verifica se na próxima posição tem elemento:
        while (it.hasNext()) {
            // pula para a próxima posição, captura o valor
            // e guarda na variável 'itemAtual':
            String itemAtual = it.next();
            // Imprime o valor atual:
            System.out.println(itemAtual);
        }

        // Conversões entre Array e ArrayList.
        // Criando a lista:
        List<String> listaDeNomes = List.of("Ashem", "Yaacov", "Atom", "Tiago");
        System.out.println(listaDeNomes);

        // Criando um array para convertê-lo em lista:
        String[] arrayDeNomes = {"Ashem", "Yaacov", "Atom", "Tiago"};
        // Convertendo array em lista:
        List<String> listaConvertida = Arrays.asList(arrayDeNomes);
        // Imprimindo:
        System.out.println(listaConvertida);
    }
}



























