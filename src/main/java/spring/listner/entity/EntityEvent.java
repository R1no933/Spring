package spring.listner.entity;

import org.springframework.context.ApplicationEvent;

public class EntityEvent extends ApplicationEvent {
    private final AccesType accesType;

    public EntityEvent(Object source, AccesType accesType) {
        super(source);
        this.accesType = accesType;
    }

    public AccesType getAccesType() {
        return accesType;
    }
}
