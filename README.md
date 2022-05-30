"# fApi" 

# fApi
API para validação de senhas.

#### Critérios de senha válida ou inválida
- considere uma senha sendo válida quando a mesma possuir as seguintes definições:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
--- considere como especial os seguintes caracteres: !@#$%^&*() -+
- Não possuir caracteres repetidos dentro do conjunto.

### Requisitos do Projeto / API:
- Java JDK
- Marven
- IDE Eclipse
- Plugin Spring Book Tools para Eclipse.

#### Para executar o projeto:

 1. Baixar ou clonar o código do projeto;
 2. Importar o projeto em sua IDE;
 3. Instalar as dependências via Marven;
 4. Executar o projeto via servidor embarcado do Eclipe/SpringBoot Tools.
	 4.1 Expandir o projeto e iniciar o serviço
	 4.2 A execução pode ser confirmada pelo console do Eclipse, por padrão sua api deve rodar no endereço: localhost:8080

### Rotas da API:
1. /api
	Vai retornar uma string com as informações da atual versão da API.
2. /api/validarSenha
	Espera receber um objeto JSON contendo a senha a ser validada.
	`{"senha":"Senha123!"}`
	Devolve um objeto JSON com o resultado da validação.
	`{"sucesso":"1", "mensagem":"Valida"}`


#### Sugestões para testar as requisições à API.

##### CURL
Podemos realizar o teste por meio do curl que pode ser executado via terminal Linux ou CMD no Windows.

Abaixo um exemplo de requisição.

    curl -X POST -H "Content-Type: application/json" -d "{\"senha\":\"teste\"}" http://localhost:8080/api/validaSenha

##### INSOMINIA
Software que permite que criemos as requisições através de sua interface de forma simples e intuitiva.

Exemplo de requisição:

Criar nova requisição > Selecionar o método Post > Definir a URL: http://localhost:8080/api/validaSenha > Definir o conteúdo como JSON > inserir o seguinte conteúdo: 

    {"senha":"T1234gyupopvn"}




