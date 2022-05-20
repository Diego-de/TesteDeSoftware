package ShowTest;

import SHOW.Capital.Lucro;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLucro {

    Lucro lucro;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.lucro = new Lucro();
    }


    @Test
    @DisplayName("Verificar a quantidade vendida do Front")
    public void TestarFront(){
        lucro.setIngressosVendidos(6000);
        assertEquals(300000.0,lucro.QuantidadeVendidosFront());
    }

    @Test
    @DisplayName("Verificar a quantidade vendida do Gold")
    public void TestarGold(){
        lucro.setIngressosVendidos(6000);
        assertEquals(660000.0,lucro.QuantidadeVendidosGold());
    }

    @Test
    @DisplayName("Verificar a quantidade vendida do Camarote")
    public void TestarCamarote(){
        lucro.setIngressosVendidos(6000);
        assertEquals(900000.0,lucro.QuantidadeVendidosCamatore());
    }

    @Test
    @DisplayName("Verificar lucro total")
    public void Lucro(){
        lucro.setIngressosVendidos(6000);
        assertEquals(1860000.0,lucro.LucroTotal());
    }



    @AfterEach
    public void Mostrar(){
        this.log.info(lucro.toString());
    }


}
