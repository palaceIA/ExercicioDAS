package questao3;
// Classe que implementa verificador de senha valida
public class ValidadorDeSenha {
    // Metodo orquestrante dos demais metodos 
    public boolean senhaValida(String senha) {
        return temComprimentoMinimo(senha) &&
               contemNumero(senha) &&
               contemLetraMaiuscula(senha);
    }  // -> Deve ser True e True e True 

    // Verificar comprimento minimo -> 8 caracteres 
    private boolean temComprimentoMinimo(String senha) {
        return senha != null && senha.length() >= 8;
    } // -> Deve ser True e True

    // Verificar contagem de numeros -> minimo 1 
    private boolean contemNumero(String senha) {
        // Metodo matches percorre a string verificando o que esta entre .**.
        return senha.matches(".*\\d.*");
    }  // -> Deve ser True

    // Verificar contagem de letras maiusculas -> minimo 1 
    private boolean contemLetraMaiuscula(String senha) {
        return senha.matches(".*[A-Z].*");
    }  // -> Deve ser True 
}
