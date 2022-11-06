package com.handicapTraining.repository;

import org.springframework.stereotype.Repository;

import com.handicapTraining.model.VideoGuia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

@Repository
public interface VideoGuiaDao extends JpaRepository <VideoGuia, Integer>{

	VideoGuia findByTitulo (String titulo);
	
	List<VideoGuia> findById(int id);

	List<VideoGuia> findByDiscapacidad(String discapacidad);

}
