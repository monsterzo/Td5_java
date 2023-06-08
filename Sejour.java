import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sejour {
    
    private LocalDateTime dateSortie;
    private LocalDateTime dateAdmie;
    private String service;
    private Medecin medecin;
    private ArrayList<Deratoscopie> deratoscopies;
    private ArrayList<Traitement> traitement;
    public LocalDateTime getDateSortie() {
        return dateSortie;
    }
    public LocalDateTime getDateAdmie() {
        return dateAdmie;
    }
    
    

}
