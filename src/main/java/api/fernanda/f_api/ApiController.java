package api.fernanda.f_api;

import java.util.HashMap;

import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ApiController {

	@GetMapping("/api")
	public String index() {
		return "Fernanda API v0.1";
	}

	@PostMapping("/api/validaSenha")
	public ResponseEntity validaSenha(@RequestBody Senha req) {
		//curl -X POST -H "Content-Type: application/json" -d "{\"senha\":\"teste\"}" http://localhost:8080/api/validaSenha 
		//insominia -> Metodo Post, link: http://localhost:8080/api/validaSenha, JSON: {"senha":"T1234gyupopvn"}
		boolean valida = req.validaSenha();
		
		HashMap<String, String> map = new HashMap<>();
	    map.put("sucesso", valida? "1" : "0");
	    map.put("mensagem", "Senha " + (valida? "Valida" : "Invalida") + ".");
		
	    return ResponseEntity.ok(map);
	  //{"sucesso":"1", "mensagem":"Valida"}
	}
}
