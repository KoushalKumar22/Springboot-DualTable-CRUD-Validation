package com.Spring_API.School_Trip.Controller;

import com.Spring_API.School_Trip.Entity.Students;
import com.Spring_API.School_Trip.Repository.StudentRepository;
import jakarta.validation.Valid;
import jakarta.validation.Validation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepository srepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public List<String> save(@Valid @RequestBody Students students){
        Students saveStudent =srepo.save(students);
        ResponseEntity.ok(saveStudent);
        return Collections.singletonList("Data Saved");
    }

    @GetMapping("/all")
    public List<Students> findAll(){
        return srepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Students> findById(@PathVariable int id){
        return srepo.findById(id);
    }

    @PutMapping("/upd/{id}")
    public ResponseEntity<Students> updateStudent(@PathVariable int id,@RequestBody Students updatedStudents){
        Students existingStudent=srepo.findById(id).orElse(null);

        if (existingStudent==null){
            return ResponseEntity.notFound().build();
        }

        existingStudent.setRollno(updatedStudents.getRollno());
        existingStudent.setName(updatedStudents.getName());
        existingStudent.setStd(updatedStudents.getStd());

        Students saveStudents=srepo.save(existingStudent);
        return ResponseEntity.ok(saveStudents);
    }


    @DeleteMapping("/del/{id}")
    public String delById(@PathVariable int id){
        srepo.findById(id);
        srepo.deleteById(id);
        return "Data Deleted";
    }
}


