package br.fiap.assistencia_tecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AssistenciaTecnicaApplication {

	public static void main(String[] args) {
		SpringApplication.run(AssistenciaTecnicaApplication.class, args);
	}

	@org.springframework.context.annotation.Bean
	org.springframework.boot.CommandLineRunner pingOracle(javax.sql.DataSource ds) {
		return args -> {
			try (var conn = ds.getConnection()) {
				if (conn.isValid(2)) { // timeout 2s
					System.out.println("Oracle OK");
				} else {
					System.err.println("Conexão inválida");
				}
			} catch (Exception e) {
				System.err.println("Falha ao conectar: " + e.getMessage());
			}
		};
	}


}