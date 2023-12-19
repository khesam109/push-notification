package ir.co.isc.push.common.logic.domain;

import ir.co.isc.push.common.logic.valueobject.BaseId;

import java.util.Objects;

public abstract class BaseDomainModel<ID extends BaseId<?>> {

    private ID id;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseDomainModel<?> that = (BaseDomainModel<?>) o;
        return id.equals(that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
