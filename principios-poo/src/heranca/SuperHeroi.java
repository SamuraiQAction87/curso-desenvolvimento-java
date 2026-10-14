package heranca;

public abstract class SuperHeroi {
    // Atributos:
    protected String traje;
    protected String[] superPoderes;

    // Construtor canônico (que inicializa todos os atributos da classe):
    public SuperHeroi(String traje, String[] superPoderes) {
        this.traje = traje;
        this.superPoderes = superPoderes;
    }
    // Construtor padrão declarado,
    // após ter sido perdido com a criação do construtor com parâmetros:
    public SuperHeroi() {

    }

    // Metodos:
    public abstract void usarSuperPoder(int index);

    // Metodo Get para acessar o traje:
    public String getTraje() {
        return traje;
    }
}
