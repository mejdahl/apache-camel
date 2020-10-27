package dk.fd.soa.util;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * Converts between Calendar and XMLGregorianCalendar objects. Both date and time are considered.
 *
 */
public class CalendarUtil {
    // The datatype factory to produce XMLGregorianCalendar objects
    private static DatatypeFactory dataFactory;

    static {
        try {
            dataFactory = DatatypeFactory.newInstance();
        } catch (DatatypeConfigurationException e) {
            throw new RuntimeException("Could not get datafactory", e);
        }
    }
    
    private CalendarUtil() {
    }
    
    /**
     * Converts a calendar object to XMLGregorianCalendar.
     * @param cal Must be an instance of GregorianCalendar and it must have its timezone set. Otherwise it is not possible to correctly do the conversion
     * @return an instance of XMLGregorianCalendar where the timezone is set to UTC
     */
    public static XMLGregorianCalendar convert(Calendar cal) {
        if (cal == null) {
            return null;
        }
        if (!(cal instanceof GregorianCalendar)) {
            throw new RuntimeException("Unexpected calendar type: " + cal.getClass().getName());
        }
        GregorianCalendar gcal = (GregorianCalendar)cal;
        if (gcal.getTimeZone() == null) {
            // See the Javadoc for DatatypeFactory.newXMLGregorianCalendar(GregorianCalendar cal)
            throw new RuntimeException("No timezone found" + cal.toString());
        }
        XMLGregorianCalendar result = dataFactory.newXMLGregorianCalendar(gcal);
        result = result.normalize(); // Normalize timezone to UTC
        return result;
    }

    /**
     * Convert a XMLGregorianCalendar to a Calendar.
     * 
     * @param cal the XMLGregorianCalendar to convert
     * @return an instance of Calendar where the timezone is set to UTC
     */
    public static Calendar convert(XMLGregorianCalendar xcal) {
        // Init
        if (xcal == null) {
            return null;
        }
        
        // Convert
        GregorianCalendar cal = xcal.toGregorianCalendar();
        
        // Convert timezone to UTC (not necessary but gives a unified result)
        GregorianCalendar result = new GregorianCalendar(TimeZone.getTimeZone("UTC"));
        result.setTimeInMillis(cal.getTimeInMillis());

        return result;
    }
    
}
