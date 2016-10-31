package com.mainservlet.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidationData {
    Pattern pattern;
    Matcher matcher;

    public boolean checkLogin(String userName){
        String regexUserName = "^[a-zA-Z0-9_.]{3,20}";
        pattern = Pattern.compile(regexUserName);
        matcher = pattern.matcher(userName);
        if(matcher.matches())
            return true;
        else return false;
    }

    public boolean checkPassword(String userPass) {
        String regexUserPass = "[a-zA-Z0-9.]{6,}";
        pattern = Pattern.compile(regexUserPass);
        matcher = pattern.matcher(userPass);
        if (matcher.matches())
            return true;
        else return false;
    }
    public boolean checkEmail(String userMail) {
        String regexUserMail = "([a-zA-Z0-9_.]+)([@])([a-zA-Z]+\\.){1,2}([a-z]{2,})";
        pattern = Pattern.compile(regexUserMail);
        matcher = pattern.matcher(userMail);
        if (matcher.matches())
            return true;
        else return false;
    }
}
