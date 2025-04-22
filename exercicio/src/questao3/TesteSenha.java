package questao3;
// Essa classe implementa o teste da senha valida
public class TesteSenha {
    public static void main(String[] args) {
        // Instanciando o objeto ValidadorSenha
        ValidadorDeSenha val = new ValidadorDeSenha() ; 
        // Primeiro teste -> Deve ser False
        String senha1 = "44ggghh";
        System.out.println("Senha valida : "+val.senhaValida(senha1));
        // Segundo teste -> Deve ser True
        String senha2 = "4Hfffffg";
        System.out.println("Senha valida : "+val.senhaValida(senha2));
    }
}
