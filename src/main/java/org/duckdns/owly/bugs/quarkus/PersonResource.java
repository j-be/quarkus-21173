package org.duckdns.owly.bugs.quarkus;

import javax.ws.rs.Path;

@Path("/person")
public class PersonResource extends AbstractRestResourceImpl {
    @Override
    public String getPrefix() {
        return "Donald Duck";
    }
}
