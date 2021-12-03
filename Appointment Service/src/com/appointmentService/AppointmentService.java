package com.appointmentService;

import java.text.ParseException;
import java.util.*;

public class AppointmentService {

    private HashMap<String, List<String>> appointmentMap = new HashMap<>();

    public AppointmentService(){
        //this.appointmentMap = ;
    }

    public void addAppointment(String appointmentId, String appointmentDate, String apptDescription) throws ParseException {
        // checking if appointment ID is unique
        if(!appointmentMap.containsKey(appointmentId)){
            // validates the input
            Appointment appointment = new Appointment(appointmentId, appointmentDate, apptDescription);

            List<String> valueSet = Arrays.asList(appointment.getAppointmentDate(), appointment.getApptDescription());

            // adds the verified appointment ID and date to the map as a value pair from the object created
            getAppointmentMap().put(appointment.getAppointmentId(), valueSet);
        }
    }

    public void deleteAppointment(String appointmentId){
        getAppointmentMap().remove(appointmentId);
    }


    public HashMap<String, List<String>> getAppointmentMap() {
        return appointmentMap;
    }

    public void setAppointmentMap(HashMap<String, List<String>> appointmentMap) {
        this.appointmentMap = appointmentMap;
    }
}
