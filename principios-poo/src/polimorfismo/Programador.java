package polimorfismo;

public class Programador implements Trabalhador{
    @Override
    public void trabalhar() {
        System.out.println("Trabalha resolvendo problemas de negócio com programação!");
    }
}
