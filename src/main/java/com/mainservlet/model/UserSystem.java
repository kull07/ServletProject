package com.mainservlet.model;

public class UserSystem {
    protected String user;
    protected String password;
    protected String email;
    protected String address;
    protected String phone;

    public UserSystem() {
    }

    public boolean createdOK(UserSystem user){
        if(getUser() !=null && getPassword() != null && getEmail() != null
                && getAddress() != null && getPhone() !=null && !getUser().equals("") && !getPassword().equals("")
                && !getEmail().equals("")
                && !getAddress().equals("") && !getPhone().equals("")){
                    return true;
        }
        else  return false;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
