package org.duckdns.owly.bugs.quarkus;

public abstract class AbstractRestResourceImpl implements AbstractRestResource<String>{
    abstract protected String getPrefix();

    @Override
    public String getById(long id) {
        return getPrefix() + " " + id;
    }
}
