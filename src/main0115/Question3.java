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

public class Question3 extends JPanel{

	private final JButton button;
    final ButtonGroup bg;

    public Question3(LayoutManager layout) {
    	setLayout(layout);

    	JLabel q1 = new JLabel("問題３：条件式として適切ものはどれ？");
		JRadioButton rb = new JRadioButton("1: double d = true");
		rb.setActionCommand("3-1");
		JRadioButton rb2 = new JRadioButton("2: 3");
        rb2.setActionCommand("3-2");
        JRadioButton rb3 = new JRadioButton("3: b + 5 < 20");
        rb3.setActionCommand("3-3");
        JRadioButton rb4 = new JRadioButton("4: isNumeric = true");
        rb4.setActionCommand("3-4");

        bg = new ButtonGroup();
        bg.add(rb);
        bg.add(rb2);
        bg.add(rb3);
        bg.add(rb4);

        button = new JButton("解答する");
        button.setActionCommand("button4");

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
