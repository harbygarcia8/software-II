package com.handicapTraining.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.apache.log4j.*;

import com.handicapTraining.model.Usuario;
import com.handicapTraining.repository.*;
import com.handicapTraining.response.RespuestaPersonalizada;
import com.handicapTraining.utilitario.*;

@Service
public class UsuarioService {

	private static final Logger logger = Logger.getLogger(UsuarioService.class);

	@Autowired
	private UsuarioDao usuarioDao;

	public ResponseEntity<Object> crearUsuario(@RequestBody Usuario usuario) {
		
		ResponseEntity<Object> respuesta;
		try {
			if (usuarioDao.findByCorreo(usuario.getCorreo()) != null) {
				respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
				respuesta = new ResponseEntity<>("El usuario ya existe", HttpStatus.BAD_REQUEST);

			} else if (ValidarCorreo.validarCorreoUsuario(usuario.getCorreo()) == false) {
				respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
				respuesta = new ResponseEntity<>("El correo no es válido, por favor intenta de nuevo",
						HttpStatus.BAD_REQUEST);

			} else if (ValidarContraseña.comprobarPassword(usuario.getPassword()) == false) {
				RespuestaPersonalizada res = new RespuestaPersonalizada("La contraseña es incorrecta", HttpStatus.BAD_REQUEST);
				respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
				respuesta = new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
		
			} else {
				RespuestaPersonalizada res = new RespuestaPersonalizada("Creación de usuario fue un éxito",
						HttpStatus.OK);
				res.setObjetoRespuesta(usuarioDao.save(usuario));
				respuesta = ResponseEntity.ok(HttpStatus.OK);
				respuesta = new ResponseEntity<>(res, HttpStatus.OK);
			}
		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("Lo sentimos, tenemos un error para crear al usuario", HttpStatus.BAD_REQUEST);
		}

		return respuesta;

		/*
		 * if (usuarioDao.findByCorreo(usuario.getCorreo()) != null) { return
		 * "El usuario ya existe";
		 * 
		 * } else if (ValidarCorreo.validarCorreoUsuario(usuario.getCorreo()) == false)
		 * { return "El correo no es válido, por favor intenta de nuevo";
		 * 
		 * } else if (ValidarContraseña.comprobarPassword(usuario.getPassword()) ==
		 * false) { return "Contraseña no es válida"; }
		 * 
		 * usuario.setPassword(encode.encode(usuario.getPassword()));
		 * usuarioDao.save(usuario); return "El usuario fue guardado exitosamente";
		 */
	}

	public ResponseEntity<Object> loginUsuario(@RequestParam String correo, @RequestParam String password) {
		ResponseEntity<Object> respuesta;
		try {
			RespuestaPersonalizada res = new RespuestaPersonalizada("Bienvenido al home", HttpStatus.OK);
			res.setObjetoRespuesta(usuarioDao.loginUsuario(correo, password));
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res, HttpStatus.OK);

		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("El usuario o la contraseña son incorrectos, inténtalo de nuevo",
					HttpStatus.BAD_REQUEST);
		}

		return respuesta;

		/*
		 * if (usuarioDao.findByCorreo(correo) == null) { return
		 * "El usuario no existe, por favor regístrese";
		 * 
		 * } else if (ValidarCorreo.validarCorreoUsuario(correo) == false) { return
		 * "El correo ingresado no es correcto, verifica lo ingresado";
		 * 
		 * } else if (ValidarContraseña.comprobarPassword(password) == false) { return
		 * "La contraseña no es válida, ingresala nuevamente";
		 * 
		 * } else if (usuarioDao.loginUsuario(correo, password) == null) { return
		 * "Comprueba los datos ingresados";
		 * 
		 * }
		 * 
		 * return "Bienvenido";
		 */
	}

	public Usuario obtenerUsuario(String correo) {
		return usuarioDao.findByCorreo(correo);
	}

	public List<Usuario> obtenerTodoUsuario() {
		return usuarioDao.findAll();
	}

	public void deleteUserById(Integer id) {
		usuarioDao.deleteById(id);
	}

	public ResponseEntity<Object> updateUserById(Integer id) {
		ResponseEntity<Object> respuesta = null;
		if (usuarioDao.existsById(id)) {
			Usuario usuario = new Usuario();
			usuarioDao.save(usuario);
			respuesta = ResponseEntity.ok(HttpStatus.OK);
		}
		return respuesta;
	}

	/*@Override
	public UserDetails loadUserByUsername(String userCorreo) throws UsernameNotFoundException {
		Usuario usuario = usuarioDao.findByCorreo(userCorreo);
		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority(usuario.getTipoUsuario().getTipo()));
		UserDetails user = new User(usuario.getCorreo(), usuario.getPassword(), authorities);

		return user;
	}*/

}

