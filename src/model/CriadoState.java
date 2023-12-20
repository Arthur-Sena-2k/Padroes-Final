package model;

public class CriadoState implements ProcessoState {
    @Override
    public void distribuir(Processo processo) {
        processo.mudarEstado(new DistribuidoState());
        processo.registrarAlunos(); // Método a ser adicionado na classe Processo para registrar os alunos
    }

    @Override
    public void pautar(Processo processo) {
        // Lógica para pautar um processo criado (se aplicável)
    }

    @Override
    public void julgar(Processo processo) {
        // Lógica para julgar um processo criado (se aplicável)
    }

    @Override
    public String getDescricao() {
        return "CRIADO";
    }
}