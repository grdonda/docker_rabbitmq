# docker_rabbitmq
Estrutura de mensagem para brincar de processamento usando pub/sub, topicos com/sem filtro, bulk insert, consumers entre outros. Trabalhar com processamento assincrono.

### Conceitos rapidos
### exchange: 
Faz a troca entre o publicador e as filas, ela que vai descobrir e interpretar a mensagem com/sem filtros para dar o direcionamento correto.



### queue
São filas que vão receber as mensagens com/sem parametros, ela pode ter um bind_key (filtro) que vira junto com a mensagem gerada pelo producer

### producer
Produz a mensagem ou mensagens em batch ( mensagens acumuladas em uma matriz )

### consumer
Quem vai consumir um topico

<br>

### Rabbit MQ Simulator
<a href="https://tryrabbitmq.com/" taget="_blank">https://tryrabbitmq.com/</a>

<br>

### Exercicio do projeto/challange
1. Criar uma estrutura de producers/consumers
2. Usar o RabbitMQ como estrutura para pub/sub
3. Acessar o endpoint final com os resultados esperados



<br><br>
## Docker
```
docker compose -f "docker-compose.yaml" up -d --build --remove-orphans
```
```
docker compose -f "docker-compose.yaml" down
```

## configurações
```
http://localhost:15672
```

User: root  
Password: root