package questao7;
// Essa classe implementa a interface PoliticaAumento
public class AumentoPercentual implements PoliticaAumento {
    // Artributo percentual
    private double percentual;

    // Construtor 
    public AumentoPercentual(double percentual) {this.percentual = percentual;}

    // Sobre escrevendo o metodo aplicarAumento
    @Override
    public void aplicarAumento(Empregado empregado) {
        double novoSalario = empregado.getSalarioMensal() * (1 + percentual / 100);
        empregado.setSalarioMensal(novoSalario);
    }
}
