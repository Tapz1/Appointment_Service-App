package tests;

import com.company.TaskService;
import org.junit.jupiter.api.Assertions;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TaskServiceTest {
    TaskService taskService = new TaskService();

    @org.junit.jupiter.api.Test
    void addTask() {
        Assertions.assertAll("adding a task", () -> taskService.addTask(
                "001",
                "Check In",
                "First time appointment check-in"
        ));
    }

    @org.junit.jupiter.api.Test
    void deleteTask() {
        Assertions.assertAll("deleting task", () -> taskService.deleteTask("001"));
        assertNull(taskService.getTaskMap().get("001"));    // checks if task was deleted by checking if null
    }

    @org.junit.jupiter.api.Test
    void updateTask() {
        Assertions.assertAll("updating contact", ()-> taskService.updateTask(
                "002",
                "Check Out",
                "Client has appointment, now needs to check-out"
        ));
    }

    @org.junit.jupiter.api.Test
    void displayAllTasks() {
        for(Map.Entry<String, List<String>> entry : taskService.getTaskMap().entrySet()){
            String key = entry.getKey();
            List<String> values = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Value: " + values);
        }
    }
}