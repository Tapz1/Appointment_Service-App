package com.appointmentService;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        AppointmentService appointmentService = new AppointmentService();
        appointmentService.addAppointment("001", "12/21/2021", "Routine check-up");

        System.out.println(appointmentService.getAppointmentMap().get("001"));
    }
}
