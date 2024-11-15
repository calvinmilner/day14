package vttp.ssf.day14.models;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.servlet.http.HttpSession;

public class Task {
    private String name;
    private String priority = "medium";
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private LocalDate completeDate;
    public static final String SESSION_KEY = "12345";
    // public static final long SESSION_COUNTER = 1;
    // public List<Task> taskList = new LinkedList<>();

    @Override
    public String toString() {
        return "Task [name=" + name + ", priority=" + priority + ", completeDate=" + completeDate + "]";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPriority() {
        return priority;
    }
    public void setPriority(String priority) {
        this.priority = priority;
    }
    public LocalDate getCompleteDate() {
        return completeDate;
    }
    public void setCompleteDate(LocalDate completeDate) {
        this.completeDate = completeDate;
    }
    
    @SuppressWarnings("unchecked")
    public static List<Task> getTaskList(HttpSession session) {
        
        List<Task> taskList = (List<Task>)session.getAttribute("taskList");
        if(null == taskList) {
            taskList = new LinkedList<>();
            session.setAttribute("taskList", taskList);
        }
        return taskList;
    }

}
