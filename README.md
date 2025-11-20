[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)
# TP : Design Patterns en Java

## IASD_25


## Objectif du TP
Ce TP a pour objectif de mettre en pratique trois design patterns classiques en Java :  

1. **Builder** : faciliter la création d’objets complexes (`CoursBuilder`).  
2. **Decorator** : ajouter dynamiquement des fonctionnalités à un objet (`CoursEnLigne`).  
3. **Observer** : notifier automatiquement les objets abonnés lors de changements (`GestionnaireEmploiDuTemps` et `Observer`).

---

## Contenu du TP
Le TP contient les éléments suivants :  

- `Cours` et `CoursBuilder` : implémentation du pattern **Builder**.  
- `CoursEnLigne` : implémentation du pattern **Decorator**.  
- `GestionnaireEmploiDuTemps` et `Observer` : implémentation du pattern **Observer**.  
- `TpTests.java` : tests unitaires fournis pour valider les exercices.  

---

## Exécution des tests

Tous les tests fournis dans `TpTests.java` ont été exécutés avec Maven et sont **passés avec succès**.


```bash
mvn test

# Résultat attendu

**Tests exécutés :** 3  
**Échecs :** 0  
**Erreurs :** 0  
**Tests ignorés :** 0  

**Statut des exercices :**  
- Exercice 1 (Builder)  
- Exercice 2 (Decorator) 
- Exercice 3 (Observer) 

**BUILD SUCCESS**

![Diagramme UML des design patterns](C:\Users\user\Pictures\Saved Pictures\uml_design_patterns.png)

# Analyse des principes de conception logicielle

- **Builder** : respecte **SRP (Single Responsibility Principle)** et facilite la création d’objets. 
- **Decorator** : respecte **OCP (Open/Closed Principle)** car on peut ajouter des fonctionnalités sans modifier la classe originale. 
- **Observer** : respecte globalement **SRP** et **OCP**, mais `GestionnaireEmploiDuTemps` cumule deux responsabilités (gestion des cours + notifications). Potentielle violation du **SRP**. 


# Conclusion

Le TP a permis d’appliquer concrètement les design patterns **Builder**, **Decorator** et **Observer**.  
Les tests sont tous réussis et le code est fonctionnel.  

Quelques améliorations pourraient être apportées pour **séparer complètement les responsabilités** du `GestionnaireEmploiDuTemps` afin de respecter pleinement le principe **SRP**.


