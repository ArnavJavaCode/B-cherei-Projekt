package de.arnav;

import de.arnav.model.Buch;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;
import java.util.Optional;

public class MyWindow {
    private JPanel contentPane;
    private JScrollPane scrollPane;
    private JScrollPane bookContent;

    public MyWindow(MainProgram mainProgram) {
        Buch[] buecher = mainProgram.buecher;
        JList<String> list = new JList<>(Arrays.stream(buecher).map(Buch::getTitel).toArray(String[]::new));
        list.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int index = list.locationToIndex(e.getPoint());
                if (index >= 0) {
                    String item = list.getModel().getElementAt(index);
                    Optional<Buch> optional = mainProgram.getBookByTitle(item);
                    optional.ifPresent(book -> {
                        System.out.println("Clicked on: " + book.getTitel());
                        JTextArea textArea = new JTextArea();
                        StringBuilder builder = new StringBuilder(String.format("Autor: %s\n\n", book.getAutor()));
                        for (int i = 0; i < book.getContent().length; i++) {
                            builder.append(String.format("Seite %d:\n", i));
                            builder.append(String.format("%s\n\n", book.getContent()[i]));
                        }
                        textArea.setText(builder.toString());
                        textArea.setLineWrap(true);
                        textArea.setWrapStyleWord(true);
                        textArea.setEditable(false);
                        bookContent.setViewportView(textArea);
                    });
                }
            }
        });
        this.scrollPane.setViewportView(list);
    }

    public JPanel getContentPane() {
        return this.contentPane;
    }
}
