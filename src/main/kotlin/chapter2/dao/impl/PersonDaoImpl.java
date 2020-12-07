package chapter2.dao.impl;

import chapter2.Person;
import chapter2.dao.PersonDao;

/**
 * @author linuxea
 */
public class PersonDaoImpl implements PersonDao {


    public Person getPerson() {
        return new Person();
    }
}
