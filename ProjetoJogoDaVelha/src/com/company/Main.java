package com.company;

import javax.swing.JFrame;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        JFrame tela = new JFrame("Velha");
        tela.setContentPane((new Velha()).getPanelJogoVelha());
        tela.setDefaultCloseOperation(3);
        tela.pack();
        tela.setVisible(true);
    }
}
