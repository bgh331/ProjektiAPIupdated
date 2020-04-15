package ProjektiAPI.ProjektiAPI.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Kysely {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String question, content, content1, content2, content3;
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "kysely")
	@JsonIgnore
	private List<Vastaaja> vastaaja;
	
	public Kysely() {
	}



	public Kysely(String question, String content, String content1, String content2, String content3) {
		super();
		this.question = question;
		this.content = content;
		this.content1 = content1;
		this.content2 = content2;
		this.content3 = content3;
	}



	public Kysely(String question, String content, String content1, String content2) {
		super();
		this.question = question;
		this.content = content;
		this.content1 = content1;
		this.content2 = content2;
		
	
	}
	
	


	public Kysely(String question, String content, String content1) {
		super();
		this.question = question;
		this.content = content;
		this.content1 = content1;
	}



	public Kysely(String question) {
		super();
		this.question = question;
	}



	public Kysely(String question, String content) {
		super();
		this.question = question;
		this.content = content;
	}



	public long getId() {
		return id;
	}


	public void setId(long questionid) {
		this.id = questionid;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getContent1() {
		return content1;
	}


	public void setContent1(String content1) {
		this.content1 = content1;
	}


	public String getContent2() {
		return content2;
	}


	public void setContent2(String content2) {
		this.content2 = content2;
	}
	
	public List<Vastaaja> getVastaajat() {
		return vastaaja;
	}

	public void setVastaajat(List<Vastaaja> vastaajat) {
		this.vastaaja = vastaajat;
	}
	
}
	
	