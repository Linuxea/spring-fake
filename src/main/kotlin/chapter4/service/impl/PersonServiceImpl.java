package chapter4.service.impl;

import chapter4.Person;
import chapter4.dao.PersonDao;
import chapter4.service.PersonService;
import chapter4.util.BeanFactory;

/**
 * @author linuxea
 */
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao = (PersonDao) BeanFactory.getBean("personDao");

    @Override
    public Person findPerson() {
        return personDao.getPerson();
    }
}
