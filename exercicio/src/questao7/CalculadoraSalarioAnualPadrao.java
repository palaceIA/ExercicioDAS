package questao7;
// Essa classe implementa a interface calcularSalarioAnual
public class CalculadoraSalarioAnualPadrao implements CalculadoraSalarioAnual {
    // Sobre escrita do metodo de acordo com as especificidades da classe
    @Override
    public double calcularSalarioAnual(Empregado empregado) {
        return empregado.getSalarioMensal() * 12;
    }
}
