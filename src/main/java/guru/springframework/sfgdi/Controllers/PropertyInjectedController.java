package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.GreetingService;

public class PropertyInjectedController {

    public GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
