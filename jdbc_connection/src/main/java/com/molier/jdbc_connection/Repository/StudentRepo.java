package com.molier.jdbc_connection.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.molier.jdbc_connection.Entity.StudentEntity;

//A repository is a mechanism for encapsulating storage, retrieval, and search behavior which emulates a collection of objects
//Basically repo talks with the database
@Repository // Indicates that the class is a repository and will handle data operations
public interface StudentRepo extends JpaRepository<StudentEntity, Integer> {

}
