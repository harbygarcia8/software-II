package com.handicapTraining.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.handicapTraining.model.VideoGuia;
import com.handicapTraining.repository.VideoGuiaDao;
import com.handicapTraining.response.RespuestaPersonalizada;

@Service
public class VideoGuiaService {
	
	@Autowired
	private VideoGuiaDao videoGuiaDao;
	
	@Autowired

	private static final Logger logger = Logger.getLogger(VideoGuiaService.class);
	
	public ResponseEntity<Object>crearVideo(@RequestBody VideoGuia video) {
		ResponseEntity<Object> respuesta;
		try {			
			RespuestaPersonalizada res = new RespuestaPersonalizada("Se creó el video con exito", HttpStatus.OK);
			res.setObjetoRespuesta(videoGuiaDao.save(video));
			res.setObjetoRespuesta(videoGuiaDao.findById(video.getId()));
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("Disculpa tenemos un error tratando de crear la película",
					HttpStatus.BAD_REQUEST);

		}
		return respuesta;
		
		
	}
	
	public ResponseEntity <Object> obtenerTodosVideos(){
		ResponseEntity<Object> respuesta;
		try {
			List<VideoGuia> peliculas = videoGuiaDao.findAll();
			RespuestaPersonalizada res = new RespuestaPersonalizada("Consulta de las peliculas con éxito",
					HttpStatus.OK);
			res.setObjetoRespuesta(peliculas);
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("Disculpa tenemos un error tratando de consultar las Peliculas",
					HttpStatus.BAD_REQUEST);

		}
		return respuesta;
		
	}
	
	public ResponseEntity <Object> obtenerVideoGuiaId(@RequestParam int id){
		ResponseEntity<Object> respuesta;
		try {
			List<VideoGuia> videoGuia = (List)videoGuiaDao.findById(id);
			RespuestaPersonalizada res = new RespuestaPersonalizada("Consulta de las peliculas con éxito",
					HttpStatus.OK);
			res.setObjetoRespuesta(videoGuia);
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("Disculpa tenemos un error tratando de consultar las Peliculas",
					HttpStatus.BAD_REQUEST);

		}
		return respuesta;
		
	}
	
	public ResponseEntity<Object>modificarVideoGuia(@RequestBody VideoGuia videoGuia){
		ResponseEntity<Object> respuesta;
		try {
			RespuestaPersonalizada res = new RespuestaPersonalizada("Modificacion de la pelicula exitosa",
					HttpStatus.OK);
			res.setObjetoRespuesta(videoGuiaDao.save(videoGuia));
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("Disculpa tenemos un error tratando de modificar la pelicula",
					HttpStatus.BAD_REQUEST);

		}
		return respuesta;
	}
	
	public ResponseEntity<Object>eliminarVideoGuia(@RequestParam int idPelicula) {
		ResponseEntity<Object> respuesta;
		try {
            RespuestaPersonalizada res = new RespuestaPersonalizada("El video fue eliminada correctamente", HttpStatus.OK);
            VideoGuia guiaEliminar = this.videoGuiaDao.findById(idPelicula).get(0);
            videoGuiaDao.delete(guiaEliminar);
            respuesta= ResponseEntity.ok(HttpStatus.OK);
            respuesta = new ResponseEntity<>(res, HttpStatus.OK);
        } catch (Exception e) {
            RespuestaPersonalizada res = new RespuestaPersonalizada("Error al eliminar el video de guia", HttpStatus.BAD_REQUEST);
            respuesta= ResponseEntity.ok(HttpStatus.BAD_REQUEST);
            respuesta = new ResponseEntity<>(res, HttpStatus.BAD_REQUEST);
        }
		
        return respuesta;
	}

	public ResponseEntity <Object> obtenerVideoGuiaDiscapacidad(@RequestParam String discapacidad){
		ResponseEntity<Object> respuesta;
		try {
			List<VideoGuia> videoGuia = (List)videoGuiaDao.findByDiscapacidad(discapacidad);
			RespuestaPersonalizada res = new RespuestaPersonalizada("Consulta de las peliculas con éxito",
					HttpStatus.OK);
			res.setObjetoRespuesta(videoGuia);
			respuesta = ResponseEntity.ok(HttpStatus.OK);
			respuesta = new ResponseEntity<>(res, HttpStatus.OK);
		} catch (Exception e) {
			logger.error(e);
			respuesta = ResponseEntity.ok(HttpStatus.BAD_REQUEST);
			respuesta = new ResponseEntity<>("Disculpa tenemos un error tratando de consultar el video",
					HttpStatus.BAD_REQUEST);

		}
		return respuesta;
	}

}
