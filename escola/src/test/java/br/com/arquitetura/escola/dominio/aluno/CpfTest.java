package br.com.arquitetura.escola.dominio.aluno;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CpfTest {

    @Test
    void naoDeveriaAceitarCpfsInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new CPF("12345678900"));
    }

    @Test
    void deveriaPermitirCriarCPFComNumeroValido() {
        String numero = "123.456.789-00";
        CPF cpf = new CPF(numero);
        Assertions.assertEquals(numero, cpf.getCpf());
    }
}
