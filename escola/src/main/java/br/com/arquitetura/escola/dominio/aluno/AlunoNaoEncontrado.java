package br.com.arquitetura.escola.dominio.aluno;

public class AlunoNaoEncontrado extends RuntimeException {

    public AlunoNaoEncontrado(CPF cpf) {
        super("Aluno nao encontrado com cpf: " + cpf.getNumero());
    }
}
