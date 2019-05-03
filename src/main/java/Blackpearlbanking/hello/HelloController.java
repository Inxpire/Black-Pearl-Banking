package Blackpearlbanking.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//marks the class ass a controller for Spring MVC
public class HelloController {

    @RequestMapping("/")// for get http get method, tells Spring what http url to map return value to
    public String sayHi(){
        return "arrrg! who goes there?!";
    }
}
