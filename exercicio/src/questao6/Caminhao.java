package questao6;

public class Caminhao {
    // Atributos da classe Caminhao 
    // Atributos especiais -> Obj Motor e Veiculo
    private Motor motor;
    private Veiculo veiculo;
    private double toneladas;
    private int alturaMax;
    private int comprimento;

    // Construtor vazio -> Inicializado com 0 
    public Caminhao() {
       setMotor(new Motor());
       setVeiculo(new Veiculo());
       setToneladas(0);
       setAlturaMax(0);
       setComprimento(0);
        
    }
    // Construtor inicializado
    public Caminhao(Motor motor, Veiculo veiculo, double toneladas, int alturaMax, int comprimento) {
        setMotor(motor);;
        setVeiculo(veiculo);;
        setToneladas(toneladas);;
        setAlturaMax(alturaMax);;
        setComprimento(comprimento);;
    }
    // Metodos GET e SET
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public double getToneladas() { return toneladas; }
    public void setToneladas(double toneladas) { this.toneladas = toneladas; }

    public int getAlturaMax() { return alturaMax; }
    public void setAlturaMax(int alturaMax) { this.alturaMax = alturaMax; }

    public int getComprimento() { return comprimento; }
    public void setComprimento(int comprimento) { this.comprimento = comprimento; }


    public void print() {
        System.out.println("Dados do Caminhão:");
        getMotor().print();
        getVeiculo().print();
        System.out.println("Toneladas: " + getToneladas());
        System.out.println("Altura máxima: " +getAlturaMax() + " m");
        System.out.println("Comprimento: " + getComprimento() + " m");
    }
}
