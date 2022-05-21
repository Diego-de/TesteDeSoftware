package ShowTest;

import SHOW.Capital.Despesas;
import SHOW.Evento.Local;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDespesas {

    Despesas despesas;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.despesas = new Despesas();
        despesas.setPagamentoLocal(90000.0);
        despesas.setPagamentoCantor(400000.0);
    }

    @Test
    @DisplayName("Verificar o valor com a taxa do cantor")
    public void TaxaCantor(){
        assertEquals(1460000.0,despesas.TaxaCantor());
    }

    @Test
    @DisplayName("Verificar o valor com a taxa do local")
    public void TaxaLocal(){
        assertEquals(1370000.0,despesas.TaxaLocal());
    }

    @Test
    @DisplayName("Verificar o total de despesas")
    public void TotalDespesas(){
        assertEquals(490000.0,despesas.totalDespesas());
    }


    @AfterEach
    public void Mostrar(){
        this.log.info(despesas.toString());
    }
}
