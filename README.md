# uf13-spring-rubrica

Applicazioni Spring per la gestione di una rubrica di contatti tramite database MySQL su container Docker

## Dependencies
- Spring Web: sviluppo webapp -> pagine HTML dinamiche
- Spring DevTools: gestisce il riavvio rapido dell'applicazione (opzionale)
- Thymeleaf: templating HTML per pagine dinamiche
- Spring Data JPA: tecnologia di gestione dei database
- Driver MySQL: connettore al DBMS
- Validator: validazione dei form (opzionale)
- Lombok: riduce il boilerplate code (codice prolisso)
- TODO

Per aggiungere nuove dependencies usare l'opzione `Spring Initializer: Add starters ...`

## Avvio applicazione

1. Creazione del container per il database specificato in `docker-compose.yaml`
```bash
docker compose up mysql-db [-d]
```

2. Verificare il corretto avvio del container
```bash
docker compose ps
```

3. Terminare l'esecuzione del container
```bash
docker compose down
```
