package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exit extends JPanel{
	JLabel label;
	JButton button;

	Exit(LayoutManager layout){

		setLayout(layout);
		label = new JLabel("お疲れ様でした。");
		button = new JButton("閉じる");
		button.setActionCommand("ok");

		label.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
    	label.setHorizontalAlignment(JLabel.CENTER);
		button.setPreferredSize(new Dimension(300, 60));
		button.setHorizontalAlignment(JButton.CENTER);
		button.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));


		this.add(label, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
	}

	public void setActionListener(ActionListener l) {
        button.addActionListener(l);
    }

}
