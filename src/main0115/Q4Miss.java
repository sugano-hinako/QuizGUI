package main0115;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q4Miss extends JPanel{

	JLabel label;
    JButton next;

    Q4Miss(LayoutManager layout){
    	setLayout(layout);
    	JLabel label = new JLabel("不正解…");
    	JLabel blank = new JLabel(" ");
    	JLabel comment = new JLabel("<html><body>" +
    	"正解は1です。あとで解説入れる。"
    			+ "</body></html>");
    	next = new JButton("次の問題へ");
    	next.setActionCommand("next8");

    	JPanel p = new JPanel(new GridLayout(4,1));
    	p.add(blank);
    	p.add(label);
    	p.add(comment);
    	p.add(blank);

    	this.add(p, BorderLayout.CENTER);
        this.add(next, BorderLayout.SOUTH);
    }

    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }
}
