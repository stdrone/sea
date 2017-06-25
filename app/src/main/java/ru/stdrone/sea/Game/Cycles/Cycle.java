package ru.stdrone.sea.Game.Cycles;

import android.app.Activity;

public abstract class Cycle {

    protected Activity _activity;
    protected IEndPlay _endPlay;

    public void SetActivity(Activity activity, IEndPlay endPlay) {
        _activity = activity;
        _endPlay =  endPlay;
    }

    public abstract void SignUp();

    protected void Play() {

    }


}
