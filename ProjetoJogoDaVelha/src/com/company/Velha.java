package com.company;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Velha {
    private JPanel panelJogoVelha;
    private JButton Btn1;
    private JButton Btn2;
    private JButton Btn3;
    private JButton Btn4;
    private JButton Btn5;
    private JButton Btn6;
    private JButton Btn7;
    private JButton Btn8;
    private JButton Btn9;
    private JButton BtnNovoJogo;
    private JButton BtnSair;
    private int cont = 0;
    public String jogada;

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        this.cont = cont + 1;
    }


    public Velha() {

        this.Btn1.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn1.getText().equals("")) {
                    if((cont % 2) == 0) {
                        Velha.this.Btn1.setText("X");
                        jogada = "X";
                    }else{
                        Velha.this.Btn1.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn2.getText().equals("")) {
                    if ((cont % 2 ) == 0) {
                        Velha.this.Btn2.setText("X");
                        jogada = "X";
                    }else{
                        Velha.this.Btn2.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn3.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                   if (Btn3.getText().equals("")) {
                       if ((cont % 2) == 0) {
                           Velha.this.Btn3.setText("X");
                           jogada = "X";
                       }else{
                           Velha.this.Btn3.setText("O");
                           jogada = "O";
                       }
                       setCont(cont);
                       if (cont >= 5) {
                           Verifica(jogada);
                       }
                   }

            }
        });
        this.Btn4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn4.getText().equals("")) {
                    if ((cont % 2) == 0) {
                        Velha.this.Btn4.setText("X");
                        jogada = "X";
                    }else{
                        Velha.this.Btn4.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn5.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn5.getText().equals("")) {
                    if ((cont % 2) == 0) {
                        Velha.this.Btn5.setText("X");
                        jogada = "X";
                    } else {
                        Velha.this.Btn5.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn6.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn6.getText().equals("")) {
                    if ((cont % 2) == 0) {
                        Velha.this.Btn6.setText("X");
                        jogada = "X";
                    } else {
                        Velha.this.Btn6.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn7.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn7.getText().equals("")) {
                    if ((cont % 2) == 0) {
                        Velha.this.Btn7.setText("X");
                        jogada = "X";
                    } else {
                        Velha.this.Btn7.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn8.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn8.getText().equals("")) {
                    if ((cont % 2) == 0) {
                        Velha.this.Btn8.setText("X");
                        jogada = "X";
                    } else {
                        Velha.this.Btn8.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }
            }
        });
        this.Btn9.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (Btn9.getText().equals("")) {
                    if ((cont % 2) == 0) {
                        Velha.this.Btn9.setText("X");
                        jogada = "X";
                    } else {
                        Velha.this.Btn9.setText("O");
                        jogada = "O";
                    }
                    setCont(cont);
                    if (cont >= 5) {
                        Verifica(jogada);
                    }
                }

            }
        });

        this.BtnNovoJogo.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                cont = 0;
                Velha.this.Btn1.setText("");
                Velha.this.Btn2.setText("");
                Velha.this.Btn3.setText("");
                Velha.this.Btn4.setText("");
                Velha.this.Btn5.setText("");
                Velha.this.Btn6.setText("");
                Velha.this.Btn7.setText("");
                Velha.this.Btn8.setText("");
                Velha.this.Btn9.setText("");

                Velha.this.Btn1.setBackground(Color.white);
                Velha.this.Btn2.setBackground(Color.white);
                Velha.this.Btn3.setBackground(Color.white);
                Velha.this.Btn4.setBackground(Color.white);
                Velha.this.Btn5.setBackground(Color.white);
                Velha.this.Btn6.setBackground(Color.white);
                Velha.this.Btn7.setBackground(Color.white);
                Velha.this.Btn8.setBackground(Color.white);
                Velha.this.Btn9.setBackground(Color.white);

            }
        });
        this.BtnSair.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Fechando o programa", "Fechado",
                        JOptionPane.INFORMATION_MESSAGE);
                System.exit(0);
            }
        });

    }

    private void Verifica(String XO) {
        boolean venceu = false;
        if ((Btn1.getText().equals(XO)) && (Btn2.getText().equals(XO)) && (Btn3.getText()).equals(XO)) {
            Btn1.setBackground(Color.green);
            Btn2.setBackground(Color.green);
            Btn3.setBackground(Color.green);
            venceu = true;
        }else if ((Btn4.getText().equals(XO)) && (Btn5.getText().equals(XO)) && (Btn6.getText()).equals(XO)) {
            Btn4.setBackground(Color.green);
            Btn5.setBackground(Color.green);
            Btn6.setBackground(Color.green);
            venceu = true;
        }else if ((Btn7.getText().equals(XO)) && (Btn8.getText().equals(XO)) && (Btn9.getText()).equals(XO)) {
            Btn7.setBackground(Color.green);
            Btn8.setBackground(Color.green);
            Btn9.setBackground(Color.green);
            venceu = true;
        }else if ((Btn1.getText().equals(XO)) && (Btn4.getText().equals(XO)) && (Btn7.getText()).equals(XO)) {
            Btn1.setBackground(Color.green);
            Btn4.setBackground(Color.green);
            Btn7.setBackground(Color.green);
            venceu = true;
        }else if ((Btn2.getText().equals(XO)) && (Btn5.getText().equals(XO)) && (Btn8.getText()).equals(XO)) {
            Btn2.setBackground(Color.green);
            Btn5.setBackground(Color.green);
            Btn8.setBackground(Color.green);
            venceu = true;
        }else if ((Btn3.getText().equals(XO)) && (Btn6.getText().equals(XO)) && (Btn9.getText()).equals(XO)) {
            Btn3.setBackground(Color.green);
            Btn6.setBackground(Color.green);
            Btn9.setBackground(Color.green);
            venceu = true;
        }else if ((Btn1.getText().equals(XO)) && (Btn5.getText().equals(XO)) && (Btn9.getText()).equals(XO)) {
            Btn1.setBackground(Color.green);
            Btn5.setBackground(Color.green);
            Btn9.setBackground(Color.green);
            venceu = true;
        }else if ((Btn3.getText().equals(XO)) && (Btn5.getText().equals(XO)) && (Btn7.getText()).equals(XO)) {
            Btn3.setBackground(Color.green);
            Btn5.setBackground(Color.green);
            Btn7.setBackground(Color.green);
            venceu = true;
        }
        if (venceu){
            if(XO=="X") {
                JOptionPane.showMessageDialog(null, "Jogador 1 Venceu");
            }else{
                JOptionPane.showMessageDialog(null, "Jogador 2 Venceu");
            }
        }else if (cont == 9){
            JOptionPane.showMessageDialog(null, "Velha");
        }
    }

    public JPanel getPanelJogoVelha() {
        return this.panelJogoVelha;
    }


}
