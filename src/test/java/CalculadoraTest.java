import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculadoraTest {

    Calculadora calculo;
    Logger log = Logger.getLogger("log");

    @BeforeEach
    public void setUp(){
        this.calculo = new Calculadora();
    }

    @Test
    @DisplayName("Testar o resultado da soma")
    public void Soma(){
        double a = 10;
        double b = 10;
        assertEquals(20 ,calculo.soma(a,b));
    }


    @Test
    @DisplayName("Testar o resultado da porcentagem de 15%")
    public void Porcentagem(){
        double a = 200;
        assertEquals(30 ,calculo.porcentagem(a));
    }

    @Test
    @DisplayName("Testar o resultado da Potencia")
    public void Potencia(){
        double a = 10;
        double b = 2;

        assertEquals(100 ,calculo.potencia(a,b));
    }


    @AfterEach
    public void Mostrar(){
        this.log.info("Testado");
    }

}
