# Eksemple på EIP

```planetuml
!includeurl https://raw.githubusercontent.com/aheil/EIP-PlantUML/master/dist/EIP-PlantUML.puml
  left to right direction 
skinparam rectangle {
  BackgroundColor #ccff99
} 

MessageTranslator(catchRequest, "Logbook Request")
MessageStore(catch,"Catch Domain")

MessageTranslator(validReq, "Validate Request")
ProcessManager(validate,"BRE")   
MessageTranslator(validResp, "Validate Response")
MessageTranslator(mapFluxReport,"FLUXBridgePostmsg")
MessageTranslator(prepareBridge, "Prepare FluxBridge")
MessageStore(fluxBridge,"FluxBridge")
MessageTranslator(fluxResponse,"Flux Response")

```