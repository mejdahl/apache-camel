package dk.fd.soa.util;

import dk.fd.util.StringUtilities;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;

/**
 *
 * @author sitr
 */
public class JodaDateTimeAdapter extends XmlAdapter<String, DateTime> {

    @Override
    public DateTime unmarshal(String v) throws Exception {
        if (StringUtilities.isNullOrEmpty(v)) {
            return null;
        }
        return new DateTime(v, DateTimeZone.UTC);
    }

    @Override
    public String marshal(DateTime v) throws Exception {
        if (v == null) {
            return null;
        }
        return new DateTime(v, DateTimeZone.UTC).toString(DateTimeFormat.forPattern("YYYY-MM-dd'T'HH:mm:ss'Z'"));
    }
}
