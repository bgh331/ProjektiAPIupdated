package ProjektiAPI.ProjektiAPI.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Vastaaja {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long vastaajaid;
	private String nimi;
	private String vastaus;
	private String vastaus1;
	private String vastaus2;
	

	@JsonIgnore
	 @ManyToOne
	    @JoinColumn(name = "kyselyid")
	    private Kysely kysely;
	
	

	public Vastaaja() {
		
	}

	public Vastaaja(String nimi, String vastaus, String vastaus1, String vastaus2) {
		super();
		this.nimi = nimi;
		this.vastaus = vastaus;
		this.vastaus1 = vastaus1;
		this.vastaus2 = vastaus2;
	}

	public Vastaaja(String nimi, String vastaus, String vastaus1) {
		super();
		this.nimi = nimi;
		this.vastaus = vastaus;
		this.vastaus1 = vastaus1;
	}

	public Vastaaja(String nimi, String vastaus) {
		super();
		this.nimi = nimi;
		this.vastaus = vastaus;
	}
	
	

	public Vastaaja(String nimi) {
		super();
		this.nimi = nimi;
	}

	public Kysely getKysely() {
		return kysely;
	}

	public void setKysely(Kysely kysely) {
		this.kysely = kysely;
	}

	public long getVastaajaid() {
		return vastaajaid;
	}

	public void setVastaajaid(long vastaajaid) {
		this.vastaajaid = vastaajaid;
	}

	public String getNimi() {
		return nimi;
	}

	public void setNimi(String nimi) {
		this.nimi = nimi;
	}

	public String getVastaus() {
		return vastaus;
	}

	public void setVastaus(String vastaus) {
		this.vastaus = vastaus;
	}

	public String getVastaus1() {
		return vastaus1;
	}

	public void setVastaus1(String vastaus1) {
		this.vastaus1 = vastaus1;
	}

	public String getVastaus2() {
		return vastaus2;
	}

	public void setVastaus2(String vastaus2) {
		this.vastaus2 = vastaus2;
	}
	

}
