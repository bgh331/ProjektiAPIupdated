package ProjektiAPI.ProjektiAPI;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ProjektiAPI.ProjektiAPI.domain.Kysely;
import ProjektiAPI.ProjektiAPI.domain.KyselyRepository;
import ProjektiAPI.ProjektiAPI.domain.User;
import ProjektiAPI.ProjektiAPI.domain.UserRepository;
import ProjektiAPI.ProjektiAPI.domain.Vastaaja;
import ProjektiAPI.ProjektiAPI.domain.VastaajaRepository;




@SpringBootApplication
public class ProjektiApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjektiApiApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(VastaajaRepository vrepository ,KyselyRepository repository,UserRepository urepository) {
		return (args) -> {
			
			
			
			
			vrepository.deleteAll();
			repository.deleteAll();
			
			Kysely k = new Kysely("Nimi: ");
			repository.save(k);
			
			Kysely k1 = new Kysely("Sukupuoli", "Mies", "Nainen", "Muu", "En halua vastata");
			repository.save(k1);
			
			Kysely k2 = new Kysely("Ajan ja tehtävien hallinta", "Teen tehtäväni sitä mukaan kun ne ilmestyy.", "Teen töistä aikataulun, jota pyrin noudattamaan.", 
					"Suunnittelen ja priorisoin säännölliset työtehtävät keskittyen olennaiseen.");
			repository.save(k2);
			
			Kysely k3 = new Kysely("Stressinhallinta", "Tiedän kuinka stressiä voisi hallita, mutta tunnen itseni usein stressaantuneeksi.", 
					"Saan usein hallittua omat stressitasoni.", "Stressinhallintani voisi olla parempi työympäristössä.");
			repository.save(k3);
			
			
			
			
			Vastaaja v = new Vastaaja("Kiia Kaukonen");
			v.setKysely(k);
			vrepository.save(v);
			
			
			User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
			User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
			User user3 = new User("Kiia", "$2a$04$9gKGDOVL/JR7dB3FnoRir..fPCreozI7YmNnR.PwBJIfJcl8NP3.e", "ADMIN");
			urepository.save(user1);
			urepository.save(user2);
			urepository.save(user3);
		};
	}

}