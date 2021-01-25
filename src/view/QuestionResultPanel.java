package view;

import config.QuizConst;
import model.QuizModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static config.QuizConst.GOTHIC;

public class QuestionResultPanel extends JPanel {
    private final JLabel label;
    private final JButton next;

    QuestionResultPanel(LayoutManager layout, QuizModel.Quiz quiz, boolean flg) {
        setLayout(layout);
        next = new JButton("次の問題へ");
        next.setActionCommand(QuizConst.SHOW_QUIZ);
        if (flg) {
            label = new JLabel("正解!!");
            settingPanel();
            this.add(label, BorderLayout.CENTER);
            this.add(next, BorderLayout.SOUTH);
        } else {
            label = new JLabel("不正解…");
            JLabel comment = new JLabel(quiz.getComment());
            comment.setHorizontalAlignment(JLabel.CENTER);
            settingPanel();

            JPanel p = new JPanel(new GridLayout(5, 1));
            p.add(label);
            p.add(comment);

            this.add(p, BorderLayout.CENTER);
            this.add(next, BorderLayout.SOUTH);
        }
    }

    private void settingPanel() {
        label.setFont(new Font(GOTHIC, Font.BOLD, 18));
        label.setHorizontalAlignment(JLabel.CENTER);
        next.setPreferredSize(new Dimension(300, 60));
        next.setHorizontalAlignment(JButton.CENTER);
        next.setFont(new Font(GOTHIC, Font.BOLD, 15));
    }

    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }
}
