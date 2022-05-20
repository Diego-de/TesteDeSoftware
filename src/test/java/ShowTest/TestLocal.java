package ShowTest;

import SHOW.Evento.Local;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestLocal {

    Local local;
    Logger log = Logger.getLogger("log");


    @BeforeEach
    public void setUp(){
        this.local = new Local();
    }

    @Test
    @DisplayName("Verificar o nome do local")
    public void VerNomeDoLocal(){
        local.setNome("Classic Hall");
        assertTrue(local.NomeLocal());
    }

    @Test
    @DisplayName("Verificar a capacidade do local")
    public void capacidadeDoLocal(){
        local.setCapacidade(15.000);
        assertEquals("Suporta",local.CapacidadePessoas());
    }

    @Test
    @DisplayName("Verificar se o local está disponivel")
    public void disponibilidadeDoLocal(){
        local.setCapacidade(16.000);
        local.setDisponibilidadeData("20/07/2022");
        assertEquals("Disponivel",local.DisponibilidadeLocal());
    }



    @AfterEach
    public void Mostrar(){
        this.log.info(local.toString());
    }
}
