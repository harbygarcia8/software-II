package com.handicapTraining.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.handicapTraining.model.VideoGuia;
import com.handicapTraining.service.VideoGuiaService;

@RestController
@RequestMapping("api/cinema/guia")
@CrossOrigin("*")
public class VideoGuiaController {
	
	@Autowired
	private VideoGuiaService VideoGuiaService;
	
	@PostMapping("crear")
	public ResponseEntity<Object> crearVideo(@RequestBody VideoGuia pelicula) {
		return VideoGuiaService.crearVideo(pelicula);
		
	}
	
	@GetMapping("obtenertodas")
	public ResponseEntity<Object> obtenerTodasPeliculas(){
		return VideoGuiaService.obtenerTodosVideos();
	}
	
	@GetMapping("obtener/{id}")
	public ResponseEntity<Object> obtenerVideoGuiaId(@PathVariable int id){
		return VideoGuiaService.obtenerVideoGuiaId(id);
	}
	
	 @DeleteMapping("eliminar")
	 public ResponseEntity<Object> eliminarVideoGuia(@RequestParam int idPelicula){
		 return VideoGuiaService.eliminarVideoGuia(idPelicula);
	 }
	 
	 @PutMapping("modificar")
	 public ResponseEntity<Object> modificarVideoGuia(@RequestParam VideoGuia pelicula){
		 return VideoGuiaService.modificarVideoGuia(pelicula);
	 }

	@GetMapping("obtenerDiscapacidad")
	public ResponseEntity<Object> obtenerVideoGuiaDiscapacidad(@RequestParam String discapacidad){
		return VideoGuiaService.obtenerVideoGuiaDiscapacidad(discapacidad);
	}
}
