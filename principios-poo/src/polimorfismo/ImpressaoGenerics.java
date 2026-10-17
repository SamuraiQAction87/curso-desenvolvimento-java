package polimorfismo;

import java.util.Arrays;

public class ImpressaoGenerics {
    public static void main(String[] args) {
        // Array com instâncias de trabalhadores:
        Trabalhador[] trabalhadores = {
                new Programador(), new Cozinheiro(), new Medico()
        };
        // Chamando o metodo imprimindo arrays de diferentes tipos
        // possibilitado pelo metodo generics 'imprimir':
        imprimir(trabalhadores);
        imprimir(new Integer[] {1, 2, 2});
        imprimir(new String[] {"texto 1", "texto 2"} );

    }
    // Metodo generics:
    private  static <T> void imprimir(T[] trabalhadores) {
        System.out.println(Arrays.toString(trabalhadores));
    }
}
























