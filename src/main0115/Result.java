package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class Result extends JPanel{
	JLabel score;
	JButton end;
	JButton again;

	JLabel label;
	JButton back;

	Result (LayoutManager layout){

		setLayout(layout);
		score = new JLabel("正答数");
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setPreferredSize(new Dimension(200, 300));
		end = new JButton("終了する");
		again = new JButton("もう一度挑戦する");
		end.setActionCommand("end");
		again.setActionCommand("again");

		this.add(score, BorderLayout.NORTH);
		this.add(end, BorderLayout.CENTER);
		this.add(again, BorderLayout.SOUTH);

	}
	public void setActionListener(ActionListener l) {
        end.addActionListener(l);
        again.addActionListener(l);
    }
	public void setLabel(QuizModel model) {
        score.setText("正答数: " + model.showCorrectAnswer());
    }

}
