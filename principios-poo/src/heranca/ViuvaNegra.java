package heranca;
// Classe ViuvaNegra sendo estendida da Super Classe:
public class ViuvaNegra extends SuperHeroi implements Avenger{
    // Construtor com os mesmos parâmetros que o da S. Class + chamada ao construtor canônico:
    public ViuvaNegra(String traje, String[] superPoderes) {
        super(traje, superPoderes);
    }

    // Implementando o method abstrado da classe pai:
    @Override
    public void usarSuperPoder(int index) {
        System.out.println(superPoderes[index]);
    }

    @Override
    public boolean isLeader() {
        return false;
    }
}
