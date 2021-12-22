<h1>Reponse aux questions de ce TP</h1>

<h3>Etape 5:</h3>   
<ol>
    <li> Web <br>
        <b>Java web </b> est un langage de programmation qui écrit en Java, combiné à d'autres technologies telles que HTML, Javascript, CSS... pour créer des sites Web ou des applications Web.
    </li>
    <li> JPA <br>
        <b>JPA (Java Persistence API)</b> est une interface de programmation d'applications Java qui décrit comment gérer les relations de données dans les applications utilisant la plate-forme Java.
    </li>
    <li> Hibernate <br>
        <b>Hibernate</b>  est un framework ORM (Object Relational Mapping) qui permet aux programmeurs de manipuler la base de données de manière totalement naturelle à travers des objets. Les programmeurs n'ont pas besoin de se soucier du type de base de données utilisé (On peux dire que Hibernate est l'implémentation de JPA).
    </li>
    <li> H2 <br>
        <b>H2</b> est une base de données relationnelle, légère et open source, écrivant langage Java.
    </li>
    <li> DevTools <br>
        <b>DevTools</b> est un ensemble d'outils Spring Boot pour faciliter le développement de nos applications Spring Boot.
    </li>
    <li> Thymeleaf <br>
        <b>Thymeleaf</b> est un template engine écrit en Java pour traiter et générer du HTML, XML, Javascript, CSS et du texte.
    </li>

</ol>

<h3>Etape 13 </h3> 
<ol>
    <li>Avec quelle partie du code avons-nous paramétré l’url d’appel /greeting ? 
        <br>//@RequestParam(name="nameGET", required=false, defaultValue="World")
    </li>
    <li>Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ? 
        <br>//return "greeting";
    </li>
    <li>Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?
        <br>//Dans le lien on va saisir le nom que l'on veut afficher sur l'interface 
        <br>//Par exemple: http://localhost:9090/greeting?nameGET=TEST
    </li>
</ol>

<h3>Etape 17 </h3> 
<p>Il ajoute la table Adresse dans la base de donnée </p>
<h3>Etape 18 </h3>
<p>L'ORM fait la correspondance entre l'objet et la base de donnée, crée les base de données avec les annotations qui perment de généré la table Address correctement</p>
<h3>Etape 20</h3> 
<p>Oui, on voit tout le contenu de la table Adresse par la commande : <br>
SELECT * FROM ADDRESS; <br>
Il affiche: <br>
ID  	CONTENT  	CREATION <br> 
1	57 boulevard demorieux	2021-11-02 18:04:15.61543 <br>
2	51 allee du gamay, 34080 montpellier	2021-11-02 18:04:15.633928
</p>
<h3>Etape 23 :</h3>
<p>@Autowired permet l'injection de dépendences pour pouvoir chercher l'interface AddressRepository, le service qui permet d'accéder à la base de donnée pour créer, lire, mettre à jour et supprimer les données
</p>
<h3>Etape 27:</h3> 
<p>Oui, on pourrais faire une navbar pour naviguer entre chaque pages. (comme on fait une page HTML/CSS statique normale)
</p>
<h3>Etape 30:</h3> 
<p>Pour ajouter Bootstrap, j'ai ajouté le code dans le pom.xml <br> 
<code>
< dependency > <br>
    < groupId > org.webjars < /groupId ><br>
    < artifactId > bootstrap < /artifactId ><br>
    < version > 4.0.0-2 < /version ><br>
< /dependency >
</code>
</p>
<h3>Etape 6 - TP4</h3>
<ol>
<li>Il faut avoir une clé API pour appeler DarkSky/Meteo-Concept (créer un compte pour obtenir la clé).</li>
<li>URL appeler: <br>
https://api.meteo-concept.com/api/forecast/daily?token=[mettre la clé]</li>
<li>Utiliser la méthode GET par getForObject() qui convertit la réponse HTTP en un type d'objet de mon choix, et renvoie cet objet
</li>
<li>On met les paramètres nécessaires (attitude et longtitude) après le token dans l'URL.
</li>
<li>Pour la température: dans la classe Forecast, il y a 2 attributs tmax et tmin pour indiquer la température max et min. <br>
   Pour la prévision : une list de Forecast (récupérer le température pendant 15 jours).
</li>
</ol>
<hr>
<p>Lien Github <br>
<a href="https://github.com/BachENSIM/POO-API">https://github.com/BachENSIM/POO-API</a>
</p>
