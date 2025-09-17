# 📖 Descrição
Este projeto é uma API REST simples para um CRUD em Spring Boot/Java, MySQL e têm o intuito de exercitar minhas habilidades em Java.

# 💻 Tecnologias
- Java
- Spring Boot
- JPA/Hibernate
- Maven
- MySQL
- H2 Database(Substituído depois por MySQL)

# ⚙️ Funcionalidades
- Listar Users(Usuários), Products(Produtos), Orders(Pedidos) e Categories(Categorias).
- Criar, Deletar(Somente users que ainda não têm pedido) e Atualizar Users.

# 🖱️ Como Rodar o Código
Caso tenha interesse em ver o código funcionando é necessário entrar em contato comigo primeiro, pois geralmente deixo o deploy do banco de dados e da API 
inativo no Railway, mas no caso de eu ativar basta enviar as requisições http para o endereço https://springbootmysqlapp-production.up.railway.app

Endpoints:
/users
/products
/orders
/categories

Exemplos:
Listar todos usuários
GET /users

Criar um usuário
POST /users
{
  "name": "Fulano",
  "email": "fulano@gmail.com",
  "phone": "999999999",
  "password": "123456"
}
