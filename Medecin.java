import java.util.ArrayList;

public class Medecin {
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String specialite;
    private ArrayList<Traitement> traitement;
    private ArrayList<AnalyseBiologie> AnalyseBiologie=new ArrayList<>() ;
    private ArrayList<Lesion> lesions=new ArrayList<>() ;
    private ArrayList<Sejour> sejour=new ArrayList<>() ;
    private ArrayList<Patient> patient=new ArrayList<>() ;
//recuperer la liste de toute les analyses biologie  par un medecin trie par date

public ArrayList<AnalyseBiologie> getAnalyseBiologie() {
    return AnalyseBiologie;
    }
//afficher un medecin + le nombre d'analyses biologie + le nombre de sejours  
public String toString() {
    return nom + " " + prenom + " adresse: " + adresse + " telephone: " + telephone + " specialite: " + specialite + " nombre d'analyses biologie: " + AnalyseBiologie.size() +
    " nombre de sejours: " + sejour.size();
    }
   
}
