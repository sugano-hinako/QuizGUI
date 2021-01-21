package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopPanel extends JPanel{
	private final JButton button;

	public TopPanel(LayoutManager layout) {
		setLayout(layout);
		JLabel label = new JLabel("<html><body><b>javaのもんだいはじまるよ</b><br><br>"
				+ "<font size=\"-1\">※全5問の4択問題です</font></body></html>");
		button = new JButton("START!");
		button.setActionCommand("button");

		label.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 18));
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
