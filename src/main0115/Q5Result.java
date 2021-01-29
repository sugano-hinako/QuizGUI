package main0115;

import static main0115.Const.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q5Result extends JPanel{

	JLabel label;
    JButton next;

    Q5Result(LayoutManager layout){
    	setLayout(layout);
    	Font f = new Font(GOTHIC, Font.PLAIN, 15);
    	Font f2 = new Font(GOTHIC, Font.PLAIN, 18);
    	Font fBtn = new Font(GOTHIC, Font.BOLD, 15);

    	label = new JLabel(CORRECT);
    	next = new JButton("次の画面へ");
    	next.setActionCommand(NEXT9);

    	label.setFont(f2);
    	label.setHorizontalAlignment(JLabel.CENTER);
    	next.setPreferredSize(new Dimension(300, 60));
		next.setHorizontalAlignment(JButton.CENTER);
		next.setFont(fBtn);

    	this.add(label, BorderLayout.CENTER);
        this.add(next, BorderLayout.SOUTH);
    }
    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }

}
