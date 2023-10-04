package spring.listner.entity;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class EntityEvent extends ApplicationEvent {

    @Getter
    private final AccesType accesType;

    public EntityEvent(Object source, AccesType accesType) {
        super(source);
        this.accesType = accesType;
    }
}
