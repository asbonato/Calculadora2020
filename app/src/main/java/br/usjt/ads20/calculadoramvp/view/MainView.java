package br.usjt.ads20.calculadoramvp.view;

public interface MainView {
    void configurarView(String v1, String v2, String op, String res);
    String getResultado();
}
