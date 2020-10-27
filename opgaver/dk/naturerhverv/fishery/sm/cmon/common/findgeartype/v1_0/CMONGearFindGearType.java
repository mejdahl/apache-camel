package dk.naturerhverv.fishery.sm.cmon.common.findgeartype.v1_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 2.7.11
 * 2020-10-27T13:08:19.111+01:00
 * Generated source version: 2.7.11
 * 
 */
@WebService(targetNamespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindGearType:v1.0", name = "CMON.Gear.FindGearType")
@XmlSeeAlso({dk.naturerhverv.fishery.sm.cmon.common.findgeartype.v1.ObjectFactory.class, dk.fd.dm.base.v1.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CMONGearFindGearType {

    @WebMethod(operationName = "FindGearType", action = "FindGearType")
    @WebResult(name = "FindGearTypeRes", targetNamespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindGearType:v1.0", partName = "part")
    public dk.naturerhverv.fishery.sm.cmon.common.findgeartype.v1.FindGearTypeRes findGearType(
        @WebParam(partName = "part", name = "FindGearTypeReq", targetNamespace = "urn:dk:naturerhverv:fishery:sm:cmon:Common:FindGearType:v1.0")
        dk.naturerhverv.fishery.sm.cmon.common.findgeartype.v1.FindGearTypeReq part
    );
}
