package br.usjt.ads20.calculadoramvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import br.usjt.ads20.calculadoramvvm.R;

import android.os.Bundle;
import br.usjt.ads20.calculadoramvvm.databinding.ActivityMainBinding;
import br.usjt.ads20.calculadoramvvm.viewmodel.MainViewModel;

public class MainActivity extends AppCompatActivity {
    MainViewModel viewModel = new MainViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,
                R.layout.activity_main);
        binding.setViewModel(viewModel);
        viewModel.onCreate();
    }

    @Override
    protected void onStart() {
        super.onStart();
        viewModel.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        viewModel.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        viewModel.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
        viewModel.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewModel.onResume();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        viewModel.onRestart();
    }
}