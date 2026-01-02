package com.molier.login.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
import com.molier.login.models.User;

//I am making this controller to handle authentication-related requests e.g. login and signup pages
//Anything reated to authentication will be handled here
@Controller
@RequestMapping
public class AuthController {
    private List<User> users = new ArrayList<>();
    //I am making this method to serve the login page
    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }
    //I am making this method to serve the signup page
    @GetMapping("/signup")
    public String signupPage(){
        return "index";
    }

    //I am making this method to handle login form submissions
    //This method takes the user from the UserController's static List<User> useres.
    //It checks if the email and password entered in the login page matches the user details in the List<User> (Simulating a database here for the time being)
    //If a match is found, the user is redirected to the landing_page.html
    //If no match is found, the user is redirected to a page called Unidentified_user.html
    //wow
    //However i need to figure out how to secure passwords properly later on (tomorrow) 
    @PostMapping("/login")
    public String login(@RequestParam String mail, @RequestParam String password, Model model){
        
        for(User u : users){
            if(u.getMail().equals(mail) && u.getPassword().equals(password)){
                return "landing_page";
            }
        }
        
        return "Unidentified_user";
    }
    
    //Upon signup (through the post method from the index.html form), this method is called
    //Spring automatically binds the form data to a User object using @ModelAttribute, a new User object is created automatically with the form data
    @PostMapping("/signup")
    public String signup(@ModelAttribute User user){
        System.out.println(user.show());
        users.add(user);
        return "login";
    }
    //there is a difference between @PostMapping and @GetMapping
    //PostMapping is used to handle form submissions and data modifications
    //GetMapping is used to retrieve and display data without modifying it

    
}
