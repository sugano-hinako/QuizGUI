package main0115;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Question4 extends JPanel{
	private final JButton button;
    final ButtonGroup bg;

    public Question4(LayoutManager layout) {
    	setLayout(layout);

    	JLabel q1 = new JLabel("<html><body>問題４：クラスを元に作られるオブジェクトのことを<br>何と言うでしょうか？</body></html>問題４：クラスを元に作られるオブジェクトのことを何と言うでしょうか？");
		JRadioButton rb = new JRadioButton("1: インスタンス");
		rb.setActionCommand("4-1");
		JRadioButton rb2 = new JRadioButton("2: コンストラクタ");
        rb2.setActionCommand("4-2");
        JRadioButton rb3 = new JRadioButton("3: インタフェース");
        rb3.setActionCommand("4-3");
        JRadioButton rb4 = new JRadioButton("4: メソッド");
        rb4.setActionCommand("4-4");

        bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        button = new JButton("解答する");
        button.setActionCommand("button5");

        q1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 18));
		q1.setHorizontalAlignment(JLabel.CENTER);
		rb.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
		rb2.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
		rb3.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
		rb4.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
        button.setPreferredSize(new Dimension(300, 60));
		button.setHorizontalAlignment(JButton.CENTER);
		button.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));

		JPanel pLeft = new JPanel();

		pLeft.setPreferredSize(new Dimension(140, 0));

        JPanel p = new JPanel(new GridLayout(4,1));
        p.add(rb);
        p.add(rb2);
        p.add(rb3);
        p.add(rb4);
        this.add(q1, BorderLayout.NORTH);
        this.add(p, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
        this.add(pLeft, BorderLayout.WEST);
    }

    public void setActionListener(ActionListener l) {
        button.addActionListener(l);
    }

    public String getSelection() {
        if (this.bg.getSelection() != null){
            return this.bg.getSelection().getActionCommand();
        }
        return "";
    }

}
