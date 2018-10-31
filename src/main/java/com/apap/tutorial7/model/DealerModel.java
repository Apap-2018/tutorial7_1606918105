package com.apap.tutorial7.model;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * 
 * @author savirasantoso
 * Dealer Model
 * @Entity
 * @Table (name=dealer)
 *
 */
@Entity
@Table (name="dealer")
public class DealerModel implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(max = 50)
	@Column (name = "alamat", nullable = false)
	private String alamat;
	
	@NotNull
	@Size(max=13)
	@Column(name="no_telp", nullable = false)
	private String noTelp;
	
	/*
	 * ada dua tipe fetch : 
	 * eager : kalau get ide yang langsung dapet listnya
	 * LAZY : kalau get id ga keluar listnya, kecuali kalo pake .get
	 */
	@OneToMany(mappedBy = "dealer", fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	private List<CarModel> listCar;
	
/*
 * method getter setter
 */
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAlamat() {
		return alamat;
	}

	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}

	public String getNoTelp() {
		return noTelp;
	}

	public void setNoTelp(String noTelp) {
		this.noTelp = noTelp;
	}

	public List<CarModel> getListCar() {
		return listCar;
	}

	public void setListCar(List<CarModel> listCar) {
		this.listCar = listCar;
	}
	

}
