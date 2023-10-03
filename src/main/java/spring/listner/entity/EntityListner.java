package spring.listner.entity;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EntityListner {

    @Order(10)
    @EventListener(condition = "#root.args[0].accesType.name() == 'READ'")
    public void acceptEntity(EntityEvent event) {
        System.out.println("Entity " + event);
    }
}
