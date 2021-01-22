package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
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
	JPanel panel;

	Result (LayoutManager layout){

		setLayout(layout);
		score = new JLabel("正答数");
		score.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setVerticalAlignment(JLabel.CENTER);
		score.setPreferredSize(new Dimension(200, 420));
		end = new JButton("終了する");
		again = new JButton("もう一度挑戦する");
		end.setActionCommand("end");
		again.setActionCommand("again");
		end.setPreferredSize(new Dimension(300, 60));
		end.setHorizontalAlignment(JButton.CENTER);
		end.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));
		again.setPreferredSize(new Dimension(300, 60));
		again.setHorizontalAlignment(JButton.CENTER);
		again.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));

		panel = new JPanel();
		panel.setPreferredSize(new Dimension(200, 420));
		panel.add(score);

		this.add(panel, BorderLayout.NORTH);
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
