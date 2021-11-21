package com.company;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TaskService taskService = new TaskService();
        try {
            taskService.addTask(
                    "001",
                    "Check In",
                    "First time appointment check-in"
                    );
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println("All tasks:");
        for(Map.Entry<String, List<String>> entry : taskService.getTaskMap().entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + values);
        }
    }
}
