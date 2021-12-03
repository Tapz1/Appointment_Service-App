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
    private Date schedDate; // variable use to convert string date from input into a Date type
    //DateFormat df = DateFormat.getDateInstance(DateFormat.LONG);
    public SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");



    public Appointment(String appointmentId, String appointmentDate, String apptDescription) throws ParseException {
        //this.schedDate = dateFormat.parse(appointmentDate); // date being input

        if(appointmentId.length() > 10 || appointmentId == null){
            throw new IllegalArgumentException("Invalid ID!");
        }
        if(dateFormat.parse(appointmentDate).before(this.date) || appointmentDate == null){
            throw new IllegalArgumentException("Invalid Date!");
        }
        if(apptDescription.length() > 50 || apptDescription == null){
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
