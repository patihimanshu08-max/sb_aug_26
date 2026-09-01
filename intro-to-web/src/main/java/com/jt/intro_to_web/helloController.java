package com.jt.intro_to_web;

// import org.springframework.stereotype.Component;
import java.io.PrintWriter;

import org.springframework.boot.web.server.Cookie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;


 //it marks the class as the controller class
                //which means that class is responsible to handle http request
@Controller
public class helloController {
    @RequestMapping("/home")                    //this annotation hadles the custom path inside a controller class
    public void sayHello(PrintWriter writer){
        System.out.println("Hello Web");
        writer.println("<h1>Hello SpringWeb</h1><p>Welcome Home</p>");
    }

    @RequestMapping("/")
    public void landingPage(PrintWriter printwriter){
        System.out.println("landing page1");
        printwriter.println("our First landing page1");
    }
    @RequestMapping("/contact") 
    public String contact(){
        return "contact-page";
    }
    
    // @RequestMapping("/submit-details")
    // public String submitDetails(HttpServletRequest request,Model model){
    //     System.out.println("Submit details handled");

    //     String name = request.getParameter("name");
    //     String phone = request.getParameter("phone");

    //     // System.out.println("name is:-  "+ name);
    //     // System.out.println("phone is:-  "+ phone);

    //     model.addAttribute("name",name);
    //     model.addAttribute("phone",phone);

    //     return "details-page" ;
    // }

    //  @RequestMapping(value="/submit-details",method= RequestMethod.POST)
    // public String submitDetails(@RequestParam(value= "name1",
    //                                 required=false,
    //                                 defaultValue="SpringBoot") String name1,
    //                             @RequestParam String phone,Model model){
        
    //     model.addAttribute("name1",name1);
    //     model.addAttribute("phone",phone);

    //     return "details-page" ;
    // }
    @RequestMapping(value="/submit-details",method= RequestMethod.POST)
    public String submitDetails(@ModelAttribute Person person,Model model){
        
        model.addAttribute("name1",person.getName1());
        model.addAttribute("phone",person.getPhone());

        return "details-page" ;
    }
}
