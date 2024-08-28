package com.sparta.todo.Dto;

import lombok.Getter;

@Getter
public class TodoSaveRequestDto {

    private final String todo;
    private final String managerName;
    private final String password;

    public TodoSaveRequestDto(String todo, String managerName, String password) {
        this.todo = todo;
        this.managerName = managerName;
        this.password = password;
    }
}
