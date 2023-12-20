import model.Aluno;
import model.AlunoAssinante;
import model.Assinante;
import model.Assunto;
import model.CriadoState;
import model.Processo;
import model.ProcessoPublicadora;
import model.ProcessoState;
import model.Professor;
import model.StatusEnum;

public class App {
    public static void main(String[] args) throws Exception {
        inicializarSistema();
        System.out.println("Julgamento finalizado!");
    }
    

    // criar processos mudando seus status e notificando os assinantes
    private static void inicializarSistema() {
        // Criando um assunto
        Assunto assunto = new Assunto("Assunto de teste");
        

        // Criando um processo
        Processo processo = new Processo(assunto);
        processo.setNumero("123456789");
        processo.setDescricao("Processo de teste");
        processo.mudarEstado(new CriadoState());
        processo.registrarAlunos(new Aluno("João"));

        // Criando assinantes
        Aluno aluno1 = new Aluno("João");
        AlunoAssinante assinante1 = new AlunoAssinante(aluno1.getNome());
        
        Aluno aluno2 = new Aluno("Maria");
        AlunoAssinante assinante2 = new AlunoAssinante(aluno2.getNome());

        // Adicionando assinantes
        StatusEnum.getInstance().adicionarAlunoAssinante(assinante1);
        StatusEnum.getInstance().adicionarAlunoAssinante(assinante2);

        // Distribuindo o processo
        processo.distribuir();

        // Pautando o processo
        processo.pautar();

        // Julgando o processo
        processo.julgar();
    }


    
}
