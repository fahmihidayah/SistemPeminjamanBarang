package models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import play.db.ebean.Model;
@Entity
public class Barang extends Model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(nullable = false)
	public String namaBarang;
	@Column(nullable = false)
	public String statusBarang;
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.ALL)
	public Peminjam peminjam;
	
	public static Finder<Long, Barang> finder = new Finder<>(Long.class, Barang.class);
}
