package model;

public enum StatusReuniao {

    ENCERRADA("encerrada"), PROGRAMADA("programada");

    private String descricao;

    StatusReuniao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return this.descricao;
    }
}

