package ru.stdrone.sea.Game.Cycles;

import android.view.View;
import android.widget.TextView;

import ru.stdrone.sea.Layouts.Password;
import ru.stdrone.sea.R;

public class Hotseat extends Cycle {

    private String _password1, _password2;
    Password _password;

    public final View.OnClickListener _setPassword = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            TextView view = ((TextView) _activity.findViewById(R.id.txt_hs_password));
            String password = view.getText().toString();
            if (password == "") {

            } else {
                if (_password1 == null) {
                    _password1 = password;
                    _password.SetPasswordLabel(_activity.getString(R.string.lbl_hs_password2));
                    view.setText("");
                } else {
                    _password2 = password;
                    Play();
                }
            }
        }
    };

    @Override
    public void SignUp() {
        _password = new Password(_activity, R.id.lay_hs_password);
        _password.SetPasswordLabel(_activity.getString(R.string.lbl_hs_password1));
        _password.Show();
    }
}
