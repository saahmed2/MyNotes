package com.notetakingapp.mynotes.data;

import java.io.Serializable;

public class ToDoList implements Serializable {

    private int idToDo;
    private String todoTitle;
    private String todoDesc;
    private String todoImage;
    private long dayTime;

    public ToDoList() {
        //empty
    }

    public ToDoList(int idToDo, String todoTitle, String todoDesc, String todoImage, long dayTime) {
        this.idToDo = idToDo;
        this.todoTitle = todoTitle;
        this.todoDesc = todoDesc;
        this.todoImage = todoImage;
        this.dayTime = dayTime;
    }

    public int getIdToDo() {
        return idToDo;
    }

    public void setIdToDo(int idToDo) {
        this.idToDo = idToDo;
    }

    public String getTodoTitle() {
        return todoTitle;
    }

    public void setTodoTitle(String todoTitle) {
        this.todoTitle = todoTitle;
    }

    public String getTodoDesc() {
        return todoDesc;
    }

    public void setTodoDesc(String todoDesc) {
        this.todoDesc = todoDesc;
    }

    public String getTodoImage() {
        return todoImage;
    }

    public void setTodoImage(String todoImage) {
        this.todoImage = todoImage;
    }

    public long getDayTime() {
        return dayTime;
    }

    public void setDayTime(long dayTime) {
        this.dayTime = dayTime;
    }
}
