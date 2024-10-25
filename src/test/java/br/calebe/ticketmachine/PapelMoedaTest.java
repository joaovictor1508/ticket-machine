package br.calebe.ticketmachine;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.calebe.ticketmachine.core.PapelMoeda;

public class PapelMoedaTest {

    @Test
    public void getValorTest(){
        PapelMoeda papelMoeda = new PapelMoeda(2, 1);
        assertEquals(2, papelMoeda.getValor());
    }

    @Test
    public void getQuantidadeTest(){
        PapelMoeda papelMoeda = new PapelMoeda(2, 1);
        assertEquals(1, papelMoeda.getQuantidade());
    }
}
