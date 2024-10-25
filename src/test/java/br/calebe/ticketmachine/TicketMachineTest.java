package br.calebe.ticketmachine;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import br.calebe.ticketmachine.core.TicketMachine;
import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

public class TicketMachineTest {
    
    @Test
    public void getSaldoTest() throws PapelMoedaInvalidaException{
        TicketMachine ticketMachine = new TicketMachine( 5);
        ticketMachine.inserir(2);
        assertEquals(2,ticketMachine.getSaldo());
    };

    @Test(expected=PapelMoedaInvalidaException.class)
    public void papelMoedaInvalidaTest() throws PapelMoedaInvalidaException{
        TicketMachine ticketMachine = new TicketMachine( 5);
        ticketMachine.inserir(200);
    };

    @Test(expected=SaldoInsuficienteException.class)
    public void saldoInsuficienteExceptionTest() throws SaldoInsuficienteException{
        TicketMachine ticketMachine = new TicketMachine( 5);
        try {
            ticketMachine.inserir(2);
        } catch (PapelMoedaInvalidaException ex) {
        }
        ticketMachine.imprimir();
        assertEquals(2,ticketMachine.getSaldo());
    };

    @Test
    public void imprimirTest() throws SaldoInsuficienteException{
        int valor = 5;
        TicketMachine ticketMachine = new TicketMachine( valor);
        try {
            ticketMachine.inserir(5);
        } catch (PapelMoedaInvalidaException ex) {
        }
        String expected = "*****************\n";
        expected += "*** R$ " + valor + ",00 ****\n";
        expected += "*****************\n";
        String bilhete = ticketMachine.imprimir();
        assertEquals(expected,bilhete);
    };
}
