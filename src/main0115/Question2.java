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

public class Question2 extends JPanel{

	private final JButton button;
    final ButtonGroup bg;

    public Question2(LayoutManager layout) {
    	setLayout(layout);

    	JLabel q1 = new JLabel("問題２：文法として正しいものはどれ？");
		JRadioButton rb = new JRadioButton("1: double d = true;");
		rb.setActionCommand("2-1");
		JRadioButton rb2 = new JRadioButton("2: String s = 2 +\"人目\"; ");
        rb2.setActionCommand("2-2");
        JRadioButton rb3 = new JRadioButton("3: int x = 3 + 5.0; ");
        rb3.setActionCommand("2-3");
        JRadioButton rb4 = new JRadioButton("4: int number = \"5\"; ");
        rb4.setActionCommand("2-4");

        bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        button = new JButton("解答する");
        button.setActionCommand("button3");

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

		pLeft.setPreferredSize(new Dimension(120, 0));

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
