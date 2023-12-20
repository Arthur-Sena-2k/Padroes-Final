package model;

public class CoordenadorAssinante implements Assinante {
    private String nome;

    public CoordenadorAssinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Coordenador " + nome + ": " + mensagem);
    }
}
