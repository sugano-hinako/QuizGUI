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

public class Q3Miss extends JPanel{
	JLabel label;
    JButton next;

    Q3Miss(LayoutManager layout){
    	setLayout(layout);
    	JLabel label = new JLabel("不正解…");
    	JLabel comment = new JLabel("<html><body>" +
    	"正解は3です。<br>1は評価結果がbooleanとならないため、条件式として利用とすると<br>コンパイルエラーになります、"
    	+ "2は文字列を比較する際は str.equals(\"柴犬\")と書きます、<br> "
    	+ "4は代入を行う式です。"
    			+ "</body></html>");
    	next = new JButton("次の問題へ");
    	next.setActionCommand("next6");

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
