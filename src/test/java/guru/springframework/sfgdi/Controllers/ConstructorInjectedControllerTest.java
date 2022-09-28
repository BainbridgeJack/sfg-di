package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.GreetingService;
import guru.springframework.sfgdi.Services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;
    GreetingServiceImpl greetingServiceToBeInjected;

    @BeforeEach
    void setUp() {
        greetingServiceToBeInjected = new GreetingServiceImpl();
        constructorInjectedController = new ConstructorInjectedController(greetingServiceToBeInjected);
    }

    @Test
    void getGreeting() {
        System.out.println(constructorInjectedController.getGreeting());
    }
}