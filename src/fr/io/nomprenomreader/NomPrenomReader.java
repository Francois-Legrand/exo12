package fr.io.nomprenomreader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NomPrenomReader {
    private String nom;
    private String prenom;

    public NomPrenomReader() {

    }

    private static List<String> readFichier(String fichier) throws IOException {
        List<String> liste = new ArrayList<>();
        BufferedReader reader = null;
        try {

            reader = new BufferedReader(new FileReader(fichier));
            String ligne  = null;
            while((ligne = reader.readLine()) != null) {
                liste.add(ligne);
            }
        } catch (IOException e) {
           System.err.println("Erreur de lecture" + e.getMessage());
        } finally {
            if (reader != null){
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return liste;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public static List<String> readNom() throws IOException{

        return readFichier("nom.txt");

    }

    public static List<String> readPrenom() throws IOException{

        return readFichier("prenom.txt");

    }
}
