package model;

import java.util.ArrayList;
import java.util.List;

public class StatusEnum {

    private static StatusEnum instanciaUnica;

    private ProcessoState state;
    private List<Assinante> alunos = new ArrayList<>();
    private List<Assinante> coordenadores = new ArrayList<>();

    private StatusEnum() {
        // Inicialize os atributos conforme necessário...
    }

    public static StatusEnum getInstance() {
        if (instanciaUnica == null) {
            instanciaUnica = new StatusEnum();
        }
        return instanciaUnica;
    }

    public void setEstado(ProcessoState state) {
        this.state = state;
        notificarAlunos("O estado do processo foi alterado para: " + state.getDescricao());
        notificarCoordenadores(state);
    }

    public void adicionarAlunoAssinante(Assinante aluno) {
        alunos.add(aluno);
    }

    public void adicionarCoordenadorAssinante(Assinante coordenador) {
        coordenadores.add(coordenador);
    }

    private void notificarAlunos(String mensagem) {
        for (Assinante aluno : alunos) {
            aluno.atualizar(mensagem);
        }
    }

    private void notificarCoordenadores(ProcessoState state) {
        if (state instanceof EmPautaState || state instanceof EmJulgamentoState) {
            String mensagem = "O estado do processo está: " + state.getDescricao();
            for (Assinante coordenador : coordenadores) {
                coordenador.atualizar(mensagem);
            }
        }
    }

    public void distribuir(Processo processo) {
        state.distribuir(processo);
    }

    public void pautar(Processo processo) {
        state.pautar(processo);
    }

    public void julgar(Processo processo) {
        state.julgar(processo);
    }

    public String getDescricao() {
        return state.getDescricao();
    }

    private void inicializarSistema() {
        carregarConfiguracoes();
        inicializarRecursos();
    }

    private void carregarConfiguracoes() {
        System.out.println("Carregando configurações do sistema...");
    }

    private void inicializarRecursos() {
        System.out.println("Inicializando recursos do sistema...");
    }

    public StatusEnum getEstado() {
        return (StatusEnum) state;
    }
}
