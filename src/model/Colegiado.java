package model;

import java.util.Date;
import java.util.List;


public class Colegiado {
    //id: int, dataInicio: date, dataFim: date, descricao: str,
    //portaria: str, curso: Curso
    private Integer id;
    private Date dataInicio;
    private Date dataFim;
    private String descricao;
    private String portaria;
    private Curso curso;
    private List<Professor> membros;
}
