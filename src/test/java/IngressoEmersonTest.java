import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;

public class IngressoEmersonTest {

    IngressoEmerson ingressoEmerson;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.ingressoEmerson = new IngressoEmerson();
        ingressoEmerson.setValor(100);
        ingressoEmerson.setQuantidade(10);
    }

    @Test
    @DisplayName("Verficar o tipo do ingresso")
    public void TipoIngresso(){
        assertEquals("Camarote", ingressoEmerson.tipoIngresso());
    }

    @Test
    @DisplayName("Verficar a quantidade Comprada")
    public void quantidadeComprada(){
        int quantidadeAvenda = 30;
        assertEquals(20, ingressoEmerson.quantidadeIngresso(quantidadeAvenda));
    }


    @Test
    @DisplayName("Verficar se o lucro teve resultado esperado")
    public void Lucro(){
       assertFalse(ingressoEmerson.lucro());
    }






    @AfterEach
    public void Mostrar(){
        this.log.info(ingressoEmerson.toString());
    }

}