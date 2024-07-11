package com.aluracursos.ChallengLiteratura;
import com.aluracursos.ChallengLiteratura.Repository.IAutorRepository;
import com.aluracursos.ChallengLiteratura.Repository.ILibroRepository;
import com.aluracursos.ChallengLiteratura.Libreria.Libreria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class ChallengLiteraturaApplication implements CommandLineRunner {
	@Autowired
	private ILibroRepository libroRepository;
	@Autowired
	private IAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(ChallengLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Libreria libreria = new Libreria(libroRepository, autorRepository);
		libreria.consumo();
	}
}
