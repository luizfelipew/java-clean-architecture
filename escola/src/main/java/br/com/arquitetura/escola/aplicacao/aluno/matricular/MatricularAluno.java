package br.com.arquitetura.escola.aplicacao.aluno.matricular;

import br.com.arquitetura.escola.dominio.aluno.Aluno;
import br.com.arquitetura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    // padrao de projeto COMMAND
    public void executa(MatricularAlunoDTO dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }
}
