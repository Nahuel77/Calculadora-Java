package Ventana;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Calculadora.Calculadora;

public class Ventana extends JFrame {
    private JPanel MainV;
    private JButton num8;
    private JButton num9;
    private JButton num4;
    private JButton num5;
    private JButton num6;
    private JButton num1;
    private JButton num2;
    private JButton num3;
    private JButton CE;
    private JButton num0;
    private JButton EQbtn;
    private JButton DIVbtn;
    private JButton MULbtn;
    private JButton RESbtn;
    private JButton SUMbtn;
    private JButton num7;
    private JLabel Visor;
    private JLabel VisorOperacion;
    private String a = "";
    private String b = "";
    private int op = 0;
    private String VisorBuffer = "";

    public Ventana() {
        setContentPane(MainV);
        setTitle("Calculadora");
        setSize(250, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Calculadora calculadora = new Calculadora();

        num0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 0;
                }else{
                    b += 0;
                }
                VisorBuffer += 0;
                Visor.setText(VisorBuffer);
            }
        });
        num1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 1;
                }else{
                    b += 1;
                }
                VisorBuffer += 1;
                Visor.setText(VisorBuffer);
            }
        });
        num2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 2;
                }else{
                    b += 2;
                }
                VisorBuffer += 2;
                Visor.setText(VisorBuffer);
            }
        });
        num3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 3;
                }else{
                    b += 3;
                }
                VisorBuffer += 3;
                Visor.setText(VisorBuffer);
            }
        });
        num4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 4;
                }else{
                    b += 4;
                }
                VisorBuffer += 4;
                Visor.setText(VisorBuffer);
            }
        });
        num5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 5;
                }else{
                    b += 5;
                }
                VisorBuffer += 5;
                Visor.setText(VisorBuffer);
            }
        });
        num6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 6;
                }else{
                    b += 6;
                }
                VisorBuffer += 6;
                Visor.setText(VisorBuffer);
            }
        });
        num7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 7;
                }else{
                    b += 7;
                }
                VisorBuffer += 7;
                Visor.setText(VisorBuffer);
            }
        });
        num8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 8;
                }else{
                    b += 8;
                }
                VisorBuffer += 8;
                Visor.setText(VisorBuffer);
            }
        });
        num9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(op==0) {
                    a += 9;
                }else{
                    b += 9;
                }
                VisorBuffer += 9;
                Visor.setText(VisorBuffer);
            }
        });
        SUMbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op = 1;
                VisorBuffer += '+';
                Visor.setText(VisorBuffer);
            }
        });
        RESbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op = 2;
                VisorBuffer += '-';
                Visor.setText(VisorBuffer);
            }
        });
        MULbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op = 3;
                VisorBuffer += '*';
                Visor.setText(VisorBuffer);
            }
        });
        DIVbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op = 4;
                VisorBuffer += '/';
                Visor.setText(VisorBuffer);
            }
        });
        EQbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.setA(Integer.parseInt(a));
                calculadora.setB(Integer.parseInt(b));
                switch (op){
                    case 1:
                        Visor.setText(Integer.toString(calculadora.suma()));
                        VisorOperacion.setText(VisorBuffer);
                    break;
                    case 2:
                        Visor.setText(Integer.toString(calculadora.resta()));
                        VisorOperacion.setText(VisorBuffer);
                        break;
                    case 3:
                        Visor.setText(Integer.toString(calculadora.multiplicar()));
                        VisorOperacion.setText(VisorBuffer);
                        break;
                    case 4:
                        Visor.setText(Float.toString(calculadora.dividir()));
                        VisorOperacion.setText(VisorBuffer);
                        break;
                }
                op=0;
                a="";
                b="";
                VisorBuffer="";
            }
        });
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                op=0;
                a="";
                b="";
                VisorBuffer="";
                Visor.setText(VisorBuffer);
                VisorOperacion.setText(VisorBuffer);
            }
        });
    }
}
