package fr.io.nomprenomreader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class UtilisateurWriter {
    public static void writeUtilisateur(String fichier, List<String> nom, List<String> prenom, int nb) throws IOException {
        try {

            // Recevoir le fichier
            File f = new File(fichier+".txt");

            // Créer un nouveau fichier
            // Vérifier s'il n'existe pas
            if (f.createNewFile())
                System.out.println("File created");
            else
                System.out.println("File already exists");
        }
        catch (Exception e) {
            System.err.println(e);
        }
        BufferedWriter writer = null;
        try {

            writer = new BufferedWriter(new FileWriter(fichier+".txt"));
            Random ran = new Random();
            // Print next int value
            // Returns number between 0-9


            for (int i = 0; i < nb; i++) {
                int randNom = ran.nextInt(233);
                int randPrenom = ran.nextInt(150);
                writer.write((i+1)+": Mr "+nom.get(randNom)+ prenom.get(randPrenom));
                writer.newLine();
            }
            //writer.write("A la date du " + new Date());
            //

        } catch (IOException e) {
            System.err.println("erreur d'écriture: " + e.getMessage());
        } finally {
            if (writer != null) {
                try { writer.close(); } catch (IOException e) { e.printStackTrace(); }
            }
        }

    }
}
