package com.sparta.todo.Controller;

import com.sparta.todo.Dto.TodoSaveResponseDto;
import com.sparta.todo.Dto.TodoSaveRequestDto;
import com.sparta.todo.Service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TodoController {

        private final TodoService todoService;

        // level 1. 일정 작성
        @PostMapping("/todos")
        public TodoSaveResponseDto saveTodo(@RequestBody TodoSaveRequestDto todoSaveRequestDto){
            return todoService.saveTodo(todoSaveRequestDto);
        }

}
