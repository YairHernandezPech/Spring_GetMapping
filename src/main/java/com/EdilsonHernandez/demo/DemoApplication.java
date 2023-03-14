package com.EdilsonHernandez.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
	//http://localhost:8080/hello?nombre=Yair&mensaje=SoyProgrmador
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "nombre", defaultValue = "World ") String nombre,@RequestParam(value = "mensaje",defaultValue = " Bienvenido")String mensaje) {
	  return String.format("Hello %s! \n", nombre +" EL mensaje es: "+ mensaje);
	  }
}
