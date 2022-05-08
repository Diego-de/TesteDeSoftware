import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JogoComputadorDiegoTest {

    JogoComputadorDiego jogo;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.jogo = new JogoComputadorDiego();
        jogo.setLigado(true);
    }

    @Test
    @DisplayName("Testar Computador está ligado")
    public void Ligado(){
        assertTrue(jogo.ComputadorLigado());
    }

    @Test
    @DisplayName("Testar se Computador tem memoria")
    public void Memoria(){
        jogo.setMemoria(500);
        jogo.setMemoriaJogo(230);
        assertTrue(jogo.Suporta());
    }


    @Test
    @DisplayName("Testar se o jogo está rodando")
    public void Rodando(){
        assertEquals("rodando...",jogo.jogoRodando());
    }


    @AfterEach
    public void Mostrar(){
        this.log.info(jogo.toString());
    }

}
