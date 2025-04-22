package questao7;
// Classe empregado 
public class Empregado {
    // Atributos da classe empregado
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    // Construtor inicializado
    public Empregado(String nome, String sobrenome, double salarioMensal) {
        setNome(sobrenome);
        setSobrenome(sobrenome);
        setSalarioMensal(salarioMensal);
    }

    // Metodos GET e SETC
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getSobrenome() {return sobrenome;}
    public void setSobrenome(String sobrenome) {this.sobrenome = sobrenome;}

    public double getSalarioMensal() {return salarioMensal;}
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal < 0) {
            System.out.println("Salário não pode ser negativo.");
        }
        this.salarioMensal = salarioMensal;
    }
}