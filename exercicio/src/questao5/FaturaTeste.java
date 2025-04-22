package questao5;
// Classe teste para a classe Fatura
public class FaturaTeste {
    public static void main(String[] args) {
        //Instanciando objeto Fatura
        Fatura fatura = new Fatura("5464", "Produto", 2, 50.0);
        // Utilizando metodos get
        System.out.println("Número da fatura: " + fatura.getNumero());
        System.out.println("Descrição do produto: " + fatura.getDescricao());
        System.out.println("Quantidade comprada: " + fatura.getQuantidade());
        System.out.println("Preço por item: " + fatura.getPreco());
        System.out.println("Valor total da fatura: " + fatura.getTotalFatura());
    }
}
