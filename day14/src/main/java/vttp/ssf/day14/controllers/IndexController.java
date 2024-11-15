// package vttp.ssf.day14.controllers;

// import java.util.*;

// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// // import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;

// // import jakarta.servlet.http.HttpSession;
// import vttp.ssf.day14.models.*;

// @Controller
// @RequestMapping(path={"/", "/index"})
// public class IndexController {

//     // List<Task> taskList = new ArrayList<>();

//     // @GetMapping
//     // public String getIndex(Model model) {
//     //     model.addAttribute("task", new Task());
//     //     model.addAttribute("taskList", taskList);
//     //     model.addAttribute("sessionKey", Task.SESSION_KEY);
//     //     return "index";
//     // }

//     // @GetMapping
//     // public String getIndex(Model model, HttpSession session) {
//     //     // List<Task> taskList = (List<Task>)session.getAttribute("taskList");
//     //     // if(null == taskList) {
//     //     //     taskList = new LinkedList<>();
//     //     //     session.setAttribute("taskList", taskList);
//     //     // }
//     //     List<Task> taskList = Task.getTaskList(session);
//     //     model.addAttribute("task", new Task());
//     //     model.addAttribute("taskList", taskList);
//     //     return "index";
//     // }

//     // @PostMapping
// 	// public String postIndex(Model model, HttpSession session) {

// 	// 	session.invalidate();

// 	// 	model.addAttribute("task", new Task());
// 	// 	model.addAttribute("taskList", new LinkedList<Task>());

// 	// 	return "index";
// 	// }
// }
