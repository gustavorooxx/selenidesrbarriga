import Contas.Contas;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class adicionarContaTest {
    Contas contas = new Contas();

    @Test
    public void adicionarContas(){
        contas.adicionarConta();
        contas.inserirConta("Gustavo Chagas");
        contas.salvar();
        Assertions.assertEquals("Conta adicionada com sucesso!", contas.alerta());
    }
}


