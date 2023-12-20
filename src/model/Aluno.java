package model;

import java.util.List;


public class Aluno extends Usuario{

    private String nome;

    public Aluno(String nome) {
        super(nome); // Explicitly invoke the constructor of the Usuario class
        this.nome = nome;
    }

    public Reuniao consultarReuniao(Reuniao reuniao) {
        return reuniao;
    }

    private String cpf;
    private List<Processo> processos;

    public void adicionarProcesso(Processo processo) {
        this.processos.add(processo);
    }

    public String getNome() {
        return nome;
    }


}

