package GUI.TICTACTOE;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;

public class Board {
    JPanel[] cell = new JPanel[9];
    int x;
    int y;
    int width;
    int height;

    public Board(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        for (int i = 0; i < 9; i++) {
            cell[i] = new JPanel();
            cell[i].setBounds((i % 3) * ((width - x) / 3), 40 + (((i / 3)) * ((height - y) / 3)), (width - x) / 3,
                    (height - y) / 3);
            if (i % 2 == 1) {
                cell[i].setBackground(new Color(200, 250, 250));
                JTextArea textArea = new JTextArea("");
                textArea.setFont(new Font("mALIHA", Font.ITALIC, 60));
                textArea.setBackground(new Color(200, 250, 250));
                cell[i].add(textArea);
            } else {
                cell[i].setBackground(new Color(137, 207, 240, 160));
                JTextArea textArea = new JTextArea("");
                textArea.setFont(new Font("mALIHA", Font.ITALIC, 60));
                textArea.setBackground(new Color(137, 207, 240, 0));
                cell[i].add(textArea);
            }
            // cell[i].setBackground(new Color);

        }
    }
}