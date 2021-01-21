package main0115;

import java.awt.BorderLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q4Result extends JPanel{

	JLabel label;
    JButton next;

    Q4Result(LayoutManager layout){
    	setLayout(layout);
    	label = new JLabel("正解!");
    	next = new JButton("次の問題へ");
    	next.setActionCommand("next7");

    	this.add(label, BorderLayout.CENTER);
        this.add(next, BorderLayout.SOUTH);
    }
    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }
}
