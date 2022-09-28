package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    ConstructorGreetingService greetingServiceToBeInjected;

    @BeforeEach
    void setUp() {
        greetingServiceToBeInjected = new ConstructorGreetingService();
        constructorInjectedController = new ConstructorInjectedController(greetingServiceToBeInjected);
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}