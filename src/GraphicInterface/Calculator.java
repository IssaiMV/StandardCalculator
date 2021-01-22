/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GraphicInterface;

import java.awt.*;
import java.io.*;
import javax.swing.*;

/**
 *
 * @author Frida Fernanda Arcos Guitierrez
 */
public class Calculator {

    private Component com;

    public Calculator() {
        com = new Component();
        generateFrame("Calculadora", 550, 330);
    }

    private void generateFrame(String title, int height, int width) {

        Dimension d = Toolkit.getDefaultToolkit().getScreenSize().getSize();
        com.generalFrame = new JFrame(title);
        com.generalFrame.setBounds((d.width / 2 - width / 2), (d.height / 2 - width / 2), width, height);
        com.generalFrame.setLayout(null);
        com.generalFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        com.generalFrame.setLocationRelativeTo(null);
        com.generalFrame.getContentPane().setBackground(Color.white);
        try {
            GraphicsEnvironment ge
                    = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("Roboto-Bold.ttf")));
        } catch (IOException | FontFormatException e) {
            e.printStackTrace();
        }
        addComponents();
        com.generalFrame.setVisible(true);

    }

    private void addComponents() {
        com.resultPanel = new JPanel();
        com.resultPanel.setBounds(0, 0, 332, 145);
        com.resultPanel.setBackground(new Color(222, 222, 222));
        com.resultPanel.setLayout(null);

        //Text
        com.resultLabel = new JLabel("Hola mundo", SwingConstants.RIGHT);
        com.resultLabel.setBounds(20, 40, 280, 60);
        com.resultLabel.setOpaque(true);
        com.resultLabel.setBackground(Color.red);
        com.resultPanel.add(com.resultLabel);

        com.generalFrame.add(com.resultPanel);

        com.operationPanel = new JPanel();
        com.operationPanel.setBounds(0, 145, 332, 405);
        com.generalFrame.add(com.operationPanel);
    }
}
