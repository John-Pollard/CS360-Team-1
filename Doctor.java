import java.util.ArrayList;
public class Doctor extends Person{

    ArrayList<String> patients = new ArrayList<String>();

    public ArrayList<String> getPatients(){
        return patients;
    }

    public void writeRx(Patient patient, String notes){
        //email patient prescription information
    }
}
