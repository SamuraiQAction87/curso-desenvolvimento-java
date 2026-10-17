package polimorfismo;

public class Main {
    public static void main(String[] args) {
        // Array com instâncias de trabalhadores:
        Trabalhador[] trabalhadores = {
                new Programador(), new Cozinheiro(), new Medico()
        };
        // Chamando o metodo passando o array como argumento:
        trabalhar(trabalhadores);
    }
        // Metodo 'trabalhar' que será chamado no 'main':
        private static void trabalhar(Trabalhador[] trabalhadores) {
            for (Trabalhador trabalhador : trabalhadores) {
                trabalhador.trabalhar();
                if (trabalhador instanceof Cozinheiro)
                    ((Cozinheiro)trabalhador).temperarComida();
            }
        }

}




























