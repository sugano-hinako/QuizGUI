package main0115;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Question5 extends JPanel{

	private final JButton button;
    final ButtonGroup bg;

    public Question5(LayoutManager layout) {
    	setLayout(layout);

    	JLabel q1 = new JLabel("問題５：文字列sで終わるか調べるメソッドの定義で正しいものはどれ？");
		JRadioButton rb = new JRadioButton("1: public int lastIndexOf(String s)");
		rb.setActionCommand("5-1");//sを後ろから検索して最初に登場する位置を調べるメソッド
		JRadioButton rb2 = new JRadioButton("2: public boolean contains(String s)");
        rb2.setActionCommand("5-2");//一部に文字列sを含むか調べるメソッド
        JRadioButton rb3 = new JRadioButton("3: public int indexOf(String s)");
        rb3.setActionCommand("5-3");//文字sが最初に登場する位置を調べるメソッド
        JRadioButton rb4 = new JRadioButton("4: public boolean endsWith(String s)");
        rb4.setActionCommand("5-4");

        bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        button = new JButton("解答する");
        button.setActionCommand("button6");

        JPanel p = new JPanel(new GridLayout(4,1));
        p.add(rb);
        p.add(rb2);
        p.add(rb3);
        p.add(rb4);
        this.add(q1, BorderLayout.NORTH);
        this.add(p, BorderLayout.CENTER);
        this.add(button, BorderLayout.SOUTH);
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
