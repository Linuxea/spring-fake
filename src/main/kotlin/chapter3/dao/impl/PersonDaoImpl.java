package chapter3.dao.impl;

import chapter2.Person;
import chapter3.dao.PersonDao;

/**
 * @author linuxea
 */
public class PersonDaoImpl implements PersonDao {


    public Person getPerson() {
        return new Person();
    }
}
