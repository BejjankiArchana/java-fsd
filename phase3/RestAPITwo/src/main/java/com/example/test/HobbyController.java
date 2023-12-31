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
@RequestMapping(path = "/webapitwo")
public class HobbyController {
    
    @Autowired
    HobbyService hobbyService;
    //http://localhost:8082/webapitwo/hobbby/2
    @GetMapping("/hobby/{personid}")
    public String findByPersonId(@PathVariable int personid){
        return hobbyService.findByPersonId(personid);
    }
    
    @PostMapping("/hobby")   
    public void addHobby(@RequestBody HobbyEntity he ) {
        hobbyService.addHobby(he);
    }

}