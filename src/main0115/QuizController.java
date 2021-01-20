package main0115;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuizController {
	private QuizView quizView;
	private QuizModel quizModel;

	QuizController(QuizView view, QuizModel model) {
		this.quizView = view;
		this.quizModel = model;
		this.quizView.addQuizListener(new QuizListener());
	}

	class QuizListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			String cmd = e.getActionCommand();
			switch (cmd) {
			case "button"://TOPページ
				QuizView.layout.next(QuizView.cardPanel);
				break;
			case "button2"://Question1
				quizModel.judge(quizView.getAnswer());
//				System.out.println(quizView.getAnswer());
				if(quizView.getAnswer().equals("1-1")) {
					QuizView.layout.next(QuizView.cardPanel);
				}else {
					QuizView.layout.show(QuizView.cardPanel, "next2");
				}
				break;
			case "next"://Q1Result
				QuizView.layout.show(QuizView.cardPanel, "button3");
				break;
			case "next2"://Q1Miss
				QuizView.layout.show(QuizView.cardPanel, "button3");
				break;
			case "button3"://Question2
				quizModel.judge2(quizView.getAnswer2());
				if(quizView.getAnswer2().equals("2-2")) {
					QuizView.layout.show(QuizView.cardPanel, "next3");
				}else {
					QuizView.layout.show(QuizView.cardPanel, "next4");
				}
				break;
			case "next3"://Q2Result
				QuizView.layout.show(QuizView.cardPanel, "button4");
				break;
			case "next4"://Q2Miss
				QuizView.layout.show(QuizView.cardPanel, "button4");
				break;
			case "button4"://Question3
				quizModel.judge3(quizView.getAnswer3());
				if(quizView.getAnswer3().equals("3-3")) {
					QuizView.layout.show(QuizView.cardPanel, "next5");
				}else {
					QuizView.layout.show(QuizView.cardPanel, "next6");
				}
				break;
			}

		}
	}
}
