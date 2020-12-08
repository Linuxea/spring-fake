package chapter2.controller;

import chapter2.Person;
import chapter2.service.PersonService;
import chapter2.util.BeanFactory;

/**
 * @author linuxea
 */
public class PersonController {

    private final PersonService personService = (PersonService) BeanFactory.getBean("chapter2.service.impl.PersonServiceImpl");

    public Person getPerson() {
        return personService.findPerson();
    }

}
