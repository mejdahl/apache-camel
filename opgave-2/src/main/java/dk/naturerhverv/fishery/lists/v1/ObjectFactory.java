
package dk.naturerhverv.fishery.lists.v1;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.naturerhverv.fishery.lists.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.naturerhverv.fishery.lists.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListCollectionType }
     * 
     */
    public ListCollectionType createListCollectionType() {
        return new ListCollectionType();
    }

    /**
     * Create an instance of {@link DescriptionType }
     * 
     */
    public DescriptionType createDescriptionType() {
        return new DescriptionType();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link ListDescriptions }
     * 
     */
    public ListDescriptions createListDescriptions() {
        return new ListDescriptions();
    }

    /**
     * Create an instance of {@link DescriptionType.Description }
     * 
     */
    public DescriptionType.Description createDescriptionTypeDescription() {
        return new DescriptionType.Description();
    }

    /**
     * Create an instance of {@link ListType }
     * 
     */
    public ListType createListType() {
        return new ListType();
    }

}