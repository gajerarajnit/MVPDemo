package mvpdemo.rajnit.com.mvpblogdemo.data.models;

/**
 * Created by MVPBlogDemo on 09/06/18.
 */

public class UserModel {

    private String username;
    private String password;
    private String date;

    public UserModel(String username, String password, String date) {
        this.username = username;
        this.password = password;
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
