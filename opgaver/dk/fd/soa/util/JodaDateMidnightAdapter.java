package dk.fd.soa.util;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.DateMidnight;

/**
 *
 * @author sitr
 */
public class JodaDateMidnightAdapter extends XmlAdapter<String, DateMidnight> {

    @Override
    public DateMidnight unmarshal(String v) throws Exception {
        return new DateMidnight(v);
    }

    @Override
    public String marshal(DateMidnight v) throws Exception {
        return v.toString();
    }
}
