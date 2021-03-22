package com.sylvestarstudio.deletequiz;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

   //ArrayList<List<String>> list = new ArrayList<List<String>>();
    //List<Integer> list1;

    //ArrayList<ArrayList<Questions>> quizArray = new ArrayList<>();

    //private Helper helper = new Helper();

    //List<Questions> currentChoices1 = new ArrayList<>();

    //private int qNum = 0;
    //private int score = 0;
    //private String[] ans = new String[5]; // user answers

    //QuizContentsTest01 arrayList = new QuizContentsTest01();

    QuestionsAndAnswers newListClass = new QuestionsAndAnswers();

    Button answer1;
    Button answer2;
    Button answer3;
    Button answer4;

    MediaPlayer playSounds;

    TextView score;
    TextView question;

    int turn = 0;

    private String mAnswer;

    private int mScore = 0;

    //List<Integer> current = Arrays.asList();
    //ArrayList<Integer> current = new ArrayList<>();

    //private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //r = new Random();

        //list1 = new ArrayList<>();

        //int randomIndex = r.nextInt(new Questions().mQuestions.length);

        answer1 = (Button) findViewById(R.id.answer1);
        answer2 = (Button) findViewById(R.id.answer2);
        answer3 = (Button) findViewById(R.id.answer3);
        answer4 = (Button) findViewById(R.id.answer4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText("Score: " +mScore);

        //Collections.shuffle(Arrays.asList(randomIndex));
/*
        quizLists.add(new QuizContentsTest01(R.raw.excellent_mk3, "Correct Answer 1", "2", "3", "4", "Correct Answer 1"));
        quizLists.add(new QuizContentsTest01(R.raw.tower_end, "1", "2", "Correct Answer 3", "4", "Correct Answer 3"));
        quizLists.add(new QuizContentsTest01(R.raw.mk2fatal2, "1", "Correct Answer 2", "3", "4", "Correct Answer 2"));
        quizLists.add(new QuizContentsTest01(R.raw.forest_end, "1", "2", "3", "Correct Answer 4", "Correct Answer 4"));

 */
        updateQuestion(turn);

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer1.getText().toString().equalsIgnoreCase(mAnswer)) {
                    mScore++;
                    turn++;
                    score.setText("Score: " +mScore);
                    updateQuestion(turn);
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer2.getText().toString().equalsIgnoreCase(mAnswer)) {
                    mScore++;
                    turn++;
                    score.setText("Score: " +mScore);
                    updateQuestion(turn);
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer3.getText().toString().equalsIgnoreCase(mAnswer)) {
                    mScore++;
                    turn++;
                    score.setText("Score: " +mScore);
                    updateQuestion(turn);
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (answer4.getText().toString().equalsIgnoreCase(mAnswer)) {
                    mScore++;
                    turn++;
                    score.setText("Score: " +mScore);
                    updateQuestion(turn);
                }
            }
        });
    }

    private void updateQuestion(int i) {

        playSounds = MediaPlayer.create(this, newListClass.quizLists.get(i).getQuestion());
        playSounds.start();

        answer1.setText(newListClass.quizLists.get(i).getOption1());
        answer2.setText(newListClass.quizLists.get(i).getOption2());
        answer3.setText(newListClass.quizLists.get(i).getOption3());
        answer4.setText(newListClass.quizLists.get(i).getOption4());

        mAnswer = newListClass.quizLists.get(i).getAnswer();
    }
        /*


        List<String> currentChoices = Arrays.asList(mQuestions.getChoice(i));

        Collections.shuffle(currentChoices);

        //playSounds = MediaPlayer.create(this, quizLists.get(i).getQuestion1());

        playSounds = MediaPlayer.create(this, new Questions().getQuestion(i));
        playSounds.start();

        mAnswer = mQuestions.getCorrectAnswer(i);

        answer1.setText(currentChoices.get(0));
        answer2.setText(currentChoices.get(1));
        answer3.setText(currentChoices.get(2));
        answer4.setText(currentChoices.get(3));


        // new list
        List<String> currentChoices2 = Arrays.asList(mQuestions2.getChoice2(i));

        Collections.shuffle(currentChoices2);

        //playSounds = MediaPlayer.create(this, quizLists.get(i).getQuestion1());

        playSounds = MediaPlayer.create(this, new Questions().getQuestion2(i));
        playSounds.start();

        mAnswer = mQuestions2.getCorrectAnswer2(i);

        answer1.setText(currentChoices2.get(0));
        answer2.setText(currentChoices2.get(1));
        answer3.setText(currentChoices2.get(2));
        answer4.setText(currentChoices2.get(3));

*/
        //List<Boolean> currentChoices = Arrays.asList(quizLists.add(new QuizContentsTest01(1, "", "", "", "", "")));

        //Collections.shuffle(Arrays.asList(quizLists));

        //quizLists.remove(quizLists);
        //playSounds = MediaPlayer.create(this, quizLists.get(i).getQuestion1());




}