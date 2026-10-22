# POO-IHM

Collection de travaux pratiques en **programmation orientée objet avec Java**. Le dépôt rassemble plusieurs exercices indépendants qui illustrent la modélisation d'objets, les relations entre classes, le polymorphisme, les collections et les tests automatisés.

> **À propos du périmètre :** malgré « IHM » dans le nom du dépôt, les exemples actuels sont principalement des applications console ; ils ne constituent pas une interface graphique complète.

## Objectifs pédagogiques

- Modéliser des objets du quotidien à l'aide de classes, d'attributs et de méthodes.
- Mettre en œuvre constructeurs, encapsulation, associations et gestion d'état.
- Explorer l'héritage, le polymorphisme et la spécialisation de comportements.
- Manipuler des collections Java (`List`, `Set`) et des types énumérés.
- Valider les comportements à l'aide de tests unitaires JUnit.
- Pratiquer la compilation et l'organisation de projets Java avec Maven et IntelliJ IDEA.

## Architecture du dépôt

Les travaux sont séparés par sujet et peuvent être étudiés indépendamment.

```text
.
├── README.md
└── TP/
    ├── TP1/             # Vélos, roues, constructeurs et collections
    ├── TP2/             # Portes, stylos et course de véhicules
    ├── TP3/             # Modèle de stylo et tests JUnit
    ├── TP4/             # Robots, batteries et exceptions métier
    └── Test_portes/     # Exercice sur les portes et tests JUnit
```

### Détail des exercices

| Dossier | Sujet et notions illustrées | Organisation |
| --- | --- | --- |
| `TP/TP1` | Vélos et roues : constructeurs, copie d'objet, accélération/freinage, `List` et `Set`. | Projet Maven ; les sources Maven sont dans `src/main/java/org/bike`. Une première version de l'exercice se trouve aussi dans `src/exo_1`. |
| `TP/TP2` | `exo1` : portes verrouillées et à code ; `exo2` : stylos, cartouches et variantes spécialisées ; `exo3` : véhicules et course sur une piste. | Trois exercices Java autonomes dans `src/exo1`, `src/exo2` et `src/exo3`, sans configuration Maven. |
| `TP/TP3` | Stylo, cartouche et capuchon, avec tests unitaires portant notamment sur leurs associations et comportements. | Projet Maven avec sources dans `src/main/java` et tests JUnit 5 dans `src/test/java`. |
| `TP/TP4` | Robot et batteries : capacité, état, enumération de types et exceptions personnalisées. | Projet Maven configuré pour Java 11. L'exercice est en cours : le `Main` actuel appelle un constructeur et une méthode qui ne correspondent pas à l'API de `Robot`. |
| `TP/Test_portes` | Portes simples, verrouillage automatique, code secret et tests des états d'ouverture/verrouillage. | Projet Maven avec tests JUnit 5. |

## Technologies

- **Java** : exercices majoritairement configurés pour Java 25 ; `TP4` cible Java 11.
- **Maven** : compilation et gestion des dépendances pour `TP1`, `TP3`, `TP4` et `Test_portes`.
- **JUnit Jupiter 5** : tests unitaires dans `TP3` et `Test_portes`.
- **IntelliJ IDEA** : fichiers de projet présents pour faciliter l'ouverture des exercices, en particulier `TP2`.

Les versions Java sont définies individuellement dans les `pom.xml` : utiliser un JDK compatible avec le dossier choisi. Pour les modules configurés en Java 25, un JDK 25 est nécessaire ; `TP4` peut être compilé avec un JDK 11 ou plus récent.

## Installation

1. Cloner le dépôt et ouvrir un terminal à sa racine :

   ```powershell
   git clone https://github.com/stephcstn/poo_ihm_semestre1.git
   cd poo_ihm_semestre1
   ```

   Si le dépôt a été fourni sous forme d'archive, la décompresser puis ouvrir un terminal dans le dossier qui contient `README.md`.

2. Installer un JDK adapté au travail choisi et vérifier sa disponibilité :

   ```powershell
   java -version
   javac -version
   ```

3. Pour les dossiers Maven, installer Maven et vérifier la commande :

   ```powershell
   mvn -version
   ```

4. (Facultatif) Ouvrir le dossier dans IntelliJ IDEA. Pour les projets Maven, importer le `pom.xml` correspondant ; pour `TP2`, ouvrir le dossier `TP/TP2` et exécuter la classe `Main` du package choisi.

## Compiler, tester et exécuter

Les commandes ci-dessous sont écrites pour **PowerShell**. Chaque dossier constitue un projet distinct ; choisir les commandes du module à étudier et exécuter le bloc correspondant depuis la racine du dépôt.

### TP1 — vélos et roues

```powershell
Set-Location .\TP\TP1
mvn clean package
java -cp target\classes org.bike.Main
```

La version alternative située dans `src/exo_1` n'appartient pas au répertoire source Maven standard ; elle peut être lancée depuis IntelliJ en tant qu'exercice distinct.

### TP2 — portes, stylos ou véhicules

Compiler les trois packages depuis `TP/TP2` :

```powershell
Set-Location .\TP\TP2
New-Item -ItemType Directory -Force .\out | Out-Null
$sources = Get-ChildItem .\src -Recurse -Filter *.java | ForEach-Object { $_.FullName }
javac -d .\out $sources
```

Exécuter ensuite l'exercice souhaité :

```powershell
java -cp .\out exo1.Main
java -cp .\out exo2.Main
java -cp .\out exo3.Main
```

### TP3 — stylo et tests

```powershell
Set-Location .\TP\TP3
mvn clean package
mvn -Dtest=CapIT,CartridgeIT,PenIT test
```

Les classes de test sont nommées `*IT` ; la commande ciblée les sélectionne explicitement. La classe `org.example.Main` affiche actuellement un message de démonstration.

### TP4 — robot et batteries

```powershell
Set-Location .\TP\TP4
mvn clean package
```

La compilation de ce module nécessite d'abord de remettre en cohérence `Main` avec l'API de `Robot` : `Main` utilise actuellement `new Robot("real_steel")` et `to_string()`, alors que `Robot` expose un constructeur à quatre paramètres et redéfinit `toString()`. Aucun lancement exécutable n'est donc documenté pour ce module dans son état actuel.

### Test_portes — tests des portes

```powershell
Set-Location .\TP\Test_portes
mvn clean test
```

## Compétences mises en évidence

Ce dépôt permet de présenter à un recruteur des bases concrètes en :

- **Conception orientée objet** : classes cohérentes autour de domaines variés, constructeurs par défaut et paramétrés, copie d'objets et encapsulation.
- **Relations entre objets** : association entre un stylo et sa cartouche, composition de véhicules sur une piste, et gestion des états d'une porte.
- **Héritage et polymorphisme** : variantes de portes, stylos et véhicules substituables via des types communs.
- **Collections et API Java** : listes, ensembles, énumérations, ainsi que parcours et gestion d'objets.
- **Qualité et validation** : tests JUnit pour les transitions d'état, les associations, les limites de capacité et les comportements attendus.
- **Outillage de développement** : projets Maven, compilation Java et organisation de modules dans IntelliJ IDEA.

## Limites et pistes d'amélioration

- Les exercices restent indépendants et n'ont pas encore de configuration Maven commune.
- `TP4` demande une mise à jour de son point d'entrée avant de pouvoir être compilé.
- Les tests de `TP3` sont nommés `*IT` et sont lancés explicitement dans la commande ci-dessus.
- Le dépôt ne contient pas encore de véritable interface graphique, de pipeline d'intégration continue ou de documentation de contribution.

## Licence

Aucune licence n'est déclarée dans le dépôt. Demander l'autorisation du propriétaire avant toute réutilisation ou redistribution.
