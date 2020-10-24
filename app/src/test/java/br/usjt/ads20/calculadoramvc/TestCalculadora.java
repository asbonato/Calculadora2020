package br.usjt.ads20.calculadoramvc;

import org.junit.Test;

import br.usjt.ads20.calculadoramvc.model.Calculadora;

import static org.junit.Assert.assertEquals;

public class TestCalculadora {
    Calculadora model = new Calculadora();

    @Test
    public void testaSoma(){
        model.setValor1(2.0);
        model.setValor2(3.0);
        model.setOperador("+");
        model.calculo();
        assertEquals(5.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testaSubtracaoNegativo(){
        model.setValor1(2.0);
        model.setValor2(3.0);
        model.setOperador("-");
        model.calculo();
        assertEquals(-1.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testaSubtracaoPositivo(){
        model.setValor1(3.0);
        model.setValor2(2.0);
        model.setOperador("-");
        model.calculo();
        assertEquals(1.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testaSubtracaoZero(){
        model.setValor1(3.0);
        model.setValor2(3.0);
        model.setOperador("-");
        model.calculo();
        assertEquals(0.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testaMultiplicacaoPositivo(){
        model.setValor1(3.0);
        model.setValor2(2.0);
        model.setOperador("*");
        model.calculo();
        assertEquals(6.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testaMultiplicacaoNegativo(){
        model.setValor1(3.0);
        model.setValor2(-2.0);
        model.setOperador("*");
        model.calculo();
        assertEquals(-6.0, model.getResultado(), 0.0001);
    }

    @Test
    public void testaMultiplicacaoPequeno(){
        model.setValor1(0.01);
        model.setValor2(0.005);
        model.setOperador("*");
        model.calculo();
        assertEquals(0.00005, model.getResultado(), 0.0001);
    }

    @Test
    public void testaDivisaoPositivo(){
        model.setValor1(3.0);
        model.setValor2(2.0);
        model.setOperador("/");
        model.calculo();
        assertEquals(1.5, model.getResultado(), 0.0001);
    }

    @Test
    public void testaDivisaoNegativo(){
        model.setValor1(-3.0);
        model.setValor2(2.0);
        model.setOperador("/");
        model.calculo();
        assertEquals(-1.5, model.getResultado(), 0.0001);
    }

    @Test
    public void testaDivisaoPorZero(){
        model.setValor1(3.0);
        model.setValor2(0.0);
        model.setOperador("/");
        model.calculo();
        assertEquals(Double.NaN, model.getResultado(), 0.0001);
    }

    @Test
    public void testaOperadorInexistente(){
        model.setValor1(3.0);
        model.setValor2(2.0);
        model.setOperador(";");
        model.calculo();
        assertEquals(Double.NaN, model.getResultado(), 0.0001);
    }



}
