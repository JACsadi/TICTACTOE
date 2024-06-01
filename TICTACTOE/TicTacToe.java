package GUI.TICTACTOE;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import javax.swing.text.StyledEditorKit.BoldAction;

import GUI.TICTACTOE.Board;

public class TicTacToe {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame();
        myFrame.setSize(420, 490);
        myFrame.setVisible(true);
        myFrame.setResizable(false);
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setLayout(null);

        JPanel head = new JPanel();
        head.setBounds(0, 0, 420, 40);
        head.setBackground(new Color(100, 100, 100));

        Board b = new Board(0, 40, 420, 460);
        JTextArea textArea = new JTextArea("Your text here");
        textArea.setFont(new Font("mALIHA", Font.ITALIC, 20));
        textArea.setBackground(new Color(100, 100, 100));
        // textArea.setEditable(false);
        // textArea.setBounds(50, 5, 320, 30); // Adjust the bounds as needed
        head.add(textArea);
        myFrame.add(head);
        for (int i = 0; i < 9; i++) {
            System.out.println(b.cell[i].getBounds());
            myFrame.add(b.cell[i]);
        }
        myFrame.revalidate();
        myFrame.repaint();

    }
}
