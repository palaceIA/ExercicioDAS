package questao6;
//Classe teste 
public class Teste {
    public static void main(String[] args) {
        // Inicializando obj das classes Motor , veiculo e Carro Passeio
        Motor motorCarro = new Motor(4, 150);
        Veiculo veiculoCarro = new Veiculo(1200, 180, 55000.0);
        CarroPasseio carro = new CarroPasseio(motorCarro, veiculoCarro, "Vermelho", "Sedan");

        System.out.println("=== Carro de Passeio ===");
        carro.print();

        // Inicializando obj das classes Motor , veiculo e Caminhao
        Motor motorCaminhao = new Motor(8, 400);
        Veiculo veiculoCaminhao = new Veiculo(8000, 120, 250000.0);
        Caminhao caminhao = new Caminhao(motorCaminhao, veiculoCaminhao, 20.5, 4, 12);

        System.out.println("\n=== Caminhão ===");
        caminhao.print();
    }
}
