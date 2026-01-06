package com.molier.jdbc_connection.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.molier.jdbc_connection.Service.StudentService;
import com.molier.jdbc_connection.Entity.StudentEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    //Data is sent from postman to the controller in JSON format, it is then converted to StudentEntity object using @RequestBody
    @PostMapping("/addStudent")
    public StudentEntity postDetails(@RequestBody StudentEntity student){

        //saveDetails method of studentService is called to save the student details to the database. It is done with the help of save method
        return studentService.saveDetails(student);
    }

}
