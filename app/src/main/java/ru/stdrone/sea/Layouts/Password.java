package ru.stdrone.sea.Layouts;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;

import ru.stdrone.sea.Game.Cycles.HotSeat;
import ru.stdrone.sea.R;

public class Password extends Layout {

    HotSeat _hsCycle;
    TextView _viewPwd;

    public Password(Activity activity, HotSeat hsCycle) {
        super(activity, R.id.lay_hs_password);
        _activity.findViewById(R.id.btn_hs_login).setOnClickListener(_setPassword);
        _hsCycle = hsCycle;
        _viewPwd = ((TextView) _activity.findViewById(R.id.txt_hs_password));
    }

    public void SetPasswordLabel(String label) {
        ((TextView) _activity.findViewById(R.id.lbl_hs_password)).setText(label);
    }

    @Override
    public void Hide() {
        super.Hide();
        _activity.findViewById(R.id.btn_hs_login).setOnClickListener(null);
    }

    public final View.OnClickListener _setPassword = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String password = _viewPwd.getText().toString();
            if(password == "") {

            }
            else {
                _hsCycle.setPassword(password);
                _viewPwd.setText("");
            }
        }
    };
}
