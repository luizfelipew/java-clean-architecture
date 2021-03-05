package br.com.arquitetura.escola;

import br.com.arquitetura.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.arquitetura.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.arquitetura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoViaLinhaDeComando {
    public static void main(String[] args) {
        String nome = "Fulano xablau";
        String cpf = "123.456.789-00";
        String email = "xablau@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularAlunoDTO(nome, cpf, email));

    }
}
