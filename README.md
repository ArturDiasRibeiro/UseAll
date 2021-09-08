#UseAll

	GET ALL Clientes
http://localhost:8080/clientes

Link da Screenshot: https://prnt.sc/1rkksgh

//-----------------------------------------//

	GET BY ID 
http://localhost:8080/clientes/{id}

Link da Screenshot: https://prnt.sc/1rkkmy5

//-----------------------------------------//

	POST Cliente
http://localhost:8080/clientes/

{
  "nome": "Maria",
  "cnpj": "123.456.789-01",
  "dataCadastro": "06/09/2021",
  "endereco": "endereço",
  "telefone": "9999-5555"
}

Link da Screenshot: https://prnt.sc/1rkkwq3

//-----------------------------------------//

	PUT Cliente
http://localhost:8080/clientes/{id}

Link da Screenshot: https://prnt.sc/1rkl01o

//-----------------------------------------//

	DELETE Cliente
http://localhost:8080/clientes/{id}

Link da Screenshot: https://prnt.sc/1rkl3g5


//-----------------------------------------//

Cliente com ID: 1, já está adicionado no banco de dados

/////////////////////////////////////////////

PORTA POSTGRESQL 5433

Aplicaton.properties da Api

spring.datasource.url=jdbc:postgresql://localhost:5433/ClienteTestDB
spring.datasource.username=postgres
spring.datasource.password=123
