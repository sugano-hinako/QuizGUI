package main0115;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class QuizView extends JFrame{
	public static JPanel cardPanel;
    public static CardLayout layout;
    private TopPanel topPanel;
    private Question1 q1;
    private Question2 q2;
    private Question3 q3;
    private Q1Result q1Result;
    private Q2Result q2Result;
    private Q3Result q3Result;
    private Q1Miss q1miss;
    private Q2Miss q2miss;
    private Q3Miss q3miss;

    QuizView(){
    	topPanel = new TopPanel(new BorderLayout());
    	q1 = new Question1(new BorderLayout());
    	q2 = new Question2(new BorderLayout());
    	q3 = new Question3(new BorderLayout());
    	q1Result = new Q1Result(new BorderLayout());
    	q2Result = new Q2Result(new BorderLayout());
    	q3Result = new Q3Result(new BorderLayout());
    	q1miss = new Q1Miss(new BorderLayout());
    	q2miss = new Q2Miss(new BorderLayout());
    	q3miss = new Q3Miss(new BorderLayout());

    	cardPanel = new JPanel();
        layout = new CardLayout();
        cardPanel.setLayout(layout);

        JPanel header = new JPanel();
		header.setBackground(new Color(18, 158, 136));
		header.setPreferredSize(new Dimension(450, 40));

        cardPanel.add(topPanel, "button");
        cardPanel.add(q1, "button2");
        cardPanel.add(q1Result, "next");
        cardPanel.add(q1miss, "next2");
        cardPanel.add(q2, "button3");
        cardPanel.add(q2Result, "next3");
        cardPanel.add(q2miss, "next4");
        cardPanel.add(q3, "button4");
        cardPanel.add(q3Result, "next5");
        cardPanel.add(q3miss, "next6");

        Container contentPane = getContentPane();
        contentPane.add(header, BorderLayout.NORTH);
        contentPane.add(cardPanel, BorderLayout.CENTER);

    }

    public void addQuizListener(ActionListener listener) {
    	topPanel.setActionListener(listener);
    	q1.setActionListener(listener);
    	q1Result.setActionListener(listener);
    	q1miss.setActionListener(listener);
    	q2.setActionListener(listener);
    	q2Result.setActionListener(listener);
    	q2miss.setActionListener(listener);
    	q3.setActionListener(listener);
    	q3Result.setActionListener(listener);
    }

    public String getAnswer() {
        if (q1.getSelection() != null){
            return q1.getSelection();
        }
        return "0";
    }
    public String getAnswer2() {
        if (q2.getSelection() != null){
            return q2.getSelection();
        }
        return "0";
    }
    public String getAnswer3() {
        if (q3.getSelection() != null){
            return q3.getSelection();
        }
        return "0";
    }


}
