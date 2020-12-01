package com.mongocrud.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class User {

    @Id
    public Integer id;
    public String name;
    public Long salary;
}
