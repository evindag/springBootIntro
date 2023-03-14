package com.project.hibernateAndJpa.Business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.hibernateAndJpa.DataAccess.IFilmDal;
import com.project.hibernateAndJpa.Entities.Film;

@Service
public class FilmManager implements IFilmService {
	
	private IFilmDal filmDal;
	@Autowired
	public FilmManager(IFilmDal filmDal) {
		this.filmDal = filmDal;
	}

	@Override
	@Transactional
	public List<Film> getAll() {
		return this.filmDal.getAll();
	}

	@Override
	@Transactional
	public void add(Film film) {
		this.filmDal.add(film);
		
	}

	@Override
	@Transactional
	public void update(Film film) {
		this.filmDal.update(film);
		
	}

	@Override
	@Transactional
	public void delete(Film film) {
		this.filmDal.delete(film);
		
	}

	@Override
	@Transactional
	public Film getById(int id) {
		return this.filmDal.getById(id);
	}
	
}
