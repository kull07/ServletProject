package com.mainservlet.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidationData {
    Pattern pattern;
    Matcher matcher;

    public boolean checkLogin(String userName){
        String regexUserName = "[a-zA-Z0-9_//.]";
        pattern = Pattern.compile(regexUserName);
        matcher = pattern.matcher(userName);
        if(matcher.equals(true))
            return true;
        else return false;
    }

    public boolean checkPassword(String userName) {
        String regexUserName = "[a-zA-Z0-9]{6,}";
        pattern = Pattern.compile(regexUserName);
        matcher = pattern.matcher(userName);
        if (matcher.equals(true))
            return true;
        else return false;
    }
    public boolean checkEmail(String userName) {
        String regexUserName = "(^[a-zA-Z_0-9_//.])([@]*?)([a-zA-Z]//.)([a-z]{0,3})";
        pattern = Pattern.compile(regexUserName);
        matcher = pattern.matcher(userName);
        if (matcher.equals(true))
            return true;
        else return false;
    }
}
