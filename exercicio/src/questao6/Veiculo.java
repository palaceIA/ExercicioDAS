package questao6;

public class Veiculo {
    // Atributos da classe Veiculo
    private int peso; 
    private int velMax; 
    private double preco;

    // Construtor vazio -> Inicializando com 0 
    public Veiculo() {
        setPeso(0);
        setPreco(0);
        setVelMax(0);
    }

    // Construtor inicializado
    public Veiculo(int peso, int velMax, double preco) {
        setPeso(peso);
        setVelMax(velMax);
        setPreco(preco);;
    }

    // Metodos GET e SET  
    public int getPeso() { return peso; }
    public void setPeso(int peso) { this.peso = peso; }

    public int getVelMax() { return velMax; }
    public void setVelMax(int velMax) { this.velMax = velMax; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    // Metodo para printar os atributos
    public void print() {
        System.out.println("Peso: " + getPeso());
        System.out.println("Velocidade Máxima: " + getVelMax());
        System.out.println("Preço: R$" + getPreco());
    }
}
