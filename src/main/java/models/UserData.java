package models;

import java.util.List;

public class UserData
{
    private String user;
    private String password;
    private Boolean answer;

    public UserData(String user, String password, Boolean answer) {
        this.user = user;
        this.password = password;
        this.answer = answer;
    }


    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAnswer() {
        return answer;
    }

    public void setAnswer(Boolean answer) {
        this.answer = answer;
    }
}
