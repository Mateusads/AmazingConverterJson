package br.com.medeiros.amazing;

import br.com.medeiros.amazing.controllers.Receiver;
import br.com.medeiros.amazing.services.ConverterLine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AmazingApplication {
	private static final Receiver receiver = new Receiver();
	private static final ConverterLine converter = new ConverterLine();
	private static final String PATH = "./src/main/files/newFileTeste.txt";

	public static void main(String[] args) {
		SpringApplication.run(AmazingApplication.class, args);

		try {
			var buffer = receiver.fileBuffered(PATH);
			var users = converter.toEntity(buffer);


			System.out.println(buffer.readLine());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}


		System.out.println("teste");

	}

}
