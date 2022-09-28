package guru.springframework.sfgdi.Services;

public class GreetingServiceImpl implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello World - inside sayGreeting()";
    }
}
