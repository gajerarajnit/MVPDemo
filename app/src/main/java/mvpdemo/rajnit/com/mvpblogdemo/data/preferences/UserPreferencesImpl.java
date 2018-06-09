package mvpdemo.rajnit.com.mvpblogdemo.data.preferences;

import android.content.SharedPreferences;

import java.util.ArrayList;
import java.util.List;

import mvpdemo.rajnit.com.mvpblogdemo.data.models.UserModel;

public class UserPreferencesImpl implements UserPreferences {

    protected SharedPreferences mPreferences;
    private String ASK_COUNT = "ask_count";

    public UserPreferencesImpl() {
        mPreferences = PreferencesProvider.providePreferences();
    }

    @Override
    public List<UserModel> getUserList() {
        String userListString = mPreferences.getString(USERS_LIST, "");
        return new ArrayList<>();
    }

    @Override
    public void setUserList(UserModel userModel) {
        mPreferences.edit().putString(USERS_LIST, userModel.toString()).apply();
    }

    @Override
    public void clearUser() {
        mPreferences.edit().putString(USERS_LIST, "").apply();
    }

}
