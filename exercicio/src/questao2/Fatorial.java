package questao2;
/*
  A Classe Fatorial aplica o metodo calcularFatorial 
  Logica : 
      Inicializando o resultado como 1 
      Inicializando indice como 2 -> (0!=1 , 1!=1)
      Condicional onde se indice for menor que n ele inicia o loop , 
      se nao , o valor final e 1 
*/
public class Fatorial {
    public int calcularFatorial(int n) {
      int resultado = 1 ;
      for(int i = 2;i<=n;i++){
        resultado *= i ;
      }
      return resultado ; 
    }
}