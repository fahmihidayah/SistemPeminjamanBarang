package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import play.db.ebean.Model;
@Entity
public class User extends Model{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(nullable = false, unique = true)
	public String userName;
	@Column(nullable = false)
	public String password;
	
	public static Finder<Long, User> finder = new Finder<>(Long.class, User.class);

}
