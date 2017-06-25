package ru.stdrone.sea.Layouts;

import android.app.Activity;
import android.view.View;

public abstract class Layout {
    protected Activity _activity;
    protected View _view;

    public Layout(Activity activity, int id) {
        _activity = activity;
        _view = _activity.findViewById(id);
    }

    public void Show() {
        _view.setVisibility(View.VISIBLE);
    }

    public void Hide() {
        _view.setVisibility(View.INVISIBLE);
    }
}
