package view;

import config.QuizConst;
import model.QuizModel.Quiz;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class QuizView extends JFrame {

    public static JPanel cardPanel;
    public static CardLayout layout;
    private final TopPanel topPanel;
    private ResultPanel resultPanel;
    private ExitPanel exitPanel;
    private QuestionPanel question;
    private ActionListener actionListener;
    private QuestionResultPanel questionResult;

    public QuizView() {
        topPanel = new TopPanel(new BorderLayout());
        layout = new CardLayout();
        cardPanel = new JPanel();
        cardPanel.setLayout(layout);
        cardPanel.add(topPanel, "button");

        JPanel header = createHeaderPanel(new JPanel());

        Container contentPane = getContentPane();
        contentPane.add(header, BorderLayout.NORTH);
        contentPane.add(cardPanel, BorderLayout.CENTER);

    }

    public static JPanel getCardPanel() {
        return cardPanel;
    }

    public void createExitPanel() {
        exitPanel = new ExitPanel(new BorderLayout());
        cardPanel.add(exitPanel, QuizConst.EXIT);
        exitPanel.setActionListener(actionListener);
    }

    public void createResultPanel() {
        resultPanel = new ResultPanel(new BorderLayout());
        cardPanel.add(resultPanel, QuizConst.SHOW_TOTAL_RESULT);
        resultPanel.setActionListener(actionListener);
    }

    private JPanel createHeaderPanel(JPanel p) {
        p.setBackground(new Color(18, 158, 136));
        p.setPreferredSize(new Dimension(450, 40));
        return p;
    }

    public void addQuizListener(ActionListener listener) {
        actionListener = listener;
        topPanel.setActionListener(listener);
    }

    public String getAnswer() {
        if (question.getButtonSelection() != null) {
            return question.getButtonSelection();
        }
        return "";
    }

    public String getCorrectAnswer() {
        return question.getCorrectAnswer();
    }

    public void createQuizPanel(Quiz quiz) {
        question = new QuestionPanel(new BorderLayout(), quiz);
        cardPanel.add(question, quiz.getQuizId());
        question.setActionListener(actionListener);
    }

    public void createQuestionResultPanel(Quiz quiz, boolean judgeResult) {
        questionResult = new QuestionResultPanel(new BorderLayout(), quiz, judgeResult);
        cardPanel.add(questionResult, QuizConst.RESULT_PANEL);
        questionResult.setActionListener(actionListener);
    }

    public void setTotalResult(int totalResult) {
        resultPanel.setLabel(totalResult);
    }
}
