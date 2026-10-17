// Interface que define o contrato para cálculo de imposto:
public interface Imposto {
    Double calcularImposto();
}
// Classe que representa o imposto para pessoa jurídica:
public class ImpostoPessoaJuridica implements Imposto {
    private Double rendaAnual;
    
    public ImpostoPessoaJuridica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    
    public Double calcularImposto() {
        return this.rendaAnual * 0.1; 
    }
    
    public Double getRendaAnual() {
        return this.rendaAnual;
    }
}
// Classe que representa o imposto para pessoa física:
public class ImpostoPessoaFisica implements Imposto {
    private Double rendaAnual;
    
    public ImpostoPessoaFisica(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }
    
    public Double calcularImposto() {
        return this.rendaAnual * 0.2; 
    }
    
    public Double getRendaAnual() {
        return this.rendaAnual;
    }
} 
// Classe principal para testar o cálculo de impostos:
public class CalculadoraImposto {
    public static void main(String[] args) {
        Imposto[] impostos = {
            new ImpostoPessoaJuridica(100_000.0),
            new ImpostoPessoaFisica(100_000.0)
        };
        
        for(Imposto imposto : impostos) {
            System.out.println(imposto.calcularImposto());
        }
    }
} 