package com.zipcodewilmington.phonebook;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class PhoneBook {

    //the below defines what kind of attribute you have, which in this case is your "contacts"
    Map<String, Person> personMap;

    //this is your constructor. whenever you see public + the classname, that is your constructor
    //
    // (this phoneBook constructor is like the "cover" of your phonebook (the binding and the spine). it creates an empty book.)

    //this can make as many phonebook objects as you want
    public PhoneBook() {

        //when we make our phonebooks, this is the form they will take (below)
        //
        // this treeMap initializes the "blank pages of the book". the treemap is the structure of how your book will hold info

        //if you were to not set this, your person map would be null(default setting)
        this.personMap = new TreeMap<String, Person>();
    }

    // this is our method below. it describes what we can do with this phonebook

    //so later, when you call "phonebook.add", that's like someone literally writing a new name and number in your phonebook object
    public void add(String name, String number){
        this.personMap.put(name, new Person(name, number));
    }

    /*
    //this method would really be better for if you need more information on your person objects (like address, etc).

    public void add(Person person){
        this.personMap.put(person.getName(), person);
    }

    */

    public Person lookup(String name) {

       return personMap.get(name);

    }

    public String reverseLookup (String phoneNumber){

        //this will "grab" all the listings in your book. it does NOT print them.
        Set<Map.Entry<String, Person>> entries = personMap.entrySet();

        for (Map.Entry<String, Person> phoneBookEntry : entries) {

            Person person = phoneBookEntry.getValue();

            if (person.getPhoneNumber().equals(phoneNumber)){
                return phoneBookEntry.getKey();
            }
        }

       return "We're sorry. The requested phone number could not be found. Have fun when you code!!!!!!!!";

    }

}

