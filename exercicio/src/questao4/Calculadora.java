package questao4;
// Classe abstrata que implementa as operacoes basicas da calculadora
public abstract class Calculadora{
    // Somar
    public Double somar(double a , double b ){
        return a + b ; 
    }
     // Subtrair
    public Double subtrair(double a , double b ){
        return a - b ; 
    }
    // Multiplicar
    public Double multiplicar(double a , double b ){
        return a * b ; 
    }
    // Dividir
    public Double dividir(double a , double b ){
        if(b==0){System.out.println("Não existe divisao por 0");}
        return a /b ; 
    }
}
