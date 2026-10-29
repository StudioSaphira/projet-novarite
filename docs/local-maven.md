# Maven local : Saphyra → Orevia → Novarite

Utiliser Java 21. Depuis la racine de chaque projet, dans cet ordre :

1. Saphyra : `./gradlew.bat publishToMavenLocal`
2. Orevia : `./gradlew.bat publishToMavenLocal`
3. Novarite : `./gradlew.bat buildAll :fabric:remapJar :neoforge:jar`

Saphyra 0.3 est déjà disponible localement. Orevia publie la version 0.1.
Les versions consommées sont dans `gradle.properties` :
`saphyra_version=0.3` et, pour Novarite, `orevia_version=0.1`.

Les artefacts sont dans `%USERPROFILE%/.m2/repository/net/orevia/` :
- `orevia-common-1.21.1` : API commune en mappings Mojang, pour compiler Common ;
- `orevia-fabric-1.21.1` : mod remappé pour Fabric, contenant Common ;
- `orevia-neoforge-1.21.1` : mod NeoForge, contenant Common.

Chaque POM Orevia déclare la variante correspondante de Saphyra.
Novarite déclare explicitement Orevia et Saphyra dans ses trois modules ;
les dépendances transitives y sont désactivées pour maîtriser les variantes.
Les métadonnées des deux loaders exigent également les deux mods.
Aucune de ces dépendances n'est embarquée dans le JAR Novarite :
dans un jeu installé, il faut installer les trois mods.

Après modification d'Orevia, republier avant de reconstruire Novarite.
Après modification de Saphyra, republier Saphyra en premier.
`buildAll` fabrique le JAR de distribution, mais ne publie pas le Maven local.

Alternative : `./gradlew.bat publish` publie Orevia dans `build/repo`.
Novarite peut alors utiliser `-PoreviaRepository="chemin/vers/Orevia/build/repo"`.
La propriété `saphyraRepository` permet de choisir séparément le dépôt Saphyra.
Ces propriétés acceptent aussi une URL Maven quand les mods seront publiés.
