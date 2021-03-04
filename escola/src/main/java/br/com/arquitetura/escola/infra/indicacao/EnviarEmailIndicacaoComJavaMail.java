package br.com.arquitetura.escola.infra.indicacao;

import br.com.arquitetura.escola.aplicacao.indicacao.EnviarEmailIndicacao;
import br.com.arquitetura.escola.dominio.aluno.Aluno;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {

    @Override
    public void enviarPara(Aluno indicaco) {
        // logica de envio de emails com a lib JAVA Mail
    }

}
