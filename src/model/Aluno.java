package model;

import java.util.List;


public class Aluno extends Usuario{

    public Reuniao consultarReuniao(Reuniao reuniao) {
        return reuniao;
    }

    private String cpf;
    private List<Processo> processos;

    public void adicionarProcesso(Processo processo) {
        this.processos.add(processo);
    }
}

