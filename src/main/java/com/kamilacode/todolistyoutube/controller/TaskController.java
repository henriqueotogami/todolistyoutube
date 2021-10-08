package com.kamilacode.todolistyoutube.controller;

import com.kamilacode.todolistyoutube.model.Task;
import com.kamilacode.todolistyoutube.service.TaskService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1")
@AllArgsConstructor
@Slf4j
public class TaskController {

    TaskService taskService;

    @ApiOperation(value = "Criando uma nova tarefa.")
    @ApiResponses(value ={
            @ApiResponse(code = 201, message = "Tarefa criada com sucesso."),
            @ApiResponse(code = 500, message = "Erro ao criar a tarefa, verifique as informações fornecidas.")
    })

    @PostMapping("/tasks")
    @ResponseStatus(HttpStatus.CREATED)
    public Task createTask(@RequestBody Task task){
        log.info("Criando uma nova tarefa com as informações [{}]", task);
        return taskService.createTask(task);
    }


    @ApiOperation(value = "Listando todas as tarefas.")
    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "Tarefas listadas com sucesso."),
            @ApiResponse(code = 500, message = "Erro ao listar as tarefas, tente novamente.")
    })

    @GetMapping("/tasks")
    @ResponseStatus(HttpStatus.OK)
    public List<Task> getAllTasks() {
        log.info("Listando todas as tarefas cadastradas");
        return taskService.listAllTasks();
    }


    @ApiOperation(value = "Buscando uma tarefa pelo identificador único(ID).")
    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "Tarefa encontrada com sucesso."),
            @ApiResponse(code = 500, message = "Tarefa não encontrada com o ID fornecido. Verifique o ID e tente novamente.")
    })

    @GetMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> getTaskById(@PathVariable (value = "id") Long id){
        log.info("Buscando a tarefa com o id: [{}]", id);
        return taskService.findTaskById(id);
    }


    @ApiOperation(value = "Atualizando uma nova tarefa existente.")
    @ApiResponses(value ={
            @ApiResponse(code = 200, message = "Tarefa atualizada com sucesso."),
            @ApiResponse(code = 404, message = "Não foi possível atualizar a tarefa, pois não foi encontrada.")
    })

    @PutMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Task> updateTaskById(@PathVariable (value = "id") Long id, @RequestBody Task task){
        log.info("Atualizando a tarefa com id [{}], as novas informações são: [{}]", id, task);
        return taskService.updateTaskById(task,id);
    }


    @ApiOperation(value = "Excluindo uma tarefa existente.")
    @ApiResponses(value ={
            @ApiResponse(code = 201, message = "Tarefa excluída com sucesso."),
            @ApiResponse(code = 500, message = "Não foi possível excluir a tarefa, pois não foi encontrada.")
    })

    @DeleteMapping("/tasks/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<Object> deleteTaskById(@PathVariable (value = "id") Long id){
        log.info("Excluindo tarefa com o id [{}]", id);
        return taskService.deleteById(id);
    }
}
