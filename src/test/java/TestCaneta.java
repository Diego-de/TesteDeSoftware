
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCaneta {

    Caneta caneta;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.caneta = new Caneta();
    }

    @AfterEach
    public void Mostrar(){
        this.log.info(caneta.toString());
    }

    @Test
    @DisplayName("Deve ver se a caneta é azul")
    public void CorCaneta(){
        caneta.setCorCaneta("Azul");

        assertEquals("Azul", caneta.Cor());
    }

    @Test
    @DisplayName("Deve ver se a caneta é bic")
    public void TipoCaneta(){
        caneta.setTipoCaneta("bic");

        assertEquals("bic", caneta.Tipo());
    }


    @Test
    @DisplayName("Deve ver se a caneta está aberta")
    public void Aberta(){
        boolean testar = true;
        caneta.setCanetaAberta(true);

        assertTrue( caneta.Aberta(testar));
    }

    @Test
    @DisplayName("Deve ver se a caneta está fechada")
    public void Fechada(){
        boolean testar = false;
        caneta.setCanetaFechada(false);

        assertTrue( caneta.Fechada(testar));

    }

    @Test
    @DisplayName("Deve ver se a caneta risca, mas so vai saber se estiver aberta")
    public void Risca(){
        caneta.setCanetaAberta(true);

        assertEquals("Escrevendo...",caneta.Escreve());
    }



}
