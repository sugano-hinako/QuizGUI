package main0115;

import javax.swing.JFrame;

public class QuizMain {

	public static void main(String[] args) {
		QuizView view = new QuizView();
        QuizModel model = new QuizModel();
        QuizController controller = new QuizController(view, model);

		view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setSize(450,600);
        view.setLocationRelativeTo(null);
        view.setTitle("javaのもんだい");
        view.setVisible(true);

	}

}
