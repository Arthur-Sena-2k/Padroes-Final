package model;

public class AlunoAssinante implements Assinante {
    private String nome;

    public AlunoAssinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Aluno " + nome + ": " + mensagem);
    }
}


