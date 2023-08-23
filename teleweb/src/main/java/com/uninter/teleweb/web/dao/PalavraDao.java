package com.uninter.teleweb.web.dao;

import java.util.List;

import com.uninter.teleweb.web.domain.Palavra;

public interface PalavraDao {

	void save(Palavra palavra);
	void update(Palavra palavra);
	void delete(Long id);
	Palavra findById(Long id);
	List<Palavra> findAll();
	
	
}

