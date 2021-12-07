package org.duckdns.owly.bugs.quarkus;

import javax.ws.rs.Path;

@Path("/person")
public class PersonResource implements AbstractRestResource<String> {
    @Override
    public String getById(long id) {
        return "Donald Duck " + id;
    }
}
