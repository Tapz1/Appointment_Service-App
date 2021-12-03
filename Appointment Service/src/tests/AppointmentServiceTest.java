package tests;

import com.appointmentService.Appointment;
import com.appointmentService.AppointmentService;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppointmentServiceTest {
    AppointmentService appointmentService;

    @Test
    void addAppointment() {
        Assertions.assertAll("adding appointment", () -> new AppointmentService().addAppointment(
                "12",
                "12/25/2021",
                "Check Up"));
    }

    @Test
    void deleteAppointment() {
        Assertions.assertAll("deleting appointment", () -> new AppointmentService().deleteAppointment(
                "12"));
    }
}