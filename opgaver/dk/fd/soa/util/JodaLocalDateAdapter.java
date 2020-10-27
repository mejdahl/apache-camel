package dk.fd.soa.util;

import dk.fd.util.StringUtilities;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.LocalDate;

/**
 *
 * @author sitr
 */
public class JodaLocalDateAdapter extends XmlAdapter<String, LocalDate> {

    @Override
    public LocalDate unmarshal(String v) throws Exception {
        if (v!=null && v.length()>0) {
            return null;
        }
        return new LocalDate(v);
    }

    @Override
    public String marshal(LocalDate v) throws Exception {
        if (v == null) {
            return null;
        }
        return v.toString();
    }
}
