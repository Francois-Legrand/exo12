package fr.io.nomprenomreader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
    NomPrenomReader nomPrenom = new NomPrenomReader();

        UtilisateurWriter.writeUtilisateur("ok",NomPrenomReader.readNom(),NomPrenomReader.readPrenom(), 50);
    }
}
