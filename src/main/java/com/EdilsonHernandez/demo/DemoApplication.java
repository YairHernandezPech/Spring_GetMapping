package com.EdilsonHernandez.demo;

import java.util.ArrayList;
import java.util.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/producto")
public class DemoApplication {
    public static void main(String[] args) {
      SpringApplication.run(DemoApplication.class, args);
    }
	  //http://localhost:8080/producto
		@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
		public ResponseEntity<Producto> getProducto(){
		 List<Producto> lista = new ArrayList<>();
	 
		 Producto p = new Producto();
		p.setId(1);
		p.setNombre("Agua");
		p.setTipo("bebida");
		p.setPrecio(10);
		
		Producto p1 = new Producto();
		p1.setId(2);
		p1.setNombre("Beby");
		p1.setTipo("bebida");
		p1.setPrecio(55);

		Producto p2 = new Producto();
		p2.setId(3);
		p2.setNombre("Sabrita");
		p2.setTipo("Embutidos");
		p2.setPrecio(35);


		 lista.add(p);
		 lista.add(p1);
		 lista.add(p2);

		 return new ResponseEntity<Producto>(p2,HttpStatus.OK);
		}
			  //@PostMapping(consumes = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
			  @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
			  public ResponseEntity<Producto> creatProducto( @RequestBody NuevoProducto nuevoproducto){
			   
				Producto newProducto = new Producto();
				newProducto.setId(nuevoproducto.getId());
				newProducto.setNombre(nuevoproducto.getNombre());
				newProducto.setTipo(nuevoproducto.getTipo());
				newProducto.setPrecio(nuevoproducto.getPrecio());

				return new ResponseEntity<Producto>(newProducto,HttpStatus.OK);
			  }
	//http://localhost:8080/producto/hello?nombre=Yair&mensaje=SoyProgramador
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "nombre", defaultValue = "World ") String nombre,@RequestParam(value = "mensaje",defaultValue = " Bienvenido")String mensaje) {
	  return String.format("Hello %s! \n", nombre +" EL mensaje es: "+ mensaje);
	  }
	  
}
