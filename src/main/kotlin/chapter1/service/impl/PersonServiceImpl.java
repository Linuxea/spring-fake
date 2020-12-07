package chapter1.service.impl;

import chapter1.Person;
import chapter1.dao.PersonDao;
import chapter1.dao.impl.PersonDaoImpl;
import chapter1.service.PersonService;

/**
 * @author linuxea
 */
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao = new PersonDaoImpl();

    public Person findPerson() {
        return personDao.getPerson();
    }
}
