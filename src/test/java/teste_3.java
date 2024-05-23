package src.test.java;
import static org.junit.Assert.*;
import org.junit.Test;
import src.main.java.Media_Notas;

public class teste_3 {
    Media_Notas media_notas = new Media_Notas();

    @Test

    public void test_substituir_nota() {
        @SuppressWarnings("static-access")
        float resultado = media_notas.substituir_nota(15.0f, 4.0f, 10.0f);
        assertEquals(7.0, resultado, 0);
    }        
}
