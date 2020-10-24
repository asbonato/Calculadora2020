package br.usjt.ads20.calculadoramvp.view;

import androidx.appcompat.app.AppCompatActivity;
import br.usjt.ads20.calculadoramvp.R;
import br.usjt.ads20.calculadoramvp.model.Calculadora;
import br.usjt.ads20.calculadoramvp.presenter.MainPresenter;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements MainView {
    private EditText valor1, valor2, operador, resultado;
    MainPresenter presenter = new MainPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valor1 = findViewById(R.id.valor1);
        valor2 = findViewById(R.id.valor2);
        operador = findViewById(R.id.operador);
        resultado = findViewById(R.id.resultado);
        presenter.onCreate();
    }

    @Override
    protected void onStart(){
        super.onStart();
        presenter.onStart();
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        presenter.onRestart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        presenter.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.onResume();
    }

    public void calcular(View view) {
        String pValor1 = valor1.getText().toString();
        String pValor2 = valor2.getText().toString();
        String op = operador.getText().toString();
        presenter.calculo(pValor1, pValor2, op);
    }

    @Override
    public void configurarView(String v1, String v2, String op, String res) {
        valor1.setText(v1);
        valor2.setText(v2);
        operador.setText(op);
        resultado.setText(res);
    }

    @Override
    public String getResultado() {
        return resultado.getText().toString();
    }
}