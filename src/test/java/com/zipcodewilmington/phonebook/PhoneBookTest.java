package com.zipcodewilmington.phonebook;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

/**
 * Created by leon on 1/23/18.
 */
public class PhoneBookTest {

    PhoneBook testPb;

    @Before
    public void setUp() {
        testPb = new PhoneBook();
    }

    @Test
    public void addTest() {
        testPb.add("Abby", "1234567899");
        String expectValue = testPb.retrieveByName("Abby");
        Assert.assertEquals(expectValue, "1234567899");
    }

    @Test
    public void deleteNameAndNumberTest() {
        testPb.add("Bob", "9999999999");
        testPb.delete("Bob");
        String expectValue = testPb.retrieveByName("Bob");
        Assert.assertEquals(expectValue, null);
    }

    @Test
    public void retrieveByNameTest() {
        testPb.add("Charles", "9879879877");
        String expectValue = testPb.retrieveByName("Charles");
        Assert.assertEquals(expectValue, "9879879877");
    }

    @Test
    public void retrieveByNumberTest() {
        testPb.add("Jen", "9879879877");
        String expectValue = testPb.retrieveByPhoneNumber("9879879877");
        Assert.assertEquals(expectValue, "Jen");
    }

    @Test
    public void listAllNamesTest() {
        testPb.add("Abby", "9999999999");
        testPb.add("Bob", "8888888888");
        testPb.add("Charles", "7777777777");
        testPb.add("Dwight", "5555555555");
        String actual = testPb.listAllNames();
        String expected = "Abby\nBob\nCharles\nDwight";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void listAllNamesAndNumbersTest() {
        testPb.add("Abby", "9999999999");
        testPb.add("Bob", "8888888888");
        testPb.add("Charles", "7777777777");
        testPb.add("Dwight", "5555555555");
        String actual = testPb.listAllNamesAndNumbers();
        String expected = "Abby 9999999999\nBob 8888888888\nCharles 7777777777\nDwight 5555555555";
        Assert.assertEquals(expected, actual);

    }
}