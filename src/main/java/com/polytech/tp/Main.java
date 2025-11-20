package com.polytech.tp;

public class Main {
    public static void main(String[] args) {
        // Création du gestionnaire
        GestionnaireEmploiDuTemps gestionnaire = new GestionnaireEmploiDuTemps();

        // Création des observateurs
        Etudiant etu1 = new Etudiant("Alice");
        Etudiant etu2 = new Etudiant("Bob");
        Responsable resp = new Responsable("Mme Dupont");

        // Attachement des observateurs
        gestionnaire.attach(etu1);
        gestionnaire.attach(etu2);
        gestionnaire.attach(resp);

        // Création d’un cours fictif
        ICours coursMaths = new Cours("Maths", "M. Martin", "Salle 101", "Lundi", "08:00", false, "Licence 1", true);

        // Ajouter un cours -> tous les observateurs sont notifiés
        gestionnaire.ajouterCours(coursMaths);

        // Modifier un cours -> notification aussi
        gestionnaire.modifierCours(coursMaths, "Changement de salle pour le cours de Maths");
    }
}
