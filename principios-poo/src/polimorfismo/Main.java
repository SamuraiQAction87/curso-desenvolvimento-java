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
                // Verificando se a instância é da classe Cozinheiro:
                if (trabalhador instanceof Cozinheiro)
                    // Se for Cozinheiro, será feito o casting esplícito para
                    // termos acesso ao metodo 'temperarComida':
                    ((Cozinheiro)trabalhador).temperarComida();
            }
        }

}




























