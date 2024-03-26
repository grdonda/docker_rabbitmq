# docker_rabbitmq
Estrutura de mensagem para brincar de processamento usando mensageria.


### exchange

### queue

### entendimento do processo de configuração

## RabbitMQ - Simulator
<a href="https://tryrabbitmq.com/" taget="_blank">https://tryrabbitmq.com/</a>

## RabbitMQ - configurações via web
```
http://localhost:15672
```
```
User: adm  
Password: adm
```

## RabbitMQ - Estrutura de pastas
```
./docker_rabbitmq/
    docker-compose.yaml  -> arquivo docker compose para subir o sistema
    |_rabbitmq/
        |_conf/          -> arquivo de configuração
        |_dada/          -> persistencia
        |_definitions/   -> arquivo .json com as pré-definições para exchange, queue, etc.
        |_env/           -> environments
```

## RabbitMQ - dados de acesso
Para atualizar os dados de acesso, altere o arquivo `./docker_rabbitmq/rabbitmq/difinitions/default.json`
```
"users": [
    {
        "name": "adm",
        "password": "adm",
        "tags": "administrator",
        "rights": ".* .* .*"
    },
    {
        "name": "another_user",
        "password": "another_pass",
        "tags": "administrator",
        "rights": ".* .* .*"
    }
]
```

<br>
<br>
<br>




<br><br>
## Docker
comandos para subir o sistema e remover quando finalizar o uso.
```docker
docker compose -f "docker-compose.yaml" up -d --build --remove-orphans
```
```docker
docker compose -f "docker-compose.yaml" down
```

