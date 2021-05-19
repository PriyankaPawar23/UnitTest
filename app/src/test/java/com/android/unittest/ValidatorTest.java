package com.android.unittest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import com.google.common.truth.*;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ValidatorTest {


    @Test
    public void WhenUsernameIsEmpty()
    {
        boolean result =Validator.validateInput("","23456789");
        assertEquals(false,result);
    }
    @Test
    public void WhenPasswordIsEmpty()
    {
          boolean result =Validator.validateInput("pqr","");
           assertEquals(false,result);
    }

    @Test
    public void WhenPasswordLengthShort()
    {
        boolean result =Validator.validateInput("pqr","123");
        assertEquals(false,result);
    }

    @Test
    public void WhenPasswordLengthExceed()
    {
        boolean result =Validator.validateInput("","123abcd858");
        assertEquals(false,result);
    }

    @Test
    public void WhenAllInputValid()
    {
        boolean result =Validator.validateInput("pqr","123abcd8");
        assertEquals(true,result);
    }

    @Test
    public void WhenExsitingUser()
    {
        boolean result =Validator.validateInput("pqr","123abcd8");
        assertEquals(false,result);
    }



}