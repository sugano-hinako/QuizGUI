package main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TopFrame extends JFrame {

	TopFrame(String title) {
		setTitle(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(450, 600);
		setLocationRelativeTo(null);

		//ラベルの設定
		JLabel topLabel = new JLabel("javaのもんだいはじまるよ");
		JLabel exLabel = new JLabel("全5問の4択問題です");
		JLabel spaceLabel = new JLabel();
		topLabel.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 20));
		topLabel.setOpaque(true);
		topLabel.setBackground(Color.WHITE);
		topLabel.setPreferredSize(new Dimension(450, 200));
		topLabel.setHorizontalAlignment(JLabel.CENTER);
		topLabel.setVerticalAlignment(JLabel.BOTTOM);
		exLabel.setFont(new Font("ＭＳ ゴシック", Font.PLAIN, 15));
		exLabel.setOpaque(true);
		exLabel.setBackground(Color.WHITE);
		exLabel.setPreferredSize(new Dimension(450, 80));
		exLabel.setHorizontalAlignment(JLabel.CENTER);
		exLabel.setVerticalAlignment(JLabel.TOP);

		//ボタンの設定
		JButton btn = new JButton("START！");
		btn.setPreferredSize(new Dimension(300, 50));
		btn.setHorizontalAlignment(JButton.CENTER);
		btn.setFont(new Font("ＭＳ ゴシック", Font.BOLD, 15));
		btn.setOpaque(true);
		btn.setForeground(Color.WHITE);
		btn.setBackground(new Color(81, 182, 255));
		btn.setBorderPainted(false);

		JPanel panel = new JPanel();//テキスト
		JPanel panel2 = new JPanel();//ヘッダー
		JPanel panel3 = new JPanel();//ボタン
		//パネルをBorderLayoutにする
		panel.setLayout(new BorderLayout());
		//パネルに要素を追加
		panel.add(topLabel, BorderLayout.NORTH);
		panel.add(spaceLabel, BorderLayout.CENTER);
		panel.add(exLabel, BorderLayout.SOUTH);
		panel3.add(btn);
		//パネルのサイズを指定
		panel.setPreferredSize(new Dimension(450, 310));
		panel2.setPreferredSize(new Dimension(450, 40));
		panel3.setPreferredSize(new Dimension(450, 250));

		//パネルの背景色
		panel.setBackground(Color.WHITE);
		panel2.setBackground(new Color(18, 158, 136));
		panel3.setBackground(Color.WHITE);

		Container contentPane = getContentPane();
		contentPane.add(panel2, BorderLayout.NORTH);
		contentPane.add(panel, BorderLayout.CENTER);
		contentPane.add(panel3, BorderLayout.SOUTH);

	}
}
