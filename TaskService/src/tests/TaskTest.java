package tests;

import com.company.Task;
import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {

    @org.junit.jupiter.api.Test
    void testTaskClass() {
        Task task = new Task("001", "Check In", "First time appointment check-in");
        assertEquals("001", task.getTaskId());
        assertEquals("Check In", task.getTaskName());
        assertEquals("First time appointment check-in", task.getTaskDescription());
    }


    @org.junit.jupiter.api.Test
    void testTaskClassTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Task("1234567891", "Client needs to check in",
                    "Client is coming in for an appointment and needs " +
                            "to check in as soon as they get here. Their name is Chris Tapia. " +
                            "Client is coming in for an appointment and needs " +
                            "to check in as soon as they get here. Their name is Chris Tapia. ");
        });
    }

    @org.junit.jupiter.api.Test
    void testTaskClassNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Task(null, null,
                    null);
        });
    }

}