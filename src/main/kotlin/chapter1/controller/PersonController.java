package chapter1.controller;

import chapter1.Person;
import chapter1.service.PersonService;
import chapter1.service.impl.PersonServiceImpl;

/**
 * @author linuxea
 */
public class PersonController {

    private final PersonService personService = new PersonServiceImpl();

    public Person getPerson() {
        return personService.findPerson();
    }

}
