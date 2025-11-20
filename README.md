[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/rGfOobSC)
# TP 2 Génie Logiciel : Design Patterns
## Gestion de l'Emploi du Temps

**Nom et prénom** : ESSELMA Abderrahmane  
**Groupe** : IASD

---

### Résultat des tests automatiques (TpTests.java)

![Tests 100% Passed](target\1.png)
> **Tous les tests sont passés avec succès : 3/3**  
> Builder ✓ Decorator ✓ Observer ✓

---

### Contexte

Vous êtes chargé de développer le module de gestion des séances de cours. Le système actuel manque de souplesse. Votre objectif est de le rendre **modulaire** et **évolutif** en utilisant trois **patterns de conception (Design Patterns)** : **Builder**, **Observer**, et **Decorator**.

---

### Exercice 1 : Construction complexe (Pattern Builder)

La classe `Cours` possède de nombreux attributs (matière, enseignant, salle, date, heure, optionnel, matériel requis, etc.). Actuellement, son constructeur est énorme et illisible.

**Tâche réalisée :**
- Implémentation du **Builder Pattern** pour faciliter la création fluide et sûre d'objets `Cours`.
- Seuls `matière` et `enseignant` sont obligatoires → les autres ont des valeurs par défaut intelligentes.
- Exemple d'utilisation : `new CoursBuilder().setMatiere("...").setEnseignant("...").build()`

---

### Exercice 2 : Notification de changement (Pattern Observer)

L’emploi du temps change souvent. Lorsqu’un cours est modifié ou annulé, les étudiants inscrits et le responsable pédagogique doivent être notifiés automatiquement.

**Tâche réalisée :**
- Implémentation complète du **Pattern Observer**
- `GestionnaireEmploiDuTemps` implémente `Subject`
- `Etudiant` et `Responsable` implémentent `Observer`
- Notification automatique via la méthode `setChangement(String)` (exigée par les tests)

---

### Exercice 3 : Extension des caractéristiques (Pattern Decorator)

Certains cours ont des spécificités temporaires ou cumulables sans modifier la structure de base de la classe : cours "En ligne", cours "En anglais", cours "Magistral", etc.

**Tâche réalisée :**
- Implémentation du **Pattern Decorator**
- `CoursDecorator` abstrait avec champ `coursDecore`
- Décorateurs concrets : `CoursEnLigne`, `CoursEnAnglais`, `CoursMagistral`
- Ajout dynamique de fonctionnalités sans toucher à `Cours` → **respect parfait du principe Open/Closed (SOLID)**

---

### Diagramme de classes UML – Architecture finale

![Diagramme de classes UML](target\2.png)


> Réalisé avec PlantUML – Architecture propre, claire et conforme aux 3 Design Patterns

---

### Bonus : Respect des principes de conception logicielle (SOLID + GRASP)

| Principe                       | Respecté ? | Justification |
|-------------------------------|------------|-------------|
| **Single Responsibility**     | Yes      | Chaque classe a une seule responsabilité claire |
| **Open/Closed Principle**     | Yes Excellent | Extension via décorateurs sans modifier `Cours` |
| **Liskov Substitution**       | Yes      | Tous les décorateurs remplacent `ICours` sans problème |
| **Interface Segregation**     | Yes      | `ICours` et `Observer` sont petites et ciblées |
| **Dependency Inversion**     | Yes      | Dépendance vers les abstractions (`Observer`, `ICours`) |
| **Low Coupling / High Cohesion** | Yes   | Classes faiblement couplées, fortement cohésives |

**Conclusion** : Ce TP respecte **pleinement les principes SOLID**, en particulier **Open/Closed** grâce au **Decorator Pattern.** 

---

