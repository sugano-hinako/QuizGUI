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

public class Q4Miss extends JPanel{

	JLabel label;
    JButton next;

    Q4Miss(LayoutManager layout){
    	setLayout(layout);
    	JLabel label = new JLabel("不正解…");
    	JLabel comment = new JLabel("<html><body>" +
    	"正解は1です。<br>2のコンストラクタはインスタンス生成時に実行されるメソッドです、"
    	+ "3のインタフェースはクラスに含まれるメソッドの具体的な処理内容を記述せず、<br>変数とメソッドの型のみを定義したものです、"
    	+ "4のメソッドはいくつかの処理をひとまとめにしたものです。"
    			+ "</body></html>");
    	next = new JButton("次の問題へ");
    	next.setActionCommand("next8");

    	JPanel panel = new JPanel();
    	JPanel panel2 = new JPanel();
    	JPanel panel3 = new JPanel();
    	JPanel panel4 = new JPanel();

    	label.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
    	label.setHorizontalAlignment(JLabel.CENTER);
    	comment.setHorizontalAlignment(JLabel.CENTER);
    	next.setPreferredSize(new Dimension(300, 60));
		next.setHorizontalAlignment(JButton.CENTER);
		next.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));
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
