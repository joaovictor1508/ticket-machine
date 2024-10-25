package br.calebe.ticketmachine;

import java.util.Iterator;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;

import br.calebe.ticketmachine.core.PapelMoeda;
import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;

public class TrocoTest {
    @Test
    public void getTrocoTest() throws PapelMoedaInvalidaException{
        TicketMachine ticketMachine = new TicketMachine(5);        
        ticketMachine.inserir(5);
        ticketMachine.inserir(5);
        ticketMachine.inserir(5);
        Iterator<PapelMoeda> troco = ticketMachine.getTroco();
        assertNotNull(troco);
    };
}
