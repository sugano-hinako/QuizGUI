package main0115;

public class QuizModel {

	private int CorrectAnswer = 0;

	public void addCorrectAnswer(){
        this.CorrectAnswer++;
    }

    public int showCorrectAnswer() {
        return this.CorrectAnswer;
    }

    public void judge(String answer) {
        if (answer.equals("1-1")) this.addCorrectAnswer();
    }
    public void judge2(String answer) {
    	if (answer.equals("2-2")) this.addCorrectAnswer();
    }
    public void judge3(String answer) {
    	if (answer.equals("3-3")) this.addCorrectAnswer();
    }

    public void reset() {
        CorrectAnswer = 0;
    }
}
