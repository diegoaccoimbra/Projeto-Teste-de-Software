package src.test.java;
import static org.junit.Assert.*;
import org.junit.Test;
import src.main.java.Media_Notas;

public class teste_1 {
    Media_Notas media_notas = new Media_Notas();

    @Test

    public void test_calcular_media() {
        @SuppressWarnings("static-access")
        float resultado = media_notas.calcular_media(21.0f);
        assertEquals(7.0, resultado, 0);
    }
}
