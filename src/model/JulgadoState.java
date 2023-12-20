package model;

public class JulgadoState implements ProcessoState {
    @Override
    public void distribuir(Processo processo) {
        // Lógica adicional, se necessário, quando já estiver julgado
    }

    @Override
    public void pautar(Processo processo) {
        // Lógica adicional, se necessário, quando já estiver julgado
    }

    @Override
    public void julgar(Processo processo) {
        // Lógica adicional, se necessário, quando já estiver julgado
    }

    @Override
    public String getDescricao() {
        return "JULGADO";
    }
}