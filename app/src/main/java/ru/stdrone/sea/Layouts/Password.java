package ru.stdrone.sea.Layouts;

import android.app.Activity;
import android.widget.TextView;

import ru.stdrone.sea.R;

public class Password extends Layout {

    public Password(Activity activity, int id) {
        super(activity, id);

    }

    public void SetPasswordLabel(String label) {
        ((TextView) _activity.findViewById(R.id.lbl_hs_password)).setText(label);
    }
}
