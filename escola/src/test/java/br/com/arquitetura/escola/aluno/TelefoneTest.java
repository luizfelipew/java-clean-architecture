package br.com.arquitetura.escola.aluno;

import br.com.arquitetura.escola.aluno.Telefone;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone(null, "123456789"));
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("", "123456789"));
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("1", "123456789"));
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("123", "123456789"));
    }

    @Test
    void naoDeveriaCriarTelefoneComNumerosInvalidos() {
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("11", null));
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("11", ""));
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("11", "123"));
        Assertions.assertThrows(IllegalArgumentException.class,
                ()-> new Telefone("11", "1234567890"));
    }

    @Test
    void deveriaPermitirCriarTelefoneComDDDENumeroValidos() {
        String ddd = "11";
        String numero = "123456789";
        Telefone telefone = new Telefone(ddd, numero);
        Assertions.assertEquals(ddd, telefone.getDdd());
        Assertions.assertEquals(numero, telefone.getNumero());

    }
}
