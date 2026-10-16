package polimorfismo;

public class Cozinheiro implements Trabalhador{
    @Override
    public void trabalhar() {
        System.out.println("Trabalha no preparo de comidas!");
    }
}
