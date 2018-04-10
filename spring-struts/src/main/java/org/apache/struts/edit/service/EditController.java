package org.apache.struts.edit.service;

import org.apache.struts.edit.model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditController implements EditService {

    @Override
    @RequestMapping("/spring-struts/controller/person")
    public Person getPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        return person;
    }

    @Override
    public void savePerson(Person personBean) {
    }
}