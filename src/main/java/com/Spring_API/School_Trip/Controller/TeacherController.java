package com.Spring_API.School_Trip.Controller;


import com.Spring_API.School_Trip.Entity.Students;
import com.Spring_API.School_Trip.Entity.Teachers;
import com.Spring_API.School_Trip.Repository.TeacherRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Repository
@RequestMapping("/teachers")
public class TeacherController {

    @Autowired
    TeacherRepository trepo;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }

    @PostMapping("/save")
    public List<String> save(@Valid @RequestBody Teachers teachers){
        Teachers saveTeachers =trepo.save(teachers);
        ResponseEntity.ok(saveTeachers);
        return Collections.singletonList("Data Saved");
    }

    @GetMapping("/all")
    public List<Teachers> findAll(){
        return trepo.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Teachers> findById(@PathVariable String id){
        return trepo.findById(id);
    }

    @PutMapping("/upd/{id}")
    public ResponseEntity<Teachers> updateTeachers(@PathVariable String id,@RequestBody Teachers updatedTeachers){
        Teachers existingTeachers=trepo.findById(id).orElse(null);

        if (existingTeachers==null){
            return ResponseEntity.notFound().build();
        }

        existingTeachers.setId(updatedTeachers.getId());
        existingTeachers.setName(updatedTeachers.getName());
        existingTeachers.setSub(updatedTeachers.getSub());

        Teachers saveTeachers=trepo.save(existingTeachers);
        return ResponseEntity.ok(saveTeachers);
    }


    @DeleteMapping("/del/{id}")
    public String delById(@PathVariable String id){
        trepo.findById(id);
        trepo.deleteById(id);
        return "Data Deleted";
    }
}
