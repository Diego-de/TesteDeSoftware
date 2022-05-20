package ShowTest;

import SHOW.Capital.TipoIngresso;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

public class TestTipoIngresso {

    TipoIngresso Ingresso;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.Ingresso = new TipoIngresso();
    }

    @Test
    @DisplayName("Testar se o ingresso é na área front")
    public void TestarFront(){
        Ingresso.setValor(50);
       assertEquals("Front",Ingresso.TipoFront());
    }

    @Test
    @DisplayName("Testar se o ingresso é na área Gold")
    public void TestarGold(){
        Ingresso.setValor(110);
        assertEquals("Gold",Ingresso.TipoGold());
    }

    @Test
    @DisplayName("Testar se o ingresso é no Caramote")
    public void TestarCaramote(){
        Ingresso.setValor(150);
        assertEquals("Camarote",Ingresso.TipoCamarote());
    }



    @AfterEach
    public void Mostrar(){
        this.log.info(Ingresso.toString());
    }

}
