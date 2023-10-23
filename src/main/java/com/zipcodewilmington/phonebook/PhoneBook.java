package com.zipcodewilmington.phonebook;

import java.util.*;

public class PhoneBook {

    private final Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {
        this.phonebook = null;
    }

    HashMap<String, String> hashMap = new HashMap<String, String>();

    HashMap<String, String[]> hashMap2 = new HashMap<String, String[]>();

    Map<String, List<String>> multiMap = new HashMap<String, List<String>>();

 //   Map<String, ArrayList<String[]>> multiMap = new HashMap<>();

//    Map<String, List<String>> multiMap = new HashMap<String, List<String>>();

    public PhoneBook() {
        this(null);
    }

    public void add(String name, String phoneNumber) {
                  // key, value
        hashMap.put(name, phoneNumber);

    }

    public void addAll(String name, String... phoneNumbers) {

        String formattedString = Arrays.toString(phoneNumbers)
                .replace("[", "")
                .replace("]", "")
                .trim();
        hashMap.put(name, formattedString);

    }


    public void remove(String name) {

        hashMap.remove(name);

    }

    public Boolean hasEntry(String name) {

        if (hashMap.containsKey(name)) {

 //           System.out.println("Located!");
            return true;

        } else {
            
//            System.out.println("This isn't a name in the phonebook!");
            return false;
            
        }

    }

    public List<String> lookup(String name) {

       return Arrays.asList(hashMap.get(name));

    }

    public String reverseLookup(String phoneNumber)  {

        for (HashMap.Entry<String, String> entry : hashMap.entrySet()) {

            if (phoneNumber.equals(entry.getValue())) {
                String key = entry.getKey();
                return key;
            }
        }

        return null;
    }

    public List<String> getAllContactNames() {

        List<String> contactNames = new ArrayList<>();

        contactNames.addAll(hashMap.keySet());

            return contactNames;
    }

    public Map<String, List<String>> getMap() {

        Map<String, List<String>> myMaps = new HashMap<String, List<String>>();
        for (HashMap.Entry<String, String> entry : hashMap.entrySet()) {

        String key = entry.getKey();
        String value = entry.getValue();

        if (!myMaps.containsKey(key)) {
            myMaps.put(key, new LinkedList<String>());
            myMaps.get(key).add(value);
        }

      }
        return myMaps;
    }

    @Override
    public String toString() {
        return "PhoneBook: " +  hashMap;
    }

}
