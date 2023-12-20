package model;

import java.util.Date;


public class Processo {
    
    private Integer id;
    private String numero;
    private Date dataRecepcao;
    private Date dataDistribuicao;
    private Date dataParecer;
    private byte[] parecer;
    private TipoDecisao decisaoRelator;
    private TipoVoto voto;
    private String texto;
    private String justificativa;
    private StatusEnum status;
    private Professor prof_relator;
    private Assunto assunto;
    private Aluno participante;
    private Curso curso;
    
    public Processo(Assunto assunto) {
        this.assunto = assunto;
    }

    public void setTipoDecisao(TipoDecisao decisaoRelator) {
        this.decisaoRelator = decisaoRelator;
    }

    public void registrarAlunos(Aluno aluno) {
        // Lógica para registrar alunos interessados no processo
        // Pode adicionar alunos em uma lista de alunos interessados no processo
    }

    public void mudarEstado(StatusEnum novoEstado) {
        this.status = novoEstado;
    }
}