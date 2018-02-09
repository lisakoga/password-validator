package com.example.lizzie.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;


public class ExampleUnitTest
{
    @Test
    public void isPassword() throws Exception
    {
        assertEquals(false, Validator.pwCheck("password"));
    }
    @Test
    public void pwTooShort() throws Exception
    {
        assertEquals(false, Validator.pwCheck("qwert"));
    }
    @Test
    public void goodPW() throws Exception
    {
        assertEquals(true, Validator.pwCheck("ABCDEF&ghijk890"));
    }
}