package com.vasanth.angularCrud.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vasanth.angularCrud.dao.PersonDao;
import com.vasanth.angularCrud.model.Person;

@Transactional
@Service
public class PersonServiceImpl {
	@Autowired
	PersonDao personDao;

	public void createPerson(Person person) {
		personDao.save(person);
	}
	public Iterable<Person> findAllPerson(){
		return personDao.findAll();
	}
	public void deletePerson(int id) {
		personDao.deleteById(id);
	}
	
}
