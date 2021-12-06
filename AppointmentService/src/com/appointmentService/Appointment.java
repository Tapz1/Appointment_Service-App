package com.appointmentService;/*

 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Appointment {
    private String appointmentId;
    private String appointmentDate;
    private String apptDescription;
    private Date date = new Date(); // generates the current date
    public SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");



    public Appointment(String appointmentId, String appointmentDate, String apptDescription) throws ParseException {

        if(appointmentId == null || appointmentId.length() > 10){
            throw new IllegalArgumentException("Invalid ID!");
        }
        if(appointmentDate == null || dateFormat.parse(appointmentDate).before(this.date)){
            throw new IllegalArgumentException("Invalid Date!");
        }
        if(apptDescription == null || apptDescription.length() > 50){
            throw new IllegalArgumentException("Invalid appointment description!");
        }
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.apptDescription = apptDescription;

    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    public String getApptDescription() {
        return apptDescription;
    }

    public void setApptDescription(String apptDescription) {
        this.apptDescription = apptDescription;
    }
}
