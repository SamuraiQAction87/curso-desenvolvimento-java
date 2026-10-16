package polimorfismo;

public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos:
        Trabalhador programador = new Programador();
        Trabalhador cozinheiro = new Cozinheiro();
        Trabalhador medico = new Medico();

        // Chamando os metodos a partir dos objetos:
        programador.trabalhar();
        cozinheiro.trabalhar();
        medico.trabalhar();
    }
}
