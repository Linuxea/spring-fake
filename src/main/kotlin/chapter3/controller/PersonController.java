package chapter3.controller;

import chapter2.Person;
import chapter3.service.PersonService;
import chapter3.util.BeanFactory;

/**
 * @author linuxea
 */
public class PersonController {

    private final PersonService personService = (PersonService) BeanFactory.getBean("chapter3.service.impl.PersonServiceImpl");

    public Person getPerson() {
        return personService.findPerson();
    }

}
