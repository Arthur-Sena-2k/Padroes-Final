package model;

public class EmPautaState implements ProcessoState {
    @Override
    public void distribuir(Processo processo) {
        // Lógica adicional, se necessário, quando estiver em pauta
    }

    @Override
    public void pautar(Processo processo) {
        // Lógica adicional, se necessário, quando já estiver em pauta
    }

    @Override
    public void julgar(Processo processo) {
        processo.setEstado(new EmJulgamentoState());
    }

    @Override
    public String getDescricao() {
        return "EM PAUTA";
    }
}