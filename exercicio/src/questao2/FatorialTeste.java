package questao2;
// Classe teste para a classe Fatorial
public class FatorialTeste {
    public static void main(String[] args) {
        // Inicializando objeto da classe Fatorial
        Fatorial fac = new Fatorial();
        // Testes
        System.out.println(fac.calcularFatorial(0)); // Resultado esperados -> 1 
        System.out.println(fac.calcularFatorial(1)); // Resultado esperados -> 1 
        System.out.println(fac.calcularFatorial(3)); // Resultado esperados -> 6

    }
 
}
