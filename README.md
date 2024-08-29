
# Sistema de Fictício Veículo & RH

## Tutorial de Uso do Maven

Este documento fornece instruções sobre como compilar, testar e executar o projeto, bem como acessar a documentação Swagger UI.

### 1. Compilação e Empacotamento

Para compilar o projeto e criar um arquivo JAR executável, utilize o seguinte comando:
```sh
mvn clean package

```
Isso criará um arquivo JAR na pasta `target` do seu projeto.

### 2. Execução do JAR

Para executar o JAR manualmente, use o comando:

```sh
java -jar target/sistema-veiculo-1.0-SNAPSHOT.jar
```

### 3. Acessar a Documentação Swagger UI

Após iniciar o aplicativo, você pode acessar a documentação Swagger UI em:

```
http://localhost:8080/swagger-ui/index.html
```

Esta interface permite que você visualize e teste os endpoints da API.
