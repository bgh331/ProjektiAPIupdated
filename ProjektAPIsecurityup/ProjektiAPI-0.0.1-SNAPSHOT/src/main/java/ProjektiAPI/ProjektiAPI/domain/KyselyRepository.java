package ProjektiAPI.ProjektiAPI.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface KyselyRepository extends CrudRepository<Kysely, Long> {
	
}