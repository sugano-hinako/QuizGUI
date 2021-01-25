package view;

import config.QuizConst;
import model.QuizModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import static config.QuizConst.GOTHIC;

public class QuestionPanel extends JPanel{
    private final JButton submitButton;
    private final ButtonGroup buttonGroup;
    private final String correctAnswer;

    public QuestionPanel(LayoutManager layout, QuizModel.Quiz quiz){
        setLayout(layout);

        JLabel questionLabel = createQuestionLabel(quiz);
        JRadioButton[] rbuttonArray = createRadioButtons(quiz);
        buttonGroup = addRadioButtonToGroup(rbuttonArray);
        correctAnswer = quiz.getCorrectAnswer();
        submitButton = createAnswerButton(quiz.getQuizId());
        setRadioButtonsFont(rbuttonArray);

        this.add(questionLabel, BorderLayout.NORTH);
        this.add(radioButtonsToPanel(rbuttonArray), BorderLayout.CENTER);
        this.add(submitButton, BorderLayout.SOUTH);
    }
    private JLabel createQuestionLabel(QuizModel.Quiz quiz){
        JLabel l = new JLabel(quiz.getQuestion());
        l.setFont(new Font(GOTHIC, Font.BOLD, 18));
        l.setHorizontalAlignment(JLabel.CENTER);
        return l;
    }
    private JRadioButton[] createRadioButtons(QuizModel.Quiz quiz) {
        JRadioButton rb = new JRadioButton("1 : " + quiz.getChoice1());
        rb.setActionCommand("1");
        JRadioButton rb2 = new JRadioButton("2 : " + quiz.getChoice2());
        rb2.setActionCommand("2");
        JRadioButton rb3 = new JRadioButton("3 : " + quiz.getChoice3());
        rb3.setActionCommand("3");
        JRadioButton rb4 = new JRadioButton("4 : " + quiz.getChoice4());
        rb4.setActionCommand("4");
        JRadioButton[] buttons = {rb, rb2, rb3, rb4};
        return buttons;
    }

    private JButton createAnswerButton(String id) {
        JButton button = new JButton("解答する");
        button.setPreferredSize(new Dimension(300, 60));
        button.setHorizontalAlignment(JButton.CENTER);
        button.setFont(new Font(GOTHIC, Font.BOLD, 15));
        button.setActionCommand(QuizConst.SHOW_RESULT);
        return button;
    }
    private void setRadioButtonsFont(JRadioButton[] rbuttonArray) {
        for(JRadioButton rbutton:rbuttonArray) {
            rbutton.setFont(answerConfig());
        }
    }

    private JPanel radioButtonsToPanel(JRadioButton[] rbuttonArray) {
        JPanel p = new JPanel(new GridLayout(4,1));
        for(JRadioButton rbutton:rbuttonArray) {
            p.add(rbutton);
        }
        return p;
    }

    private ButtonGroup addRadioButtonToGroup(JRadioButton[] rbuttonArray) {
        ButtonGroup bg = new ButtonGroup();
        for(JRadioButton b: rbuttonArray){
            bg.add(b);
        }
        return bg;
    }

    private Font answerConfig() {
        return new Font(GOTHIC, Font.PLAIN, 15);
    }
    public void setActionListener(ActionListener l) {
        submitButton.addActionListener(l);
    }

    public String getButtonSelection() {
        if (this.buttonGroup.getSelection() != null){
            return this.buttonGroup.getSelection().getActionCommand();
        }
        return "";
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
