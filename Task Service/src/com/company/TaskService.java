package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskService {

    private HashMap<String, List<String>> taskMap = new HashMap<>();

    public TaskService() {

    }

    public HashMap<String, List<String>> getTaskMap() {
        return taskMap;
    }

    public void addTask(String taskId, String taskName, String taskDescription) {
        // checks to see if task ID is unique
        if (!taskMap.containsKey(taskId)) {
            new Task(
                    // input validation
                    taskId,
                    taskName,
                    taskDescription
            );

            // adds the task to the HashMap "database"
            List<String> valueSet = Arrays.asList(
                    taskId,
                    taskName,
                    taskDescription
            );
            taskMap.put(taskId, valueSet);  // maps out the key (taskId) to the valueSet(taskName & taskDescription

        } else {
            System.out.println("That task ID is already in use!");
        }

    }

    public void deleteTask(String taskId){
        getTaskMap().remove(taskId);
    }

    public void updateTask(String taskId, String taskName, String taskDescription){
        // this method updates the task info by task ID
        List<String> valueSet = Arrays.asList(
                taskId,
                taskName,
                taskDescription
        );
        taskMap.put(taskId,valueSet);
    }

    public void displayAllTasks(){
        for(Map.Entry<String, List<String>> entry : getTaskMap().entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + values);
        }
    }
}
