package questao1;
//Classe de teste para a Calculadora de Desconto
public class CalculadoraTeste {
    public static void main(String[] args) {
        // Instanciando o objeto
        CalculadoraDescontos calDes = new CalculadoraDescontos(); 
        // Printando o resultado do metodo 
        System.out.println(calDes.calcularDescontoProduto(1500, 10));
    }
}
