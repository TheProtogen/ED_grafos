package view;

import control.Main4Control;

import java.io.IOException;

public class Main4 {
    public static void main(String[] args) throws IOException {
        Main4Control control = new Main4Control();

        control.exibirMatriz(control.preencherTrianguloSuperior());
    }
}
