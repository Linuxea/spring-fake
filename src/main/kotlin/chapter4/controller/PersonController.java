package chapter4.controller;

import chapter4.Person;
import chapter4.service.PersonService;
import chapter4.util.BeanFactory;

/**
 * @author linuxea
 */
public class PersonController {

    private final PersonService personService = (PersonService) BeanFactory.getBean("personService");

    public Person getPerson() {
        return personService.findPerson();
    }

}
