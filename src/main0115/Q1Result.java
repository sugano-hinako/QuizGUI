package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q1Result extends JPanel{
	private QuizView quizView;
	JLabel label;
    JButton next;
    boolean answer = true;

    Q1Result(LayoutManager layout){
    	setLayout(layout);
    	quizView.setJudge();
    	if(answer == true) {
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
    	}else {
    		JLabel label = new JLabel("不正解…");
        	JPanel panel = new JPanel();
        	JPanel panel2 = new JPanel();
        	JPanel panel3 = new JPanel();
        	JLabel comment = new JLabel("<html><body>" +
        	"正解はintです。<br>Stringは文字列を格納する型、<br>doubleは少数を格納する型、<br>charは1つの文字を格納する型です。"
        			+ "</body></html>");
        	next = new JButton("次の問題へ");
        	next.setActionCommand("next2");

        	label.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
        	label.setHorizontalAlignment(JLabel.CENTER);
        	comment.setHorizontalAlignment(JLabel.CENTER);
        	next.setPreferredSize(new Dimension(300, 60));
    		next.setHorizontalAlignment(JButton.CENTER);
    		next.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));

        	JPanel p = new JPanel(new GridLayout(5,1));
        	p.add(panel);
        	p.add(label);
        	p.add(comment);
        	p.add(panel2);
        	p.add(panel3);

        	this.add(p, BorderLayout.CENTER);
            this.add(next, BorderLayout.SOUTH);
    	}
    }
    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }
    public void setLabel(QuizModel model) {
        label.setText("正解!");
    }

}
