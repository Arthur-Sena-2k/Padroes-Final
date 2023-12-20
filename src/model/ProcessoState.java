package model;

public interface ProcessoState {
    void distribuir(Processo processo);
    void pautar(Processo processo);
    void julgar(Processo processo);
    String getDescricao();
}
