package main0115;

import static main0115.Const.*;

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
			case BUTTON://TOPページ
				QuizView.layout.next(QuizView.cardPanel);
				break;
			case BUTTON2://Question1
				quizModel.judge(quizView.getAnswer());
//				System.out.println(quizView.getAnswer());
				if(quizView.getAnswer().equals("1-1")) {
					QuizView.layout.next(QuizView.cardPanel);
				}else {
					QuizView.layout.show(QuizView.cardPanel, NEXT2);
				}
				break;
			case NEXT://Q1Result
				QuizView.layout.show(QuizView.cardPanel, BUTTON3);
				break;
			case NEXT2://Q1Miss
				QuizView.layout.show(QuizView.cardPanel, BUTTON3);
				break;
			case BUTTON3://Question2
				quizModel.judge2(quizView.getAnswer2());
				if(quizView.getAnswer2().equals("2-2")) {
					QuizView.layout.show(QuizView.cardPanel, NEXT3);
				}else {
					QuizView.layout.show(QuizView.cardPanel, NEXT4);
				}
				break;
			case NEXT3://Q2Result
				QuizView.layout.show(QuizView.cardPanel, BUTTON4);
				break;
			case NEXT4://Q2Miss
				QuizView.layout.show(QuizView.cardPanel, BUTTON4);
				break;
			case BUTTON4://Question3
				quizModel.judge3(quizView.getAnswer3());
				if(quizView.getAnswer3().equals("3-3")) {
					QuizView.layout.show(QuizView.cardPanel, NEXT5);
				}else {
					QuizView.layout.show(QuizView.cardPanel, NEXT6);
				}
				break;
			case NEXT5://Q3Result
				QuizView.layout.show(QuizView.cardPanel, BUTTON5);
				break;
			case NEXT6://Q3Miss
				QuizView.layout.show(QuizView.cardPanel, BUTTON5);
				break;
			case BUTTON5://Question4
				quizModel.judge4(quizView.getAnswer4());
				if(quizView.getAnswer4().equals("4-1")) {
					QuizView.layout.show(QuizView.cardPanel, NEXT7);
				}else {
					QuizView.layout.show(QuizView.cardPanel, NEXT8);
				}
				break;
			case NEXT7://Q4Result
				QuizView.layout.show(QuizView.cardPanel, BUTTON6);
				break;
			case NEXT8://Q4Miss
				QuizView.layout.show(QuizView.cardPanel, BUTTON6);
				break;
			case BUTTON6://Question5
				quizModel.judge5(quizView.getAnswer5());
				if(quizView.getAnswer5().equals("5-4")) {
					QuizView.layout.show(QuizView.cardPanel, NEXT9);
				}else {
					QuizView.layout.show(QuizView.cardPanel, NEXT10);
				}
				break;
			case NEXT9://Q5Result
				quizView.setResult(quizModel);
				QuizView.layout.show(QuizView.cardPanel, "again");
				break;
			case NEXT10://Q5Miss
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