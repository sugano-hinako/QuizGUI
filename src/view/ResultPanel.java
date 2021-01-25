package view;

import config.QuizConst;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import static config.QuizConst.GOTHIC;


public class ResultPanel extends JPanel {
    private JLabel scoreLabel;
    private JButton endBUtton;
    private JButton againButton;

    ResultPanel(LayoutManager layout) {
        setLayout(layout);
        scoreLabel = createCorrectAnswerLabel(new JLabel("正答数"));
        endBUtton = createEndButton(new JButton("終了する"));
        againButton = createRestartButton(new JButton("もう一度挑戦する"));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200, 420));
        panel.add(scoreLabel);

        this.add(panel, BorderLayout.NORTH);
        this.add(endBUtton, BorderLayout.CENTER);
        this.add(againButton, BorderLayout.SOUTH);

    }

    private JButton createRestartButton(JButton button) {
        JButton b = button;
        b.setActionCommand(QuizConst.SHOW_TOTAL_RESULT);
        b.setPreferredSize(new Dimension(300, 60));
        b.setHorizontalAlignment(JButton.CENTER);
        b.setFont(new Font(GOTHIC, Font.BOLD, 15));
        return b;
    }

    private JButton createEndButton(JButton button) {
        JButton b = button;
        b.setActionCommand(QuizConst.END);
        b.setPreferredSize(new Dimension(300, 60));
        b.setHorizontalAlignment(JButton.CENTER);
        b.setFont(new Font(GOTHIC, Font.BOLD, 15));
        return b;
    }

    private JLabel createCorrectAnswerLabel(JLabel label) {
        JLabel l = label;
        l.setFont(new Font(GOTHIC, Font.BOLD, 18));
        l.setHorizontalAlignment(SwingConstants.CENTER);
        l.setVerticalAlignment(JLabel.CENTER);
        l.setPreferredSize(new Dimension(200, 420));
        return l;
    }

    public void setActionListener(ActionListener l) {
        endBUtton.addActionListener(l);
        againButton.addActionListener(l);
    }

    public void setLabel(int total) {
        scoreLabel.setText("正答数: " + total);
    }

}
