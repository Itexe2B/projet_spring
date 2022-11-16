MS 1 :
  Exposé sur le port 8080,  http://localhost:8080/swagger-ui.html tu auras tous les endpoints
  
MS 2 :
  Exposé sur le port 8081,  http://localhost:8080/swagger-ui.html tu auras tous les endpoints
  /healthMovie pour voir si le MS 1 est UP ou DOWN (fonctionne avec un circuit breaker)
  
MS 3 :
  Exposé sur le port 8761, http://localhost:8761/admin 
  
  
Pour facilité la correction :
MS1 :
  J'ai pas fait le "lien fort" entre Acteur et Film, impossible de serializer ça tourne en boucle.
  Je n'ai pas fait l'update et le delete.
MS2:
  Je n'ai pas proposé l'alternative au circuit breaker quand on coupe le MS1 on a "breaker"
  Je n'ai pas fait l'endpoint prometheus
MS3:
  Je n'ai pas capturé le Hystrix du MS2 pour l'afficher en graphique.


