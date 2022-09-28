package guru.springframework.sfgdi.Services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {

    @Qualifier("setterGreetingService")
    @Override
    public String sayGreeting() {
        return "Hello World - inside SetterGreetingService()";
    }
}
