package com.bignerdranch.android.geoquiz;

/**
 * Created by rsten on 5/29/2017.
 */

public class Question {

    /** Local Variables */
    private int mTextResId;
    private boolean mAnswerTrue;

    /** Getter */
    public int getTextResId() {
        return mTextResId;
    }

    /** Setter */
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }


    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    /** Setter */
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    /** Getter */
    public Question(int textResId, boolean answerTrue){

        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }
}

