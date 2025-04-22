package questao4;

/*
  A classe CalculadoraCientifica herda todos os metodos da calculadora 
  e os metodos especialistas da classe
*/
public class CalculadoraCientifica extends Calculadora{
    // Calcular a raiz quadrada 
    public Double raizQuadrada(double a){
        return Math.sqrt(a);
    }
    // Calcular a potencia 
    public Double potencia(double base,double expoente){
        return Math.pow(base,expoente);
    }
}
