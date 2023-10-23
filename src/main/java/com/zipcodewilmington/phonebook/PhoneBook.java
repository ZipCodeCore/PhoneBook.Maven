package com.zipcodewilmington.phonebook;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = map;
    }

    public PhoneBook() {
        this.phonebook = new LinkedHashMap<String, List<String>>();
    }

    public void add(String name, String phoneNumber) {
        phonebook.put(name,new ArrayList<String>());
        phonebook.get(name).add(phoneNumber);
    }

    public void addAll(String name, String... phoneNumbers) {
        phonebook.put(name, Arrays.asList(phoneNumbers));

    }

    public void remove(String name) {
        phonebook.remove(name);
    }

    public Boolean hasEntry(String name) {
        if(phonebook.containsKey(name)){
            return true;
        }

        return false;
    }
    public Boolean hasEntry(String name, String string) {
        if(phonebook.containsKey(name)){
            return true;
        }
        return false;
    }

    public List<String> lookup(String name) {
        return phonebook.get(name);
    }

     public String reverseLookup(String phoneNumber)  {
         String list = "";
         for(String key: phonebook.keySet()){
             if(phonebook.get(key).equals(phoneNumber)) {
                 list = list.concat(key);
                 return list;
             }
         }
         return null;
    }

    public List<String> getAllContactNames() {
        LinkedHashMap<String, List<String>> newMap = new LinkedHashMap<String, List<String>>();
        newMap.putAll(phonebook);
        return new ArrayList<String>(newMap.keySet());
    }

    public Map<String, List<String>> getMap() {
        return phonebook;
    }
}
