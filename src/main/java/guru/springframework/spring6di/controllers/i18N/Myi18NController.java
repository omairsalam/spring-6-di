package guru.springframework.spring6di.controllers.i18N;

import guru.springframework.spring6di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class Myi18NController {
    public Myi18NController(@Qualifier("i18NService")GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    private final GreetingService greetingService;

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
