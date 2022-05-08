import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RadioEmersonTest {
    RadioEmerson radioEmerson;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.radioEmerson = new RadioEmerson();
        radioEmerson.setVolume(99);
    }

    @AfterEach
    public void Mostrar(){
        this.log.info(radioEmerson.toString());
    }


    @Test
    @DisplayName("Testar se o radio aumenta o volume")
    public void Aumentar(){
        assertTrue(radioEmerson.aumentaV());
    }

    @Test
    @DisplayName("Testar se o radio aumenta o volume")
    public void Diminuir(){
        assertTrue(radioEmerson.diminuirV());
    }

    @Test
    @DisplayName("Testar se o radio troca de canal")
    public void Canal(){
        radioEmerson.setCanal(102.1);
        assertTrue(radioEmerson.TrocaCanal());
    }


}
