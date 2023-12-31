package com.example.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/webapione")
public class PersonController {

    @Autowired
    PersonService personService;
  //http://localhost:8081/webapione/person/2
    @GetMapping("/person/{personId}")
    public PersonResponse getPerson(@PathVariable int personId){
        return personService.getPerson(personId);
    }
    
  //http://localhost:8081/webapione/person
    @PostMapping("/person")   
    public void addPerson(@RequestBody PersonEntity pe ) {
        personService.addPerson(pe);
    }
}