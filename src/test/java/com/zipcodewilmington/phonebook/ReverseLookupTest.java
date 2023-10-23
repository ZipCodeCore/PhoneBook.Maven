package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLookupTest {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }


    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String expectedName = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(expectedName, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(expectedName));

        // when
        String actualName = phoneBook.reverseLookup(phoneNumber);

        // then
        Assert.assertEquals(expectedName, actualName);
    }
}
