package com.myspingapp.springsamfrst.Controller;

import com.myspingapp.springsamfrst.Model.Student;
import com.myspingapp.springsamfrst.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {
    @Autowired
    StudentRepository studentrepo ;

    @PostMapping("/addStudent")
    public  void addstudent (@RequestBody Student student ){
        studentrepo.save(student);
    }

    @GetMapping("/getstudent/{id}")
    public Student getstudent (@PathVariable Integer id){
        return studentrepo.findById(id).orElse(null) ;
    }

    @GetMapping ("/getAllStudents")
    public List<Student> getAllStudents(){
        return  studentrepo.findAll() ;
    }

    @PutMapping ("/updateStudent")
    public void updateStudent(@RequestBody Student student){
        Integer id = student.getRoll() ;
        Student data = studentrepo.findById(id).orElse(null) ;
        if(data != null){
            data.setName(student.getName());
            data.setAddress(student.getAddress());
            studentrepo.save(data);
        }
    }
}
