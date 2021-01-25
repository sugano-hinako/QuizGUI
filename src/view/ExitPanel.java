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

import static config.QuizConst.GOTHIC;

public class ExitPanel extends JPanel {
    private final JButton button;

    ExitPanel(LayoutManager layout) {
        setLayout(layout);
        JLabel label = messageLabelConf(new JLabel("お疲れ様でした。"));
        button = closeButtonConf(new JButton("閉じる"));
        this.add(label, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
    }

    private JLabel messageLabelConf(JLabel label) {
        JLabel l = label;
        l.setFont(new Font(GOTHIC, Font.BOLD, 18));
        l.setHorizontalAlignment(JLabel.CENTER);
        return l;
    }

    private JButton closeButtonConf(JButton button) {
        JButton b = button;
        b.setActionCommand(QuizConst.EXIT);
        b.setPreferredSize(new Dimension(300, 60));
        b.setHorizontalAlignment(JButton.CENTER);
        b.setFont(new Font(GOTHIC, Font.BOLD, 15));
        return b;
    }

    public void setActionListener(ActionListener l) {
        button.addActionListener(l);
    }

}
