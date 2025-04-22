package questao1;

/*
  Essa classe implementa o metodo calcularDescontoProduto recebendo 
  como parametros preco do produto e desconto a ser aplicado e retorna
  diretamente o preco calculado . 
*/
public class CalculadoraDescontos {

    public double calcularDescontoProduto(double preco,double desconto) {
        return preco - (preco*(desconto/100)) ; 
    }
}