package escola;

public class CPF {

    private String cpf;

    public CPF(String cpf) {
        if (cpf == null || !cpf.matches("[0-9]{3}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{2}")) {
            throw new IllegalArgumentException("Cpf inválido!");
        }
        this.cpf = cpf;
    }
}
