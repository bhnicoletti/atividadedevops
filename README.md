# Atividade DEVOPS

## Como rodar a aplicação
- Clonar o repositório
- Gere o arquivo jar do projeto -> mvn package  
- Para gerar a imagem do docker -> "docker build -t devops ."
- Para iniciar a aplicação -> "docker run -p 8080:8080 devops"

## Utilização da aplicação
Estará disponível no endereço http://localhost:8080/pessoas
### Métodos
- GET -> /pessoas/ (listar pessoas) ou /pessoas/{id} (buscar pessoa)
- POST -> /pessoas/ (adicionar pessoa)
- PUT -> /pessoas/{id} (atualizar pessoa)

### JSON para referência
{ "id" : 1, "nome" : "Bruno"}

## Necessário maven na máquina