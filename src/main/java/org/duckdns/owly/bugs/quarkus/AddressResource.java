package org.duckdns.owly.bugs.quarkus;

import javax.ws.rs.Path;

@Path("/address")
public class AddressResource implements AbstractRestResource<String> {
    @Override
    public String getById(long id) {
        return "Disney Land, Gate " + id;
    }
}
