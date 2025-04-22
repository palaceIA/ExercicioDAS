package questao7;
// Classe teste
public class EmpregadoTeste {
    public static void main(String[] args) {
        // Criando instancias dos objetos
        Empregado emp1 = new Empregado("Carlos", "Silva", 3000);
        Empregado emp2 = new Empregado("Ana", "Souza", 4500);

        // Calculadora de salário anual (usa interface)
        CalculadoraSalarioAnual calculadora = new CalculadoraSalarioAnualPadrao();

        System.out.println(emp1.getNome() + " salário anual: R$ " + calculadora.calcularSalarioAnual(emp1));
        System.out.println(emp2.getNome() + " salário anual: R$ " + calculadora.calcularSalarioAnual(emp2));

        // Aplica aumento de 10%
        PoliticaAumento aumento10 = new AumentoPercentual(10);
        aumento10.aplicarAumento(emp1);
        aumento10.aplicarAumento(emp2);

        System.out.println("\nApós aumento de 10%:");
        System.out.println(emp1.getNome() + " novo salário anual: R$ " + calculadora.calcularSalarioAnual(emp1));
        System.out.println(emp2.getNome() + " novo salário anual: R$ " + calculadora.calcularSalarioAnual(emp2));
    }
}
