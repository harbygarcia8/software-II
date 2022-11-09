package com.handicapTraining.controller;

import java.util.List;

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

import com.handicapTraining.model.Usuario;
import com.handicapTraining.service.UsuarioService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/discap-login/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	
	@PostMapping("create")
	public ResponseEntity<Object> createUser(@RequestBody Usuario usuario) {
		return usuarioService.crearUsuario(usuario);
	}
	
	@GetMapping("login")
	public ResponseEntity<Object> userLogin(@RequestParam String correo, @RequestParam String password) {
		return usuarioService.loginUsuario(correo, password);
	}

	@GetMapping("getInformation")
	public List<Usuario> getUser(){
		return usuarioService.obtenerTodoUsuario();
	}

	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable("id") Integer id) {
		 usuarioService.deleteUserById(id);
	}

	@PutMapping("/update")
	public void updateUser(@RequestBody Usuario usuario){

	}
}
