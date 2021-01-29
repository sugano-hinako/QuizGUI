package main0115;

import static main0115.Const.*;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Q5Miss extends JPanel{

	JLabel label;
    JButton next;

    Q5Miss(LayoutManager layout){
    	setLayout(layout);
    	Font f = new Font(GOTHIC, Font.PLAIN, 15);
    	Font f2 = new Font(GOTHIC, Font.PLAIN, 18);
    	Font fBtn = new Font(GOTHIC, Font.BOLD, 15);

    	JLabel label = new JLabel("不正解…");
    	JLabel comment = new JLabel("<html><body>" +
    	"正解は1です。<br>2はsを後ろから検索して最初に登場する位置を調べる、<br>"
    	+ "3は一部に文字列sを含むか調べる、<br>4は文字列sが最初に登場する位置を調べるメソッドです。"
    			+ "</body></html>");
    	next = new JButton("次の画面へ");
    	next.setActionCommand(NEXT10);

    	JPanel panel = new JPanel();
    	JPanel panel2 = new JPanel();
    	JPanel panel3 = new JPanel();
    	JPanel panel4 = new JPanel();

    	label.setFont(f2);
    	label.setHorizontalAlignment(JLabel.CENTER);
    	comment.setHorizontalAlignment(JLabel.CENTER);
    	next.setPreferredSize(new Dimension(300, 60));
		next.setHorizontalAlignment(JButton.CENTER);
		next.setFont(fBtn);
		panel.setPreferredSize(new Dimension(50, 60));
		panel2.setPreferredSize(new Dimension(50, 60));

    	JPanel p = new JPanel(new GridLayout(4,1));
    	p.add(panel3);
    	p.add(label);
    	p.add(comment);
    	p.add(panel4);

    	this.add(p, BorderLayout.CENTER);
        this.add(next, BorderLayout.SOUTH);
        this.add(panel, BorderLayout.WEST);
        this.add(panel2, BorderLayout.EAST);
    }

    public void setActionListener(ActionListener l) {
        next.addActionListener(l);
    }

}
