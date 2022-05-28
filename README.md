"# fApi" 
A instalação do prj será feita da seguinte forma:

- Ide eclipse

-Java JDK

-Spring boot

-Maven generate sources

-Insommia

No prompt digita: Java -version

-extrai a f_api => file =>import=>general=>projects from folder or archive=> procura a pasta com o arquivo=>clica em directory=> finish

Para instalar a spring boot vai no ícone help => eclipse markeplace => busca a spring tools 4.14.1 realese e faz a instalação.

Vai na f_api e clica no botão direito e vai para =>run as=>clica na maven generate sources

Depois vai no item local expande a f-api, clica botão esquerdo e vai na aba (re)start para iniciar o serviço da api (f-api [:8080])

Depois digita no navegador localhost:8080 para abrir a api

A próxima rota é http://localhost:8080/api/validarSenha

Expande a f_api

Depois pode baixar no insommia e/ou terminal para rodar o prj.

Api para validação de senha

Para executar o prj após clonar 

Instalar as dependências e rodar via o servidor embarcado do eclipe 

com api em execução temos as seguintes rotas: http:\\localhost:8080/api 

obter a versão da aplicação http:\\localhost:8080/api/validarSenha  

uma senha passada via Json

Padrão requisição:{senha:[senha a validar]}

Resposta:{sucesso:[1/0], mensagem: [valida, inválida]}

Critérios de senha válida ou inválida
- considere uma senha sendo válida quando a mesma possuir as seguintes definições:
- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiscula
- Ao menos 1 caractere especial
--- considere como especial os seguintes caracteres: !@#$%^&*() -+

- Não possuir caracteres repetidos dentro do conjunto.


