import java.util.ArrayList;
public class Doctor extends Person{

    ArrayList<String> patients = new ArrayList<String>();

    public ArrayList<String> getPatients(){
        return patients;
    }

    public void writeRx(Patient patient, String prescription, String instructions, String notes){
        Email.emailRx(patient.getFname, patient.getEmail, prescription, instructions, notes);
    }
}
