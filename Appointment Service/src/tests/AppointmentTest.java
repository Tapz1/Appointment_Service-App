package tests;

import com.appointmentService.Appointment;
import org.junit.jupiter.api.Assertions;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentTest {

    @org.junit.jupiter.api.Test
    void testAppointmentClass() throws ParseException {
        Appointment appointment = new Appointment("001","12/25/2022", "Routine check-up");
        assertEquals("001", appointment.getAppointmentId());
        assertEquals("12/25/2021", appointment.getAppointmentDate());
        assertEquals("Routine check-up", appointment.getApptDescription());
    }

    @org.junit.jupiter.api.Test
    void testAppointmentClassTooLong() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Appointment("12345678911", "12/25/2021",
                    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec et mauris faucibus, viverra metus eu, ornare augue. Suspendisse volutpat nisi a augue viverra, vitae vehicula libero posuere. Sed convallis, lacus id sodales venenatis, eros tellus convallis nisl, a venenatis leo massa molestie mi. Phasellus elementum elit id quam mattis semper. Pellentesque aliquet lorem eu orci interdum facilisis. Maecenas enim ipsum, vulputate at sollicitudin ac, ultricies nec felis. Integer consectetur eu lectus ac ultrices. Sed egestas diam sed odio tempus fermentum. Aenean ut efficitur neque.");
        });
    }

    @org.junit.jupiter.api.Test
    void testAppointmentClassNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Appointment(null, null,
                    null);
        });
    }

    @org.junit.jupiter.api.Test
    void testDateInPastNull() {
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            new Appointment("001", "11/12/2021",
                    "Lorem ipsum");
        });
    }
}