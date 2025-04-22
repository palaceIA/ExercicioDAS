package questao6;

public class CarroPasseio {
    // Atributos da classe CarroPasseio 
    // Atributos especiais -> Obj Motor e Veiculo
    private Motor motor;
    private Veiculo veiculo;
    private String cor;
    private String modelo;

    // Construtor vazio -> inicializado 0 e "" 
    public CarroPasseio() {
        setMotor(new Motor());
        setVeiculo(new Veiculo());
        setCor("");
        setModelo("");
    }

    // Construtor inicializado
    public CarroPasseio(Motor motor, Veiculo veiculo, String cor, String modelo) {
        setMotor(motor);
        setVeiculo(veiculo);
        setCor(cor);
        setModelo(modelo);
    }

    // Metodos GET e SET
    public Motor getMotor() { return motor; }
    public void setMotor(Motor motor) { this.motor = motor; }

    public Veiculo getVeiculo() { return veiculo; }
    public void setVeiculo(Veiculo veiculo) { this.veiculo = veiculo; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    // Metodo para printar as informacoes 
    public void print() {
        System.out.println("Dados do Carro de Passeio:");
        getMotor().print();
        getVeiculo().print();
        System.out.println("Cor: " + getCor());
        System.out.println("Modelo: " + getModelo());
    }
}
