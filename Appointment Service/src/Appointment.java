/*

 */
import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Date appointmentDate;
    private Date date;


    public Appointment(String appointmentId, Date appointmentDate){
        if(appointmentId.length() > 10 || appointmentId == null){
            throw new IllegalArgumentException("Invalid ID!");
        }
        if(date.before(appointmentDate) || appointmentDate == null){
            throw new IllegalArgumentException("Invalid Date!");
        }
        this.appointmentId = appointmentId;
        this.appointmentDate = appointmentDate;
        this.date = new Date();

    }

    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }
}
