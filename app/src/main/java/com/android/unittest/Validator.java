package com.android.unittest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validator {

    //method
    public static boolean validateNumber(int number)
    {
        if(!(number<=0))
            return true;
        return false;
    }

    public static String[] existingUsers=new String[]{"abc","xyz"};

    static List<String> nameList = new ArrayList<>(Arrays.asList(existingUsers));

    public static boolean validateInput(String username, String password )
    {
        if(username.isEmpty() || password.isEmpty())
        {
            return false;
        }
        if(nameList.contains(username))
        {
        return false;
        }
        if(!(password.length()>=8 & password.length()<=15))
        {
        return false;
        }
        return true;

    }








}
