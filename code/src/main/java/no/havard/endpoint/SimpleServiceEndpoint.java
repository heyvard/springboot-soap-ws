package no.havard.endpoint;


import no.havard.header.Header;
import no.havard.service.SimpleService;

import javax.xml.bind.annotation.XmlElement;
import java.time.Instant;


public class SimpleServiceEndpoint implements SimpleService {


    @Override
    public String ping(@XmlElement(required = true) String input, @XmlElement(required = true) Header header) {
        return "hello " + header.getBrukerId() + " " + Instant.now();

    }
}
