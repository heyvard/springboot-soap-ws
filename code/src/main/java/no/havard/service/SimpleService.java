package no.havard.service;

import no.havard.header.Header;
import org.apache.cxf.annotations.SchemaValidation;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlElement;

@WebService(name = "SimpleService", targetNamespace = "http://www.havard.no/namespace/ping/")
@SchemaValidation
public interface SimpleService {

    @WebMethod(operationName = "Ping")

    String ping(@WebParam(name = "input") String input,
                @WebParam(name = "header", header = true) Header header);
}
