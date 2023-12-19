package ir.co.isc.push.common.logic.event;

public interface DomainEvent<T> {

    void fire();
}
