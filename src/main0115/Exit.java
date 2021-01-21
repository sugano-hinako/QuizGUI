package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Exit extends JPanel{
	JLabel label;
	JButton button;
	JPanel panel1;
	JPanel panel2;

	Exit(LayoutManager layout){

		setLayout(layout);
		label = new JLabel("お疲れ様でした。");
		button = new JButton("閉じる");
		button.setActionCommand("ok");
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel1.setPreferredSize(new Dimension(200, 300));
		panel2.setPreferredSize(new Dimension(200, 300));


		this.add(label, BorderLayout.NORTH);
		this.add(button, BorderLayout.CENTER);
		this.add(panel2, BorderLayout.SOUTH);
	}

	public void setActionListener(ActionListener l) {
        button.addActionListener(l);
    }

}
