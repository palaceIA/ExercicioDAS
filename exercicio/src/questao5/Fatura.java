package questao5;

public class Fatura {
    // Atributos da classe Fatura
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco; 
    // Construtor da Classe Fatura
    public Fatura(String numero, String descricao, int quantidade, double preco) {
        setNumero(numero);;
        setDescricao(descricao);;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    // Metodos GET
    public String getNumero() {
        return numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPreco() {
        return preco;
    }

    // Metodos SET
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.preco = (precoPorItem > 0) ? precoPorItem : 0.0;
    }

    // Metodo que calcula a fatura total -> Quantidade * preco
    public double getTotalFatura(){
        return getQuantidade() * getPreco();
    }
}
