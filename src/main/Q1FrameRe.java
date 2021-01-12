package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Q1FrameRe extends JFrame{
	JRadioButton[] q1radio;

	Q1FrameRe(String title){
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 600);
		setLocationRelativeTo(null);

		//ラベル
		JLabel q1 = new JLabel("問題１");
		JLabel question = new JLabel("<html><body>整数を格納する型は？</body></html>");

		//ラベルの設定
		q1.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));
		q1.setForeground(Color.WHITE);
		q1.setPreferredSize(new Dimension(450, 30));
		q1.setHorizontalAlignment(JLabel.CENTER);
		q1.setVerticalAlignment(JLabel.CENTER);
		question.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));
		question.setHorizontalAlignment(JLabel.CENTER);

		//ラジオボタン
		q1radio = new JRadioButton[4];
		q1radio[0] =new JRadioButton("1.  int");
		q1radio[1] =new JRadioButton("2.  String");
		q1radio[2] =new JRadioButton("3.  double");
		q1radio[3] =new JRadioButton("4.  char");

		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(q1radio[0]);
		bgroup.add(q1radio[1]);
		bgroup.add(q1radio[2]);
		bgroup.add(q1radio[3]);

		//解答ボタン
		JButton ab = new JButton("解答する");//ab = answer button

		//パネル
		JPanel header = new JPanel();
		header.add(q1);
		header.setPreferredSize(new Dimension(450, 40));
		header.setBackground(new Color(18, 158, 136));

		JPanel qs = new JPanel();//qs = question sentence
		GridBagLayout layout = new GridBagLayout();
		qs.setLayout(layout);
		GridBagConstraints gbc = new GridBagConstraints();

		gbc.gridx = 0;
	    gbc.gridy = 0;
	    layout.setConstraints(question,gbc);
		gbc.gridx = 0;
	    gbc.gridy = 1;
	    layout.setConstraints(q1radio[0],gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 2;
	    layout.setConstraints(q1radio[1],gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 3;
	    layout.setConstraints(q1radio[2],gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 4;
	    layout.setConstraints(q1radio[3],gbc);
	    gbc.gridx = 0;
	    gbc.gridy = 5;
	    layout.setConstraints(ab,gbc);

	    qs.add(question);
	    qs.add(q1radio[0]);
	    qs.add(q1radio[1]);
	    qs.add(q1radio[2]);
	    qs.add(q1radio[3]);
	    qs.add(ab);

		Container contentPane = getContentPane();
		contentPane.setBackground(Color.WHITE);
		contentPane.add(header, BorderLayout.NORTH);
		contentPane.add(qs, BorderLayout.CENTER);
	}

}
