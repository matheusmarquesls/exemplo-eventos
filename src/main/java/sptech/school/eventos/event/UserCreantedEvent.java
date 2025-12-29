package sptech.school.eventos.event;

import org.springframework.context.ApplicationEvent;
import sptech.school.eventos.model.User;
import org.springframework.context.ApplicationContext;
public class UserCreantedEvent extends ApplicationEvent {

    private final User user;

    public  UserCreantedEvent(Object source, User user){
        super(source);
        this.user = user;
    }

    public User getUser(){
        return user;
    }
}
