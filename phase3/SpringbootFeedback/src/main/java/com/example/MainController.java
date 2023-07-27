package com.example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MainController {
@Autowired
private FeedbackDao dao;
@PostMapping("/feedback")
public String userRegister(@RequestParam("name") String name,
@RequestParam("email") String email , @RequestParam("feedback")
String feedback) {
Feedback f = new Feedback(name,email,feedback);
int data= dao.addFeedback(f);
if(data>0) {
return "Feedback added succesfully!";
}
else {
return "Unable to add the feedback";
}
}
}