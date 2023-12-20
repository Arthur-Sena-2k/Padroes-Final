package model;

import java.util.Date;
import java.util.List;



public class Reuniao {
   
    private Integer id;
    private Date dataReuniao;
    private StatusReuniao status;
    public StatusReuniao getStatusReuniao() {
        return this.status;
    }

    private byte[] ata;
    private Colegiado colegiado;
    private List<Processo> processos;
    
    public void addProcesso(Processo processo){
        this.processos.add(processo);
    }
}
