package org.duckdns.owly.bugs.quarkus;

import javax.ws.rs.Path;

@Path("/address")
public class AddressResource extends AbstractRestResourceImpl {
    @Override
    protected String getPrefix() {
        return "Disney Land, Gate";
    }
}
