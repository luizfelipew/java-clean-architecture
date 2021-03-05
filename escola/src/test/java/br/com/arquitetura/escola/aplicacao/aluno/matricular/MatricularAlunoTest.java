package br.com.arquitetura.escola.aplicacao.aluno.matricular;

import br.com.arquitetura.escola.dominio.aluno.Aluno;
import br.com.arquitetura.escola.dominio.aluno.CPF;
import br.com.arquitetura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO("Xablau", "123.456.789-00", "xablau@email.com");
        useCase.executa(dados);

        Aluno encontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));

        Assertions.assertEquals("Xablau", encontrado.getNome());
        Assertions.assertEquals("123.456.789-00", encontrado.getCpf());
        Assertions.assertEquals("xablau@email.com", encontrado.getEmail());
    }
}
