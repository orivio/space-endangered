/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.obedotto.spaceendangered.core;

/**
 *
 * @author obedh
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

// ChatGPT generated placeholder
public class Main {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Space Endangered");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.add(new JLabel("Hello Swing!"));
            frame.setVisible(true);
        });
    }
}