package vttp.ssf.day14.controllers;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

// import jakarta.servlet.http.HttpSession;
// import jakarta.validation.Valid;
import vttp.ssf.day14.models.*;

@Controller
// @RequestMapping("/task")
public class TaskController {
    
    List<Task> taskList = new LinkedList<>();
    private String sessionKey = "12345";

    @GetMapping({"/", "/index"})
    public String getIndex(Model model) {
        model.addAttribute("task", new Task());
        model.addAttribute("taskList", taskList);
        model.addAttribute("sessionKey", sessionKey);
        return "index";
    }

    @PostMapping("/")
    public String postIndex(Model model) {

        model.addAttribute("task", new Task());
        model.addAttribute("taskList", new LinkedList<>());
        model.addAttribute("sessionKey", sessionKey);
        return "index";
    }

    @PostMapping("/task")
    public String postTask(Model model, @RequestParam String sessionKey, @ModelAttribute Task task) {
        if(!sessionKey.equals(Task.SESSION_KEY)) {
            return "fail"; 
        }

        taskList.add(task);
        model.addAttribute("taskList", taskList);
        model.addAttribute("sessionKey", Task.SESSION_KEY);
        return "redirect:/";

    }
//     @PostMapping
//     public String postTask(Model model, HttpSession session, @ModelAttribute Task task) {

//         // List<Task> taskList = (List<Task>)session.getAttribute("taskList");
//         // if(null == taskList) {
//         //     taskList = new LinkedList<>();
//         //     session.setAttribute("taskList", taskList);
//         // }
//         List<Task> taskList = Task.getTaskList(session);
//         taskList.add(task);
//         model.addAttribute("task", new Task());
//         model.addAttribute("taskList", taskList);

//         return "index";
//     }
}
