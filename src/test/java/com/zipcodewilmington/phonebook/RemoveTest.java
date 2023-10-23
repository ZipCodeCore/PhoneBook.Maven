package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveTest {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "John";
        String phoneNumber = "302-555-4545";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name, phoneNumber));

        Map<String, List<String>> demoPhonebook = phoneBook.getMap();
        PhoneBook newPhoneBook = new PhoneBook(demoPhonebook);

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String phoneNumber = "302-554-4545";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name, phoneNumber));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }


    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Smith";
        String phoneNumber = "302-554-4535";
        phoneBook.add(name, phoneNumber);
        Assert.assertTrue(phoneBook.hasEntry(name, phoneNumber));

        // when
        phoneBook.remove(name);

        // then
        Assert.assertFalse(phoneBook.hasEntry(name));
    }
}
