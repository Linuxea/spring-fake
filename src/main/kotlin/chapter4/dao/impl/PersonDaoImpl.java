package chapter4.dao.impl;

import chapter4.Person;
import chapter4.dao.PersonDao;

/**
 * @author linuxea
 */
public class PersonDaoImpl implements PersonDao {


    @Override
    public Person getPerson() {
        return new Person();
    }
}
