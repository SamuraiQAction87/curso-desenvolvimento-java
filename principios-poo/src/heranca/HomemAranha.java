package heranca;

// Classe HomemAranha sendo estendida da Super Classe:
public class HomemAranha extends SuperHeroi {

    // Construtor com os mesmos parâmetros que o da S. Class + chamada ao construtor canônico:
    public HomemAranha(String traje, String[] superPoderes) {

    }

    // Implementando o method abstrado da classe pai:
    @Override
    public void usarSuperPoder(int index) {
        System.out.println(superPoderes[index]);
    }
}
