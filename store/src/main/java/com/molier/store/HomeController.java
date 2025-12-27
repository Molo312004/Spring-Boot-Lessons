package com.molier.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //This is an annotation: It tells spring framework that this java file is a controller

public class HomeController {
    

    @RequestMapping("/") //"/" means map this method with the root of our website
    public String index(){
       
        return "index.html";
    }
    
}
