package com.sparta.todo.Service;

import com.sparta.todo.Dto.TodoSaveRequestDto;
import com.sparta.todo.Dto.TodoSaveResponseDto;
import com.sparta.todo.Entity.Todo;
import com.sparta.todo.Repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoSaveResponseDto saveTodo(TodoSaveRequestDto todoSaveRequestDto) {
        Todo todo = new Todo(
                todoSaveRequestDto.getTodo(),
                todoSaveRequestDto.getManagerName(),
                todoSaveRequestDto.getPassword()

        );

        Todo savedTodo = todoRepository.save(todo);
        return new TodoSaveResponseDto(
                savedTodo.getId(),
                savedTodo.getTodo(),
                savedTodo.getManagerName(),
                savedTodo.getPassword()
        );
    }
}
