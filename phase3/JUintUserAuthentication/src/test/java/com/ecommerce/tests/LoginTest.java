package com.ecommerce.tests;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ecommerce.tests.Login;
public class LoginTest {
private Login login;
@Before
public void setup() {
login= new Login();
System.out.println("Login Initiated");
}
@After
public void tearDown() {
login=null;
System.out.println("Login Closed");
}
@Test
public void bothcorrect() {
assertEquals(true,login.auth("archana","archana@777"));
System.out.println("Both Username and Password are correct");
}
@Test
public void WrongUsername() {
assertEquals(false,login.auth("archanabejjanki","archana@777")
);
System.out.println("Username is incorrect");
}
@Test
public void WrongPassword() {
assertEquals(false,login.auth("archana","arc777"));
System.out.println("Password is incorrect");
}
@Test
public void WrongUsernameandPassword() {
assertEquals(false,login.auth("b_archana","ammu@777"));
System.out.println("Both Username and Password are incorrect");
}
}