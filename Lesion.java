import java.util.ArrayList;

public class Lesion {
    private String localisation;
    private int taille;
    private String type;
    private Patient patient;
    private ArrayList<Deratoscopie> deratoscopies;
    public String getLocalisation() {
        return localisation;
    }
    public int getTaille() {
        return taille;
    }
    public String getType() {
        return type;
    }
    public Patient getPatient() {
        return patient;
    }
    public ArrayList<Deratoscopie> getDeratoscopies() {
        return deratoscopies;
    }
    
}
