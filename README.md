# XY-Inc Ltda.
### Plataforma para disponibilizar POI para empresa XY.
#### Pré configuração para execução
Projeto criado com Spring Initializr, configurado para implementar uma infraestrutura básica para disponibilizar Pontos de Interesse (POI) para inserção e consulta.

#### Arquitetura utilizada
Foram utilizadas as seguintes tecnologias:
- Spring Web
- Spring Data JPA
- H2 Database
- Swagger
- Lombok

#### Para execução do projeto:
Basta apenas dar um maven build no projeto e executar como Aplicação spring.

#### Para testes
Basta configurar os endpoints para as chamadas rest e testar.

##### Salvar POI
http://localhost:8080/services/poi/save (POST)

JSON de exemplo de body:
{
	"nome": "Sorveteria",
	"posX": 15,
	"posY": 1
}

##### Listar Todos os POI
http://localhost:8080/services/poi/listAll?page=0&size=3

Serviço paginado, onde o parametro page é a página a ser buscada e o size é o tamanho da página.

##### Listar Todos os POI
http://localhost:8080/services/poi/listByProximity?posX=20&posY=10&raio=10&page=1&size=2

Serviço paginado, onde os parametros posX, posY, raio são filtros para proximidade e parametro page é a página a ser buscada e o size é o tamanho da página.