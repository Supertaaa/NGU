package com.example.demo.Controller;

//
//import com.example.demo.Entities.Person;
//import com.example.demo.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class PersonController {


//    @PostMapping(path = "/create")
//    public ResponseEntity<?> create(@RequestParam(name = "fname") String name, @RequestParam(name = "lname") String lname, @RequestParam(name = "address") String address) {
//        Person person = new Person(name, lname, address);
//        personRepository.save(person);
//
//        return ResponseEntity.ok(person);
//    }

    @PostMapping(path = "/Show")
    public ResponseEntity<?> show(){
        return ResponseEntity.ok("SOMETHING WILL BE DISPLAYED");
    }





}
