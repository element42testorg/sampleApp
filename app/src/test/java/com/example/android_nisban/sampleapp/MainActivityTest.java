package com.example.android_nisban.sampleapp;

import org.junit.Test;

import static com.example.android_nisban.sampleapp.MainActivity.isValidEmail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Android_nisban on 4/5/2019.
 */
public class MainActivityTest {
    @Test
    public void isValidEmailID() throws Exception {
        assertTrue("with simple mail", isValidEmail("name@email.com"));
    }

    @Test
    public void isValidEmailID1() throws Exception {
        assertFalse("Empty mail id", isValidEmail(""));
    }

    @Test
    public void isValidEmailID2() throws Exception {
        assertTrue("With Sub Domain", isValidEmail("name@email.co.in"));
    }

    @Test
    public void isValidEmailID3() throws Exception {
        assertFalse("No Username", isValidEmail("@email.com"));
    }

    @Test
    public void isValidEmailID4() throws Exception {
        assertFalse("Null", isValidEmail("hghgh"));
    }
}
