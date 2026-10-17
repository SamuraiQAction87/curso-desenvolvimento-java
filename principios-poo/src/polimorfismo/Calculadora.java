package polimorfismo;

public class Calculadora {
    public static void main(String[] args) {
        // Chamando os métodos:
        System.out.println(soma(1, 2));

        System.out.println(soma(3.33, 6.66));
    }

    // Metodos com o mesmo nome, mas assinaturas diferentes:
    static int soma(int a, int b) {
        return a + b;
    }

    static double soma(double a, double b) {
        return a + b;
    }
}


































