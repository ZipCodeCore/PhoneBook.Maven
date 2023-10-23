package com.zipcodewilmington.phonebook;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GetAllContactNames {
    @Test
    public void test1() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Joe", "Jay", "John", "Jim"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }
        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }

    @Test
    public void test2() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Christopher", "Chris", "Christian",  "Christina"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }

        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }

    @Test
    public void test3() {
        // given
        PhoneBook phoneBook = new PhoneBook();
        String[] names = new String[]{"Aaron", "Ashley", "Albert", "Alfred"};
        for (int i = 0; i < names.length; i++) {
            String name = names[i];
            phoneBook.add(name, "");
        }
        // when
        List<String> actualNames = phoneBook.getAllContactNames();

        // then
        Assert.assertEquals(Arrays.asList(names), actualNames);
    }
}
