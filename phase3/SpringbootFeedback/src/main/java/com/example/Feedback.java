package com.example;
import javax.annotation.processing.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan
@org.springframework.data.relational.core.mapping.Table(name="feedback")
public class Feedback {
@org.springframework.data.annotation.Id @Generated(value = { "" })
private int Id;
private String name;
private String email;
private String feedback;
public Feedback(String name, String email, String feedback) {
super();
this.name = name;
this.email = email;
this.feedback = feedback;
}
public int getId() {
return Id;
}
public void setId(int Id) {
this.Id = Id;
}
public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}
public String getEmail() {
return email;
}
public void setEmail(String email) {
this.email = email;
}
public String getFeedback() {
return feedback;
}
public void setFeedback(String feedback) {
this.feedback = feedback;
}
@Override
public String toString() {
return "Feedback [Id=" + Id + ", name=" + name + ", email=" + email
+ ", feedback=" + feedback + "]";
}
}

