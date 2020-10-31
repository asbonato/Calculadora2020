package br.usjt.ads20.calculadoramvvm.viewmodel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMainViewModel {
    private MainViewModel viewModel;

    @Before
    public void setup(){
        viewModel = new MainViewModel();
    }

    @Test
    public void testSoma(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("2.0");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("3.0", viewModel.resultado.get());
    }

    @Test
    public void testSomaDecimal(){
        viewModel.valor1.set("3.35");
        viewModel.valor2.set("12.15");
        viewModel.operador.set("+");
        viewModel.calcular();
        assertEquals("15.5", viewModel.resultado.get());
    }

    @Test
    public void testSubtracaoPositiva(){
        viewModel.valor1.set("2.0");
        viewModel.valor2.set("1.0");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("1.0", viewModel.resultado.get());
    }

    @Test
    public void testSubtracaoZero(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("1.0");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("0.0", viewModel.resultado.get());
    }

    @Test
    public void testSubtracaoNegativa(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("2.0");
        viewModel.operador.set("-");
        viewModel.calcular();
        assertEquals("-1.0", viewModel.resultado.get());
    }

    @Test
    public void testMultiplicacaoPositiva(){
        viewModel.valor1.set("2.0");
        viewModel.valor2.set("1.0");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("2.0", viewModel.resultado.get());
    }

    @Test
    public void testMultiplicacaoZero(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("0.0");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("0.0", viewModel.resultado.get());
    }

    @Test
    public void testMultiplicacaoNegativa(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("-2.0");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("-2.0", viewModel.resultado.get());
    }

    @Test
    public void testMultiplicacaDecimal(){
        viewModel.valor1.set("1.5");
        viewModel.valor2.set("2.0");
        viewModel.operador.set("*");
        viewModel.calcular();
        assertEquals("3.0", viewModel.resultado.get());
    }

    @Test
    public void testDivisaoPositiva(){
        viewModel.valor1.set("4.0");
        viewModel.valor2.set("2.0");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("2.0", viewModel.resultado.get());
    }

    @Test
    public void testDivisaooZero(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("0.0");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals(Double.NaN+"", viewModel.resultado.get());
    }

    @Test
    public void testDivisaoNegativa(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("-2.0");
        viewModel.operador.set("/");
        viewModel.calcular();
        assertEquals("-0.5", viewModel.resultado.get());
    }

    @Test
    public void testDivisaoDecimal(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("3.0");
        viewModel.operador.set("/");
        viewModel.calcular();
        double resultado = Double.parseDouble(viewModel.resultado.get());
        assertEquals(0.333, resultado, 0.001 );
    }

    @Test
    public void testOperadorInexistente(){
        viewModel.valor1.set("1.0");
        viewModel.valor2.set("0.0");
        viewModel.operador.set(";");
        viewModel.calcular();
        assertEquals(Double.NaN+"", viewModel.resultado.get());
    }

    @Test
    public void testMultiplicacaoPequeno(){
        viewModel.valor1.set("2.0");
        viewModel.valor2.set("0.000005");
        viewModel.operador.set("*");
        viewModel.calcular();
        double resultado = Double.parseDouble(viewModel.resultado.get());
        assertEquals(0.00001, resultado, 0.000001 );
    }
}
