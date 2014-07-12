package hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PessoaController {

	@RequestMapping("/pessoa")
	public Pessoa pessoa() {
		return Pessoa.of(123, "Yanaga", "4430307070");
	}

}
