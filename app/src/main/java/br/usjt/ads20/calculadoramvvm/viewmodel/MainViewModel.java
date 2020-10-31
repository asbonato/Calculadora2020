package br.usjt.ads20.calculadoramvvm.viewmodel;

import androidx.databinding.ObservableField;
import br.usjt.ads20.calculadoramvvm.model.Calculadora;

public class MainViewModel implements ViewModel {
    private Calculadora model;
    public final ObservableField<String> valor1 = new ObservableField<>();
    public final ObservableField<String> valor2 = new ObservableField<>();
    public final ObservableField<String> operador = new ObservableField<>();
    public final ObservableField<String> resultado = new ObservableField<>();

    public MainViewModel(){
        model = new Calculadora();
    }

    @Override
    public void onCreate() {
        model = new Calculadora();
    }

    @Override
    public void onStart() {

    }

    @Override
    public void onResume() {

    }

    @Override
    public void onPause() {

    }

    @Override
    public void onRestart() {

    }

    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }


    public void calcular() {
        double pValor1 = Double.parseDouble(this.valor1.get());
        double pValor2 = Double.parseDouble(this.valor2.get());
        String op = this.operador.get();
        model.setValor1(pValor1);
        model.setValor2(pValor2);
        model.setOperador(op);
        model.calculo();
        double pResultado = model.getResultado();
        this.resultado.set(pResultado+"");
    }
}

