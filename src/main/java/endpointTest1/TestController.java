package endpointTest1;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
public class TestController {
    
    @RequestMapping("/")
    public String index() {
        return "You're not going anywhere...";
    }    
    
    @RequestMapping("/insult")    public String insult() {
        return "You lost homeboy?";
    }    
    
    @RequestMapping("/greet")
    public String greet() {
        return "Greetings from La Boot!";
    }
    @RequestMapping(value = "/echo/{in}", method = RequestMethod.GET)
    public String echo(@PathVariable(value = "in") final String in) {
        return "You said: " + in;
    }
    
}
