package controller;

import config.QuizConst;
import model.QuizModel;
import view.QuizView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static config.QuizConst.SHOW_QUIZ;
import static config.QuizConst.SHOW_RESULT;
import static config.QuizConst.SHOW_TOTAL_RESULT;
import static config.QuizConst.END;
import static config.QuizConst.EXIT;
import static view.QuizView.getCardPanel;

public class QuizController {
    private QuizView quizView;
    private QuizModel quizModel;

    public QuizController(QuizView view, QuizModel model) {
        this.quizView = view;
        this.quizModel = model;
        this.quizView.addQuizListener(new QuizListener());
    }

    class QuizListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (e.getActionCommand()) {
                case SHOW_QUIZ:
                    if (quizModel.isQuizEnd(quizModel.getQuizIndex())) {
                        quizView.createResultPanel();
                        quizView.setTotalResult(quizModel.showCorrectAnswer());
                        QuizView.layout.show(getCardPanel(), SHOW_TOTAL_RESULT);
                        break;
                    }
                    quizView.createQuizPanel(quizModel.getQuizData());
                    QuizView.layout.show(
                            getCardPanel(),
                            String.valueOf(quizModel.getQuizIndex() + 1)
                    );
                    break;
                case SHOW_RESULT:
                    if (quizView.getAnswer().equals("")) break;
                    boolean judgeResult = quizModel.judge(quizView.getAnswer(), quizView.getCorrectAnswer());
                    quizView.createQuestionResultPanel(quizModel.getQuizData(), judgeResult);
                    quizModel.incrementQuizIndex();
                    QuizView.layout.show(getCardPanel(), QuizConst.RESULT_PANEL);
                    break;
                case SHOW_TOTAL_RESULT:
                    quizModel.reset();
                    QuizView.layout.first(getCardPanel());
                    break;
                case END:
                    quizView.createExitPanel();
                    QuizView.layout.show(getCardPanel(), QuizConst.EXIT);
                    break;
                case EXIT:
                    System.exit(0);
                    break;
            }

        }
    }
}
