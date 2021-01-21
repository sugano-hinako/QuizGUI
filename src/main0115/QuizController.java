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
			case "next5"://Q3Result
				QuizView.layout.show(QuizView.cardPanel, "button5");
				break;
			case "next6"://Q3Miss
				QuizView.layout.show(QuizView.cardPanel, "button5");
				break;
			case "button5"://Question4
				quizModel.judge4(quizView.getAnswer4());
				if(quizView.getAnswer4().equals("4-1")) {
					QuizView.layout.show(QuizView.cardPanel, "next7");
				}else {
					QuizView.layout.show(QuizView.cardPanel, "next8");
				}
				break;
			case "next7"://Q4Result
				QuizView.layout.show(QuizView.cardPanel, "button6");
				break;
			case "next8"://Q4Miss
				QuizView.layout.show(QuizView.cardPanel, "button6");
				break;
			case "button6"://Question5
				quizModel.judge5(quizView.getAnswer5());
				if(quizView.getAnswer5().equals("5-4")) {
					QuizView.layout.show(QuizView.cardPanel, "next9");
				}else {
					QuizView.layout.show(QuizView.cardPanel, "next10");
				}
				break;
			case "next9"://Q5Result
				quizView.setResult(quizModel);
				QuizView.layout.show(QuizView.cardPanel, "again");
				break;
			case "next10"://Q5Miss
				quizView.setResult(quizModel);
				QuizView.layout.show(QuizView.cardPanel, "again");
				break;
			case "again": //Result
				quizModel.reset();
                QuizView.layout.first(QuizView.cardPanel);
                break;
			case "end": //Result
				QuizView.layout.show(QuizView.cardPanel, "ok");
                break;
			case "ok":
				System.exit(0);
				break;
			}

		}
	}
}
