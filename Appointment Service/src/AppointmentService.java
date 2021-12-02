import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class AppointmentService {
    Appointment appointment;
    private HashMap<String, Date> appointmentMap;

    public AppointmentService(){
        this.appointmentMap = new HashMap<>();
    }

    public void addAppointment(String appointmentId, Date appointmentDate){
        // checking if appointment ID is unique
        if(!appointmentMap.containsKey(appointmentId)){
            new Appointment(appointmentId, appointmentDate);

            List<String, Date> valueSet = Arrays.asList(appointment.getAppointmentId(), appointmentDate);
        }
    }

    public void deleteAppointment(){

    }


    public HashMap<String, Date> getAppointmentMap() {
        return appointmentMap;
    }

    public void setAppointmentMap(HashMap<String, Date> appointmentMap) {
        this.appointmentMap = appointmentMap;
    }
}
