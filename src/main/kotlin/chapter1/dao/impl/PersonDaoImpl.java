package chapter1.dao.impl;

import chapter1.Person;
import chapter1.dao.PersonDao;

/**
 * @author linuxea
 */
public class PersonDaoImpl implements PersonDao {


    public Person getPerson() {
        return new Person();
    }
}
