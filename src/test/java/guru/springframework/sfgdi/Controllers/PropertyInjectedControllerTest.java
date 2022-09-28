package guru.springframework.sfgdi.Controllers;

import guru.springframework.sfgdi.Services.ConstructorGreetingService;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    // Mimic the Spring Context Creation for our test.
    void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService = new ConstructorGreetingService();
    }

    void sayGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}