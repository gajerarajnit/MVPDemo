package mvpdemo.rajnit.com.mvpblogdemo.data.preferences;

import android.support.annotation.Keep;

import java.util.List;

import mvpdemo.rajnit.com.mvpblogdemo.data.models.UserModel;

@Keep
public interface UserPreferences {

    String USERS_LIST = "USERS_LIST";

    public void setUserList(UserModel userModel);

    public List<UserModel> getUserList();

    public void clearUser();
}
