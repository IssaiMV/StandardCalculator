/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterface;

import Events.EventOnClickSendOperation;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.InputStream;
import javax.swing.*;

/**
 *
 * @author Frida Fernanda Arcos Guitierrez
 */
public class Calculator {

    private Component com;
    private Font font = null;
    public String roboto = "Roboto-Bold.ttf";

    public Calculator() {
        com = new Component();
        generateFrame("Calculadora", 592, 344);
    }

    private void generateFrame(String title, int height, int width) {

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize().getSize();
        com.generalFrame = new JFrame(title);
        com.generalFrame.setBounds((d.width / 2 - width / 2), (d.height / 2 - width / 2), width, height);
        com.generalFrame.setLayout(null);
        com.generalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        com.generalFrame.setLocationRelativeTo(null);
        com.generalFrame.setResizable(false);
        com.generalFrame.getContentPane().setBackground(Color.white);
        addComponents();
        com.generalFrame.setVisible(true);

    }

    private void addComponents() {
        com.resultPanel = new JPanel();
        com.resultPanel.setBounds(0, 0, 332, 145);
        com.resultPanel.setBackground(new Color(222, 222, 222));
        com.resultPanel.setLayout(null);

        //Text
        com.resultLabel = new JLabel("0", SwingConstants.RIGHT);
        com.resultLabel.setBounds(20, 40, 280, 60);
        com.resultLabel.setOpaque(true);
        com.resultLabel.setBackground(new Color(222, 222, 222));
        com.resultLabel.setFont(fuente(roboto, Font.BOLD, 28));
        com.resultPanel.add(com.resultLabel);
        com.generalFrame.add(com.resultPanel);

        com.operationPanel = new JPanel();
        com.operationPanel.setBounds(0, 145, 336, 408);
        com.operationPanel.setLayout(null);
        com.operationPanel.setBackground(new Color(69, 69, 69));

        //Buttons
        int x = 0;
        int y = 0;

        //First row
        com.number7Button = new JButton("7");
        com.number7Button.setBounds(x, y, 82, 102);
        com.number7Button.setBackground(new Color(69, 69, 69));
        com.number7Button.setForeground(Color.WHITE);
        com.number7Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number7Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "7"));
        com.operationPanel.add(com.number7Button);

        com.number8Button = new JButton("8");
        com.number8Button.setBounds(x + 82 * 1, y, 82, 102);
        com.number8Button.setBackground(new Color(69, 69, 69));
        com.number8Button.setForeground(Color.WHITE);
        com.number8Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number8Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "8"));
        com.operationPanel.add(com.number8Button);

        com.number9Button = new JButton("9");
        com.number9Button.setBounds(x + 82 * 2, y, 82, 102);
        com.number9Button.setBackground(new Color(69, 69, 69));
        com.number9Button.setForeground(Color.WHITE);
        com.number9Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number9Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "9"));
        com.operationPanel.add(com.number9Button);

        com.divisionButton = new JButton("/");
        com.divisionButton.setBounds(x + 82 * 3, y, 82, 102);
        com.divisionButton.setBackground(new Color(8, 190, 190));
        com.divisionButton.setForeground(Color.WHITE);
        com.divisionButton.setFont(fuente(roboto, Font.BOLD, 28));
        com.divisionButton.addActionListener((ActionListener) new EventOnClickSendOperation(com, "/"));
        com.operationPanel.add(com.divisionButton);

        //Second row
        com.number4Button = new JButton("4");
        com.number4Button.setBounds(x, y + 102 * 1, 82, 102);
        com.number4Button.setBackground(new Color(69, 69, 69));
        com.number4Button.setForeground(Color.WHITE);
        com.number4Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number4Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "4"));
        com.operationPanel.add(com.number4Button);

        com.number5Button = new JButton("5");
        com.number5Button.setBounds(x + 82 * 1, y + 102 * 1, 82, 102);
        com.number5Button.setBackground(new Color(69, 69, 69));
        com.number5Button.setForeground(Color.WHITE);
        com.number5Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number5Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "5"));
        com.operationPanel.add(com.number5Button);

        com.number6Button = new JButton("6");
        com.number6Button.setBounds(x + 82 * 2, y + 102 * 1, 82, 102);
        com.number6Button.setBackground(new Color(69, 69, 69));
        com.number6Button.setForeground(Color.WHITE);
        com.number6Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number6Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "6"));
        com.operationPanel.add(com.number6Button);

        com.multiplicationButton = new JButton("x");
        com.multiplicationButton.setBounds(x + 82 * 3, y + 102 * 1, 82, 102);
        com.multiplicationButton.setBackground(new Color(8, 190, 190));
        com.multiplicationButton.setForeground(Color.WHITE);
        com.multiplicationButton.setFont(fuente(roboto, Font.BOLD, 28));
        com.multiplicationButton.addActionListener((ActionListener) new EventOnClickSendOperation(com, "*"));
        com.operationPanel.add(com.multiplicationButton);

        //Third row
        com.number1Button = new JButton("1");
        com.number1Button.setBounds(x, y + 102 * 2, 82, 102);
        com.number1Button.setBackground(new Color(69, 69, 69));
        com.number1Button.setForeground(Color.WHITE);
        com.number1Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number1Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "1"));
        com.operationPanel.add(com.number1Button);

        com.number2Button = new JButton("2");
        com.number2Button.setBounds(x + 82 * 1, y + 102 * 2, 82, 102);
        com.number2Button.setBackground(new Color(69, 69, 69));
        com.number2Button.setForeground(Color.WHITE);
        com.number2Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number2Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "2"));
        com.operationPanel.add(com.number2Button);

        com.number3Button = new JButton("3");
        com.number3Button.setBounds(x + 82 * 2, y + 102 * 2, 82, 102);
        com.number3Button.setBackground(new Color(69, 69, 69));
        com.number3Button.setForeground(Color.WHITE);
        com.number3Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number3Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "3"));
        com.operationPanel.add(com.number3Button);

        com.subtractionButton = new JButton("-");
        com.subtractionButton.setBounds(x + 82 * 3, y + 102 * 2, 82, 102);
        com.subtractionButton.setBackground(new Color(8, 190, 190));
        com.subtractionButton.setForeground(Color.WHITE);
        com.subtractionButton.setFont(fuente(roboto, Font.BOLD, 28));
        com.subtractionButton.addActionListener((ActionListener) new EventOnClickSendOperation(com, "-"));
        com.operationPanel.add(com.subtractionButton);

        //Fourth row
        com.clearButton = new JButton("C");
        com.clearButton.setBounds(x, y + 102 * 3, 82, 102);
        com.clearButton.setBackground(new Color(69, 69, 69));
        com.clearButton.setForeground(Color.WHITE);
        com.clearButton.setFont(fuente(roboto, Font.BOLD, 28));
        com.clearButton.addActionListener((ActionListener) new EventOnClickSendOperation(com, "C"));
        com.operationPanel.add(com.clearButton);

        com.number0Button = new JButton("0");
        com.number0Button.setBounds(x + 82 * 1, y + 102 * 3, 82, 102);
        com.number0Button.setBackground(new Color(69, 69, 69));
        com.number0Button.setForeground(Color.WHITE);
        com.number0Button.setFont(fuente(roboto, Font.BOLD, 28));
        com.number0Button.addActionListener((ActionListener) new EventOnClickSendOperation(com, "0"));
        com.operationPanel.add(com.number0Button);

        com.resultButton = new JButton("=");
        com.resultButton.setBounds(x + 82 * 2, y + 102 * 3, 82, 102);
        com.resultButton.setBackground(new Color(69, 69, 69));
        com.resultButton.setForeground(Color.WHITE);
        com.resultButton.setFont(fuente(roboto, Font.BOLD, 28));
        com.resultButton.addActionListener((ActionListener) new EventOnClickSendOperation(com, "="));
        com.operationPanel.add(com.resultButton);

        com.sumButton = new JButton("+");
        com.sumButton.setBounds(x + 82 * 3, y + 102 * 3, 82, 102);
        com.sumButton.setBackground(new Color(8, 190, 190));
        com.sumButton.setForeground(Color.WHITE);
        com.sumButton.setFont(fuente(roboto, Font.BOLD, 28));
        com.sumButton.addActionListener((ActionListener) new EventOnClickSendOperation(com, "+"));
        com.operationPanel.add(com.sumButton);

        com.generalFrame.add(com.operationPanel);
    }

    public Font fuente(String fontName, int estilo, float tamanio) {
        try {
            //Se carga la fuente
            InputStream is = getClass().getResourceAsStream("../Assets/" + fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
        } catch (Exception ex) {
            //Si existe un error se carga fuente por defecto ARIAL
            System.err.println(fontName + " No se cargo la fuente");
            font = new Font("Arial", Font.PLAIN, 14);
        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;
    }
}
