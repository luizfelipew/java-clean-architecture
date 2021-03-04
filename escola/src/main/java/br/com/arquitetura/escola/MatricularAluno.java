package br.com.arquitetura.escola;

import br.com.arquitetura.escola.dominio.aluno.Aluno;
import br.com.arquitetura.escola.dominio.aluno.CPF;
import br.com.arquitetura.escola.dominio.aluno.Email;
import br.com.arquitetura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.arquitetura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {
    public static void main(String[] args) {
        String nome = "Fulano xablau";
        CPF cpf = new CPF("123.456.789-00");
        Email email = new Email("xablau@email.com");

        Aluno aluno = new Aluno(cpf, nome, email);

        RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
        repositorio.matricular(aluno);
    }
}
