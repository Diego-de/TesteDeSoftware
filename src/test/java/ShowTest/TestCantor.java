package ShowTest;

import SHOW.Evento.Cantor;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCantor {

   Cantor cantor;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.cantor = new Cantor();

    }

    @Test
    @DisplayName("Testar o estilo musical pelo nome do cantor")
    public void EstiloMusical(){
        cantor.setEstiloMusical("Joao Gomes");
        assertEquals("Fórro",cantor.EstiloMusica());
    }

    @Test
    @DisplayName("Testar Se o cantor está presente para cantar")
    public void SeEstáPresente(){
        cantor.setPresenca(true);
        assertTrue(cantor.Presente());
    }

    @Test
    @DisplayName("Testar a hora que o cantor vai cantar")
    public void HoraQueCanta(){
        cantor.setHorario("21:30");
        cantor.setPresenca(true);

        assertEquals("Cantar",cantor.Hora());
    }



    @AfterEach
    public void Mostrar(){
        this.log.info(cantor.toString());
    }


}
