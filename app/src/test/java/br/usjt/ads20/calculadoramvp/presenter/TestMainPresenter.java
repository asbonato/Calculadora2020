package br.usjt.ads20.calculadoramvp.presenter;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import br.usjt.ads20.calculadoramvp.view.MainView;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TestMainPresenter {
    private MainPresenter presenter;

    @Mock
    private MainView view;

    @Before
    public void setup(){
        presenter = new MainPresenter(view);
    }

    @Test
    public void testCalculoSoma(){
        presenter.calculo("1.0", "2.0", "+");
        when(view.getResultado()).thenReturn("3.0");
        assertEquals(view.getResultado(), presenter.getResultado());
    }

    @Test
    public void testCalculoSubtracao(){
        presenter.calculo("2.0", "1.0", "-");
        when(view.getResultado()).thenReturn("1.0");
        assertEquals(view.getResultado(), presenter.getResultado());
    }

    @Test
    public void testCalculoMultiplicacao(){
        presenter.calculo("2.5", "4.0", "*");
        when(view.getResultado()).thenReturn("10.0");
        assertEquals(view.getResultado(), presenter.getResultado());
    }

    @Test
    public void testCalculoDivisao(){
        presenter.calculo("5.0", "2.0", "/");
        when(view.getResultado()).thenReturn("2.5");
        assertEquals(view.getResultado(), presenter.getResultado());
    }
}
