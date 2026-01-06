package com.molier.jdbc_connection.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.molier.jdbc_connection.Repository.StudentRepo;
import com.molier.jdbc_connection.Entity.StudentEntity;

@Service
public class StudentService {
    
    @Autowired
    private StudentRepo studentRepo;

    public StudentEntity saveDetails(StudentEntity student){
        //save method of studentRepo is called to save the student entity to the database
        //save method is inherited from JpaRepository
        return studentRepo.save(student);
    }
    
}
