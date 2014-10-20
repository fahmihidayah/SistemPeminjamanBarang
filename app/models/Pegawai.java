package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import play.db.ebean.Model;
@Entity
public class Pegawai extends Model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(nullable = false)
	public String namaPegawai;
	@Column(nullable = false)
	public String alamat;
	@Column(nullable = false)
	public String telepon;
	@OneToOne(cascade = CascadeType.ALL)
	public User user;
	
	public static Finder<Long, Pegawai> finder = new Finder<>(Long.class, Pegawai.class);
}
