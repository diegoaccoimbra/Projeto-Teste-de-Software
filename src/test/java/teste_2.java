package src.test.java;
import static org.junit.Assert.*;
import org.junit.Test;
import src.main.java.Media_Notas;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class teste_2 {
    Media_Notas media_notas = new Media_Notas();

    @Test

    public void test_inserir_alunos() {
        // Simulando a entrada de um valor maior que 5.
        String valor_inserido = "6";
        InputStream entrada = new ByteArrayInputStream(valor_inserido.getBytes());
        System.setIn(entrada);

        // Obtendo a saída do método inserir_alunos().
        media_notas.inserir_alunos();

        // Verificando se a mensagem exibida está de acordo com a saída simulada acima.
        assertEquals("O limite de alunos é 5! Por favor insira novamente a quantidade de alunos.", );
    }
}
