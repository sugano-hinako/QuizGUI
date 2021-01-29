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

public class Question2 extends JPanel{

	private final JButton button;
    ButtonGroup bg;

    public Question2(LayoutManager layout) {
    	setLayout(layout);
    	Font f = new Font(GOTHIC, Font.PLAIN, 15);
    	Font f2 = new Font(GOTHIC, Font.PLAIN, 18);

    	JLabel q1 = new JLabel("問題２：文法として正しいものはどれ？");
		JRadioButton rb = new JRadioButton("1: double d = true;");
		rb.setActionCommand("2-1");
		JRadioButton rb2 = new JRadioButton("2: String s = 2 +\"人目\"; ");
        rb2.setActionCommand("2-2");
        JRadioButton rb3 = new JRadioButton("3: int x = 3 + 5.0; ");
        rb3.setActionCommand("2-3");
        JRadioButton rb4 = new JRadioButton("4: int number = \"5\"; ");
        rb4.setActionCommand("2-4");

        JRadioButton[] rbtns = {rb,rb2,rb3,rb4};
        bg = setButtonGroup(rbtns);

        button = new JButton("解答する");
        button.setActionCommand(BUTTON3);

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
