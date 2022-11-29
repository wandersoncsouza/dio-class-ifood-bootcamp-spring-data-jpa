package dio.aula;

import java.net.ResponseCache;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dio.aula.model.User;
import dio.aula.repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository repository;

    @Override
    public void run(String... args) throws Exception {
        
        User usuario = new User();
        usuario.setName("WANDERSON");
        usuario.setUsername("wanderneguinho");
        usuario.setPassword("Dio1234");

        repository.save(usuario);

        for (User u: repository.findAll()) {
            System.out.println(u);
        }
        
    }
    
}
