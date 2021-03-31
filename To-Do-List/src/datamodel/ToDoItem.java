package datamodel;

import java.time.LocalDate;

public class ToDoItem {
    private String description;
    private String detail;
    private LocalDate deadLine;

    public ToDoItem(String description, String detail, LocalDate deadLine){
        this.description = description;
        this.detail = detail;
        this.deadLine = deadLine;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDetails() {
        return detail;
    }
    public void setDetails(String detail){
        this.detail = detail;
    }
    public LocalDate getDeadLine() {
        return deadLine;
    }
    public void setDeadLine(LocalDate deadLine){
        this.deadLine = deadLine;
    }

    @Override
    public String toString() {
        //return super.toString();
        return description;
    }
}
