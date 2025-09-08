package de.arnav;

import com.sun.tools.javac.Main;

import javax.swing.*;

public class MyWindow {
    private JPanel contentPane;
    private JPanel bookTitle;
    private MainProgram mainProgram;

    public MyWindow(MainProgram mainProgram) {
        this.mainProgram = mainProgram;
    }

    public JPanel getContentPane() {
        return contentPane;
    }
}
