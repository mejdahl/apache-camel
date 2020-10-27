# Teknisk Tirsdag

## Opgave 27/10

* Lave en applikation der modtager en fil med en liste af by forkortelser (MDR) og aflevere en soteret liste med bynavn og land
* Udvid applikationen med en rest service der kan det samme med JSON
* Tilføj en wrapper grupperet pr land og returner denne Rest.
* Tilføj en http header der filtrer alle byer der starter med en vokal fra
* Tilføj land til URL’en således at service kun returnere gældende land.



## Nyttig links:

EIP: https://camel.apache.org/components/latest/eips/enterprise-integration-patterns.html

TODO: https://dzone.com/articles/apache-camel-getting-started-episode-1-of-apache-c

Camel Boot: https://camel.apache.org/manual/latest/camel-boot.html


## Hint Opgaver

Kopi af List.class findes i "./opgaver/dk..."


Quick: Simpel Camel Applikation

```
mvn archetype:generate -DarchetypeGroupId=org.apache.camel.archetypes -DarchetypeArtifactId=camel-archetype-java
```


```
run> mvn camel:run
```

Url til "by" service https://fiskeriservice-q.fiskeristyrelsen.dk/common-integration/rest/list/LocationList

Tilføj til POM for brug af List.class 
```
<dependency>
	<groupId>joda-time</groupId>
	<artifactId>joda-time</artifactId>
	<version>2.1</version>
</dependency>
```
	