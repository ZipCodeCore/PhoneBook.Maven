package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class AddAllTest {


    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
                "302-555-1111",
        };

        String bracketRemover = Arrays.toString(phoneNumbers)
                .replace("[", "")
                .replace("]", "")
                .trim();

        // when
        phoneBook.addAll(name, bracketRemover);
        List<String> actualPhoneNumbers = phoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(bracketRemover), actualPhoneNumbers);
    }



    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-5555",
                "302-555-4444",
                "302-555-3333",
                "302-555-2222",
        };

        String bracketRemover = Arrays.toString(phoneNumbers)
                .replace("[", "")
                .replace("]", "")
                .trim();

        // when
        phoneBook.addAll(name, bracketRemover);
        List<String> actualPhoneNumbers = phoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(bracketRemover), actualPhoneNumbers);
    }


    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String name = "Joe";
        String[] phoneNumbers = {
                "302-555-1212",
                "302-555-3434",
                "302-555-4545",
                "302-555-5656",
        };

        String bracketRemover = Arrays.toString(phoneNumbers)
                .replace("[", "")
                .replace("]", "")
                .trim();

        // when
        phoneBook.addAll(name, bracketRemover);
        List<String> actualPhoneNumbers = phoneBook.lookup(name);
        Assert.assertEquals(Arrays.asList(bracketRemover), actualPhoneNumbers);
    }
}
