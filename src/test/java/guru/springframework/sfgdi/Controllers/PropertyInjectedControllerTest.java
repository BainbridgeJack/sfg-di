package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.GreetingServiceImpl;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    // Mimic the Spring Context Creation for our test.
    void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    void sayGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}