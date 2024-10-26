package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculadoraView extends JFrame {

    public static JButton buttonDelete = new JButton("Delete");
    public static JButton buttonPercentage = new JButton("%");
    public static JButton buttonCE = new JButton("CE");
    public static JButton buttonMultiplication = new JButton("*");
    public static JButton buttonDivision = new JButton("/");
    public static JButton buttonSubtract = new JButton("-");
    public static JButton buttonAddition = new JButton("+");
    public static JButton buttonResult = new JButton("=");
    public static JButton buttonComma = new JButton(",");
    public static JButton number0 = new JButton("0");
    public static JButton number1 = new JButton("1");
    public static JButton number2 = new JButton("2");
    public static JButton number3 = new JButton("3");
    public static JButton number4 = new JButton("4");
    public static JButton number5 = new JButton("5");
    public static JButton number6 = new JButton("6");
    public static JButton number7 = new JButton("7");
    public static JButton number8 = new JButton("8");
    public static JButton number9 = new JButton("9");
    public static JLabel resultCalculation = new JLabel("", SwingConstants.RIGHT);

    public CalculadoraView() {
        super("Calculadora");
        setLayout(new GridLayout(7, 4, 5, 5));


        JPanel mainLine = new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel linha1 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel linha2 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel linha3 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel linha4 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel linha5 =  new JPanel(new GridLayout(1, 1, 10, 10));
        JPanel linha6 =  new JPanel(new GridLayout(1, 1, 10, 10));

        mainLine.add(resultCalculation);
        add(mainLine);

        linha1.add(buttonPercentage);
        linha1.add(buttonCE);
        linha1.add(buttonDelete);
        add(linha1);

        linha2.add(buttonDivision);
        add(linha2);

        linha3.add(number7);
        linha3.add(number8);
        linha3.add(number9);
        linha3.add(buttonMultiplication);
        add(linha3);

        linha4.add(number4);
        linha4.add(number5);
        linha4.add(number6);
        linha4.add(buttonSubtract);
        add(linha4);

        linha5.add(number1);
        linha5.add(number2);
        linha5.add(number3);
        linha5.add(buttonAddition);
        add(linha5);

        linha6.add(number0);
        linha6.add(buttonComma);
        linha6.add(buttonResult);
        add(linha6);

        setVisible(true);
        setSize(400, 500);
    }

    public static void main(String[] args) {

        CalculadoraView application = new CalculadoraView();
        application.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
} 