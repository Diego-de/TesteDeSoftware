package ShowTest;

import SHOW.Evento.Cantor;
import SHOW.Evento.Publico;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPublico {

    Publico publico;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.publico = new Publico();
        publico.setIdade(18);
    }


    @Test
    @DisplayName("Testar o pedir documento caso seja maior que 18 anos")
    public void IdadeValida(){
        assertEquals("Mostrar",publico.Entrada());
    }

    @Test
    @DisplayName("Testar se o documento é valido")
    public void VerificarDocumentacao(){
        assertTrue(publico.Documentacao());
    }


    @Test
    @DisplayName("Caso documento seja valido, Entregar Pulseira")
    public void EntregarPulseira(){
        assertEquals("Recebeu pulseira",publico.Pulseira());
    }





    @AfterEach
    public void Mostrar(){
        this.log.info(publico.toString());
    }
}
