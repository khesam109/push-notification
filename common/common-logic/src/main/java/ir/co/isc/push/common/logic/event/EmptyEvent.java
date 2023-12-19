package ir.co.isc.push.common.logic.event;

public final class EmptyEvent implements DomainEvent<Void> {

    private EmptyEvent() {
    }

    @Override
    public void fire() {

    }
}
