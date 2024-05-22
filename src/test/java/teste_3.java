package src.test.java;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import org.junit.Test;

import src.main.java.Media_Notas;

public class teste_3 {
    Media_Notas media_notas = new Media_Notas();

    @Test

    public void test_nota_4() {
        String valor_inserido = "8.0"; // Enter a nota_4 value that should result in "APROVADO"
        InputStream entrada = new ByteArrayInputStream(valor_inserido.getBytes());
        System.setIn(entrada);

        float media = 7.5f; // Assumed initial calculated media
        float soma = 22.5f; // Assumed initial sum of notas
        float menor = 6.0f; // Assumed initial menor nota

        System.setIn(entrada);

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Media_Notas.nota_4(media, soma, menor);

        assertEquals("APROVADO", outContent.toString().trim()); // Add the expected output message
    }

    // Add more test cases as needed to cover different scenarios
}
