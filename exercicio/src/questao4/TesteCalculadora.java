package questao4;
public class TesteCalculadora {
    public static void main(String[] args){
        // Instanciando o objeto Calculadora
        CalculadoraCientifica calculadora = new CalculadoraCientifica();
        // Testes dos metodos da classe abstrata  
        System.out.println(calculadora.somar(2, 2));
        System.out.println(calculadora.subtrair(2, 2));
        System.out.println(calculadora.dividir(2, 2));
        System.out.println(calculadora.multiplicar(2, 2));
        // Testes dos metodos da classe especializada 
        System.out.println(calculadora.raizQuadrada(4));
        System.out.println(calculadora.potencia(4,2));
    }
}
