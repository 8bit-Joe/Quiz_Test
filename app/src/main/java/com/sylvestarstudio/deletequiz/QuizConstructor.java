package com.sylvestarstudio.deletequiz;

import java.util.Collections;

public class QuizConstructor {

    private int mQuestion;
    private String mOption1;
    private String mOption2;
    private String mOption3;
    private String mOption4;
    private String mCorrectAnswer;

    /**
     * A constructor to assign a question, options, and answer value to the class fields
     *
     */
    public QuizConstructor(int Question, String mOption1, String mOption2, String mOption3, String mOption4, String correctAnswer) {
        this.mQuestion = Question;
        this.mOption1 = mOption1;
        this.mOption2 = mOption2;
        this.mOption3 = mOption3;
        this.mOption4 = mOption4;
        this.mCorrectAnswer = correctAnswer;
    }

//      getters to get the value of class fields

    public int getQuestion() {
        return mQuestion;
    }

    public String getOption1() {
        return mOption1;
    }

    public String getOption2() {
        return mOption2;
    }

    public String getOption3() {
        return mOption3;
    }

    public String getOption4() {
        return mOption4;
    }

    public String getAnswer() {
        return mCorrectAnswer;
    }


}
