package com.sylvestarstudio.deletequiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class QuestionsAndAnswers {

    ArrayList<QuizConstructor> quizLists = new ArrayList<>();

    public QuestionsAndAnswers() {
        quizLists.add(new QuizConstructor(R.raw.excellent_mk3, "Correct Answer 1", "2", "3", "4", "Correct Answer 1"));
        quizLists.add(new QuizConstructor(R.raw.flawless_voice, "Correct Answer 2", "2", "3", "4", "Correct Answer 2"));
        quizLists.add(new QuizConstructor(R.raw.forest_end, "Correct Answer 3", "2", "3", "4", "Correct Answer 3"));
        quizLists.add(new QuizConstructor(R.raw.mileena_sai, "Correct Answer 4", "2", "3", "4", "Correct Answer 4"));
        quizLists.add(new QuizConstructor(R.raw.mk2_00960, "Correct Answer 5", "2", "3", "4", "Correct Answer 5"));
        quizLists.add(new QuizConstructor(R.raw.mk2_00963, "Correct Answer 6", "2", "3", "4", "Correct Answer 6"));
        quizLists.add(new QuizConstructor(R.raw.mk2_00966, "Correct Answer 7", "2", "3", "4", "Correct Answer 7"));
        quizLists.add(new QuizConstructor(R.raw.mk2_01190, "Correct Answer 8", "2", "3", "4", "Correct Answer 8"));
        quizLists.add(new QuizConstructor(R.raw.mk2fatal1, "Correct Answer 9", "2", "3", "4", "Correct Answer 9"));
        quizLists.add(new QuizConstructor(R.raw.mk2fatal2, "Correct Answer 10", "2", "3", "4", "Correct Answer 10"));
        quizLists.add(new QuizConstructor(R.raw.nothing, "Correct Answer 11", "2", "3", "4", "Correct Answer 11"));
        quizLists.add(new QuizConstructor(R.raw.pathetic, "Correct Answer 12", "2", "3", "4", "Correct Answer 12"));
        quizLists.add(new QuizConstructor(R.raw.shang_tsung_rainbow, "Correct Answer 13", "2", "3", "4", "Correct Answer 13"));
        quizLists.add(new QuizConstructor(R.raw.slash, "Correct Answer 14", "2", "3", "4", "Correct Answer 14"));
        quizLists.add(new QuizConstructor(R.raw.toasty, "Correct Answer 15", "2", "3", "4", "Correct Answer 15"));
        quizLists.add(new QuizConstructor(R.raw.prepare, "Correct Answer 16", "2", "3", "4", "Correct Answer 16"));
        quizLists.add(new QuizConstructor(R.raw.tower_end, "Correct Answer 17", "2", "3", "4", "Correct Answer 17"));
        quizLists.add(new QuizConstructor(R.raw.trying_to_win_mk3, "Correct Answer 18", "2", "3", "4", "Correct Answer 18"));
        quizLists.add(new QuizConstructor(R.raw.metal, "Correct Answer 19", "2", "3", "4", "Correct Answer 19"));
        quizLists.add(new QuizConstructor(R.raw.verses2, "Correct Answer 20", "2", "3", "4", "Correct Answer 20"));
        Collections.shuffle(quizLists);
    }
}

