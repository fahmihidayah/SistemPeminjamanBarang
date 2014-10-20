package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import play.db.ebean.Model;
@Entity
public class Peminjam extends Model {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long id;
	@Column(nullable = false)
	public String namaPeminjam;
	@Column(nullable = false)
	public String alamatPeminjam;
	@Column(nullable = false)
	public String teleponPeminjam;
	@OneToMany(cascade = CascadeType.ALL)
	public List<Barang> listBarang = new ArrayList<>();
	
	public static Finder<Long, Peminjam> finder = new Finder<>(Long.class, Peminjam.class);
}
