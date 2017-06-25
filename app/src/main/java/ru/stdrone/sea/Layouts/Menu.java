package ru.stdrone.sea.Layouts;

import android.app.Activity;
import android.view.View;

import ru.stdrone.sea.R;

public class Menu extends Layout {

    public Menu(Activity activity, int id) {
        super(activity, id);
        _activity.findViewById(R.id.btn_mm_quit).setOnClickListener(_quit);
    }

    final View.OnClickListener _quit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.exit(0);
        }
    };

}
