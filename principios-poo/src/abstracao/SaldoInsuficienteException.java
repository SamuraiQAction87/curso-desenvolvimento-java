// 1. Criando a Exceção de Negócio personalizada
public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem); // Repassa a mensagem para a classe pai (RuntimeException)
    }
}

// 2. Usando a exceção em uma classe de Conta Bancária
public class ContaBancaria {
    private double saldo = 100.0;

    public void sacar(double valor) {
        if (valor > saldo) {
            // Lançando a nossa exceção customizada!
            throw new SaldoInsuficienteException("Tentativa de saque de R$ " + valor + ", mas o saldo atual é de R$ " + saldo);
        }
        saldo -= valor;
        System.out.println("Saque realizado com sucesso. Saldo restante: R$ " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        
        try {
            conta.sacar(250.0); // Vai falhar e cair no catch
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}