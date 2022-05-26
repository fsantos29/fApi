package api.fernanda.f_api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

	private String senha;

	public Senha() {}
	
	public Senha(String senha) {
		this.senha = senha;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public boolean validaSenha(){
//		^ inicio da string.
//      (?!.*(.).*\\1) nega char repetido 
//		(?=.*[0-9a-zA-Z!@#$%^&*()+/-]) representa chars aceitos
//		.{9,25} representa pelo menos 8 caracteres e no máximo 20 caracteres.
//		$ fim da string.
//      Site para testes e criacao de regex: https://regex101.com/

		String regex ="^(?!.*(.).*\\1)((?=.*[0-9a-zA-Z!@#$%^&*()+/-]).{9,25})$";
		
		Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		Matcher m = pattern.matcher(this.senha);
		
		return m.matches();
	}


}
