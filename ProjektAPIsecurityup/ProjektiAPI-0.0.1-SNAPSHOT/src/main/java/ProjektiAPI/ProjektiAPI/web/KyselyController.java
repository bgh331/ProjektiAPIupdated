package ProjektiAPI.ProjektiAPI.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ProjektiAPI.ProjektiAPI.domain.Kysely;
import ProjektiAPI.ProjektiAPI.domain.KyselyRepository;
import ProjektiAPI.ProjektiAPI.domain.Vastaaja;
import ProjektiAPI.ProjektiAPI.domain.VastaajaRepository;



@RestController
public class KyselyController {
	
	
	
	@Autowired
	public KyselyRepository repository;

	@Autowired
	public VastaajaRepository trepository;
	
	  @RequestMapping(value="/login")
	    public String login() {	
	        return "login";
	    }
	
    @RequestMapping(value = "/getkysely")
	List<Kysely> getKyselyt() {	
		return (List<Kysely>) repository.findAll();
	}

    @RequestMapping(value = "/getvastaaja")
	List<Vastaaja> getTrainings() {	
		return (List<Vastaaja>) trepository.findAll();
	}  
	
	
}