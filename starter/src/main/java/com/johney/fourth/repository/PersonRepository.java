package com.johney.fourth.repository;

import java.util.List;

import com.johney.fourth.domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {

	public Person findByNameAndSurname(String name, String surname);

	public List<Person> findBySurname(String surname);

}
