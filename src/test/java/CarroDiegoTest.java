import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarroDiegoTest {

    CarroDiego carroDiego;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.carroDiego = new CarroDiego();
        carroDiego.setLigado(true);
    }



    @Test
    @DisplayName("Comprando gasolina")
    public void ComprarGasolina(){
        carroDiego.setSaldo(100);
        carroDiego.setPrecogasolina(6.56);
        assertEquals(80.32, carroDiego.comprarGasolina());
    }

    @Test
    @DisplayName("Testar se o carro está ligado")
    public void Ligado(){
        boolean testar = true;
        assertTrue(carroDiego.carroLigado(testar));

    }


    @Test
    @DisplayName("Testar se o carro vai dar partida")
    public void Anda(){
        assertEquals("andando", carroDiego.andando());
    }



    @AfterEach
    public void ApresentarResults(){
        this.log.info(carroDiego.toString());
    }


}
