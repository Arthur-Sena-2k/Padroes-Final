package model;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;


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
    private ProcessoState status;
    private Professor prof_relator;
    private Assunto assunto;
    private Curso curso;
    private List<Aluno> alunosInteressados;
    
    public Processo(Assunto assunto) {
        this.assunto = assunto;
        this.alunosInteressados = new ArrayList<>();
    }

    public void setTipoDecisao(TipoDecisao decisaoRelator) {
        this.decisaoRelator = decisaoRelator;
    }

    public void registrarAlunos(Aluno aluno) {
        // Adiciona o aluno à lista de alunos interessados no processo
        this.alunosInteressados.add(aluno);
    }

    public void mudarEstado(ProcessoState novoEstado) {
        this.status = novoEstado;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setDescricao(String descricao) {
        this.texto = descricao;
    }

    public void pautar() {
        this.status.pautar(this);
    }

    public void distribuir() {
        this.status.distribuir(this);
    }

    public void julgar() {
        this.status.julgar(this);
    }

    public List<Aluno> getAlunosInteressados() {
        return alunosInteressados;
    }
}
