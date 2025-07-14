package com.myspingapp.springsamfrst.Repository;

import com.myspingapp.springsamfrst.Model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository  extends MongoRepository<Student , Integer> {

}
