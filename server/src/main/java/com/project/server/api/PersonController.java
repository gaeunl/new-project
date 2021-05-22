package com.project.server.api;

import com.project.server.model.Person;
import com.project.server.service.PersonService;

public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    public int addPerson(Person person){
        return personService.addPerson(person);
    }
}
