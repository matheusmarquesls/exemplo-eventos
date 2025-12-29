package sptech.school.eventos.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import sptech.school.eventos.event.UserCreantedEvent;

@Component
public class UserCreatedListener {
    @EventListener
    public void UserCreatedEvent(UserCreantedEvent event){
        String nome = event.getUser().getNome();
        System.out.println("Enviando nome para:" + nome);
        String email = event.getUser().getEmail();
        System.out.println("Enviando Email para:" + email);
        // aqui poderiamos inserir outros serviços de envio reais
    }


}
