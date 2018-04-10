package org.apache.struts.edit.service;

import org.apache.struts.edit.model.Foo;
import org.apache.struts.edit.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EditController implements EditService {

    @Override
    @RequestMapping(value = "person", method = RequestMethod.GET, produces = "application/json" )
    public @ResponseBody Person getPerson() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        return person;
    }

    @RequestMapping(value = "test", method = RequestMethod.GET )
    public ResponseEntity<String> test() {
        return ResponseEntity.ok().body("ok");
    }

    @RequestMapping(value = "person2", method = RequestMethod.GET )
    public ResponseEntity<Person> getPerson2() {
        Person person = new Person();
        person.setFirstName("John");
        person.setLastName("Doe");
        return ResponseEntity.ok().body(person);
    }


    @RequestMapping(value = "foo", method = RequestMethod.GET )
    public ResponseEntity<Foo> foo() {
        Foo foo = new Foo();
        foo.name = "bar";
        return ResponseEntity.ok().body(foo);
    }

    @Override
    public void savePerson(Person personBean) {
    }
}