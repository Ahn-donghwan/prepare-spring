package com.sparta.todo.Dto;

import lombok.Getter;

@Getter
public class TodoSaveResponseDto {

    private final Long id;
    private final String todo;
    private final String managerName;
    private final String password;

    public TodoSaveResponseDto(Long id, String todo, String managerName, String password) {
        this.id = id;
        this.todo = todo;
        this.managerName = managerName;
        this.password = password;
    }
}
