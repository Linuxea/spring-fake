package chapter2.service.impl;

import chapter2.Person;
import chapter2.dao.PersonDao;
import chapter2.service.PersonService;
import chapter2.util.BeanFactory;

/**
 * @author linuxea
 */
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao = (PersonDao) BeanFactory.getBean("chapter2/dao/impl/PersonDaoImpl.java");

    public Person findPerson() {
        return personDao.getPerson();
    }
}
