package no.havard.header;


import com.migesok.jaxb.adapter.javatime.InstantXmlAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.Instant;

@XmlAccessorType(XmlAccessType.FIELD)

public class Header {

    @XmlJavaTypeAdapter(InstantXmlAdapter.class)
    private Instant tidspunkt;

    @XmlElement(required = true)
    private String brukerId;

    public Instant getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(Instant tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public String getBrukerId() {
        return brukerId;
    }

    public void setBrukerId(String brukerId) {
        this.brukerId = brukerId;
    }
}
