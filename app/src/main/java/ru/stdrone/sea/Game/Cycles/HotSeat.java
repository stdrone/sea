package ru.stdrone.sea.Game.Cycles;

import ru.stdrone.sea.Layouts.Password;
import ru.stdrone.sea.R;

public class HotSeat extends Cycle {

    private String _password1, _password2;
    Password _password;

    public void setPassword(String password) {
        if (_password1 == null) {
            _password1 = password;
            _password.SetPasswordLabel(_activity.getString(R.string.lbl_hs_password2));
        } else {
            _password2 = password;
            _password.Hide();
            Play();
        }
    }

    @Override
    public void SignUp() {
        _password = new Password(_activity, this);
        _password.SetPasswordLabel(_activity.getString(R.string.lbl_hs_password1));
        _password.Show();
    }
}
