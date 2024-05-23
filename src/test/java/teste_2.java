package src.test.java;
import static org.junit.Assert.*;
import org.junit.Test;
import src.main.java.Media_Notas;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class teste_2 {
    Media_Notas media_notas = new Media_Notas();

    @SuppressWarnings("static-access")
    @Test

    public void test_inserir_alunos_maior_que_5() {
        
        int valor_inserido = 6;
        
        // Capturando a saída do sistema
        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        System.setOut(new PrintStream(saida));

        media_notas.inserir_alunos(valor_inserido);

        String saida_esperada = "O limite de alunos é 5! Por favor insira novamente a quantidade de alunos.";
        String saida_obtida = saida.toString();

        assertTrue(saida_obtida.contains(saida_esperada));
    }
}
