import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class IngressoTest {

    Ingresso ingresso;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.ingresso = new  Ingresso();
        ingresso.setValor(100);
        ingresso.setQuantidade(10);
    }

    @Test
    @DisplayName("Verficar o tipo do ingresso")
    public void TipoIngresso(){
        assertEquals("Camarote",ingresso.tipoIngresso());
    }

    @Test
    @DisplayName("Verficar a quantidade Comprada")
    public void quantidadeComprada(){
        int quantidadeAvenda = 30;
        assertEquals(20,ingresso.quantidadeIngresso(quantidadeAvenda));
    }


    @Test
    @DisplayName("Verficar se o lucro teve resultado esperado")
    public void Lucro(){
       assertFalse(ingresso.lucro());
    }






    @AfterEach
    public void Mostrar(){
        this.log.info(ingresso.toString());
    }

}
