package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q1Result extends JPanel{
	JLabel label;
    JButton next;

    Q1Result(LayoutManager layout){
    	setLayout(layout);
    	label = new JLabel("正解!!");
    	next = new JButton("次の問題へ");
    	next.setActionCommand("next");

    	label.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
    	label.setHorizontalAlignment(JLabel.CENTER);
    	next.setPreferredSize(new Dimension(300, 60));
		next.setHorizontalAlignment(JButton.CENTER);
		next.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));

    	this.add(label, BorderLayout.CENTER);
        this.add(next, BorderLayout.SOUTH);
    }
    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }
    public void setLabel(QuizModel model) {
        label.setText("正解!");
    }

}
