import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RadioTest {
    Radio radio;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.radio = new  Radio();
        radio.setVolume(99);
    }

    @AfterEach
    public void Mostrar(){
        this.log.info(radio.toString());
    }


    @Test
    @DisplayName("Testar se o radio aumenta o volume")
    public void Aumentar(){
        assertTrue(radio.aumentaV());
    }

    @Test
    @DisplayName("Testar se o radio aumenta o volume")
    public void Diminuir(){
        assertTrue(radio.diminuirV());
    }

    @Test
    @DisplayName("Testar se o radio troca de canal")
    public void Canal(){
        radio.setCanal(102.1);
        assertTrue(radio.TrocaCanal());
    }


}
