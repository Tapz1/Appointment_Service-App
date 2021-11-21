package com.contactService;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ContactService contactService = new ContactService();
        try {
            contactService.addContact(
                    "222",
                    "Colonel",
                    "Sanders",
                    "6035554224",
                    "226 Wallaby Way");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("All contacts:");
        for(Map.Entry<String, List<String>> entry : contactService.getContactMap().entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + values);
        }
    }
}
