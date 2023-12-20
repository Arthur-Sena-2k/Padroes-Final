package model;

public class DistribuidoState implements ProcessoState {
    @Override
    public void distribuir(Processo processo) {
        // Lógica adicional, se necessário, quando já estiver distribuído
    }

    @Override
    public void pautar(Processo processo) {
        processo.setEstado(new EmPautaState());
    }

    @Override
    public void julgar(Processo processo) {
        // Lógica para julgar um processo distribuído (se aplicável)
    }

    @Override
    public String getDescricao() {
        return "DISTRIBUÍDO";
    }
}
