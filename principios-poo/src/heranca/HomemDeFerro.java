package heranca;
// Classe HomemDeFerro sendo estendida da Super Classe:
public class HomemDeFerro extends SuperHeroi implements Avenger{
    // Construtor com os mesmos parâmetros que o da S. Class + chamada ao construtor canônico:
    public HomemDeFerro(String traje, String[] superPoderes) {

        super(traje, superPoderes);
    }

    @Override
    public void usarSuperPoder(int index) {
        System.out.println(superPoderes[index]);
    }

    @Override
    public boolean isLeader() {
        return true;
    }
}
