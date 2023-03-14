package com.project.hibernateAndJpa.Entities;
import javax.persistence.*;

@Entity
@Table(name="film_text")
public class Film {
	@Id
	@Column(name="film_id")
	@GeneratedValue(strategy=GenerationType.IDENTITIY)
	private int film_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	public Film(int film_id, String title, String description) {
		super();
		this.film_id = film_id;
		this.title = title;
		this.description = description;
	}
	public Film () {}
	public int getFilm_id() {
		return film_id;
	}
	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
