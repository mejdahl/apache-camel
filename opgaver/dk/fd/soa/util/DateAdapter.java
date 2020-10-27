package dk.fd.soa.util;

import java.util.Calendar;
import java.util.TimeZone;

import javax.xml.bind.DatatypeConverter;
import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 * Utility class for parsing and formatting "dates" between jaxb objects and XML. Calls to the {@link
 * #marshal(Calendar)} method are inserted into the generated source during jaxb compilation stage.
 * 
 * 
 * Note: The date is represented by a calendar where hours and minutes are zero.
 * 
 */
public class DateAdapter extends XmlAdapter<String, Calendar> {
    
    /**
     * Converts a string representing the date format in the XML Schema specification,
     * see http://www.w3.org/TR/xmlschema-2/#date
     */
    @Override
    public Calendar unmarshal(String str) {
        // Init
        if (str == null) {
            return null;
        }
        
        // Parse
        Calendar result = DatatypeConverter.parseDate(str);
        
        // Convert to UTC timezone. We ignore the time here
        result.setTimeZone(TimeZone.getTimeZone("UTC"));
        
        return result;
    }

    /**
     * Converts a <code>Calendar</code> object to date string specified in the XML Schema specification,
     * see http://www.w3.org/TR/xmlschema-2/#date
     *
     */
    @Override
    public String marshal(Calendar cal) {
        // Init
        if (cal == null) {
            return null;
        }
        
        // Convert
        String result = DatatypeConverter.printDate(cal);
        return result;
    }
}
