package escola;

public class Email {

    private String endereco;

    public Email(String endereco) {
        if (endereco == null || !endereco.matches("/^[a-z0-9.]+@[a-z0-9]+\\.[a-z]+\\.([a-z]+)?$/i")) {
            throw new IllegalArgumentException("E-mail inválido");
        }
        this.endereco = endereco;
    }
}
