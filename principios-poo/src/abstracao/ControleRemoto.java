package abstracao;

public class ControleRemoto {
    private final TV tv;

    // O controle remoto recebe a TV que ele vai controlar
    public ControleRemoto(TV tv) {
        this.tv = tv;
    }

    // Botões do controle remoto (Expondo apenas a abstração da ação)
    public void botaoPower() {
        tv.ligarDesligar();
    }

    public void botaoMaisVolume() {
        tv.aumentarVolume();
    }

    public void botaoMenosVolume() {
        tv.reduzirVolume();
    }

    public void digitarCanal(int canal) {
        tv.trocarCanal(canal);
    }
}