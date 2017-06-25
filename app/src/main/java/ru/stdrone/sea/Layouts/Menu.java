package ru.stdrone.sea.Layouts;

import android.app.Activity;
import android.view.View;

import ru.stdrone.sea.Game.Cycles.Cycle;
import ru.stdrone.sea.Game.Cycles.Hotseat;
import ru.stdrone.sea.Game.Cycles.IEndPlay;
import ru.stdrone.sea.R;

public class Menu extends Layout implements IEndPlay {

    public Menu(Activity activity, int id) {
        super(activity, id);
        _activity.findViewById(R.id.btn_mm_quit).setOnClickListener(_quit);
        _activity.findViewById(R.id.btn_mm_play_hs).setOnClickListener(_play_hs);
    }

    private void Play(Cycle cycle) {
        Hide();
        cycle.SetActivity(_activity, this);
        cycle.SignUp();
    }

    public void EndPlay() {
        Show();
    }

    final View.OnClickListener _quit = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            System.exit(0);
        }
    };

    final View.OnClickListener _play_hs = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Play(new Hotseat());
        }
    };
}
