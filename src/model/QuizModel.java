package model;

import config.QuizConst;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class QuizModel {
    List<Quiz> quizArray;
    private int quizIndex = 0;
    private int quizLength;
    private int CorrectAnswer = 0;

    public QuizModel() {
        quizArray = createQuizDataArray(QuizConst.FILE_PATH);
    }

    public void addCorrectAnswer() {
        this.CorrectAnswer++;
    }

    public int showCorrectAnswer() {
        return this.CorrectAnswer;
    }

    public boolean judge(String answer, String correctAnswer) {
        if (answer.equals(correctAnswer)) {
            this.addCorrectAnswer();
            return true;
        }
        return false;
    }

    public void reset() {
        CorrectAnswer = 0;
        quizIndex = 0;
    }

    private List<Quiz> createQuizDataArray(String filePath) {
        List<Quiz> quizArray = new ArrayList<>();
        try {
            File csv = new File(filePath);
            BufferedReader br = new BufferedReader(new FileReader(csv));
            String line = "";
            while ((line = br.readLine()) != null) {
                quizArray.add(new Quiz(line));
            }
            br.close();
            quizLength = quizArray.size();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return quizArray;
    }

    public boolean isQuizEnd(int index) {
        return index >= quizLength;
    }

    public Quiz getQuizData() {
        return quizArray.get(getQuizIndex());
    }

    public int getQuizIndex() {
        return quizIndex;
    }

    public void incrementQuizIndex() {
        quizIndex++;
    }

    public static class Quiz {
        private final String id;
        private final String Question;
        private final String choice1;
        private final String choice2;
        private final String choice3;
        private final String choice4;
        private final String correct;
        private final String comment;


        public Quiz(String quizdata) {
            StringTokenizer st = new StringTokenizer(quizdata, ",");
            id = st.nextToken();
            Question = st.nextToken();
            choice1 = st.nextToken();
            choice2 = st.nextToken();
            choice3 = st.nextToken();
            choice4 = st.nextToken();
            correct = st.nextToken();
            comment = st.nextToken();
        }

        public String getQuizId(){
            return this.id;
        }
        public String getQuestion(){
            return this.Question;
        }
        public String getChoice1(){
            return this.choice1;
        }
        public String getChoice2(){
            return this.choice2;
        }
        public String getChoice3(){
            return this.choice3;
        }
        public String getChoice4(){
            return this.choice4;
        }
        public String getCorrectAnswer(){
            return this.correct;
        }
        public String getComment(){
            return this.comment;
        }
    }
}