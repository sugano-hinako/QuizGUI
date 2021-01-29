package main0115;

import static main0115.Const.*;

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

public class Question5 extends JPanel{

	private final JButton button;
    ButtonGroup bg;

    public Question5(LayoutManager layout) {
    	setLayout(layout);
    	Font f = new Font(GOTHIC, Font.PLAIN, 15);
    	Font f2 = new Font(GOTHIC, Font.PLAIN, 18);

    	JLabel q1 = new JLabel("<html><body>問題５：文字列sで終わるか調べるメソッドの定義で<br>正しいものはどれ？</body></html>");
		JRadioButton rb = new JRadioButton("1: public int lastIndexOf(String s)");
		rb.setActionCommand("5-1");//sを後ろから検索して最初に登場する位置を調べるメソッド
		JRadioButton rb2 = new JRadioButton("2: public boolean contains(String s)");
        rb2.setActionCommand("5-2");//一部に文字列sを含むか調べるメソッド
        JRadioButton rb3 = new JRadioButton("3: public int indexOf(String s)");
        rb3.setActionCommand("5-3");//文字列sが最初に登場する位置を調べるメソッド
        JRadioButton rb4 = new JRadioButton("4: public boolean endsWith(String s)");
        rb4.setActionCommand("5-4");

        JRadioButton[] rbtns = {rb,rb2,rb3,rb4};
        bg = setButtonGroup(rbtns);

        button = new JButton("解答する");
        button.setActionCommand(BUTTON6);

        q1.setFont(f2);
		q1.setHorizontalAlignment(JLabel.CENTER);
		rb.setFont(f);
		rb2.setFont(f);
		rb3.setFont(f);
		rb4.setFont(f);
        button.setPreferredSize(new Dimension(300, 60));
		button.setHorizontalAlignment(JButton.CENTER);
		button.setFont(new Font(GOTHIC, Font.BOLD, 15));

		JPanel pLeft = new JPanel();

		pLeft.setPreferredSize(new Dimension(80, 0));

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
    private ButtonGroup setButtonGroup(JRadioButton[] rbtns) {
    	bg = new ButtonGroup();
    	for (JRadioButton rbutton : rbtns) {
    		bg.add(rbutton);
    	}
    	return bg;
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
