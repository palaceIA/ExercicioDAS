package questao6;

public class Motor {
    // Atributos da classe Motor
    private int numCilindros;
    private int potencia;

    // Construtor vazio -> Inicializado com 0 
    public Motor() {
        setNumCilindros(0);
        setPotencia(0);
    }

    // Construtor inicializado 
    public Motor(int numCilindros, int potencia) {
        setNumCilindros(numCilindros);;
        setPotencia(potencia);
    }

    // Metodos GET e SET
    public int getNumCilindros() { return numCilindros; }
    public void setNumCilindros(int numCilindros) { this.numCilindros = numCilindros; }

    public int getPotencia() { return potencia; }
    public void setPotencia(int potencia) { this.potencia = potencia; }

    // Metodo Print para mostrar informacoes 
    public void print() {
        System.out.println("Número de cilindros: " + getNumCilindros());
        System.out.println("Potência: " + getPotencia()+ " CV");
    }
}
