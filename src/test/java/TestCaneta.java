
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class TestCaneta {

    Caneta caneta;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.caneta = new Caneta();
        caneta.setCanetaAberta(true);
    }

    @Test
    @DisplayName("Deve ver se a caneta está aberta")
    public void Aberta(){
        boolean testar = true;
        assertTrue( caneta.Aberta(testar));
    }

    @Test
    @DisplayName("Deve ver se a caneta está fechada")
    public void Fechada(){
        boolean testar = false;
        caneta.setCanetaFechada(true);
        assertFalse( caneta.Fechada(testar));

    }

    @Test
    @DisplayName("Deve ver se a caneta risca, mas so vai saber se estiver aberta")
    public void Risca(){
        assertEquals("Escrevendo...",caneta.Escreve());
    }



    @AfterEach
    public void Mostrar(){
        this.log.info(caneta.toString());
    }



}
