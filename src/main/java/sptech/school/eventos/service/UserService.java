package sptech.school.eventos.service;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import sptech.school.eventos.EventosApplication;
import sptech.school.eventos.event.UserCreantedEvent;
import sptech.school.eventos.model.User;

@Service
public class UserService {
 //   private final EventosApplication eventosPublisher;

    private final ApplicationEventPublisher eventPublisher;
    public UserService(ApplicationEventPublisher eventPublisher){
        this.eventPublisher = eventPublisher;
    }
    public  User createdUser(User user){
        System.out.println("Usuario criado:" + user);
        // publicar o evento
        eventPublisher.publishEvent(new UserCreantedEvent(this,user));
        return user;
    }


}
