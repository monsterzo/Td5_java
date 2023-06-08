import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class Patient{
    private String nom ;
    private String prenom ;
    private LocalDate naissance ;
    public LocalDate getNaissance() {
        return naissance;
    }

    private String telephone ;
    private String adresse ;
    private ArrayList<Traitement> traitements;
    private ArrayList<AnalyseBiologie> AnalyseBiologie;
    private ArrayList<Lesion> Lesions; 
    public ArrayList<Lesion> getLesions() {
        return Lesions;
    }

    private ArrayList<Sejour> Sejour;
    private Medecin medecin;
    public ArrayList<Sejour> getSejour() {
        return Sejour;
    }
    public Patient(String nom, String prenom, LocalDate naissance, String telephone, String adresse,
            ArrayList<AnalyseBiologie> analyseBiologie, ArrayList<Lesion> lesions, ArrayList<Sejour> sejour) {
        this.nom = nom;
        this.prenom = prenom;
        this.naissance = naissance;
        this.telephone = telephone;
        this.adresse = adresse;
        AnalyseBiologie = analyseBiologie;
        this.Lesions = lesions;
        Sejour = sejour;

    }
//  public Patient rechercherParNom(String nom){
    
//  }
public ArrayList<Sejour> getSejours(){

    ArrayList<Sejour> S = new ArrayList<>();
    for(int i=0;i<Sejour.size();i++){
       S.add(i, Sejour.get(i));
    }
    //trie par date admie
    for(int i=0;i<Sejour.size();i++){
        for(int j=0;j<Sejour.size();j++){
            if(Sejour.get(i).getDateAdmie().isBefore(Sejour.get(j).getDateAdmie())){
                //swap
                Sejour temp = S.get(i);
                S.set(i, S.get(j));
                S.set(j, temp);
                }
        }

    }
    return S;
}

//age patient
public int age(){
    LocalDate now=LocalDate.now();
    return  Period.between(now, naissance).getYears();
}

//liste des analyses biologie triee par date
public ArrayList<AnalyseBiologie> getAnalyseBiologie(){
    ArrayList<AnalyseBiologie> analyses = new ArrayList<>();
    for(int i=0;i<AnalyseBiologie.size();i++){
        analyses.add(i, AnalyseBiologie.get(i));    
        }
        //trie par date admie
        for(int i=0;i<analyses.size();i++){
            for(int j=0;j<analyses.size();j++){
                if(analyses.get(i).getDate().isBefore(analyses.get(j).getDate())){
                    //swap
                    AnalyseBiologie temp = analyses.get(i);
                    analyses.set(i, analyses.get(j));
                    analyses.set(j, temp);
                }
            }
    }
    return analyses;
}
public void setNom(String nom) {
    this.nom = nom;
}
public void setPrenom(String prenom) {
    this.prenom = prenom;
}
public void setNaissance(LocalDate naissance) {
    this.naissance = naissance;
}
public void setTelephone(String telephone) {
    this.telephone = telephone;
}
public void setAdresse(String adresse) {
    this.adresse = adresse;
}

//recuperer la liste des lesion triee par taille ou type
public ArrayList<Lesion> getLesion(){
    ArrayList<Lesion> lesions = new ArrayList<>();
    for(int i=0;i<Lesions.size();i++){
        lesions.add(i, Lesions.get(i));
    }
        //trie par taille ou type
        for(int i=0;i<lesions.size();i++){
            for(int j=0;j<lesions.size();j++){
                if(lesions.get(i).getTaille()<lesions.get(j).getTaille()){
                    //swap
                    Lesion temp = lesions.get(i);
                    lesions.set(i, lesions.get(j));
                    lesions.set(j, temp);
                }else{
                if(lesions.get(i).getTaille()==lesions.get(j).getTaille()){
                    //compare type
                    if(lesions.get(i).getType().compareTo(lesions.get(j).getType())<0){
                    //swap
                    Lesion temp = lesions.get(i);
                    lesions.set(i, lesions.get(j));
                    lesions.set(j, temp);
                    }
                    }
                }
            }
        }
        return lesions;
    }  
public void affichetStatistiques(){
    System.out.println("Le nombre des analyses : " + AnalyseBiologie.size());
    System.out.println("Le nombre des Sejour : " + Sejour.size());
    System.out.println("Le nombre des Lesions : " + Lesions.size());
}          

public ArrayList<Medecin> getMedecins(){
    ArrayList<Medecin> M = new ArrayList<>();
    M.add(medecin);
    for(int i=0;i<Sejour.size();i++){
        M.add(Sejour.get(i).getMedecin());
    }
    for(int i=0;i<traitements.size();i++){
        M.add(traitements.get(i).getMedecin());
    }
    traitements.sort(Comparator.comparing(Patient::getNaissance);
}
//sorte la  date  par la fontion sorte








