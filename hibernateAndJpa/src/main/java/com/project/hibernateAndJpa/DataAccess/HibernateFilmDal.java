package com.project.hibernateAndJpa.DataAccess;

import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.project.hibernateAndJpa.Entities.Film;

import jakarta.persistence.EntityManager;
@Repository
public class HibernateFilmDal implements IFilmDal{
	private EntityManager entityManager;	
	
	@Override
	@Transactional
	public List<Film> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Film> films = session.createQuery("from Film",Film.class).getResutList();
	}
	@Autowired
	public HibernateFilmDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public void add(Film film) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(film);
	}

	@Override
	public void update(Film film) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(film);
		
	}

	@Override
	public void delete(Film film) {
		Session session = entityManager.unwrap(Session.class);
		Film filmToDelete = session.get(Film.class, film.getId());
		session.delete(film);
		
	}
	@Override
	public Film getById(int id) {
		Session session = entityManager.unwrap(Session.class);
		Film film = session.get(Film.class,id);
		return film;
	}

}
