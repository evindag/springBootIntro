package com.project.hibernateAndJpa.restApi;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.hibernateAndJpa.Business.IFilmService;
import com.project.hibernateAndJpa.Entities.Film;
import com.project.hibernateAndJpa.Entites.*;
@RestController
@RequestMapping("/api")
public class FilmContoller {
	private IFilmService filmService;

	@Autowired
	public FilmContoller(IFilmService filmService) {
		this.filmService = filmService;
	}
	@GetMapping("/films")
	public List<Film> get(){
		return filmService.getAll();
	}
	
	@PostMapping("/add")
	public void add(RequestBody Film film) {
		filmService.add(film);
	}
	@PostMapping("/update")
	public void update(RequestBody Film film) {
		filmService.add(film);
	}
	@PostMapping("/delete")
	public void delete(RequestBody Film film) {
		filmService.add(film);
	}
	@GetMapping("/films/{id}")
	public Film getById(@PathVariable int id){
		return filmService.getById(id); 
	}
}

