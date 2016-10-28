package com.mainservlet.model;

public class UserAddSystem {
    protected String userName;
    protected String password;
    protected String email;


    public UserAddSystem() {
    }

    public UserAddSystem(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public boolean readyForBuild(UserAddSystem user){
        if(getUserName() !=null && getPassword() != null && getEmail() != null
                 && !getUserName().equals("") && !getPassword().equals("")
                && !getEmail().equals(""))
        {
            return true;
        }
        else  return false;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
