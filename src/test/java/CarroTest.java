import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;

import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CarroTest {

    Carro carro;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.carro = new Carro();
        carro.setLigado(true);
    }



    @Test
    @DisplayName("Comprando gasolina")
    public void ComprarGasolina(){
        carro.setSaldo(100);
        carro.setPrecogasolina(6.56);
        assertEquals(80.32, carro.comprarGasolina());
    }

    @Test
    @DisplayName("Testar se o carro está ligado")
    public void Ligado(){
        boolean testar = true;
        assertTrue(carro.carroLigado(testar));

    }


    @Test
    @DisplayName("Testar se o carro vai dar partida")
    public void Anda(){
        assertEquals("andando", carro.andando());
    }



    @AfterEach
    public void ApresentarResults(){
        this.log.info(carro.toString());
    }


}
