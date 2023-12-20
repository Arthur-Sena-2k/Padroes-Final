package model;

public class ProcessoPublicadora extends Publicadora {
    private String descricao;

    public void executarProcesso() {
        // Lógica do processo...
        // Após algo importante acontecer dentro da publicadora, notifica os assinantes
        notificarAssinantes("O estado do processo foi alterado.");
    }

    // Método para atualizar a descrição do processo
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
