package com.myspingapp.springsamfrst.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Student {

    @Id
    private  Integer roll ;

    private  String name ;
    private  String address ;


}
