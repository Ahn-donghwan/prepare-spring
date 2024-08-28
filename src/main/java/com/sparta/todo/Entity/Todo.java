package com.sparta.todo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

// Entity Annotation 5형제 추가
@Getter
@Entity
@NoArgsConstructor
public class Todo extends Timestamped {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String todo;
    private String managerName;
    private String password;


    public Todo(String todo, String managerName, String password) {
        this.todo = todo;
        this.managerName = managerName;
        this.password = password;
    }
}