"# fApi" 
Api para validação de senha

Para executar o prj apos clonar instalar as depedencias e rodar via o servidor embarcado do eclipse.

com a api em execução temos as seguintes rotas: http:\localhost:8080/api obeter a versao da aplicacao

http:\localhost:8080/api/validarSenha Validar uma senha passada via JSON

Padrão requisição: {senha: [senha a validar]}

resposta: {sucesso: [1 | 0], mensagem: [valida, invalida]}

criterios de senha válida ou inváida
