package model;

import java.util.ArrayList;
import java.util.List;

public abstract class Publicadora {
    private List<Assinante> assinantes = new ArrayList<>();

    public void adicionarAssinante(Assinante assinante) {
        assinantes.add(assinante);
    }

    public void removerAssinante(Assinante assinante) {
        assinantes.remove(assinante);
    }

    protected void notificarAssinantes(String mensagem) {
        for (Assinante assinante : assinantes) {
            assinante.atualizar(mensagem);
        }
    }
}
