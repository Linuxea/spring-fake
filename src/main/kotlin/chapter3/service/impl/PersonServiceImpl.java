package chapter3.service.impl;

import chapter2.Person;
import chapter3.dao.PersonDao;
import chapter3.service.PersonService;
import chapter3.util.BeanFactory;

/**
 * @author linuxea
 */
public class PersonServiceImpl implements PersonService {

    private final PersonDao personDao = (PersonDao) BeanFactory.getBean("chapter3.dao.impl.PersonDaoImpl");

    @Override
    public Person findPerson() {
        return personDao.getPerson();
    }
}
