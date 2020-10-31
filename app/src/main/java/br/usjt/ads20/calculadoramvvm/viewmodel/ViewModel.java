package br.usjt.ads20.calculadoramvvm.viewmodel;

public interface ViewModel {
    void onCreate();
    void onStart();
    void onResume();
    void onPause();
    void onRestart();
    void onStop();
    void onDestroy();
}
