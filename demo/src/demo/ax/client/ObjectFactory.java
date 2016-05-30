
package demo.ax.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the demo.ax.client package. 
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

    private final static QName _UpdatePerformanceFeedback_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePerformanceFeedback");
    private final static QName _PowerOnServerWithCredential_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnServerWithCredential");
    private final static QName _RemovePolicy_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removePolicy");
    private final static QName _UpdateServerPowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateServerPowerProfile");
    private final static QName _UpdatePerformanceFeedbackResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePerformanceFeedbackResponse");
    private final static QName _ExecuteCommand_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "executeCommand");
    private final static QName _RankServersForWorkload_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rankServersForWorkload");
    private final static QName _PowerOnServer_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnServer");
    private final static QName _SchedulePolicy_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "schedulePolicy");
    private final static QName _IdentifyEntityByProtocolResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "identifyEntityByProtocolResponse");
    private final static QName _SetPolicyExResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyExResponse");
    private final static QName _PowerOffOutlet_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffOutlet");
    private final static QName _GetTemperatureRiseResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getTemperatureRiseResponse");
    private final static QName _FindEntitiesWithDetailsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "findEntitiesWithDetailsResponse");
    private final static QName _ExecuteCommandResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "executeCommandResponse");
    private final static QName _GetEventMessageAuthenticationKeyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEventMessageAuthenticationKeyResponse");
    private final static QName _ExportHierarchy_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "exportHierarchy");
    private final static QName _SetGlobalProperty_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setGlobalProperty");
    private final static QName _RankServersForMigration_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rankServersForMigration");
    private final static QName _GetUtilizationMetricsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getUtilizationMetricsResponse");
    private final static QName _UpdateWorkloadIntensity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateWorkloadIntensity");
    private final static QName _UpdatePolicy_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePolicy");
    private final static QName _UpdatePolicyExResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePolicyExResponse");
    private final static QName _GetEntityPropertiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEntityPropertiesResponse");
    private final static QName _SubscribeEventHandler_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "subscribeEventHandler");
    private final static QName _AssociateInbandNodeResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "associateInbandNodeResponse");
    private final static QName _AnalyzeCoolingStatusResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "analyzeCoolingStatusResponse");
    private final static QName _PowerCycleServerWithCredential_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerCycleServerWithCredential");
    private final static QName _DisableCoreResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "disableCoreResponse");
    private final static QName _GetSELInTextResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getSELInTextResponse");
    private final static QName _EnumerateCustomEvents_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateCustomEvents");
    private final static QName _SetNotificationStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setNotificationStateResponse");
    private final static QName _GetActiveIdlePowerEstimation_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getActiveIdlePowerEstimation");
    private final static QName _GetBatchMetricData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getBatchMetricData");
    private final static QName _ResetActiveIdlePowerEstimation_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "resetActiveIdlePowerEstimation");
    private final static QName _ResetServerWithCredentialResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "resetServerWithCredentialResponse");
    private final static QName _DeleteSecretKey_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "deleteSecretKey");
    private final static QName _UnsubscribePredefinedEvent_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "unsubscribePredefinedEvent");
    private final static QName _GetQueryAggregationPeriodListResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getQueryAggregationPeriodListResponse");
    private final static QName _StartPowerSaving_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "startPowerSaving");
    private final static QName _GetRealTimeUpsData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getRealTimeUpsData");
    private final static QName _SchedulePolicyHastilyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "schedulePolicyHastilyResponse");
    private final static QName _GetPowerDistribution_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPowerDistribution");
    private final static QName _MaintainDBResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "maintainDBResponse");
    private final static QName _SetLocationInfoResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setLocationInfoResponse");
    private final static QName _GetCoolingIndicatorResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getCoolingIndicatorResponse");
    private final static QName _EnumerateEntitiesRecursively_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesRecursively");
    private final static QName _EnumeratePowerModels_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumeratePowerModels");
    private final static QName _GetPolicyDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyDataResponse");
    private final static QName _GetLatestQueryData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getLatestQueryData");
    private final static QName _UpdateNotificationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateNotificationResponse");
    private final static QName _DumpMetricData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "dumpMetricData");
    private final static QName _StartPowerSavingResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "startPowerSavingResponse");
    private final static QName _RemoveNetworkDevicePowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeNetworkDevicePowerProfileResponse");
    private final static QName _EnumerateNetworkDevicePowerProfilesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateNetworkDevicePowerProfilesResponse");
    private final static QName _GetBatchQueryDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getBatchQueryDataResponse");
    private final static QName _SetPolicyEx_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyEx");
    private final static QName _GetLatestMetricData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getLatestMetricData");
    private final static QName _RemovePolicyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removePolicyResponse");
    private final static QName _AddServerPowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addServerPowerProfileResponse");
    private final static QName _GetGlobalProperty_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getGlobalProperty");
    private final static QName _SetEventState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setEventState");
    private final static QName _GetOverCoolingIndicator_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getOverCoolingIndicator");
    private final static QName _GetMultipleLatestMetricData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMultipleLatestMetricData");
    private final static QName _GetNotificationData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNotificationData");
    private final static QName _UpdateStorageDevicePowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateStorageDevicePowerProfileResponse");
    private final static QName _ResetObservedMaxPowerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "resetObservedMaxPowerResponse");
    private final static QName _GetPECBladeInfoResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPECBladeInfoResponse");
    private final static QName _GetLoadfactors_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getLoadfactors");
    private final static QName _GetPhysicalParentResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPhysicalParentResponse");
    private final static QName _GetSensorDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getSensorDataResponse");
    private final static QName _UpdatePolicyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePolicyResponse");
    private final static QName _EnumerateEntities_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntities");
    private final static QName _SetPolicyExHastily_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyExHastily");
    private final static QName _DefineCustomEventResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "defineCustomEventResponse");
    private final static QName _EnumeratePoliciesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumeratePoliciesResponse");
    private final static QName _GetPowerDistributionResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPowerDistributionResponse");
    private final static QName _EnumerateEntitiesWithDetailsRecursively_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesWithDetailsRecursively");
    private final static QName _FindEntitiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "findEntitiesResponse");
    private final static QName _SetNotificationState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setNotificationState");
    private final static QName _AssociateEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "associateEntity");
    private final static QName _ResetObservedMaxPower_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "resetObservedMaxPower");
    private final static QName _ClearNodePoliciesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "clearNodePoliciesResponse");
    private final static QName _GetGlobalPropertyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getGlobalPropertyResponse");
    private final static QName _SubscribePredefinedEventResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "subscribePredefinedEventResponse");
    private final static QName _GetMultipleLatestQueryDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMultipleLatestQueryDataResponse");
    private final static QName _RemoveNotification_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeNotification");
    private final static QName _EvaluateServerForMigrationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "evaluateServerForMigrationResponse");
    private final static QName _GetConnectorList_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getConnectorList");
    private final static QName _UpdateNetworkDevicePowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateNetworkDevicePowerProfile");
    private final static QName _DisassociateEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "disassociateEntityResponse");
    private final static QName _RemoveEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeEntity");
    private final static QName _IdentifyEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "identifyEntityResponse");
    private final static QName _GetConnectorPropertySetResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getConnectorPropertySetResponse");
    private final static QName _SetPolicyExHastilyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyExHastilyResponse");
    private final static QName _GetPECBladeInfo_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPECBladeInfo");
    private final static QName _SubmitSecretKey_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "submitSecretKey");
    private final static QName _EnumerateCustomEventsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateCustomEventsResponse");
    private final static QName _GetPolicyHistoryResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyHistoryResponse");
    private final static QName _EnumeratePowerModelsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumeratePowerModelsResponse");
    private final static QName _StartCollectingPowerDistribution_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "startCollectingPowerDistribution");
    private final static QName _PredictPower_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "predictPower");
    private final static QName _RemovePowerModelResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removePowerModelResponse");
    private final static QName _UpdateCustomEvent_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateCustomEvent");
    private final static QName _SetEntityPropertiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setEntityPropertiesResponse");
    private final static QName _StopPowerSavingResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "stopPowerSavingResponse");
    private final static QName _UpdatePolicyExHastilyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePolicyExHastilyResponse");
    private final static QName _GetSystemTime_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getSystemTime");
    private final static QName _UpdateStorageDevicePowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateStorageDevicePowerProfile");
    private final static QName _DumpMeasurementDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "dumpMeasurementDataResponse");
    private final static QName _AddNetworkDevicePowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addNetworkDevicePowerProfile");
    private final static QName _EnumerateStorageDevicePowerProfiles_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateStorageDevicePowerProfiles");
    private final static QName _DisableCore_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "disableCore");
    private final static QName _GetNextRawDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNextRawDataResponse");
    private final static QName _RediscoverNodeCapabilitiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rediscoverNodeCapabilitiesResponse");
    private final static QName _SubmitSecretKeyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "submitSecretKeyResponse");
    private final static QName _SetGlobalPropertyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setGlobalPropertyResponse");
    private final static QName _RemovePowerModel_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removePowerModel");
    private final static QName _GetCollectionStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getCollectionStateResponse");
    private final static QName _AddNetworkDevicePowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addNetworkDevicePowerProfileResponse");
    private final static QName _StartCollectingPowerDistributionResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "startCollectingPowerDistributionResponse");
    private final static QName _GetNextData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNextData");
    private final static QName _IsPolicyActive_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "isPolicyActive");
    private final static QName _IsPolicyActiveResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "isPolicyActiveResponse");
    private final static QName _AddEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addEntityResponse");
    private final static QName _IdentifyEntityByProtocol_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "identifyEntityByProtocol");
    private final static QName _GetConnectorListResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getConnectorListResponse");
    private final static QName _GetPSUPower_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPSUPower");
    private final static QName _GetSystemTimeResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getSystemTimeResponse");
    private final static QName _GetOutletStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getOutletStateResponse");
    private final static QName _RemoveStorageDevicePowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeStorageDevicePowerProfile");
    private final static QName _DetectEntities_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "detectEntities");
    private final static QName _GetImmediateLogicalPredecessorsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getImmediateLogicalPredecessorsResponse");
    private final static QName _RankServersForMigrationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rankServersForMigrationResponse");
    private final static QName _GetUnreachableEntities_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getUnreachableEntities");
    private final static QName _GetWorkloadPatternResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getWorkloadPatternResponse");
    private final static QName _ImportHierarchyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "importHierarchyResponse");
    private final static QName _SetPolicyStateHastilyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyStateHastilyResponse");
    private final static QName _GetCustomEventData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getCustomEventData");
    private final static QName _EnumeratePolicies_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumeratePolicies");
    private final static QName _SetPolicyStateHastily_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyStateHastily");
    private final static QName _GetNotificationDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNotificationDataResponse");
    private final static QName _AddServerPowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addServerPowerProfile");
    private final static QName _RemoveCustomEventResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeCustomEventResponse");
    private final static QName _GetStaticCUPSDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getStaticCUPSDataResponse");
    private final static QName _EvaluateLowUtilizationServerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "evaluateLowUtilizationServerResponse");
    private final static QName _PowerOffOutletResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffOutletResponse");
    private final static QName _AssociateEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "associateEntityResponse");
    private final static QName _StopCollectingPowerDistributionResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "stopCollectingPowerDistributionResponse");
    private final static QName _GetActiveIdlePowerEstimationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getActiveIdlePowerEstimationResponse");
    private final static QName _PowerOff_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOff");
    private final static QName _GetPolicyHistory_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyHistory");
    private final static QName _GetEntityProperties_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEntityProperties");
    private final static QName _GetObservedMaxPower_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getObservedMaxPower");
    private final static QName _GetPredefinedEventTypesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPredefinedEventTypesResponse");
    private final static QName _RemoveStorageDevicePowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeStorageDevicePowerProfileResponse");
    private final static QName _UpdateNotification_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateNotification");
    private final static QName _PowerOnServerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnServerResponse");
    private final static QName _GetEnclosureAndBladeInfo_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEnclosureAndBladeInfo");
    private final static QName _GetNextDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNextDataResponse");
    private final static QName _SetLoadfactorsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setLoadfactorsResponse");
    private final static QName _GetNotificationStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNotificationStateResponse");
    private final static QName _GetOverCoolingIndicatorResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getOverCoolingIndicatorResponse");
    private final static QName _DefineNotification_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "defineNotification");
    private final static QName _GetPhysicalParent_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPhysicalParent");
    private final static QName _GetEnclosureAndBladeInfoResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEnclosureAndBladeInfoResponse");
    private final static QName _GetCoolingIndicator_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getCoolingIndicator");
    private final static QName _GetBatchQueryData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getBatchQueryData");
    private final static QName _EnumerateEventHandlers_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEventHandlers");
    private final static QName _GetQueryAggregationPeriodList_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getQueryAggregationPeriodList");
    private final static QName _PowerOn_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOn");
    private final static QName _GetLatestMetricDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getLatestMetricDataResponse");
    private final static QName _EnumerateServerPowerProfiles_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateServerPowerProfiles");
    private final static QName _UpdateServerPowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateServerPowerProfileResponse");
    private final static QName _LaunchPTUResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "launchPTUResponse");
    private final static QName _EnumerateEntitiesWithDetailsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesWithDetailsResponse");
    private final static QName _UnsubscribePredefinedEventResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "unsubscribePredefinedEventResponse");
    private final static QName _RemoveEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeEntityResponse");
    private final static QName _GetEntityPropertyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEntityPropertyResponse");
    private final static QName _GetEventStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEventStateResponse");
    private final static QName _PowerOnServerWithCredentialResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnServerWithCredentialResponse");
    private final static QName _Exception_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "Exception");
    private final static QName _PowerOnOutlet_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnOutlet");
    private final static QName _DumpMetricDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "dumpMetricDataResponse");
    private final static QName _EnumerateEventHandlersResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEventHandlersResponse");
    private final static QName _GetImmediateLogicalPredecessors_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getImmediateLogicalPredecessors");
    private final static QName _GetPolicyDataEx_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyDataEx");
    private final static QName _PowerOffResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffResponse");
    private final static QName _EvaluateServerForMigration_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "evaluateServerForMigration");
    private final static QName _UnsubscribeEventHandlerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "unsubscribeEventHandlerResponse");
    private final static QName _EnumerateEntitiesRecursivelyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesRecursivelyResponse");
    private final static QName _SetPolicyStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyStateResponse");
    private final static QName _RediscoverEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rediscoverEntity");
    private final static QName _UpdatePolicyEx_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePolicyEx");
    private final static QName _RediscoverEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rediscoverEntityResponse");
    private final static QName _EnumerateStorageDevicePowerProfilesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateStorageDevicePowerProfilesResponse");
    private final static QName _EvaluateServerForWorkload_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "evaluateServerForWorkload");
    private final static QName _EnumerateNotifications_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateNotifications");
    private final static QName _RemoveNetworkDevicePowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeNetworkDevicePowerProfile");
    private final static QName _GetStaticCUPSData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getStaticCUPSData");
    private final static QName _GetActionLogRecords_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getActionLogRecords");
    private final static QName _SetEventStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setEventStateResponse");
    private final static QName _SetCollectionStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setCollectionStateResponse");
    private final static QName _GetEventHandlerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEventHandlerResponse");
    private final static QName _ExportHierarchyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "exportHierarchyResponse");
    private final static QName _GetQueryData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getQueryData");
    private final static QName _PredictPowerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "predictPowerResponse");
    private final static QName _RemovePolicyHastilyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removePolicyHastilyResponse");
    private final static QName _LaunchPTU_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "launchPTU");
    private final static QName _AnalyzeCoolingStatus_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "analyzeCoolingStatus");
    private final static QName _EnumerateEntitiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesResponse");
    private final static QName _GetVersionResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getVersionResponse");
    private final static QName _AddStorageDevicePowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addStorageDevicePowerProfileResponse");
    private final static QName _SetCollectionState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setCollectionState");
    private final static QName _MaintainDB_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "maintainDB");
    private final static QName _GetSELInText_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getSELInText");
    private final static QName _SchedulePolicyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "schedulePolicyResponse");
    private final static QName _DiscoverEntities_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "discoverEntities");
    private final static QName _SetEntityProperties_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setEntityProperties");
    private final static QName _EnumerateEntitiesWithDetailsRecursivelyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesWithDetailsRecursivelyResponse");
    private final static QName _GetEventMessageAuthenticationKey_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEventMessageAuthenticationKey");
    private final static QName _AddEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addEntity");
    private final static QName _UpdateCustomEventResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateCustomEventResponse");
    private final static QName _EnumerateEntitiesWithDetails_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateEntitiesWithDetails");
    private final static QName _GetMultipleLatestQueryData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMultipleLatestQueryData");
    private final static QName _GetPSUPowerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPSUPowerResponse");
    private final static QName _DiscoverEntitiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "discoverEntitiesResponse");
    private final static QName _DefineCustomEvent_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "defineCustomEvent");
    private final static QName _SetPolicyState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyState");
    private final static QName _DefineNotificationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "defineNotificationResponse");
    private final static QName _PowerOffServerWithCredential_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffServerWithCredential");
    private final static QName _EnumerateNetworkDevicePowerProfiles_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateNetworkDevicePowerProfiles");
    private final static QName _UnsubscribeEventHandler_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "unsubscribeEventHandler");
    private final static QName _PowerOnResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnResponse");
    private final static QName _GetWorkloadPattern_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getWorkloadPattern");
    private final static QName _GetRealTimePduDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getRealTimePduDataResponse");
    private final static QName _SubscribeEventHandlerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "subscribeEventHandlerResponse");
    private final static QName _GetRealTimeUpsDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getRealTimeUpsDataResponse");
    private final static QName _SetLocationInfo_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setLocationInfo");
    private final static QName _EnumerateNotificationsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateNotificationsResponse");
    private final static QName _SetPolicy_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicy");
    private final static QName _PowerOnOutletResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOnOutletResponse");
    private final static QName _FindEntities_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "findEntities");
    private final static QName _GetVersion_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getVersion");
    private final static QName _GetLatestQueryDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getLatestQueryDataResponse");
    private final static QName _GetPolicyDataExResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyDataExResponse");
    private final static QName _GetNotificationState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNotificationState");
    private final static QName _SubscribePredefinedEvent_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "subscribePredefinedEvent");
    private final static QName _SetLoadfactors_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setLoadfactors");
    private final static QName _DeleteSecretKeyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "deleteSecretKeyResponse");
    private final static QName _RediscoverNodeCapabilities_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rediscoverNodeCapabilities");
    private final static QName _UpdateWorkloadIntensityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateWorkloadIntensityResponse");
    private final static QName _GetUnreachableEntitiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getUnreachableEntitiesResponse");
    private final static QName _RemovePolicyHastily_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removePolicyHastily");
    private final static QName _GetRealTimeSensorData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getRealTimeSensorData");
    private final static QName _GetTemperatureRise_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getTemperatureRise");
    private final static QName _GetMetricData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMetricData");
    private final static QName _UpdateNetworkDevicePowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updateNetworkDevicePowerProfileResponse");
    private final static QName _GetInletTemperatureDistribution_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getInletTemperatureDistribution");
    private final static QName _AddPowerModel_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addPowerModel");
    private final static QName _RemoveNotificationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeNotificationResponse");
    private final static QName _GetObservedMaxPowerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getObservedMaxPowerResponse");
    private final static QName _GetMetricDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMetricDataResponse");
    private final static QName _EvaluateServerForWorkloadResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "evaluateServerForWorkloadResponse");
    private final static QName _GetConnectorPropertySet_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getConnectorPropertySet");
    private final static QName _GetPredefinedEventTypes_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPredefinedEventTypes");
    private final static QName _GetCollectionState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getCollectionState");
    private final static QName _SchedulePolicyHastily_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "schedulePolicyHastily");
    private final static QName _GetUtilizationMetrics_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getUtilizationMetrics");
    private final static QName _GetNextRawData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getNextRawData");
    private final static QName _GetRealTimeSensorDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getRealTimeSensorDataResponse");
    private final static QName _PowerOffServerResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffServerResponse");
    private final static QName _PowerOffServerWithCredentialResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffServerWithCredentialResponse");
    private final static QName _AssociateInbandNode_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "associateInbandNode");
    private final static QName _GetPolicyData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyData");
    private final static QName _GetCustomEventDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getCustomEventDataResponse");
    private final static QName _ResetServerWithCredential_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "resetServerWithCredential");
    private final static QName _UpdatePolicyExHastily_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "updatePolicyExHastily");
    private final static QName _ImportHierarchy_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "importHierarchy");
    private final static QName _DumpMeasurementData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "dumpMeasurementData");
    private final static QName _GetEntityProperty_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEntityProperty");
    private final static QName _IdentifyEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "identifyEntity");
    private final static QName _AddPowerModelResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addPowerModelResponse");
    private final static QName _AddStorageDevicePowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "addStorageDevicePowerProfile");
    private final static QName _FindEntitiesWithDetails_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "findEntitiesWithDetails");
    private final static QName _RemoveServerPowerProfile_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeServerPowerProfile");
    private final static QName _StopCollectingPowerDistribution_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "stopCollectingPowerDistribution");
    private final static QName _GetPolicyStateResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyStateResponse");
    private final static QName _ReconnectEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "reconnectEntity");
    private final static QName _StopPowerSaving_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "stopPowerSaving");
    private final static QName _GetMetricAggregationPeriodListResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMetricAggregationPeriodListResponse");
    private final static QName _ResetActiveIdlePowerEstimationResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "resetActiveIdlePowerEstimationResponse");
    private final static QName _GetMultipleLatestMetricDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMultipleLatestMetricDataResponse");
    private final static QName _GetActionLogRecordsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getActionLogRecordsResponse");
    private final static QName _DetectEntitiesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "detectEntitiesResponse");
    private final static QName _ClearNodePolicies_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "clearNodePolicies");
    private final static QName _RemoveServerPowerProfileResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeServerPowerProfileResponse");
    private final static QName _RankServersForWorkloadResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "rankServersForWorkloadResponse");
    private final static QName _PowerOffServer_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerOffServer");
    private final static QName _GetLoadfactorsResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getLoadfactorsResponse");
    private final static QName _RemoveCustomEvent_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "removeCustomEvent");
    private final static QName _DisassociateEntity_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "disassociateEntity");
    private final static QName _GetBatchMetricDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getBatchMetricDataResponse");
    private final static QName _EvaluateLowUtilizationServer_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "evaluateLowUtilizationServer");
    private final static QName _GetEventHandler_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEventHandler");
    private final static QName _SetPolicyResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "setPolicyResponse");
    private final static QName _GetPolicyState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getPolicyState");
    private final static QName _GetInletTemperatureDistributionResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getInletTemperatureDistributionResponse");
    private final static QName _PowerCycleServerWithCredentialResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "powerCycleServerWithCredentialResponse");
    private final static QName _ReconnectEntityResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "reconnectEntityResponse");
    private final static QName _GetSensorData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getSensorData");
    private final static QName _EnumerateServerPowerProfilesResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "enumerateServerPowerProfilesResponse");
    private final static QName _GetQueryDataResponse_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getQueryDataResponse");
    private final static QName _GetRealTimePduData_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getRealTimePduData");
    private final static QName _GetMetricAggregationPeriodList_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getMetricAggregationPeriodList");
    private final static QName _GetOutletState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getOutletState");
    private final static QName _GetEventState_QNAME = new QName("http://wsdl.intf.dcm.intel.com/", "getEventState");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: demo.ax.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RemoveServerPowerProfileResponse }
     * 
     */
    public RemoveServerPowerProfileResponse createRemoveServerPowerProfileResponse() {
        return new RemoveServerPowerProfileResponse();
    }

    /**
     * Create an instance of {@link RankServersForWorkloadResponse }
     * 
     */
    public RankServersForWorkloadResponse createRankServersForWorkloadResponse() {
        return new RankServersForWorkloadResponse();
    }

    /**
     * Create an instance of {@link PowerOffServer }
     * 
     */
    public PowerOffServer createPowerOffServer() {
        return new PowerOffServer();
    }

    /**
     * Create an instance of {@link GetLoadfactorsResponse }
     * 
     */
    public GetLoadfactorsResponse createGetLoadfactorsResponse() {
        return new GetLoadfactorsResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomEvent }
     * 
     */
    public RemoveCustomEvent createRemoveCustomEvent() {
        return new RemoveCustomEvent();
    }

    /**
     * Create an instance of {@link DisassociateEntity }
     * 
     */
    public DisassociateEntity createDisassociateEntity() {
        return new DisassociateEntity();
    }

    /**
     * Create an instance of {@link GetActionLogRecordsResponse }
     * 
     */
    public GetActionLogRecordsResponse createGetActionLogRecordsResponse() {
        return new GetActionLogRecordsResponse();
    }

    /**
     * Create an instance of {@link DetectEntitiesResponse }
     * 
     */
    public DetectEntitiesResponse createDetectEntitiesResponse() {
        return new DetectEntitiesResponse();
    }

    /**
     * Create an instance of {@link ClearNodePolicies }
     * 
     */
    public ClearNodePolicies createClearNodePolicies() {
        return new ClearNodePolicies();
    }

    /**
     * Create an instance of {@link GetMetricAggregationPeriodListResponse }
     * 
     */
    public GetMetricAggregationPeriodListResponse createGetMetricAggregationPeriodListResponse() {
        return new GetMetricAggregationPeriodListResponse();
    }

    /**
     * Create an instance of {@link StopPowerSaving }
     * 
     */
    public StopPowerSaving createStopPowerSaving() {
        return new StopPowerSaving();
    }

    /**
     * Create an instance of {@link GetMultipleLatestMetricDataResponse }
     * 
     */
    public GetMultipleLatestMetricDataResponse createGetMultipleLatestMetricDataResponse() {
        return new GetMultipleLatestMetricDataResponse();
    }

    /**
     * Create an instance of {@link ResetActiveIdlePowerEstimationResponse }
     * 
     */
    public ResetActiveIdlePowerEstimationResponse createResetActiveIdlePowerEstimationResponse() {
        return new ResetActiveIdlePowerEstimationResponse();
    }

    /**
     * Create an instance of {@link ReconnectEntity }
     * 
     */
    public ReconnectEntity createReconnectEntity() {
        return new ReconnectEntity();
    }

    /**
     * Create an instance of {@link GetPolicyStateResponse }
     * 
     */
    public GetPolicyStateResponse createGetPolicyStateResponse() {
        return new GetPolicyStateResponse();
    }

    /**
     * Create an instance of {@link AddStorageDevicePowerProfile }
     * 
     */
    public AddStorageDevicePowerProfile createAddStorageDevicePowerProfile() {
        return new AddStorageDevicePowerProfile();
    }

    /**
     * Create an instance of {@link AddPowerModelResponse }
     * 
     */
    public AddPowerModelResponse createAddPowerModelResponse() {
        return new AddPowerModelResponse();
    }

    /**
     * Create an instance of {@link IdentifyEntity }
     * 
     */
    public IdentifyEntity createIdentifyEntity() {
        return new IdentifyEntity();
    }

    /**
     * Create an instance of {@link StopCollectingPowerDistribution }
     * 
     */
    public StopCollectingPowerDistribution createStopCollectingPowerDistribution() {
        return new StopCollectingPowerDistribution();
    }

    /**
     * Create an instance of {@link RemoveServerPowerProfile }
     * 
     */
    public RemoveServerPowerProfile createRemoveServerPowerProfile() {
        return new RemoveServerPowerProfile();
    }

    /**
     * Create an instance of {@link FindEntitiesWithDetails }
     * 
     */
    public FindEntitiesWithDetails createFindEntitiesWithDetails() {
        return new FindEntitiesWithDetails();
    }

    /**
     * Create an instance of {@link GetEntityProperty }
     * 
     */
    public GetEntityProperty createGetEntityProperty() {
        return new GetEntityProperty();
    }

    /**
     * Create an instance of {@link DumpMeasurementData }
     * 
     */
    public DumpMeasurementData createDumpMeasurementData() {
        return new DumpMeasurementData();
    }

    /**
     * Create an instance of {@link ImportHierarchy }
     * 
     */
    public ImportHierarchy createImportHierarchy() {
        return new ImportHierarchy();
    }

    /**
     * Create an instance of {@link UpdatePolicyExHastily }
     * 
     */
    public UpdatePolicyExHastily createUpdatePolicyExHastily() {
        return new UpdatePolicyExHastily();
    }

    /**
     * Create an instance of {@link GetEventState }
     * 
     */
    public GetEventState createGetEventState() {
        return new GetEventState();
    }

    /**
     * Create an instance of {@link GetOutletState }
     * 
     */
    public GetOutletState createGetOutletState() {
        return new GetOutletState();
    }

    /**
     * Create an instance of {@link GetQueryDataResponse }
     * 
     */
    public GetQueryDataResponse createGetQueryDataResponse() {
        return new GetQueryDataResponse();
    }

    /**
     * Create an instance of {@link GetRealTimePduData }
     * 
     */
    public GetRealTimePduData createGetRealTimePduData() {
        return new GetRealTimePduData();
    }

    /**
     * Create an instance of {@link EnumerateServerPowerProfilesResponse }
     * 
     */
    public EnumerateServerPowerProfilesResponse createEnumerateServerPowerProfilesResponse() {
        return new EnumerateServerPowerProfilesResponse();
    }

    /**
     * Create an instance of {@link GetMetricAggregationPeriodList }
     * 
     */
    public GetMetricAggregationPeriodList createGetMetricAggregationPeriodList() {
        return new GetMetricAggregationPeriodList();
    }

    /**
     * Create an instance of {@link GetSensorData }
     * 
     */
    public GetSensorData createGetSensorData() {
        return new GetSensorData();
    }

    /**
     * Create an instance of {@link PowerCycleServerWithCredentialResponse }
     * 
     */
    public PowerCycleServerWithCredentialResponse createPowerCycleServerWithCredentialResponse() {
        return new PowerCycleServerWithCredentialResponse();
    }

    /**
     * Create an instance of {@link ReconnectEntityResponse }
     * 
     */
    public ReconnectEntityResponse createReconnectEntityResponse() {
        return new ReconnectEntityResponse();
    }

    /**
     * Create an instance of {@link GetPolicyState }
     * 
     */
    public GetPolicyState createGetPolicyState() {
        return new GetPolicyState();
    }

    /**
     * Create an instance of {@link GetInletTemperatureDistributionResponse }
     * 
     */
    public GetInletTemperatureDistributionResponse createGetInletTemperatureDistributionResponse() {
        return new GetInletTemperatureDistributionResponse();
    }

    /**
     * Create an instance of {@link SetPolicyResponse }
     * 
     */
    public SetPolicyResponse createSetPolicyResponse() {
        return new SetPolicyResponse();
    }

    /**
     * Create an instance of {@link GetBatchMetricDataResponse }
     * 
     */
    public GetBatchMetricDataResponse createGetBatchMetricDataResponse() {
        return new GetBatchMetricDataResponse();
    }

    /**
     * Create an instance of {@link EvaluateLowUtilizationServer }
     * 
     */
    public EvaluateLowUtilizationServer createEvaluateLowUtilizationServer() {
        return new EvaluateLowUtilizationServer();
    }

    /**
     * Create an instance of {@link GetEventHandler }
     * 
     */
    public GetEventHandler createGetEventHandler() {
        return new GetEventHandler();
    }

    /**
     * Create an instance of {@link GetRealTimeSensorData }
     * 
     */
    public GetRealTimeSensorData createGetRealTimeSensorData() {
        return new GetRealTimeSensorData();
    }

    /**
     * Create an instance of {@link GetTemperatureRise }
     * 
     */
    public GetTemperatureRise createGetTemperatureRise() {
        return new GetTemperatureRise();
    }

    /**
     * Create an instance of {@link UpdateWorkloadIntensityResponse }
     * 
     */
    public UpdateWorkloadIntensityResponse createUpdateWorkloadIntensityResponse() {
        return new UpdateWorkloadIntensityResponse();
    }

    /**
     * Create an instance of {@link GetUnreachableEntitiesResponse }
     * 
     */
    public GetUnreachableEntitiesResponse createGetUnreachableEntitiesResponse() {
        return new GetUnreachableEntitiesResponse();
    }

    /**
     * Create an instance of {@link RemovePolicyHastily }
     * 
     */
    public RemovePolicyHastily createRemovePolicyHastily() {
        return new RemovePolicyHastily();
    }

    /**
     * Create an instance of {@link DeleteSecretKeyResponse }
     * 
     */
    public DeleteSecretKeyResponse createDeleteSecretKeyResponse() {
        return new DeleteSecretKeyResponse();
    }

    /**
     * Create an instance of {@link RediscoverNodeCapabilities }
     * 
     */
    public RediscoverNodeCapabilities createRediscoverNodeCapabilities() {
        return new RediscoverNodeCapabilities();
    }

    /**
     * Create an instance of {@link SetLoadfactors }
     * 
     */
    public SetLoadfactors createSetLoadfactors() {
        return new SetLoadfactors();
    }

    /**
     * Create an instance of {@link SubscribePredefinedEvent }
     * 
     */
    public SubscribePredefinedEvent createSubscribePredefinedEvent() {
        return new SubscribePredefinedEvent();
    }

    /**
     * Create an instance of {@link GetNotificationState }
     * 
     */
    public GetNotificationState createGetNotificationState() {
        return new GetNotificationState();
    }

    /**
     * Create an instance of {@link GetPolicyDataExResponse }
     * 
     */
    public GetPolicyDataExResponse createGetPolicyDataExResponse() {
        return new GetPolicyDataExResponse();
    }

    /**
     * Create an instance of {@link PowerOnOutletResponse }
     * 
     */
    public PowerOnOutletResponse createPowerOnOutletResponse() {
        return new PowerOnOutletResponse();
    }

    /**
     * Create an instance of {@link GetLatestQueryDataResponse }
     * 
     */
    public GetLatestQueryDataResponse createGetLatestQueryDataResponse() {
        return new GetLatestQueryDataResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link FindEntities }
     * 
     */
    public FindEntities createFindEntities() {
        return new FindEntities();
    }

    /**
     * Create an instance of {@link SetLocationInfo }
     * 
     */
    public SetLocationInfo createSetLocationInfo() {
        return new SetLocationInfo();
    }

    /**
     * Create an instance of {@link SetPolicy }
     * 
     */
    public SetPolicy createSetPolicy() {
        return new SetPolicy();
    }

    /**
     * Create an instance of {@link EnumerateNotificationsResponse }
     * 
     */
    public EnumerateNotificationsResponse createEnumerateNotificationsResponse() {
        return new EnumerateNotificationsResponse();
    }

    /**
     * Create an instance of {@link SubscribeEventHandlerResponse }
     * 
     */
    public SubscribeEventHandlerResponse createSubscribeEventHandlerResponse() {
        return new SubscribeEventHandlerResponse();
    }

    /**
     * Create an instance of {@link GetRealTimePduDataResponse }
     * 
     */
    public GetRealTimePduDataResponse createGetRealTimePduDataResponse() {
        return new GetRealTimePduDataResponse();
    }

    /**
     * Create an instance of {@link GetWorkloadPattern }
     * 
     */
    public GetWorkloadPattern createGetWorkloadPattern() {
        return new GetWorkloadPattern();
    }

    /**
     * Create an instance of {@link GetRealTimeUpsDataResponse }
     * 
     */
    public GetRealTimeUpsDataResponse createGetRealTimeUpsDataResponse() {
        return new GetRealTimeUpsDataResponse();
    }

    /**
     * Create an instance of {@link ResetServerWithCredential }
     * 
     */
    public ResetServerWithCredential createResetServerWithCredential() {
        return new ResetServerWithCredential();
    }

    /**
     * Create an instance of {@link GetCustomEventDataResponse }
     * 
     */
    public GetCustomEventDataResponse createGetCustomEventDataResponse() {
        return new GetCustomEventDataResponse();
    }

    /**
     * Create an instance of {@link PowerOffServerWithCredentialResponse }
     * 
     */
    public PowerOffServerWithCredentialResponse createPowerOffServerWithCredentialResponse() {
        return new PowerOffServerWithCredentialResponse();
    }

    /**
     * Create an instance of {@link PowerOffServerResponse }
     * 
     */
    public PowerOffServerResponse createPowerOffServerResponse() {
        return new PowerOffServerResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeSensorDataResponse }
     * 
     */
    public GetRealTimeSensorDataResponse createGetRealTimeSensorDataResponse() {
        return new GetRealTimeSensorDataResponse();
    }

    /**
     * Create an instance of {@link GetPolicyData }
     * 
     */
    public GetPolicyData createGetPolicyData() {
        return new GetPolicyData();
    }

    /**
     * Create an instance of {@link AssociateInbandNode }
     * 
     */
    public AssociateInbandNode createAssociateInbandNode() {
        return new AssociateInbandNode();
    }

    /**
     * Create an instance of {@link SchedulePolicyHastily }
     * 
     */
    public SchedulePolicyHastily createSchedulePolicyHastily() {
        return new SchedulePolicyHastily();
    }

    /**
     * Create an instance of {@link GetNextRawData }
     * 
     */
    public GetNextRawData createGetNextRawData() {
        return new GetNextRawData();
    }

    /**
     * Create an instance of {@link GetUtilizationMetrics }
     * 
     */
    public GetUtilizationMetrics createGetUtilizationMetrics() {
        return new GetUtilizationMetrics();
    }

    /**
     * Create an instance of {@link GetCollectionState }
     * 
     */
    public GetCollectionState createGetCollectionState() {
        return new GetCollectionState();
    }

    /**
     * Create an instance of {@link GetConnectorPropertySet }
     * 
     */
    public GetConnectorPropertySet createGetConnectorPropertySet() {
        return new GetConnectorPropertySet();
    }

    /**
     * Create an instance of {@link EvaluateServerForWorkloadResponse }
     * 
     */
    public EvaluateServerForWorkloadResponse createEvaluateServerForWorkloadResponse() {
        return new EvaluateServerForWorkloadResponse();
    }

    /**
     * Create an instance of {@link GetPredefinedEventTypes }
     * 
     */
    public GetPredefinedEventTypes createGetPredefinedEventTypes() {
        return new GetPredefinedEventTypes();
    }

    /**
     * Create an instance of {@link RemoveNotificationResponse }
     * 
     */
    public RemoveNotificationResponse createRemoveNotificationResponse() {
        return new RemoveNotificationResponse();
    }

    /**
     * Create an instance of {@link AddPowerModel }
     * 
     */
    public AddPowerModel createAddPowerModel() {
        return new AddPowerModel();
    }

    /**
     * Create an instance of {@link GetInletTemperatureDistribution }
     * 
     */
    public GetInletTemperatureDistribution createGetInletTemperatureDistribution() {
        return new GetInletTemperatureDistribution();
    }

    /**
     * Create an instance of {@link UpdateNetworkDevicePowerProfileResponse }
     * 
     */
    public UpdateNetworkDevicePowerProfileResponse createUpdateNetworkDevicePowerProfileResponse() {
        return new UpdateNetworkDevicePowerProfileResponse();
    }

    /**
     * Create an instance of {@link GetMetricData }
     * 
     */
    public GetMetricData createGetMetricData() {
        return new GetMetricData();
    }

    /**
     * Create an instance of {@link GetMetricDataResponse }
     * 
     */
    public GetMetricDataResponse createGetMetricDataResponse() {
        return new GetMetricDataResponse();
    }

    /**
     * Create an instance of {@link GetObservedMaxPowerResponse }
     * 
     */
    public GetObservedMaxPowerResponse createGetObservedMaxPowerResponse() {
        return new GetObservedMaxPowerResponse();
    }

    /**
     * Create an instance of {@link SetEntityProperties }
     * 
     */
    public SetEntityProperties createSetEntityProperties() {
        return new SetEntityProperties();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesWithDetailsRecursivelyResponse }
     * 
     */
    public EnumerateEntitiesWithDetailsRecursivelyResponse createEnumerateEntitiesWithDetailsRecursivelyResponse() {
        return new EnumerateEntitiesWithDetailsRecursivelyResponse();
    }

    /**
     * Create an instance of {@link MaintainDB }
     * 
     */
    public MaintainDB createMaintainDB() {
        return new MaintainDB();
    }

    /**
     * Create an instance of {@link DiscoverEntities }
     * 
     */
    public DiscoverEntities createDiscoverEntities() {
        return new DiscoverEntities();
    }

    /**
     * Create an instance of {@link SchedulePolicyResponse }
     * 
     */
    public SchedulePolicyResponse createSchedulePolicyResponse() {
        return new SchedulePolicyResponse();
    }

    /**
     * Create an instance of {@link GetSELInText }
     * 
     */
    public GetSELInText createGetSELInText() {
        return new GetSELInText();
    }

    /**
     * Create an instance of {@link SetCollectionState }
     * 
     */
    public SetCollectionState createSetCollectionState() {
        return new SetCollectionState();
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link AddStorageDevicePowerProfileResponse }
     * 
     */
    public AddStorageDevicePowerProfileResponse createAddStorageDevicePowerProfileResponse() {
        return new AddStorageDevicePowerProfileResponse();
    }

    /**
     * Create an instance of {@link RemovePolicyHastilyResponse }
     * 
     */
    public RemovePolicyHastilyResponse createRemovePolicyHastilyResponse() {
        return new RemovePolicyHastilyResponse();
    }

    /**
     * Create an instance of {@link PredictPowerResponse }
     * 
     */
    public PredictPowerResponse createPredictPowerResponse() {
        return new PredictPowerResponse();
    }

    /**
     * Create an instance of {@link GetQueryData }
     * 
     */
    public GetQueryData createGetQueryData() {
        return new GetQueryData();
    }

    /**
     * Create an instance of {@link AnalyzeCoolingStatus }
     * 
     */
    public AnalyzeCoolingStatus createAnalyzeCoolingStatus() {
        return new AnalyzeCoolingStatus();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesResponse }
     * 
     */
    public EnumerateEntitiesResponse createEnumerateEntitiesResponse() {
        return new EnumerateEntitiesResponse();
    }

    /**
     * Create an instance of {@link LaunchPTU }
     * 
     */
    public LaunchPTU createLaunchPTU() {
        return new LaunchPTU();
    }

    /**
     * Create an instance of {@link ExportHierarchyResponse }
     * 
     */
    public ExportHierarchyResponse createExportHierarchyResponse() {
        return new ExportHierarchyResponse();
    }

    /**
     * Create an instance of {@link EnumerateNetworkDevicePowerProfiles }
     * 
     */
    public EnumerateNetworkDevicePowerProfiles createEnumerateNetworkDevicePowerProfiles() {
        return new EnumerateNetworkDevicePowerProfiles();
    }

    /**
     * Create an instance of {@link UnsubscribeEventHandler }
     * 
     */
    public UnsubscribeEventHandler createUnsubscribeEventHandler() {
        return new UnsubscribeEventHandler();
    }

    /**
     * Create an instance of {@link PowerOnResponse }
     * 
     */
    public PowerOnResponse createPowerOnResponse() {
        return new PowerOnResponse();
    }

    /**
     * Create an instance of {@link SetPolicyState }
     * 
     */
    public SetPolicyState createSetPolicyState() {
        return new SetPolicyState();
    }

    /**
     * Create an instance of {@link DefineNotificationResponse }
     * 
     */
    public DefineNotificationResponse createDefineNotificationResponse() {
        return new DefineNotificationResponse();
    }

    /**
     * Create an instance of {@link PowerOffServerWithCredential }
     * 
     */
    public PowerOffServerWithCredential createPowerOffServerWithCredential() {
        return new PowerOffServerWithCredential();
    }

    /**
     * Create an instance of {@link DefineCustomEvent }
     * 
     */
    public DefineCustomEvent createDefineCustomEvent() {
        return new DefineCustomEvent();
    }

    /**
     * Create an instance of {@link DiscoverEntitiesResponse }
     * 
     */
    public DiscoverEntitiesResponse createDiscoverEntitiesResponse() {
        return new DiscoverEntitiesResponse();
    }

    /**
     * Create an instance of {@link GetMultipleLatestQueryData }
     * 
     */
    public GetMultipleLatestQueryData createGetMultipleLatestQueryData() {
        return new GetMultipleLatestQueryData();
    }

    /**
     * Create an instance of {@link GetPSUPowerResponse }
     * 
     */
    public GetPSUPowerResponse createGetPSUPowerResponse() {
        return new GetPSUPowerResponse();
    }

    /**
     * Create an instance of {@link UpdateCustomEventResponse }
     * 
     */
    public UpdateCustomEventResponse createUpdateCustomEventResponse() {
        return new UpdateCustomEventResponse();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesWithDetails }
     * 
     */
    public EnumerateEntitiesWithDetails createEnumerateEntitiesWithDetails() {
        return new EnumerateEntitiesWithDetails();
    }

    /**
     * Create an instance of {@link AddEntity }
     * 
     */
    public AddEntity createAddEntity() {
        return new AddEntity();
    }

    /**
     * Create an instance of {@link GetEventMessageAuthenticationKey }
     * 
     */
    public GetEventMessageAuthenticationKey createGetEventMessageAuthenticationKey() {
        return new GetEventMessageAuthenticationKey();
    }

    /**
     * Create an instance of {@link PowerOnOutlet }
     * 
     */
    public PowerOnOutlet createPowerOnOutlet() {
        return new PowerOnOutlet();
    }

    /**
     * Create an instance of {@link PowerOnServerWithCredentialResponse }
     * 
     */
    public PowerOnServerWithCredentialResponse createPowerOnServerWithCredentialResponse() {
        return new PowerOnServerWithCredentialResponse();
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link GetEventStateResponse }
     * 
     */
    public GetEventStateResponse createGetEventStateResponse() {
        return new GetEventStateResponse();
    }

    /**
     * Create an instance of {@link GetEntityPropertyResponse }
     * 
     */
    public GetEntityPropertyResponse createGetEntityPropertyResponse() {
        return new GetEntityPropertyResponse();
    }

    /**
     * Create an instance of {@link UnsubscribePredefinedEventResponse }
     * 
     */
    public UnsubscribePredefinedEventResponse createUnsubscribePredefinedEventResponse() {
        return new UnsubscribePredefinedEventResponse();
    }

    /**
     * Create an instance of {@link RemoveEntityResponse }
     * 
     */
    public RemoveEntityResponse createRemoveEntityResponse() {
        return new RemoveEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateServerPowerProfileResponse }
     * 
     */
    public UpdateServerPowerProfileResponse createUpdateServerPowerProfileResponse() {
        return new UpdateServerPowerProfileResponse();
    }

    /**
     * Create an instance of {@link EnumerateServerPowerProfiles }
     * 
     */
    public EnumerateServerPowerProfiles createEnumerateServerPowerProfiles() {
        return new EnumerateServerPowerProfiles();
    }

    /**
     * Create an instance of {@link LaunchPTUResponse }
     * 
     */
    public LaunchPTUResponse createLaunchPTUResponse() {
        return new LaunchPTUResponse();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesWithDetailsResponse }
     * 
     */
    public EnumerateEntitiesWithDetailsResponse createEnumerateEntitiesWithDetailsResponse() {
        return new EnumerateEntitiesWithDetailsResponse();
    }

    /**
     * Create an instance of {@link GetBatchQueryData }
     * 
     */
    public GetBatchQueryData createGetBatchQueryData() {
        return new GetBatchQueryData();
    }

    /**
     * Create an instance of {@link EnumerateEventHandlers }
     * 
     */
    public EnumerateEventHandlers createEnumerateEventHandlers() {
        return new EnumerateEventHandlers();
    }

    /**
     * Create an instance of {@link GetQueryAggregationPeriodList }
     * 
     */
    public GetQueryAggregationPeriodList createGetQueryAggregationPeriodList() {
        return new GetQueryAggregationPeriodList();
    }

    /**
     * Create an instance of {@link GetEnclosureAndBladeInfoResponse }
     * 
     */
    public GetEnclosureAndBladeInfoResponse createGetEnclosureAndBladeInfoResponse() {
        return new GetEnclosureAndBladeInfoResponse();
    }

    /**
     * Create an instance of {@link GetCoolingIndicator }
     * 
     */
    public GetCoolingIndicator createGetCoolingIndicator() {
        return new GetCoolingIndicator();
    }

    /**
     * Create an instance of {@link PowerOn }
     * 
     */
    public PowerOn createPowerOn() {
        return new PowerOn();
    }

    /**
     * Create an instance of {@link GetLatestMetricDataResponse }
     * 
     */
    public GetLatestMetricDataResponse createGetLatestMetricDataResponse() {
        return new GetLatestMetricDataResponse();
    }

    /**
     * Create an instance of {@link DefineNotification }
     * 
     */
    public DefineNotification createDefineNotification() {
        return new DefineNotification();
    }

    /**
     * Create an instance of {@link GetPhysicalParent }
     * 
     */
    public GetPhysicalParent createGetPhysicalParent() {
        return new GetPhysicalParent();
    }

    /**
     * Create an instance of {@link GetNotificationStateResponse }
     * 
     */
    public GetNotificationStateResponse createGetNotificationStateResponse() {
        return new GetNotificationStateResponse();
    }

    /**
     * Create an instance of {@link GetOverCoolingIndicatorResponse }
     * 
     */
    public GetOverCoolingIndicatorResponse createGetOverCoolingIndicatorResponse() {
        return new GetOverCoolingIndicatorResponse();
    }

    /**
     * Create an instance of {@link RemoveStorageDevicePowerProfileResponse }
     * 
     */
    public RemoveStorageDevicePowerProfileResponse createRemoveStorageDevicePowerProfileResponse() {
        return new RemoveStorageDevicePowerProfileResponse();
    }

    /**
     * Create an instance of {@link SetLoadfactorsResponse }
     * 
     */
    public SetLoadfactorsResponse createSetLoadfactorsResponse() {
        return new SetLoadfactorsResponse();
    }

    /**
     * Create an instance of {@link UpdateNotification }
     * 
     */
    public UpdateNotification createUpdateNotification() {
        return new UpdateNotification();
    }

    /**
     * Create an instance of {@link PowerOnServerResponse }
     * 
     */
    public PowerOnServerResponse createPowerOnServerResponse() {
        return new PowerOnServerResponse();
    }

    /**
     * Create an instance of {@link GetEnclosureAndBladeInfo }
     * 
     */
    public GetEnclosureAndBladeInfo createGetEnclosureAndBladeInfo() {
        return new GetEnclosureAndBladeInfo();
    }

    /**
     * Create an instance of {@link GetNextDataResponse }
     * 
     */
    public GetNextDataResponse createGetNextDataResponse() {
        return new GetNextDataResponse();
    }

    /**
     * Create an instance of {@link SetCollectionStateResponse }
     * 
     */
    public SetCollectionStateResponse createSetCollectionStateResponse() {
        return new SetCollectionStateResponse();
    }

    /**
     * Create an instance of {@link GetEventHandlerResponse }
     * 
     */
    public GetEventHandlerResponse createGetEventHandlerResponse() {
        return new GetEventHandlerResponse();
    }

    /**
     * Create an instance of {@link SetEventStateResponse }
     * 
     */
    public SetEventStateResponse createSetEventStateResponse() {
        return new SetEventStateResponse();
    }

    /**
     * Create an instance of {@link GetActionLogRecords }
     * 
     */
    public GetActionLogRecords createGetActionLogRecords() {
        return new GetActionLogRecords();
    }

    /**
     * Create an instance of {@link GetStaticCUPSData }
     * 
     */
    public GetStaticCUPSData createGetStaticCUPSData() {
        return new GetStaticCUPSData();
    }

    /**
     * Create an instance of {@link RediscoverEntityResponse }
     * 
     */
    public RediscoverEntityResponse createRediscoverEntityResponse() {
        return new RediscoverEntityResponse();
    }

    /**
     * Create an instance of {@link EnumerateStorageDevicePowerProfilesResponse }
     * 
     */
    public EnumerateStorageDevicePowerProfilesResponse createEnumerateStorageDevicePowerProfilesResponse() {
        return new EnumerateStorageDevicePowerProfilesResponse();
    }

    /**
     * Create an instance of {@link UpdatePolicyEx }
     * 
     */
    public UpdatePolicyEx createUpdatePolicyEx() {
        return new UpdatePolicyEx();
    }

    /**
     * Create an instance of {@link RemoveNetworkDevicePowerProfile }
     * 
     */
    public RemoveNetworkDevicePowerProfile createRemoveNetworkDevicePowerProfile() {
        return new RemoveNetworkDevicePowerProfile();
    }

    /**
     * Create an instance of {@link EvaluateServerForWorkload }
     * 
     */
    public EvaluateServerForWorkload createEvaluateServerForWorkload() {
        return new EvaluateServerForWorkload();
    }

    /**
     * Create an instance of {@link EnumerateNotifications }
     * 
     */
    public EnumerateNotifications createEnumerateNotifications() {
        return new EnumerateNotifications();
    }

    /**
     * Create an instance of {@link UnsubscribeEventHandlerResponse }
     * 
     */
    public UnsubscribeEventHandlerResponse createUnsubscribeEventHandlerResponse() {
        return new UnsubscribeEventHandlerResponse();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesRecursivelyResponse }
     * 
     */
    public EnumerateEntitiesRecursivelyResponse createEnumerateEntitiesRecursivelyResponse() {
        return new EnumerateEntitiesRecursivelyResponse();
    }

    /**
     * Create an instance of {@link SetPolicyStateResponse }
     * 
     */
    public SetPolicyStateResponse createSetPolicyStateResponse() {
        return new SetPolicyStateResponse();
    }

    /**
     * Create an instance of {@link RediscoverEntity }
     * 
     */
    public RediscoverEntity createRediscoverEntity() {
        return new RediscoverEntity();
    }

    /**
     * Create an instance of {@link PowerOffResponse }
     * 
     */
    public PowerOffResponse createPowerOffResponse() {
        return new PowerOffResponse();
    }

    /**
     * Create an instance of {@link EvaluateServerForMigration }
     * 
     */
    public EvaluateServerForMigration createEvaluateServerForMigration() {
        return new EvaluateServerForMigration();
    }

    /**
     * Create an instance of {@link GetImmediateLogicalPredecessors }
     * 
     */
    public GetImmediateLogicalPredecessors createGetImmediateLogicalPredecessors() {
        return new GetImmediateLogicalPredecessors();
    }

    /**
     * Create an instance of {@link GetPolicyDataEx }
     * 
     */
    public GetPolicyDataEx createGetPolicyDataEx() {
        return new GetPolicyDataEx();
    }

    /**
     * Create an instance of {@link DumpMetricDataResponse }
     * 
     */
    public DumpMetricDataResponse createDumpMetricDataResponse() {
        return new DumpMetricDataResponse();
    }

    /**
     * Create an instance of {@link EnumerateEventHandlersResponse }
     * 
     */
    public EnumerateEventHandlersResponse createEnumerateEventHandlersResponse() {
        return new EnumerateEventHandlersResponse();
    }

    /**
     * Create an instance of {@link GetWorkloadPatternResponse }
     * 
     */
    public GetWorkloadPatternResponse createGetWorkloadPatternResponse() {
        return new GetWorkloadPatternResponse();
    }

    /**
     * Create an instance of {@link RankServersForMigrationResponse }
     * 
     */
    public RankServersForMigrationResponse createRankServersForMigrationResponse() {
        return new RankServersForMigrationResponse();
    }

    /**
     * Create an instance of {@link GetUnreachableEntities }
     * 
     */
    public GetUnreachableEntities createGetUnreachableEntities() {
        return new GetUnreachableEntities();
    }

    /**
     * Create an instance of {@link RemoveStorageDevicePowerProfile }
     * 
     */
    public RemoveStorageDevicePowerProfile createRemoveStorageDevicePowerProfile() {
        return new RemoveStorageDevicePowerProfile();
    }

    /**
     * Create an instance of {@link GetOutletStateResponse }
     * 
     */
    public GetOutletStateResponse createGetOutletStateResponse() {
        return new GetOutletStateResponse();
    }

    /**
     * Create an instance of {@link GetImmediateLogicalPredecessorsResponse }
     * 
     */
    public GetImmediateLogicalPredecessorsResponse createGetImmediateLogicalPredecessorsResponse() {
        return new GetImmediateLogicalPredecessorsResponse();
    }

    /**
     * Create an instance of {@link DetectEntities }
     * 
     */
    public DetectEntities createDetectEntities() {
        return new DetectEntities();
    }

    /**
     * Create an instance of {@link GetSystemTimeResponse }
     * 
     */
    public GetSystemTimeResponse createGetSystemTimeResponse() {
        return new GetSystemTimeResponse();
    }

    /**
     * Create an instance of {@link AddEntityResponse }
     * 
     */
    public AddEntityResponse createAddEntityResponse() {
        return new AddEntityResponse();
    }

    /**
     * Create an instance of {@link IdentifyEntityByProtocol }
     * 
     */
    public IdentifyEntityByProtocol createIdentifyEntityByProtocol() {
        return new IdentifyEntityByProtocol();
    }

    /**
     * Create an instance of {@link IsPolicyActiveResponse }
     * 
     */
    public IsPolicyActiveResponse createIsPolicyActiveResponse() {
        return new IsPolicyActiveResponse();
    }

    /**
     * Create an instance of {@link GetConnectorListResponse }
     * 
     */
    public GetConnectorListResponse createGetConnectorListResponse() {
        return new GetConnectorListResponse();
    }

    /**
     * Create an instance of {@link GetPSUPower }
     * 
     */
    public GetPSUPower createGetPSUPower() {
        return new GetPSUPower();
    }

    /**
     * Create an instance of {@link GetNextData }
     * 
     */
    public GetNextData createGetNextData() {
        return new GetNextData();
    }

    /**
     * Create an instance of {@link IsPolicyActive }
     * 
     */
    public IsPolicyActive createIsPolicyActive() {
        return new IsPolicyActive();
    }

    /**
     * Create an instance of {@link StartCollectingPowerDistributionResponse }
     * 
     */
    public StartCollectingPowerDistributionResponse createStartCollectingPowerDistributionResponse() {
        return new StartCollectingPowerDistributionResponse();
    }

    /**
     * Create an instance of {@link GetCollectionStateResponse }
     * 
     */
    public GetCollectionStateResponse createGetCollectionStateResponse() {
        return new GetCollectionStateResponse();
    }

    /**
     * Create an instance of {@link AddNetworkDevicePowerProfileResponse }
     * 
     */
    public AddNetworkDevicePowerProfileResponse createAddNetworkDevicePowerProfileResponse() {
        return new AddNetworkDevicePowerProfileResponse();
    }

    /**
     * Create an instance of {@link SetGlobalPropertyResponse }
     * 
     */
    public SetGlobalPropertyResponse createSetGlobalPropertyResponse() {
        return new SetGlobalPropertyResponse();
    }

    /**
     * Create an instance of {@link RemovePowerModel }
     * 
     */
    public RemovePowerModel createRemovePowerModel() {
        return new RemovePowerModel();
    }

    /**
     * Create an instance of {@link GetEntityProperties }
     * 
     */
    public GetEntityProperties createGetEntityProperties() {
        return new GetEntityProperties();
    }

    /**
     * Create an instance of {@link GetPredefinedEventTypesResponse }
     * 
     */
    public GetPredefinedEventTypesResponse createGetPredefinedEventTypesResponse() {
        return new GetPredefinedEventTypesResponse();
    }

    /**
     * Create an instance of {@link GetObservedMaxPower }
     * 
     */
    public GetObservedMaxPower createGetObservedMaxPower() {
        return new GetObservedMaxPower();
    }

    /**
     * Create an instance of {@link StopCollectingPowerDistributionResponse }
     * 
     */
    public StopCollectingPowerDistributionResponse createStopCollectingPowerDistributionResponse() {
        return new StopCollectingPowerDistributionResponse();
    }

    /**
     * Create an instance of {@link GetActiveIdlePowerEstimationResponse }
     * 
     */
    public GetActiveIdlePowerEstimationResponse createGetActiveIdlePowerEstimationResponse() {
        return new GetActiveIdlePowerEstimationResponse();
    }

    /**
     * Create an instance of {@link PowerOff }
     * 
     */
    public PowerOff createPowerOff() {
        return new PowerOff();
    }

    /**
     * Create an instance of {@link GetPolicyHistory }
     * 
     */
    public GetPolicyHistory createGetPolicyHistory() {
        return new GetPolicyHistory();
    }

    /**
     * Create an instance of {@link PowerOffOutletResponse }
     * 
     */
    public PowerOffOutletResponse createPowerOffOutletResponse() {
        return new PowerOffOutletResponse();
    }

    /**
     * Create an instance of {@link AssociateEntityResponse }
     * 
     */
    public AssociateEntityResponse createAssociateEntityResponse() {
        return new AssociateEntityResponse();
    }

    /**
     * Create an instance of {@link EvaluateLowUtilizationServerResponse }
     * 
     */
    public EvaluateLowUtilizationServerResponse createEvaluateLowUtilizationServerResponse() {
        return new EvaluateLowUtilizationServerResponse();
    }

    /**
     * Create an instance of {@link SetPolicyStateHastily }
     * 
     */
    public SetPolicyStateHastily createSetPolicyStateHastily() {
        return new SetPolicyStateHastily();
    }

    /**
     * Create an instance of {@link GetStaticCUPSDataResponse }
     * 
     */
    public GetStaticCUPSDataResponse createGetStaticCUPSDataResponse() {
        return new GetStaticCUPSDataResponse();
    }

    /**
     * Create an instance of {@link RemoveCustomEventResponse }
     * 
     */
    public RemoveCustomEventResponse createRemoveCustomEventResponse() {
        return new RemoveCustomEventResponse();
    }

    /**
     * Create an instance of {@link AddServerPowerProfile }
     * 
     */
    public AddServerPowerProfile createAddServerPowerProfile() {
        return new AddServerPowerProfile();
    }

    /**
     * Create an instance of {@link GetNotificationDataResponse }
     * 
     */
    public GetNotificationDataResponse createGetNotificationDataResponse() {
        return new GetNotificationDataResponse();
    }

    /**
     * Create an instance of {@link GetCustomEventData }
     * 
     */
    public GetCustomEventData createGetCustomEventData() {
        return new GetCustomEventData();
    }

    /**
     * Create an instance of {@link EnumeratePolicies }
     * 
     */
    public EnumeratePolicies createEnumeratePolicies() {
        return new EnumeratePolicies();
    }

    /**
     * Create an instance of {@link ImportHierarchyResponse }
     * 
     */
    public ImportHierarchyResponse createImportHierarchyResponse() {
        return new ImportHierarchyResponse();
    }

    /**
     * Create an instance of {@link SetPolicyStateHastilyResponse }
     * 
     */
    public SetPolicyStateHastilyResponse createSetPolicyStateHastilyResponse() {
        return new SetPolicyStateHastilyResponse();
    }

    /**
     * Create an instance of {@link SetPolicyExHastilyResponse }
     * 
     */
    public SetPolicyExHastilyResponse createSetPolicyExHastilyResponse() {
        return new SetPolicyExHastilyResponse();
    }

    /**
     * Create an instance of {@link GetConnectorPropertySetResponse }
     * 
     */
    public GetConnectorPropertySetResponse createGetConnectorPropertySetResponse() {
        return new GetConnectorPropertySetResponse();
    }

    /**
     * Create an instance of {@link SubmitSecretKey }
     * 
     */
    public SubmitSecretKey createSubmitSecretKey() {
        return new SubmitSecretKey();
    }

    /**
     * Create an instance of {@link GetPECBladeInfo }
     * 
     */
    public GetPECBladeInfo createGetPECBladeInfo() {
        return new GetPECBladeInfo();
    }

    /**
     * Create an instance of {@link IdentifyEntityResponse }
     * 
     */
    public IdentifyEntityResponse createIdentifyEntityResponse() {
        return new IdentifyEntityResponse();
    }

    /**
     * Create an instance of {@link RemoveEntity }
     * 
     */
    public RemoveEntity createRemoveEntity() {
        return new RemoveEntity();
    }

    /**
     * Create an instance of {@link DisassociateEntityResponse }
     * 
     */
    public DisassociateEntityResponse createDisassociateEntityResponse() {
        return new DisassociateEntityResponse();
    }

    /**
     * Create an instance of {@link UpdateNetworkDevicePowerProfile }
     * 
     */
    public UpdateNetworkDevicePowerProfile createUpdateNetworkDevicePowerProfile() {
        return new UpdateNetworkDevicePowerProfile();
    }

    /**
     * Create an instance of {@link GetConnectorList }
     * 
     */
    public GetConnectorList createGetConnectorList() {
        return new GetConnectorList();
    }

    /**
     * Create an instance of {@link RemoveNotification }
     * 
     */
    public RemoveNotification createRemoveNotification() {
        return new RemoveNotification();
    }

    /**
     * Create an instance of {@link EvaluateServerForMigrationResponse }
     * 
     */
    public EvaluateServerForMigrationResponse createEvaluateServerForMigrationResponse() {
        return new EvaluateServerForMigrationResponse();
    }

    /**
     * Create an instance of {@link GetMultipleLatestQueryDataResponse }
     * 
     */
    public GetMultipleLatestQueryDataResponse createGetMultipleLatestQueryDataResponse() {
        return new GetMultipleLatestQueryDataResponse();
    }

    /**
     * Create an instance of {@link RediscoverNodeCapabilitiesResponse }
     * 
     */
    public RediscoverNodeCapabilitiesResponse createRediscoverNodeCapabilitiesResponse() {
        return new RediscoverNodeCapabilitiesResponse();
    }

    /**
     * Create an instance of {@link GetNextRawDataResponse }
     * 
     */
    public GetNextRawDataResponse createGetNextRawDataResponse() {
        return new GetNextRawDataResponse();
    }

    /**
     * Create an instance of {@link SubmitSecretKeyResponse }
     * 
     */
    public SubmitSecretKeyResponse createSubmitSecretKeyResponse() {
        return new SubmitSecretKeyResponse();
    }

    /**
     * Create an instance of {@link EnumerateStorageDevicePowerProfiles }
     * 
     */
    public EnumerateStorageDevicePowerProfiles createEnumerateStorageDevicePowerProfiles() {
        return new EnumerateStorageDevicePowerProfiles();
    }

    /**
     * Create an instance of {@link DisableCore }
     * 
     */
    public DisableCore createDisableCore() {
        return new DisableCore();
    }

    /**
     * Create an instance of {@link AddNetworkDevicePowerProfile }
     * 
     */
    public AddNetworkDevicePowerProfile createAddNetworkDevicePowerProfile() {
        return new AddNetworkDevicePowerProfile();
    }

    /**
     * Create an instance of {@link UpdateStorageDevicePowerProfile }
     * 
     */
    public UpdateStorageDevicePowerProfile createUpdateStorageDevicePowerProfile() {
        return new UpdateStorageDevicePowerProfile();
    }

    /**
     * Create an instance of {@link DumpMeasurementDataResponse }
     * 
     */
    public DumpMeasurementDataResponse createDumpMeasurementDataResponse() {
        return new DumpMeasurementDataResponse();
    }

    /**
     * Create an instance of {@link UpdatePolicyExHastilyResponse }
     * 
     */
    public UpdatePolicyExHastilyResponse createUpdatePolicyExHastilyResponse() {
        return new UpdatePolicyExHastilyResponse();
    }

    /**
     * Create an instance of {@link StopPowerSavingResponse }
     * 
     */
    public StopPowerSavingResponse createStopPowerSavingResponse() {
        return new StopPowerSavingResponse();
    }

    /**
     * Create an instance of {@link GetSystemTime }
     * 
     */
    public GetSystemTime createGetSystemTime() {
        return new GetSystemTime();
    }

    /**
     * Create an instance of {@link UpdateCustomEvent }
     * 
     */
    public UpdateCustomEvent createUpdateCustomEvent() {
        return new UpdateCustomEvent();
    }

    /**
     * Create an instance of {@link RemovePowerModelResponse }
     * 
     */
    public RemovePowerModelResponse createRemovePowerModelResponse() {
        return new RemovePowerModelResponse();
    }

    /**
     * Create an instance of {@link SetEntityPropertiesResponse }
     * 
     */
    public SetEntityPropertiesResponse createSetEntityPropertiesResponse() {
        return new SetEntityPropertiesResponse();
    }

    /**
     * Create an instance of {@link StartCollectingPowerDistribution }
     * 
     */
    public StartCollectingPowerDistribution createStartCollectingPowerDistribution() {
        return new StartCollectingPowerDistribution();
    }

    /**
     * Create an instance of {@link EnumeratePowerModelsResponse }
     * 
     */
    public EnumeratePowerModelsResponse createEnumeratePowerModelsResponse() {
        return new EnumeratePowerModelsResponse();
    }

    /**
     * Create an instance of {@link GetPolicyHistoryResponse }
     * 
     */
    public GetPolicyHistoryResponse createGetPolicyHistoryResponse() {
        return new GetPolicyHistoryResponse();
    }

    /**
     * Create an instance of {@link PredictPower }
     * 
     */
    public PredictPower createPredictPower() {
        return new PredictPower();
    }

    /**
     * Create an instance of {@link EnumerateCustomEventsResponse }
     * 
     */
    public EnumerateCustomEventsResponse createEnumerateCustomEventsResponse() {
        return new EnumerateCustomEventsResponse();
    }

    /**
     * Create an instance of {@link GetMultipleLatestMetricData }
     * 
     */
    public GetMultipleLatestMetricData createGetMultipleLatestMetricData() {
        return new GetMultipleLatestMetricData();
    }

    /**
     * Create an instance of {@link GetOverCoolingIndicator }
     * 
     */
    public GetOverCoolingIndicator createGetOverCoolingIndicator() {
        return new GetOverCoolingIndicator();
    }

    /**
     * Create an instance of {@link SetEventState }
     * 
     */
    public SetEventState createSetEventState() {
        return new SetEventState();
    }

    /**
     * Create an instance of {@link GetGlobalProperty }
     * 
     */
    public GetGlobalProperty createGetGlobalProperty() {
        return new GetGlobalProperty();
    }

    /**
     * Create an instance of {@link AddServerPowerProfileResponse }
     * 
     */
    public AddServerPowerProfileResponse createAddServerPowerProfileResponse() {
        return new AddServerPowerProfileResponse();
    }

    /**
     * Create an instance of {@link GetLatestMetricData }
     * 
     */
    public GetLatestMetricData createGetLatestMetricData() {
        return new GetLatestMetricData();
    }

    /**
     * Create an instance of {@link RemovePolicyResponse }
     * 
     */
    public RemovePolicyResponse createRemovePolicyResponse() {
        return new RemovePolicyResponse();
    }

    /**
     * Create an instance of {@link EnumerateNetworkDevicePowerProfilesResponse }
     * 
     */
    public EnumerateNetworkDevicePowerProfilesResponse createEnumerateNetworkDevicePowerProfilesResponse() {
        return new EnumerateNetworkDevicePowerProfilesResponse();
    }

    /**
     * Create an instance of {@link SetPolicyEx }
     * 
     */
    public SetPolicyEx createSetPolicyEx() {
        return new SetPolicyEx();
    }

    /**
     * Create an instance of {@link GetBatchQueryDataResponse }
     * 
     */
    public GetBatchQueryDataResponse createGetBatchQueryDataResponse() {
        return new GetBatchQueryDataResponse();
    }

    /**
     * Create an instance of {@link RemoveNetworkDevicePowerProfileResponse }
     * 
     */
    public RemoveNetworkDevicePowerProfileResponse createRemoveNetworkDevicePowerProfileResponse() {
        return new RemoveNetworkDevicePowerProfileResponse();
    }

    /**
     * Create an instance of {@link StartPowerSavingResponse }
     * 
     */
    public StartPowerSavingResponse createStartPowerSavingResponse() {
        return new StartPowerSavingResponse();
    }

    /**
     * Create an instance of {@link DumpMetricData }
     * 
     */
    public DumpMetricData createDumpMetricData() {
        return new DumpMetricData();
    }

    /**
     * Create an instance of {@link ResetObservedMaxPower }
     * 
     */
    public ResetObservedMaxPower createResetObservedMaxPower() {
        return new ResetObservedMaxPower();
    }

    /**
     * Create an instance of {@link AssociateEntity }
     * 
     */
    public AssociateEntity createAssociateEntity() {
        return new AssociateEntity();
    }

    /**
     * Create an instance of {@link SubscribePredefinedEventResponse }
     * 
     */
    public SubscribePredefinedEventResponse createSubscribePredefinedEventResponse() {
        return new SubscribePredefinedEventResponse();
    }

    /**
     * Create an instance of {@link GetGlobalPropertyResponse }
     * 
     */
    public GetGlobalPropertyResponse createGetGlobalPropertyResponse() {
        return new GetGlobalPropertyResponse();
    }

    /**
     * Create an instance of {@link ClearNodePoliciesResponse }
     * 
     */
    public ClearNodePoliciesResponse createClearNodePoliciesResponse() {
        return new ClearNodePoliciesResponse();
    }

    /**
     * Create an instance of {@link FindEntitiesResponse }
     * 
     */
    public FindEntitiesResponse createFindEntitiesResponse() {
        return new FindEntitiesResponse();
    }

    /**
     * Create an instance of {@link SetNotificationState }
     * 
     */
    public SetNotificationState createSetNotificationState() {
        return new SetNotificationState();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesWithDetailsRecursively }
     * 
     */
    public EnumerateEntitiesWithDetailsRecursively createEnumerateEntitiesWithDetailsRecursively() {
        return new EnumerateEntitiesWithDetailsRecursively();
    }

    /**
     * Create an instance of {@link GetPowerDistributionResponse }
     * 
     */
    public GetPowerDistributionResponse createGetPowerDistributionResponse() {
        return new GetPowerDistributionResponse();
    }

    /**
     * Create an instance of {@link DefineCustomEventResponse }
     * 
     */
    public DefineCustomEventResponse createDefineCustomEventResponse() {
        return new DefineCustomEventResponse();
    }

    /**
     * Create an instance of {@link SetPolicyExHastily }
     * 
     */
    public SetPolicyExHastily createSetPolicyExHastily() {
        return new SetPolicyExHastily();
    }

    /**
     * Create an instance of {@link EnumerateEntities }
     * 
     */
    public EnumerateEntities createEnumerateEntities() {
        return new EnumerateEntities();
    }

    /**
     * Create an instance of {@link EnumeratePoliciesResponse }
     * 
     */
    public EnumeratePoliciesResponse createEnumeratePoliciesResponse() {
        return new EnumeratePoliciesResponse();
    }

    /**
     * Create an instance of {@link UpdatePolicyResponse }
     * 
     */
    public UpdatePolicyResponse createUpdatePolicyResponse() {
        return new UpdatePolicyResponse();
    }

    /**
     * Create an instance of {@link GetSensorDataResponse }
     * 
     */
    public GetSensorDataResponse createGetSensorDataResponse() {
        return new GetSensorDataResponse();
    }

    /**
     * Create an instance of {@link GetPhysicalParentResponse }
     * 
     */
    public GetPhysicalParentResponse createGetPhysicalParentResponse() {
        return new GetPhysicalParentResponse();
    }

    /**
     * Create an instance of {@link GetPECBladeInfoResponse }
     * 
     */
    public GetPECBladeInfoResponse createGetPECBladeInfoResponse() {
        return new GetPECBladeInfoResponse();
    }

    /**
     * Create an instance of {@link GetLoadfactors }
     * 
     */
    public GetLoadfactors createGetLoadfactors() {
        return new GetLoadfactors();
    }

    /**
     * Create an instance of {@link ResetObservedMaxPowerResponse }
     * 
     */
    public ResetObservedMaxPowerResponse createResetObservedMaxPowerResponse() {
        return new ResetObservedMaxPowerResponse();
    }

    /**
     * Create an instance of {@link GetNotificationData }
     * 
     */
    public GetNotificationData createGetNotificationData() {
        return new GetNotificationData();
    }

    /**
     * Create an instance of {@link UpdateStorageDevicePowerProfileResponse }
     * 
     */
    public UpdateStorageDevicePowerProfileResponse createUpdateStorageDevicePowerProfileResponse() {
        return new UpdateStorageDevicePowerProfileResponse();
    }

    /**
     * Create an instance of {@link AnalyzeCoolingStatusResponse }
     * 
     */
    public AnalyzeCoolingStatusResponse createAnalyzeCoolingStatusResponse() {
        return new AnalyzeCoolingStatusResponse();
    }

    /**
     * Create an instance of {@link AssociateInbandNodeResponse }
     * 
     */
    public AssociateInbandNodeResponse createAssociateInbandNodeResponse() {
        return new AssociateInbandNodeResponse();
    }

    /**
     * Create an instance of {@link GetEntityPropertiesResponse }
     * 
     */
    public GetEntityPropertiesResponse createGetEntityPropertiesResponse() {
        return new GetEntityPropertiesResponse();
    }

    /**
     * Create an instance of {@link SubscribeEventHandler }
     * 
     */
    public SubscribeEventHandler createSubscribeEventHandler() {
        return new SubscribeEventHandler();
    }

    /**
     * Create an instance of {@link UpdateWorkloadIntensity }
     * 
     */
    public UpdateWorkloadIntensity createUpdateWorkloadIntensity() {
        return new UpdateWorkloadIntensity();
    }

    /**
     * Create an instance of {@link GetUtilizationMetricsResponse }
     * 
     */
    public GetUtilizationMetricsResponse createGetUtilizationMetricsResponse() {
        return new GetUtilizationMetricsResponse();
    }

    /**
     * Create an instance of {@link UpdatePolicyExResponse }
     * 
     */
    public UpdatePolicyExResponse createUpdatePolicyExResponse() {
        return new UpdatePolicyExResponse();
    }

    /**
     * Create an instance of {@link UpdatePolicy }
     * 
     */
    public UpdatePolicy createUpdatePolicy() {
        return new UpdatePolicy();
    }

    /**
     * Create an instance of {@link RankServersForMigration }
     * 
     */
    public RankServersForMigration createRankServersForMigration() {
        return new RankServersForMigration();
    }

    /**
     * Create an instance of {@link SetGlobalProperty }
     * 
     */
    public SetGlobalProperty createSetGlobalProperty() {
        return new SetGlobalProperty();
    }

    /**
     * Create an instance of {@link ExecuteCommandResponse }
     * 
     */
    public ExecuteCommandResponse createExecuteCommandResponse() {
        return new ExecuteCommandResponse();
    }

    /**
     * Create an instance of {@link FindEntitiesWithDetailsResponse }
     * 
     */
    public FindEntitiesWithDetailsResponse createFindEntitiesWithDetailsResponse() {
        return new FindEntitiesWithDetailsResponse();
    }

    /**
     * Create an instance of {@link GetTemperatureRiseResponse }
     * 
     */
    public GetTemperatureRiseResponse createGetTemperatureRiseResponse() {
        return new GetTemperatureRiseResponse();
    }

    /**
     * Create an instance of {@link ExportHierarchy }
     * 
     */
    public ExportHierarchy createExportHierarchy() {
        return new ExportHierarchy();
    }

    /**
     * Create an instance of {@link GetEventMessageAuthenticationKeyResponse }
     * 
     */
    public GetEventMessageAuthenticationKeyResponse createGetEventMessageAuthenticationKeyResponse() {
        return new GetEventMessageAuthenticationKeyResponse();
    }

    /**
     * Create an instance of {@link SetPolicyExResponse }
     * 
     */
    public SetPolicyExResponse createSetPolicyExResponse() {
        return new SetPolicyExResponse();
    }

    /**
     * Create an instance of {@link IdentifyEntityByProtocolResponse }
     * 
     */
    public IdentifyEntityByProtocolResponse createIdentifyEntityByProtocolResponse() {
        return new IdentifyEntityByProtocolResponse();
    }

    /**
     * Create an instance of {@link PowerOffOutlet }
     * 
     */
    public PowerOffOutlet createPowerOffOutlet() {
        return new PowerOffOutlet();
    }

    /**
     * Create an instance of {@link UpdatePerformanceFeedbackResponse }
     * 
     */
    public UpdatePerformanceFeedbackResponse createUpdatePerformanceFeedbackResponse() {
        return new UpdatePerformanceFeedbackResponse();
    }

    /**
     * Create an instance of {@link SchedulePolicy }
     * 
     */
    public SchedulePolicy createSchedulePolicy() {
        return new SchedulePolicy();
    }

    /**
     * Create an instance of {@link PowerOnServer }
     * 
     */
    public PowerOnServer createPowerOnServer() {
        return new PowerOnServer();
    }

    /**
     * Create an instance of {@link RankServersForWorkload }
     * 
     */
    public RankServersForWorkload createRankServersForWorkload() {
        return new RankServersForWorkload();
    }

    /**
     * Create an instance of {@link ExecuteCommand }
     * 
     */
    public ExecuteCommand createExecuteCommand() {
        return new ExecuteCommand();
    }

    /**
     * Create an instance of {@link UpdateServerPowerProfile }
     * 
     */
    public UpdateServerPowerProfile createUpdateServerPowerProfile() {
        return new UpdateServerPowerProfile();
    }

    /**
     * Create an instance of {@link RemovePolicy }
     * 
     */
    public RemovePolicy createRemovePolicy() {
        return new RemovePolicy();
    }

    /**
     * Create an instance of {@link PowerOnServerWithCredential }
     * 
     */
    public PowerOnServerWithCredential createPowerOnServerWithCredential() {
        return new PowerOnServerWithCredential();
    }

    /**
     * Create an instance of {@link UpdatePerformanceFeedback }
     * 
     */
    public UpdatePerformanceFeedback createUpdatePerformanceFeedback() {
        return new UpdatePerformanceFeedback();
    }

    /**
     * Create an instance of {@link UpdateNotificationResponse }
     * 
     */
    public UpdateNotificationResponse createUpdateNotificationResponse() {
        return new UpdateNotificationResponse();
    }

    /**
     * Create an instance of {@link GetLatestQueryData }
     * 
     */
    public GetLatestQueryData createGetLatestQueryData() {
        return new GetLatestQueryData();
    }

    /**
     * Create an instance of {@link GetPolicyDataResponse }
     * 
     */
    public GetPolicyDataResponse createGetPolicyDataResponse() {
        return new GetPolicyDataResponse();
    }

    /**
     * Create an instance of {@link GetCoolingIndicatorResponse }
     * 
     */
    public GetCoolingIndicatorResponse createGetCoolingIndicatorResponse() {
        return new GetCoolingIndicatorResponse();
    }

    /**
     * Create an instance of {@link EnumeratePowerModels }
     * 
     */
    public EnumeratePowerModels createEnumeratePowerModels() {
        return new EnumeratePowerModels();
    }

    /**
     * Create an instance of {@link EnumerateEntitiesRecursively }
     * 
     */
    public EnumerateEntitiesRecursively createEnumerateEntitiesRecursively() {
        return new EnumerateEntitiesRecursively();
    }

    /**
     * Create an instance of {@link GetPowerDistribution }
     * 
     */
    public GetPowerDistribution createGetPowerDistribution() {
        return new GetPowerDistribution();
    }

    /**
     * Create an instance of {@link SetLocationInfoResponse }
     * 
     */
    public SetLocationInfoResponse createSetLocationInfoResponse() {
        return new SetLocationInfoResponse();
    }

    /**
     * Create an instance of {@link MaintainDBResponse }
     * 
     */
    public MaintainDBResponse createMaintainDBResponse() {
        return new MaintainDBResponse();
    }

    /**
     * Create an instance of {@link SchedulePolicyHastilyResponse }
     * 
     */
    public SchedulePolicyHastilyResponse createSchedulePolicyHastilyResponse() {
        return new SchedulePolicyHastilyResponse();
    }

    /**
     * Create an instance of {@link GetRealTimeUpsData }
     * 
     */
    public GetRealTimeUpsData createGetRealTimeUpsData() {
        return new GetRealTimeUpsData();
    }

    /**
     * Create an instance of {@link UnsubscribePredefinedEvent }
     * 
     */
    public UnsubscribePredefinedEvent createUnsubscribePredefinedEvent() {
        return new UnsubscribePredefinedEvent();
    }

    /**
     * Create an instance of {@link DeleteSecretKey }
     * 
     */
    public DeleteSecretKey createDeleteSecretKey() {
        return new DeleteSecretKey();
    }

    /**
     * Create an instance of {@link StartPowerSaving }
     * 
     */
    public StartPowerSaving createStartPowerSaving() {
        return new StartPowerSaving();
    }

    /**
     * Create an instance of {@link GetQueryAggregationPeriodListResponse }
     * 
     */
    public GetQueryAggregationPeriodListResponse createGetQueryAggregationPeriodListResponse() {
        return new GetQueryAggregationPeriodListResponse();
    }

    /**
     * Create an instance of {@link ResetActiveIdlePowerEstimation }
     * 
     */
    public ResetActiveIdlePowerEstimation createResetActiveIdlePowerEstimation() {
        return new ResetActiveIdlePowerEstimation();
    }

    /**
     * Create an instance of {@link GetBatchMetricData }
     * 
     */
    public GetBatchMetricData createGetBatchMetricData() {
        return new GetBatchMetricData();
    }

    /**
     * Create an instance of {@link GetActiveIdlePowerEstimation }
     * 
     */
    public GetActiveIdlePowerEstimation createGetActiveIdlePowerEstimation() {
        return new GetActiveIdlePowerEstimation();
    }

    /**
     * Create an instance of {@link ResetServerWithCredentialResponse }
     * 
     */
    public ResetServerWithCredentialResponse createResetServerWithCredentialResponse() {
        return new ResetServerWithCredentialResponse();
    }

    /**
     * Create an instance of {@link GetSELInTextResponse }
     * 
     */
    public GetSELInTextResponse createGetSELInTextResponse() {
        return new GetSELInTextResponse();
    }

    /**
     * Create an instance of {@link SetNotificationStateResponse }
     * 
     */
    public SetNotificationStateResponse createSetNotificationStateResponse() {
        return new SetNotificationStateResponse();
    }

    /**
     * Create an instance of {@link EnumerateCustomEvents }
     * 
     */
    public EnumerateCustomEvents createEnumerateCustomEvents() {
        return new EnumerateCustomEvents();
    }

    /**
     * Create an instance of {@link PowerCycleServerWithCredential }
     * 
     */
    public PowerCycleServerWithCredential createPowerCycleServerWithCredential() {
        return new PowerCycleServerWithCredential();
    }

    /**
     * Create an instance of {@link DisableCoreResponse }
     * 
     */
    public DisableCoreResponse createDisableCoreResponse() {
        return new DisableCoreResponse();
    }

    /**
     * Create an instance of {@link EntityDetectInfo }
     * 
     */
    public EntityDetectInfo createEntityDetectInfo() {
        return new EntityDetectInfo();
    }

    /**
     * Create an instance of {@link SelData }
     * 
     */
    public SelData createSelData() {
        return new SelData();
    }

    /**
     * Create an instance of {@link EnclosureBladeInfo }
     * 
     */
    public EnclosureBladeInfo createEnclosureBladeInfo() {
        return new EnclosureBladeInfo();
    }

    /**
     * Create an instance of {@link UpsBypassEntry }
     * 
     */
    public UpsBypassEntry createUpsBypassEntry() {
        return new UpsBypassEntry();
    }

    /**
     * Create an instance of {@link PduSensorData }
     * 
     */
    public PduSensorData createPduSensorData() {
        return new PduSensorData();
    }

    /**
     * Create an instance of {@link LocationInfo }
     * 
     */
    public LocationInfo createLocationInfo() {
        return new LocationInfo();
    }

    /**
     * Create an instance of {@link RealTimeUpsData }
     * 
     */
    public RealTimeUpsData createRealTimeUpsData() {
        return new RealTimeUpsData();
    }

    /**
     * Create an instance of {@link StorageDevicePowerProfile }
     * 
     */
    public StorageDevicePowerProfile createStorageDevicePowerProfile() {
        return new StorageDevicePowerProfile();
    }

    /**
     * Create an instance of {@link EntityDetailedInfo }
     * 
     */
    public EntityDetailedInfo createEntityDetailedInfo() {
        return new EntityDetailedInfo();
    }

    /**
     * Create an instance of {@link WorkloadPattern }
     * 
     */
    public WorkloadPattern createWorkloadPattern() {
        return new WorkloadPattern();
    }

    /**
     * Create an instance of {@link PduOutletData }
     * 
     */
    public PduOutletData createPduOutletData() {
        return new PduOutletData();
    }

    /**
     * Create an instance of {@link CustomEventData }
     * 
     */
    public CustomEventData createCustomEventData() {
        return new CustomEventData();
    }

    /**
     * Create an instance of {@link RealTimePduData }
     * 
     */
    public RealTimePduData createRealTimePduData() {
        return new RealTimePduData();
    }

    /**
     * Create an instance of {@link PowerUtilizationData }
     * 
     */
    public PowerUtilizationData createPowerUtilizationData() {
        return new PowerUtilizationData();
    }

    /**
     * Create an instance of {@link MeasurementDistributionInfo }
     * 
     */
    public MeasurementDistributionInfo createMeasurementDistributionInfo() {
        return new MeasurementDistributionInfo();
    }

    /**
     * Create an instance of {@link EntityPriority }
     * 
     */
    public EntityPriority createEntityPriority() {
        return new EntityPriority();
    }

    /**
     * Create an instance of {@link Loadfactors }
     * 
     */
    public Loadfactors createLoadfactors() {
        return new Loadfactors();
    }

    /**
     * Create an instance of {@link ServerPowerProfile }
     * 
     */
    public ServerPowerProfile createServerPowerProfile() {
        return new ServerPowerProfile();
    }

    /**
     * Create an instance of {@link UpsInputEntry }
     * 
     */
    public UpsInputEntry createUpsInputEntry() {
        return new UpsInputEntry();
    }

    /**
     * Create an instance of {@link PolicyDataEx }
     * 
     */
    public PolicyDataEx createPolicyDataEx() {
        return new PolicyDataEx();
    }

    /**
     * Create an instance of {@link UpsOutputEntry }
     * 
     */
    public UpsOutputEntry createUpsOutputEntry() {
        return new UpsOutputEntry();
    }

    /**
     * Create an instance of {@link PecBladeInfo }
     * 
     */
    public PecBladeInfo createPecBladeInfo() {
        return new PecBladeInfo();
    }

    /**
     * Create an instance of {@link PolicyData }
     * 
     */
    public PolicyData createPolicyData() {
        return new PolicyData();
    }

    /**
     * Create an instance of {@link EvaluationResult }
     * 
     */
    public EvaluationResult createEvaluationResult() {
        return new EvaluationResult();
    }

    /**
     * Create an instance of {@link SensorData }
     * 
     */
    public SensorData createSensorData() {
        return new SensorData();
    }

    /**
     * Create an instance of {@link StaticCUPSData }
     * 
     */
    public StaticCUPSData createStaticCUPSData() {
        return new StaticCUPSData();
    }

    /**
     * Create an instance of {@link Option }
     * 
     */
    public Option createOption() {
        return new Option();
    }

    /**
     * Create an instance of {@link CoolingStatusInfo }
     * 
     */
    public CoolingStatusInfo createCoolingStatusInfo() {
        return new CoolingStatusInfo();
    }

    /**
     * Create an instance of {@link UtilizationMetric }
     * 
     */
    public UtilizationMetric createUtilizationMetric() {
        return new UtilizationMetric();
    }

    /**
     * Create an instance of {@link ServerScore }
     * 
     */
    public ServerScore createServerScore() {
        return new ServerScore();
    }

    /**
     * Create an instance of {@link EnumerationData }
     * 
     */
    public EnumerationData createEnumerationData() {
        return new EnumerationData();
    }

    /**
     * Create an instance of {@link GenericSensorData }
     * 
     */
    public GenericSensorData createGenericSensorData() {
        return new GenericSensorData();
    }

    /**
     * Create an instance of {@link RawPtData }
     * 
     */
    public RawPtData createRawPtData() {
        return new RawPtData();
    }

    /**
     * Create an instance of {@link AggregationPeriod }
     * 
     */
    public AggregationPeriod createAggregationPeriod() {
        return new AggregationPeriod();
    }

    /**
     * Create an instance of {@link PowerDistributionInfo }
     * 
     */
    public PowerDistributionInfo createPowerDistributionInfo() {
        return new PowerDistributionInfo();
    }

    /**
     * Create an instance of {@link MeasurementDistributionData }
     * 
     */
    public MeasurementDistributionData createMeasurementDistributionData() {
        return new MeasurementDistributionData();
    }

    /**
     * Create an instance of {@link RealTimePSUData }
     * 
     */
    public RealTimePSUData createRealTimePSUData() {
        return new RealTimePSUData();
    }

    /**
     * Create an instance of {@link ModelInfo }
     * 
     */
    public ModelInfo createModelInfo() {
        return new ModelInfo();
    }

    /**
     * Create an instance of {@link PtData }
     * 
     */
    public PtData createPtData() {
        return new PtData();
    }

    /**
     * Create an instance of {@link PduPhaseData }
     * 
     */
    public PduPhaseData createPduPhaseData() {
        return new PduPhaseData();
    }

    /**
     * Create an instance of {@link LatestMetricData }
     * 
     */
    public LatestMetricData createLatestMetricData() {
        return new LatestMetricData();
    }

    /**
     * Create an instance of {@link EntityDiscoverInfo }
     * 
     */
    public EntityDiscoverInfo createEntityDiscoverInfo() {
        return new EntityDiscoverInfo();
    }

    /**
     * Create an instance of {@link SensorRawData }
     * 
     */
    public SensorRawData createSensorRawData() {
        return new SensorRawData();
    }

    /**
     * Create an instance of {@link Property }
     * 
     */
    public Property createProperty() {
        return new Property();
    }

    /**
     * Create an instance of {@link EnumerationRawData }
     * 
     */
    public EnumerationRawData createEnumerationRawData() {
        return new EnumerationRawData();
    }

    /**
     * Create an instance of {@link PowerDistributionData }
     * 
     */
    public PowerDistributionData createPowerDistributionData() {
        return new PowerDistributionData();
    }

    /**
     * Create an instance of {@link ConnectorInfo }
     * 
     */
    public ConnectorInfo createConnectorInfo() {
        return new ConnectorInfo();
    }

    /**
     * Create an instance of {@link BladeInfo }
     * 
     */
    public BladeInfo createBladeInfo() {
        return new BladeInfo();
    }

    /**
     * Create an instance of {@link LatestQueryData }
     * 
     */
    public LatestQueryData createLatestQueryData() {
        return new LatestQueryData();
    }

    /**
     * Create an instance of {@link PropertyEx }
     * 
     */
    public PropertyEx createPropertyEx() {
        return new PropertyEx();
    }

    /**
     * Create an instance of {@link NetworkDevicePowerProfile }
     * 
     */
    public NetworkDevicePowerProfile createNetworkDevicePowerProfile() {
        return new NetworkDevicePowerProfile();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerformanceFeedback }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePerformanceFeedback")
    public JAXBElement<UpdatePerformanceFeedback> createUpdatePerformanceFeedback(UpdatePerformanceFeedback value) {
        return new JAXBElement<UpdatePerformanceFeedback>(_UpdatePerformanceFeedback_QNAME, UpdatePerformanceFeedback.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnServerWithCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnServerWithCredential")
    public JAXBElement<PowerOnServerWithCredential> createPowerOnServerWithCredential(PowerOnServerWithCredential value) {
        return new JAXBElement<PowerOnServerWithCredential>(_PowerOnServerWithCredential_QNAME, PowerOnServerWithCredential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removePolicy")
    public JAXBElement<RemovePolicy> createRemovePolicy(RemovePolicy value) {
        return new JAXBElement<RemovePolicy>(_RemovePolicy_QNAME, RemovePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServerPowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateServerPowerProfile")
    public JAXBElement<UpdateServerPowerProfile> createUpdateServerPowerProfile(UpdateServerPowerProfile value) {
        return new JAXBElement<UpdateServerPowerProfile>(_UpdateServerPowerProfile_QNAME, UpdateServerPowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePerformanceFeedbackResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePerformanceFeedbackResponse")
    public JAXBElement<UpdatePerformanceFeedbackResponse> createUpdatePerformanceFeedbackResponse(UpdatePerformanceFeedbackResponse value) {
        return new JAXBElement<UpdatePerformanceFeedbackResponse>(_UpdatePerformanceFeedbackResponse_QNAME, UpdatePerformanceFeedbackResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCommand }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "executeCommand")
    public JAXBElement<ExecuteCommand> createExecuteCommand(ExecuteCommand value) {
        return new JAXBElement<ExecuteCommand>(_ExecuteCommand_QNAME, ExecuteCommand.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankServersForWorkload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rankServersForWorkload")
    public JAXBElement<RankServersForWorkload> createRankServersForWorkload(RankServersForWorkload value) {
        return new JAXBElement<RankServersForWorkload>(_RankServersForWorkload_QNAME, RankServersForWorkload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnServer")
    public JAXBElement<PowerOnServer> createPowerOnServer(PowerOnServer value) {
        return new JAXBElement<PowerOnServer>(_PowerOnServer_QNAME, PowerOnServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchedulePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "schedulePolicy")
    public JAXBElement<SchedulePolicy> createSchedulePolicy(SchedulePolicy value) {
        return new JAXBElement<SchedulePolicy>(_SchedulePolicy_QNAME, SchedulePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyEntityByProtocolResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "identifyEntityByProtocolResponse")
    public JAXBElement<IdentifyEntityByProtocolResponse> createIdentifyEntityByProtocolResponse(IdentifyEntityByProtocolResponse value) {
        return new JAXBElement<IdentifyEntityByProtocolResponse>(_IdentifyEntityByProtocolResponse_QNAME, IdentifyEntityByProtocolResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyExResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyExResponse")
    public JAXBElement<SetPolicyExResponse> createSetPolicyExResponse(SetPolicyExResponse value) {
        return new JAXBElement<SetPolicyExResponse>(_SetPolicyExResponse_QNAME, SetPolicyExResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffOutlet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffOutlet")
    public JAXBElement<PowerOffOutlet> createPowerOffOutlet(PowerOffOutlet value) {
        return new JAXBElement<PowerOffOutlet>(_PowerOffOutlet_QNAME, PowerOffOutlet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemperatureRiseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getTemperatureRiseResponse")
    public JAXBElement<GetTemperatureRiseResponse> createGetTemperatureRiseResponse(GetTemperatureRiseResponse value) {
        return new JAXBElement<GetTemperatureRiseResponse>(_GetTemperatureRiseResponse_QNAME, GetTemperatureRiseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEntitiesWithDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "findEntitiesWithDetailsResponse")
    public JAXBElement<FindEntitiesWithDetailsResponse> createFindEntitiesWithDetailsResponse(FindEntitiesWithDetailsResponse value) {
        return new JAXBElement<FindEntitiesWithDetailsResponse>(_FindEntitiesWithDetailsResponse_QNAME, FindEntitiesWithDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExecuteCommandResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "executeCommandResponse")
    public JAXBElement<ExecuteCommandResponse> createExecuteCommandResponse(ExecuteCommandResponse value) {
        return new JAXBElement<ExecuteCommandResponse>(_ExecuteCommandResponse_QNAME, ExecuteCommandResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventMessageAuthenticationKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEventMessageAuthenticationKeyResponse")
    public JAXBElement<GetEventMessageAuthenticationKeyResponse> createGetEventMessageAuthenticationKeyResponse(GetEventMessageAuthenticationKeyResponse value) {
        return new JAXBElement<GetEventMessageAuthenticationKeyResponse>(_GetEventMessageAuthenticationKeyResponse_QNAME, GetEventMessageAuthenticationKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "exportHierarchy")
    public JAXBElement<ExportHierarchy> createExportHierarchy(ExportHierarchy value) {
        return new JAXBElement<ExportHierarchy>(_ExportHierarchy_QNAME, ExportHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGlobalProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setGlobalProperty")
    public JAXBElement<SetGlobalProperty> createSetGlobalProperty(SetGlobalProperty value) {
        return new JAXBElement<SetGlobalProperty>(_SetGlobalProperty_QNAME, SetGlobalProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankServersForMigration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rankServersForMigration")
    public JAXBElement<RankServersForMigration> createRankServersForMigration(RankServersForMigration value) {
        return new JAXBElement<RankServersForMigration>(_RankServersForMigration_QNAME, RankServersForMigration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilizationMetricsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getUtilizationMetricsResponse")
    public JAXBElement<GetUtilizationMetricsResponse> createGetUtilizationMetricsResponse(GetUtilizationMetricsResponse value) {
        return new JAXBElement<GetUtilizationMetricsResponse>(_GetUtilizationMetricsResponse_QNAME, GetUtilizationMetricsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorkloadIntensity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateWorkloadIntensity")
    public JAXBElement<UpdateWorkloadIntensity> createUpdateWorkloadIntensity(UpdateWorkloadIntensity value) {
        return new JAXBElement<UpdateWorkloadIntensity>(_UpdateWorkloadIntensity_QNAME, UpdateWorkloadIntensity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePolicy")
    public JAXBElement<UpdatePolicy> createUpdatePolicy(UpdatePolicy value) {
        return new JAXBElement<UpdatePolicy>(_UpdatePolicy_QNAME, UpdatePolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyExResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePolicyExResponse")
    public JAXBElement<UpdatePolicyExResponse> createUpdatePolicyExResponse(UpdatePolicyExResponse value) {
        return new JAXBElement<UpdatePolicyExResponse>(_UpdatePolicyExResponse_QNAME, UpdatePolicyExResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEntityPropertiesResponse")
    public JAXBElement<GetEntityPropertiesResponse> createGetEntityPropertiesResponse(GetEntityPropertiesResponse value) {
        return new JAXBElement<GetEntityPropertiesResponse>(_GetEntityPropertiesResponse_QNAME, GetEntityPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeEventHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "subscribeEventHandler")
    public JAXBElement<SubscribeEventHandler> createSubscribeEventHandler(SubscribeEventHandler value) {
        return new JAXBElement<SubscribeEventHandler>(_SubscribeEventHandler_QNAME, SubscribeEventHandler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateInbandNodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "associateInbandNodeResponse")
    public JAXBElement<AssociateInbandNodeResponse> createAssociateInbandNodeResponse(AssociateInbandNodeResponse value) {
        return new JAXBElement<AssociateInbandNodeResponse>(_AssociateInbandNodeResponse_QNAME, AssociateInbandNodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyzeCoolingStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "analyzeCoolingStatusResponse")
    public JAXBElement<AnalyzeCoolingStatusResponse> createAnalyzeCoolingStatusResponse(AnalyzeCoolingStatusResponse value) {
        return new JAXBElement<AnalyzeCoolingStatusResponse>(_AnalyzeCoolingStatusResponse_QNAME, AnalyzeCoolingStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerCycleServerWithCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerCycleServerWithCredential")
    public JAXBElement<PowerCycleServerWithCredential> createPowerCycleServerWithCredential(PowerCycleServerWithCredential value) {
        return new JAXBElement<PowerCycleServerWithCredential>(_PowerCycleServerWithCredential_QNAME, PowerCycleServerWithCredential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableCoreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "disableCoreResponse")
    public JAXBElement<DisableCoreResponse> createDisableCoreResponse(DisableCoreResponse value) {
        return new JAXBElement<DisableCoreResponse>(_DisableCoreResponse_QNAME, DisableCoreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSELInTextResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getSELInTextResponse")
    public JAXBElement<GetSELInTextResponse> createGetSELInTextResponse(GetSELInTextResponse value) {
        return new JAXBElement<GetSELInTextResponse>(_GetSELInTextResponse_QNAME, GetSELInTextResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateCustomEvents }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateCustomEvents")
    public JAXBElement<EnumerateCustomEvents> createEnumerateCustomEvents(EnumerateCustomEvents value) {
        return new JAXBElement<EnumerateCustomEvents>(_EnumerateCustomEvents_QNAME, EnumerateCustomEvents.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNotificationStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setNotificationStateResponse")
    public JAXBElement<SetNotificationStateResponse> createSetNotificationStateResponse(SetNotificationStateResponse value) {
        return new JAXBElement<SetNotificationStateResponse>(_SetNotificationStateResponse_QNAME, SetNotificationStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveIdlePowerEstimation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getActiveIdlePowerEstimation")
    public JAXBElement<GetActiveIdlePowerEstimation> createGetActiveIdlePowerEstimation(GetActiveIdlePowerEstimation value) {
        return new JAXBElement<GetActiveIdlePowerEstimation>(_GetActiveIdlePowerEstimation_QNAME, GetActiveIdlePowerEstimation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBatchMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getBatchMetricData")
    public JAXBElement<GetBatchMetricData> createGetBatchMetricData(GetBatchMetricData value) {
        return new JAXBElement<GetBatchMetricData>(_GetBatchMetricData_QNAME, GetBatchMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetActiveIdlePowerEstimation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "resetActiveIdlePowerEstimation")
    public JAXBElement<ResetActiveIdlePowerEstimation> createResetActiveIdlePowerEstimation(ResetActiveIdlePowerEstimation value) {
        return new JAXBElement<ResetActiveIdlePowerEstimation>(_ResetActiveIdlePowerEstimation_QNAME, ResetActiveIdlePowerEstimation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetServerWithCredentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "resetServerWithCredentialResponse")
    public JAXBElement<ResetServerWithCredentialResponse> createResetServerWithCredentialResponse(ResetServerWithCredentialResponse value) {
        return new JAXBElement<ResetServerWithCredentialResponse>(_ResetServerWithCredentialResponse_QNAME, ResetServerWithCredentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSecretKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "deleteSecretKey")
    public JAXBElement<DeleteSecretKey> createDeleteSecretKey(DeleteSecretKey value) {
        return new JAXBElement<DeleteSecretKey>(_DeleteSecretKey_QNAME, DeleteSecretKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribePredefinedEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "unsubscribePredefinedEvent")
    public JAXBElement<UnsubscribePredefinedEvent> createUnsubscribePredefinedEvent(UnsubscribePredefinedEvent value) {
        return new JAXBElement<UnsubscribePredefinedEvent>(_UnsubscribePredefinedEvent_QNAME, UnsubscribePredefinedEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQueryAggregationPeriodListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getQueryAggregationPeriodListResponse")
    public JAXBElement<GetQueryAggregationPeriodListResponse> createGetQueryAggregationPeriodListResponse(GetQueryAggregationPeriodListResponse value) {
        return new JAXBElement<GetQueryAggregationPeriodListResponse>(_GetQueryAggregationPeriodListResponse_QNAME, GetQueryAggregationPeriodListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPowerSaving }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "startPowerSaving")
    public JAXBElement<StartPowerSaving> createStartPowerSaving(StartPowerSaving value) {
        return new JAXBElement<StartPowerSaving>(_StartPowerSaving_QNAME, StartPowerSaving.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRealTimeUpsData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getRealTimeUpsData")
    public JAXBElement<GetRealTimeUpsData> createGetRealTimeUpsData(GetRealTimeUpsData value) {
        return new JAXBElement<GetRealTimeUpsData>(_GetRealTimeUpsData_QNAME, GetRealTimeUpsData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchedulePolicyHastilyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "schedulePolicyHastilyResponse")
    public JAXBElement<SchedulePolicyHastilyResponse> createSchedulePolicyHastilyResponse(SchedulePolicyHastilyResponse value) {
        return new JAXBElement<SchedulePolicyHastilyResponse>(_SchedulePolicyHastilyResponse_QNAME, SchedulePolicyHastilyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPowerDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPowerDistribution")
    public JAXBElement<GetPowerDistribution> createGetPowerDistribution(GetPowerDistribution value) {
        return new JAXBElement<GetPowerDistribution>(_GetPowerDistribution_QNAME, GetPowerDistribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainDBResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "maintainDBResponse")
    public JAXBElement<MaintainDBResponse> createMaintainDBResponse(MaintainDBResponse value) {
        return new JAXBElement<MaintainDBResponse>(_MaintainDBResponse_QNAME, MaintainDBResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLocationInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setLocationInfoResponse")
    public JAXBElement<SetLocationInfoResponse> createSetLocationInfoResponse(SetLocationInfoResponse value) {
        return new JAXBElement<SetLocationInfoResponse>(_SetLocationInfoResponse_QNAME, SetLocationInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoolingIndicatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getCoolingIndicatorResponse")
    public JAXBElement<GetCoolingIndicatorResponse> createGetCoolingIndicatorResponse(GetCoolingIndicatorResponse value) {
        return new JAXBElement<GetCoolingIndicatorResponse>(_GetCoolingIndicatorResponse_QNAME, GetCoolingIndicatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesRecursively }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesRecursively")
    public JAXBElement<EnumerateEntitiesRecursively> createEnumerateEntitiesRecursively(EnumerateEntitiesRecursively value) {
        return new JAXBElement<EnumerateEntitiesRecursively>(_EnumerateEntitiesRecursively_QNAME, EnumerateEntitiesRecursively.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumeratePowerModels }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumeratePowerModels")
    public JAXBElement<EnumeratePowerModels> createEnumeratePowerModels(EnumeratePowerModels value) {
        return new JAXBElement<EnumeratePowerModels>(_EnumeratePowerModels_QNAME, EnumeratePowerModels.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyDataResponse")
    public JAXBElement<GetPolicyDataResponse> createGetPolicyDataResponse(GetPolicyDataResponse value) {
        return new JAXBElement<GetPolicyDataResponse>(_GetPolicyDataResponse_QNAME, GetPolicyDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestQueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getLatestQueryData")
    public JAXBElement<GetLatestQueryData> createGetLatestQueryData(GetLatestQueryData value) {
        return new JAXBElement<GetLatestQueryData>(_GetLatestQueryData_QNAME, GetLatestQueryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateNotificationResponse")
    public JAXBElement<UpdateNotificationResponse> createUpdateNotificationResponse(UpdateNotificationResponse value) {
        return new JAXBElement<UpdateNotificationResponse>(_UpdateNotificationResponse_QNAME, UpdateNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "dumpMetricData")
    public JAXBElement<DumpMetricData> createDumpMetricData(DumpMetricData value) {
        return new JAXBElement<DumpMetricData>(_DumpMetricData_QNAME, DumpMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartPowerSavingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "startPowerSavingResponse")
    public JAXBElement<StartPowerSavingResponse> createStartPowerSavingResponse(StartPowerSavingResponse value) {
        return new JAXBElement<StartPowerSavingResponse>(_StartPowerSavingResponse_QNAME, StartPowerSavingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNetworkDevicePowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeNetworkDevicePowerProfileResponse")
    public JAXBElement<RemoveNetworkDevicePowerProfileResponse> createRemoveNetworkDevicePowerProfileResponse(RemoveNetworkDevicePowerProfileResponse value) {
        return new JAXBElement<RemoveNetworkDevicePowerProfileResponse>(_RemoveNetworkDevicePowerProfileResponse_QNAME, RemoveNetworkDevicePowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateNetworkDevicePowerProfilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateNetworkDevicePowerProfilesResponse")
    public JAXBElement<EnumerateNetworkDevicePowerProfilesResponse> createEnumerateNetworkDevicePowerProfilesResponse(EnumerateNetworkDevicePowerProfilesResponse value) {
        return new JAXBElement<EnumerateNetworkDevicePowerProfilesResponse>(_EnumerateNetworkDevicePowerProfilesResponse_QNAME, EnumerateNetworkDevicePowerProfilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBatchQueryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getBatchQueryDataResponse")
    public JAXBElement<GetBatchQueryDataResponse> createGetBatchQueryDataResponse(GetBatchQueryDataResponse value) {
        return new JAXBElement<GetBatchQueryDataResponse>(_GetBatchQueryDataResponse_QNAME, GetBatchQueryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyEx")
    public JAXBElement<SetPolicyEx> createSetPolicyEx(SetPolicyEx value) {
        return new JAXBElement<SetPolicyEx>(_SetPolicyEx_QNAME, SetPolicyEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getLatestMetricData")
    public JAXBElement<GetLatestMetricData> createGetLatestMetricData(GetLatestMetricData value) {
        return new JAXBElement<GetLatestMetricData>(_GetLatestMetricData_QNAME, GetLatestMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removePolicyResponse")
    public JAXBElement<RemovePolicyResponse> createRemovePolicyResponse(RemovePolicyResponse value) {
        return new JAXBElement<RemovePolicyResponse>(_RemovePolicyResponse_QNAME, RemovePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddServerPowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addServerPowerProfileResponse")
    public JAXBElement<AddServerPowerProfileResponse> createAddServerPowerProfileResponse(AddServerPowerProfileResponse value) {
        return new JAXBElement<AddServerPowerProfileResponse>(_AddServerPowerProfileResponse_QNAME, AddServerPowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGlobalProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getGlobalProperty")
    public JAXBElement<GetGlobalProperty> createGetGlobalProperty(GetGlobalProperty value) {
        return new JAXBElement<GetGlobalProperty>(_GetGlobalProperty_QNAME, GetGlobalProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEventState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setEventState")
    public JAXBElement<SetEventState> createSetEventState(SetEventState value) {
        return new JAXBElement<SetEventState>(_SetEventState_QNAME, SetEventState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOverCoolingIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getOverCoolingIndicator")
    public JAXBElement<GetOverCoolingIndicator> createGetOverCoolingIndicator(GetOverCoolingIndicator value) {
        return new JAXBElement<GetOverCoolingIndicator>(_GetOverCoolingIndicator_QNAME, GetOverCoolingIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleLatestMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMultipleLatestMetricData")
    public JAXBElement<GetMultipleLatestMetricData> createGetMultipleLatestMetricData(GetMultipleLatestMetricData value) {
        return new JAXBElement<GetMultipleLatestMetricData>(_GetMultipleLatestMetricData_QNAME, GetMultipleLatestMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNotificationData")
    public JAXBElement<GetNotificationData> createGetNotificationData(GetNotificationData value) {
        return new JAXBElement<GetNotificationData>(_GetNotificationData_QNAME, GetNotificationData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStorageDevicePowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateStorageDevicePowerProfileResponse")
    public JAXBElement<UpdateStorageDevicePowerProfileResponse> createUpdateStorageDevicePowerProfileResponse(UpdateStorageDevicePowerProfileResponse value) {
        return new JAXBElement<UpdateStorageDevicePowerProfileResponse>(_UpdateStorageDevicePowerProfileResponse_QNAME, UpdateStorageDevicePowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetObservedMaxPowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "resetObservedMaxPowerResponse")
    public JAXBElement<ResetObservedMaxPowerResponse> createResetObservedMaxPowerResponse(ResetObservedMaxPowerResponse value) {
        return new JAXBElement<ResetObservedMaxPowerResponse>(_ResetObservedMaxPowerResponse_QNAME, ResetObservedMaxPowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPECBladeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPECBladeInfoResponse")
    public JAXBElement<GetPECBladeInfoResponse> createGetPECBladeInfoResponse(GetPECBladeInfoResponse value) {
        return new JAXBElement<GetPECBladeInfoResponse>(_GetPECBladeInfoResponse_QNAME, GetPECBladeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoadfactors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getLoadfactors")
    public JAXBElement<GetLoadfactors> createGetLoadfactors(GetLoadfactors value) {
        return new JAXBElement<GetLoadfactors>(_GetLoadfactors_QNAME, GetLoadfactors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhysicalParentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPhysicalParentResponse")
    public JAXBElement<GetPhysicalParentResponse> createGetPhysicalParentResponse(GetPhysicalParentResponse value) {
        return new JAXBElement<GetPhysicalParentResponse>(_GetPhysicalParentResponse_QNAME, GetPhysicalParentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getSensorDataResponse")
    public JAXBElement<GetSensorDataResponse> createGetSensorDataResponse(GetSensorDataResponse value) {
        return new JAXBElement<GetSensorDataResponse>(_GetSensorDataResponse_QNAME, GetSensorDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePolicyResponse")
    public JAXBElement<UpdatePolicyResponse> createUpdatePolicyResponse(UpdatePolicyResponse value) {
        return new JAXBElement<UpdatePolicyResponse>(_UpdatePolicyResponse_QNAME, UpdatePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntities")
    public JAXBElement<EnumerateEntities> createEnumerateEntities(EnumerateEntities value) {
        return new JAXBElement<EnumerateEntities>(_EnumerateEntities_QNAME, EnumerateEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyExHastily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyExHastily")
    public JAXBElement<SetPolicyExHastily> createSetPolicyExHastily(SetPolicyExHastily value) {
        return new JAXBElement<SetPolicyExHastily>(_SetPolicyExHastily_QNAME, SetPolicyExHastily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefineCustomEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "defineCustomEventResponse")
    public JAXBElement<DefineCustomEventResponse> createDefineCustomEventResponse(DefineCustomEventResponse value) {
        return new JAXBElement<DefineCustomEventResponse>(_DefineCustomEventResponse_QNAME, DefineCustomEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumeratePoliciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumeratePoliciesResponse")
    public JAXBElement<EnumeratePoliciesResponse> createEnumeratePoliciesResponse(EnumeratePoliciesResponse value) {
        return new JAXBElement<EnumeratePoliciesResponse>(_EnumeratePoliciesResponse_QNAME, EnumeratePoliciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPowerDistributionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPowerDistributionResponse")
    public JAXBElement<GetPowerDistributionResponse> createGetPowerDistributionResponse(GetPowerDistributionResponse value) {
        return new JAXBElement<GetPowerDistributionResponse>(_GetPowerDistributionResponse_QNAME, GetPowerDistributionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesWithDetailsRecursively }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesWithDetailsRecursively")
    public JAXBElement<EnumerateEntitiesWithDetailsRecursively> createEnumerateEntitiesWithDetailsRecursively(EnumerateEntitiesWithDetailsRecursively value) {
        return new JAXBElement<EnumerateEntitiesWithDetailsRecursively>(_EnumerateEntitiesWithDetailsRecursively_QNAME, EnumerateEntitiesWithDetailsRecursively.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEntitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "findEntitiesResponse")
    public JAXBElement<FindEntitiesResponse> createFindEntitiesResponse(FindEntitiesResponse value) {
        return new JAXBElement<FindEntitiesResponse>(_FindEntitiesResponse_QNAME, FindEntitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetNotificationState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setNotificationState")
    public JAXBElement<SetNotificationState> createSetNotificationState(SetNotificationState value) {
        return new JAXBElement<SetNotificationState>(_SetNotificationState_QNAME, SetNotificationState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "associateEntity")
    public JAXBElement<AssociateEntity> createAssociateEntity(AssociateEntity value) {
        return new JAXBElement<AssociateEntity>(_AssociateEntity_QNAME, AssociateEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetObservedMaxPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "resetObservedMaxPower")
    public JAXBElement<ResetObservedMaxPower> createResetObservedMaxPower(ResetObservedMaxPower value) {
        return new JAXBElement<ResetObservedMaxPower>(_ResetObservedMaxPower_QNAME, ResetObservedMaxPower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearNodePoliciesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "clearNodePoliciesResponse")
    public JAXBElement<ClearNodePoliciesResponse> createClearNodePoliciesResponse(ClearNodePoliciesResponse value) {
        return new JAXBElement<ClearNodePoliciesResponse>(_ClearNodePoliciesResponse_QNAME, ClearNodePoliciesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetGlobalPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getGlobalPropertyResponse")
    public JAXBElement<GetGlobalPropertyResponse> createGetGlobalPropertyResponse(GetGlobalPropertyResponse value) {
        return new JAXBElement<GetGlobalPropertyResponse>(_GetGlobalPropertyResponse_QNAME, GetGlobalPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribePredefinedEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "subscribePredefinedEventResponse")
    public JAXBElement<SubscribePredefinedEventResponse> createSubscribePredefinedEventResponse(SubscribePredefinedEventResponse value) {
        return new JAXBElement<SubscribePredefinedEventResponse>(_SubscribePredefinedEventResponse_QNAME, SubscribePredefinedEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleLatestQueryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMultipleLatestQueryDataResponse")
    public JAXBElement<GetMultipleLatestQueryDataResponse> createGetMultipleLatestQueryDataResponse(GetMultipleLatestQueryDataResponse value) {
        return new JAXBElement<GetMultipleLatestQueryDataResponse>(_GetMultipleLatestQueryDataResponse_QNAME, GetMultipleLatestQueryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeNotification")
    public JAXBElement<RemoveNotification> createRemoveNotification(RemoveNotification value) {
        return new JAXBElement<RemoveNotification>(_RemoveNotification_QNAME, RemoveNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateServerForMigrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "evaluateServerForMigrationResponse")
    public JAXBElement<EvaluateServerForMigrationResponse> createEvaluateServerForMigrationResponse(EvaluateServerForMigrationResponse value) {
        return new JAXBElement<EvaluateServerForMigrationResponse>(_EvaluateServerForMigrationResponse_QNAME, EvaluateServerForMigrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectorList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getConnectorList")
    public JAXBElement<GetConnectorList> createGetConnectorList(GetConnectorList value) {
        return new JAXBElement<GetConnectorList>(_GetConnectorList_QNAME, GetConnectorList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNetworkDevicePowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateNetworkDevicePowerProfile")
    public JAXBElement<UpdateNetworkDevicePowerProfile> createUpdateNetworkDevicePowerProfile(UpdateNetworkDevicePowerProfile value) {
        return new JAXBElement<UpdateNetworkDevicePowerProfile>(_UpdateNetworkDevicePowerProfile_QNAME, UpdateNetworkDevicePowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisassociateEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "disassociateEntityResponse")
    public JAXBElement<DisassociateEntityResponse> createDisassociateEntityResponse(DisassociateEntityResponse value) {
        return new JAXBElement<DisassociateEntityResponse>(_DisassociateEntityResponse_QNAME, DisassociateEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeEntity")
    public JAXBElement<RemoveEntity> createRemoveEntity(RemoveEntity value) {
        return new JAXBElement<RemoveEntity>(_RemoveEntity_QNAME, RemoveEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "identifyEntityResponse")
    public JAXBElement<IdentifyEntityResponse> createIdentifyEntityResponse(IdentifyEntityResponse value) {
        return new JAXBElement<IdentifyEntityResponse>(_IdentifyEntityResponse_QNAME, IdentifyEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectorPropertySetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getConnectorPropertySetResponse")
    public JAXBElement<GetConnectorPropertySetResponse> createGetConnectorPropertySetResponse(GetConnectorPropertySetResponse value) {
        return new JAXBElement<GetConnectorPropertySetResponse>(_GetConnectorPropertySetResponse_QNAME, GetConnectorPropertySetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyExHastilyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyExHastilyResponse")
    public JAXBElement<SetPolicyExHastilyResponse> createSetPolicyExHastilyResponse(SetPolicyExHastilyResponse value) {
        return new JAXBElement<SetPolicyExHastilyResponse>(_SetPolicyExHastilyResponse_QNAME, SetPolicyExHastilyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPECBladeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPECBladeInfo")
    public JAXBElement<GetPECBladeInfo> createGetPECBladeInfo(GetPECBladeInfo value) {
        return new JAXBElement<GetPECBladeInfo>(_GetPECBladeInfo_QNAME, GetPECBladeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSecretKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "submitSecretKey")
    public JAXBElement<SubmitSecretKey> createSubmitSecretKey(SubmitSecretKey value) {
        return new JAXBElement<SubmitSecretKey>(_SubmitSecretKey_QNAME, SubmitSecretKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateCustomEventsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateCustomEventsResponse")
    public JAXBElement<EnumerateCustomEventsResponse> createEnumerateCustomEventsResponse(EnumerateCustomEventsResponse value) {
        return new JAXBElement<EnumerateCustomEventsResponse>(_EnumerateCustomEventsResponse_QNAME, EnumerateCustomEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyHistoryResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyHistoryResponse")
    public JAXBElement<GetPolicyHistoryResponse> createGetPolicyHistoryResponse(GetPolicyHistoryResponse value) {
        return new JAXBElement<GetPolicyHistoryResponse>(_GetPolicyHistoryResponse_QNAME, GetPolicyHistoryResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumeratePowerModelsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumeratePowerModelsResponse")
    public JAXBElement<EnumeratePowerModelsResponse> createEnumeratePowerModelsResponse(EnumeratePowerModelsResponse value) {
        return new JAXBElement<EnumeratePowerModelsResponse>(_EnumeratePowerModelsResponse_QNAME, EnumeratePowerModelsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartCollectingPowerDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "startCollectingPowerDistribution")
    public JAXBElement<StartCollectingPowerDistribution> createStartCollectingPowerDistribution(StartCollectingPowerDistribution value) {
        return new JAXBElement<StartCollectingPowerDistribution>(_StartCollectingPowerDistribution_QNAME, StartCollectingPowerDistribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredictPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "predictPower")
    public JAXBElement<PredictPower> createPredictPower(PredictPower value) {
        return new JAXBElement<PredictPower>(_PredictPower_QNAME, PredictPower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePowerModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removePowerModelResponse")
    public JAXBElement<RemovePowerModelResponse> createRemovePowerModelResponse(RemovePowerModelResponse value) {
        return new JAXBElement<RemovePowerModelResponse>(_RemovePowerModelResponse_QNAME, RemovePowerModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateCustomEvent")
    public JAXBElement<UpdateCustomEvent> createUpdateCustomEvent(UpdateCustomEvent value) {
        return new JAXBElement<UpdateCustomEvent>(_UpdateCustomEvent_QNAME, UpdateCustomEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEntityPropertiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setEntityPropertiesResponse")
    public JAXBElement<SetEntityPropertiesResponse> createSetEntityPropertiesResponse(SetEntityPropertiesResponse value) {
        return new JAXBElement<SetEntityPropertiesResponse>(_SetEntityPropertiesResponse_QNAME, SetEntityPropertiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPowerSavingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "stopPowerSavingResponse")
    public JAXBElement<StopPowerSavingResponse> createStopPowerSavingResponse(StopPowerSavingResponse value) {
        return new JAXBElement<StopPowerSavingResponse>(_StopPowerSavingResponse_QNAME, StopPowerSavingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyExHastilyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePolicyExHastilyResponse")
    public JAXBElement<UpdatePolicyExHastilyResponse> createUpdatePolicyExHastilyResponse(UpdatePolicyExHastilyResponse value) {
        return new JAXBElement<UpdatePolicyExHastilyResponse>(_UpdatePolicyExHastilyResponse_QNAME, UpdatePolicyExHastilyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemTime }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getSystemTime")
    public JAXBElement<GetSystemTime> createGetSystemTime(GetSystemTime value) {
        return new JAXBElement<GetSystemTime>(_GetSystemTime_QNAME, GetSystemTime.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateStorageDevicePowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateStorageDevicePowerProfile")
    public JAXBElement<UpdateStorageDevicePowerProfile> createUpdateStorageDevicePowerProfile(UpdateStorageDevicePowerProfile value) {
        return new JAXBElement<UpdateStorageDevicePowerProfile>(_UpdateStorageDevicePowerProfile_QNAME, UpdateStorageDevicePowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpMeasurementDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "dumpMeasurementDataResponse")
    public JAXBElement<DumpMeasurementDataResponse> createDumpMeasurementDataResponse(DumpMeasurementDataResponse value) {
        return new JAXBElement<DumpMeasurementDataResponse>(_DumpMeasurementDataResponse_QNAME, DumpMeasurementDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNetworkDevicePowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addNetworkDevicePowerProfile")
    public JAXBElement<AddNetworkDevicePowerProfile> createAddNetworkDevicePowerProfile(AddNetworkDevicePowerProfile value) {
        return new JAXBElement<AddNetworkDevicePowerProfile>(_AddNetworkDevicePowerProfile_QNAME, AddNetworkDevicePowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateStorageDevicePowerProfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateStorageDevicePowerProfiles")
    public JAXBElement<EnumerateStorageDevicePowerProfiles> createEnumerateStorageDevicePowerProfiles(EnumerateStorageDevicePowerProfiles value) {
        return new JAXBElement<EnumerateStorageDevicePowerProfiles>(_EnumerateStorageDevicePowerProfiles_QNAME, EnumerateStorageDevicePowerProfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisableCore }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "disableCore")
    public JAXBElement<DisableCore> createDisableCore(DisableCore value) {
        return new JAXBElement<DisableCore>(_DisableCore_QNAME, DisableCore.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextRawDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNextRawDataResponse")
    public JAXBElement<GetNextRawDataResponse> createGetNextRawDataResponse(GetNextRawDataResponse value) {
        return new JAXBElement<GetNextRawDataResponse>(_GetNextRawDataResponse_QNAME, GetNextRawDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RediscoverNodeCapabilitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rediscoverNodeCapabilitiesResponse")
    public JAXBElement<RediscoverNodeCapabilitiesResponse> createRediscoverNodeCapabilitiesResponse(RediscoverNodeCapabilitiesResponse value) {
        return new JAXBElement<RediscoverNodeCapabilitiesResponse>(_RediscoverNodeCapabilitiesResponse_QNAME, RediscoverNodeCapabilitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubmitSecretKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "submitSecretKeyResponse")
    public JAXBElement<SubmitSecretKeyResponse> createSubmitSecretKeyResponse(SubmitSecretKeyResponse value) {
        return new JAXBElement<SubmitSecretKeyResponse>(_SubmitSecretKeyResponse_QNAME, SubmitSecretKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetGlobalPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setGlobalPropertyResponse")
    public JAXBElement<SetGlobalPropertyResponse> createSetGlobalPropertyResponse(SetGlobalPropertyResponse value) {
        return new JAXBElement<SetGlobalPropertyResponse>(_SetGlobalPropertyResponse_QNAME, SetGlobalPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePowerModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removePowerModel")
    public JAXBElement<RemovePowerModel> createRemovePowerModel(RemovePowerModel value) {
        return new JAXBElement<RemovePowerModel>(_RemovePowerModel_QNAME, RemovePowerModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollectionStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getCollectionStateResponse")
    public JAXBElement<GetCollectionStateResponse> createGetCollectionStateResponse(GetCollectionStateResponse value) {
        return new JAXBElement<GetCollectionStateResponse>(_GetCollectionStateResponse_QNAME, GetCollectionStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddNetworkDevicePowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addNetworkDevicePowerProfileResponse")
    public JAXBElement<AddNetworkDevicePowerProfileResponse> createAddNetworkDevicePowerProfileResponse(AddNetworkDevicePowerProfileResponse value) {
        return new JAXBElement<AddNetworkDevicePowerProfileResponse>(_AddNetworkDevicePowerProfileResponse_QNAME, AddNetworkDevicePowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartCollectingPowerDistributionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "startCollectingPowerDistributionResponse")
    public JAXBElement<StartCollectingPowerDistributionResponse> createStartCollectingPowerDistributionResponse(StartCollectingPowerDistributionResponse value) {
        return new JAXBElement<StartCollectingPowerDistributionResponse>(_StartCollectingPowerDistributionResponse_QNAME, StartCollectingPowerDistributionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNextData")
    public JAXBElement<GetNextData> createGetNextData(GetNextData value) {
        return new JAXBElement<GetNextData>(_GetNextData_QNAME, GetNextData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPolicyActive }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "isPolicyActive")
    public JAXBElement<IsPolicyActive> createIsPolicyActive(IsPolicyActive value) {
        return new JAXBElement<IsPolicyActive>(_IsPolicyActive_QNAME, IsPolicyActive.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IsPolicyActiveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "isPolicyActiveResponse")
    public JAXBElement<IsPolicyActiveResponse> createIsPolicyActiveResponse(IsPolicyActiveResponse value) {
        return new JAXBElement<IsPolicyActiveResponse>(_IsPolicyActiveResponse_QNAME, IsPolicyActiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addEntityResponse")
    public JAXBElement<AddEntityResponse> createAddEntityResponse(AddEntityResponse value) {
        return new JAXBElement<AddEntityResponse>(_AddEntityResponse_QNAME, AddEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyEntityByProtocol }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "identifyEntityByProtocol")
    public JAXBElement<IdentifyEntityByProtocol> createIdentifyEntityByProtocol(IdentifyEntityByProtocol value) {
        return new JAXBElement<IdentifyEntityByProtocol>(_IdentifyEntityByProtocol_QNAME, IdentifyEntityByProtocol.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectorListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getConnectorListResponse")
    public JAXBElement<GetConnectorListResponse> createGetConnectorListResponse(GetConnectorListResponse value) {
        return new JAXBElement<GetConnectorListResponse>(_GetConnectorListResponse_QNAME, GetConnectorListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPSUPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPSUPower")
    public JAXBElement<GetPSUPower> createGetPSUPower(GetPSUPower value) {
        return new JAXBElement<GetPSUPower>(_GetPSUPower_QNAME, GetPSUPower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSystemTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getSystemTimeResponse")
    public JAXBElement<GetSystemTimeResponse> createGetSystemTimeResponse(GetSystemTimeResponse value) {
        return new JAXBElement<GetSystemTimeResponse>(_GetSystemTimeResponse_QNAME, GetSystemTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutletStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getOutletStateResponse")
    public JAXBElement<GetOutletStateResponse> createGetOutletStateResponse(GetOutletStateResponse value) {
        return new JAXBElement<GetOutletStateResponse>(_GetOutletStateResponse_QNAME, GetOutletStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStorageDevicePowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeStorageDevicePowerProfile")
    public JAXBElement<RemoveStorageDevicePowerProfile> createRemoveStorageDevicePowerProfile(RemoveStorageDevicePowerProfile value) {
        return new JAXBElement<RemoveStorageDevicePowerProfile>(_RemoveStorageDevicePowerProfile_QNAME, RemoveStorageDevicePowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "detectEntities")
    public JAXBElement<DetectEntities> createDetectEntities(DetectEntities value) {
        return new JAXBElement<DetectEntities>(_DetectEntities_QNAME, DetectEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImmediateLogicalPredecessorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getImmediateLogicalPredecessorsResponse")
    public JAXBElement<GetImmediateLogicalPredecessorsResponse> createGetImmediateLogicalPredecessorsResponse(GetImmediateLogicalPredecessorsResponse value) {
        return new JAXBElement<GetImmediateLogicalPredecessorsResponse>(_GetImmediateLogicalPredecessorsResponse_QNAME, GetImmediateLogicalPredecessorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankServersForMigrationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rankServersForMigrationResponse")
    public JAXBElement<RankServersForMigrationResponse> createRankServersForMigrationResponse(RankServersForMigrationResponse value) {
        return new JAXBElement<RankServersForMigrationResponse>(_RankServersForMigrationResponse_QNAME, RankServersForMigrationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnreachableEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getUnreachableEntities")
    public JAXBElement<GetUnreachableEntities> createGetUnreachableEntities(GetUnreachableEntities value) {
        return new JAXBElement<GetUnreachableEntities>(_GetUnreachableEntities_QNAME, GetUnreachableEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkloadPatternResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getWorkloadPatternResponse")
    public JAXBElement<GetWorkloadPatternResponse> createGetWorkloadPatternResponse(GetWorkloadPatternResponse value) {
        return new JAXBElement<GetWorkloadPatternResponse>(_GetWorkloadPatternResponse_QNAME, GetWorkloadPatternResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "importHierarchyResponse")
    public JAXBElement<ImportHierarchyResponse> createImportHierarchyResponse(ImportHierarchyResponse value) {
        return new JAXBElement<ImportHierarchyResponse>(_ImportHierarchyResponse_QNAME, ImportHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyStateHastilyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyStateHastilyResponse")
    public JAXBElement<SetPolicyStateHastilyResponse> createSetPolicyStateHastilyResponse(SetPolicyStateHastilyResponse value) {
        return new JAXBElement<SetPolicyStateHastilyResponse>(_SetPolicyStateHastilyResponse_QNAME, SetPolicyStateHastilyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomEventData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getCustomEventData")
    public JAXBElement<GetCustomEventData> createGetCustomEventData(GetCustomEventData value) {
        return new JAXBElement<GetCustomEventData>(_GetCustomEventData_QNAME, GetCustomEventData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumeratePolicies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumeratePolicies")
    public JAXBElement<EnumeratePolicies> createEnumeratePolicies(EnumeratePolicies value) {
        return new JAXBElement<EnumeratePolicies>(_EnumeratePolicies_QNAME, EnumeratePolicies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyStateHastily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyStateHastily")
    public JAXBElement<SetPolicyStateHastily> createSetPolicyStateHastily(SetPolicyStateHastily value) {
        return new JAXBElement<SetPolicyStateHastily>(_SetPolicyStateHastily_QNAME, SetPolicyStateHastily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNotificationDataResponse")
    public JAXBElement<GetNotificationDataResponse> createGetNotificationDataResponse(GetNotificationDataResponse value) {
        return new JAXBElement<GetNotificationDataResponse>(_GetNotificationDataResponse_QNAME, GetNotificationDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddServerPowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addServerPowerProfile")
    public JAXBElement<AddServerPowerProfile> createAddServerPowerProfile(AddServerPowerProfile value) {
        return new JAXBElement<AddServerPowerProfile>(_AddServerPowerProfile_QNAME, AddServerPowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeCustomEventResponse")
    public JAXBElement<RemoveCustomEventResponse> createRemoveCustomEventResponse(RemoveCustomEventResponse value) {
        return new JAXBElement<RemoveCustomEventResponse>(_RemoveCustomEventResponse_QNAME, RemoveCustomEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaticCUPSDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getStaticCUPSDataResponse")
    public JAXBElement<GetStaticCUPSDataResponse> createGetStaticCUPSDataResponse(GetStaticCUPSDataResponse value) {
        return new JAXBElement<GetStaticCUPSDataResponse>(_GetStaticCUPSDataResponse_QNAME, GetStaticCUPSDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateLowUtilizationServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "evaluateLowUtilizationServerResponse")
    public JAXBElement<EvaluateLowUtilizationServerResponse> createEvaluateLowUtilizationServerResponse(EvaluateLowUtilizationServerResponse value) {
        return new JAXBElement<EvaluateLowUtilizationServerResponse>(_EvaluateLowUtilizationServerResponse_QNAME, EvaluateLowUtilizationServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffOutletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffOutletResponse")
    public JAXBElement<PowerOffOutletResponse> createPowerOffOutletResponse(PowerOffOutletResponse value) {
        return new JAXBElement<PowerOffOutletResponse>(_PowerOffOutletResponse_QNAME, PowerOffOutletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "associateEntityResponse")
    public JAXBElement<AssociateEntityResponse> createAssociateEntityResponse(AssociateEntityResponse value) {
        return new JAXBElement<AssociateEntityResponse>(_AssociateEntityResponse_QNAME, AssociateEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopCollectingPowerDistributionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "stopCollectingPowerDistributionResponse")
    public JAXBElement<StopCollectingPowerDistributionResponse> createStopCollectingPowerDistributionResponse(StopCollectingPowerDistributionResponse value) {
        return new JAXBElement<StopCollectingPowerDistributionResponse>(_StopCollectingPowerDistributionResponse_QNAME, StopCollectingPowerDistributionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActiveIdlePowerEstimationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getActiveIdlePowerEstimationResponse")
    public JAXBElement<GetActiveIdlePowerEstimationResponse> createGetActiveIdlePowerEstimationResponse(GetActiveIdlePowerEstimationResponse value) {
        return new JAXBElement<GetActiveIdlePowerEstimationResponse>(_GetActiveIdlePowerEstimationResponse_QNAME, GetActiveIdlePowerEstimationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOff }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOff")
    public JAXBElement<PowerOff> createPowerOff(PowerOff value) {
        return new JAXBElement<PowerOff>(_PowerOff_QNAME, PowerOff.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyHistory }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyHistory")
    public JAXBElement<GetPolicyHistory> createGetPolicyHistory(GetPolicyHistory value) {
        return new JAXBElement<GetPolicyHistory>(_GetPolicyHistory_QNAME, GetPolicyHistory.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEntityProperties")
    public JAXBElement<GetEntityProperties> createGetEntityProperties(GetEntityProperties value) {
        return new JAXBElement<GetEntityProperties>(_GetEntityProperties_QNAME, GetEntityProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObservedMaxPower }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getObservedMaxPower")
    public JAXBElement<GetObservedMaxPower> createGetObservedMaxPower(GetObservedMaxPower value) {
        return new JAXBElement<GetObservedMaxPower>(_GetObservedMaxPower_QNAME, GetObservedMaxPower.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPredefinedEventTypesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPredefinedEventTypesResponse")
    public JAXBElement<GetPredefinedEventTypesResponse> createGetPredefinedEventTypesResponse(GetPredefinedEventTypesResponse value) {
        return new JAXBElement<GetPredefinedEventTypesResponse>(_GetPredefinedEventTypesResponse_QNAME, GetPredefinedEventTypesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveStorageDevicePowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeStorageDevicePowerProfileResponse")
    public JAXBElement<RemoveStorageDevicePowerProfileResponse> createRemoveStorageDevicePowerProfileResponse(RemoveStorageDevicePowerProfileResponse value) {
        return new JAXBElement<RemoveStorageDevicePowerProfileResponse>(_RemoveStorageDevicePowerProfileResponse_QNAME, RemoveStorageDevicePowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateNotification")
    public JAXBElement<UpdateNotification> createUpdateNotification(UpdateNotification value) {
        return new JAXBElement<UpdateNotification>(_UpdateNotification_QNAME, UpdateNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnServerResponse")
    public JAXBElement<PowerOnServerResponse> createPowerOnServerResponse(PowerOnServerResponse value) {
        return new JAXBElement<PowerOnServerResponse>(_PowerOnServerResponse_QNAME, PowerOnServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnclosureAndBladeInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEnclosureAndBladeInfo")
    public JAXBElement<GetEnclosureAndBladeInfo> createGetEnclosureAndBladeInfo(GetEnclosureAndBladeInfo value) {
        return new JAXBElement<GetEnclosureAndBladeInfo>(_GetEnclosureAndBladeInfo_QNAME, GetEnclosureAndBladeInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNextDataResponse")
    public JAXBElement<GetNextDataResponse> createGetNextDataResponse(GetNextDataResponse value) {
        return new JAXBElement<GetNextDataResponse>(_GetNextDataResponse_QNAME, GetNextDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLoadfactorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setLoadfactorsResponse")
    public JAXBElement<SetLoadfactorsResponse> createSetLoadfactorsResponse(SetLoadfactorsResponse value) {
        return new JAXBElement<SetLoadfactorsResponse>(_SetLoadfactorsResponse_QNAME, SetLoadfactorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNotificationStateResponse")
    public JAXBElement<GetNotificationStateResponse> createGetNotificationStateResponse(GetNotificationStateResponse value) {
        return new JAXBElement<GetNotificationStateResponse>(_GetNotificationStateResponse_QNAME, GetNotificationStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOverCoolingIndicatorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getOverCoolingIndicatorResponse")
    public JAXBElement<GetOverCoolingIndicatorResponse> createGetOverCoolingIndicatorResponse(GetOverCoolingIndicatorResponse value) {
        return new JAXBElement<GetOverCoolingIndicatorResponse>(_GetOverCoolingIndicatorResponse_QNAME, GetOverCoolingIndicatorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefineNotification }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "defineNotification")
    public JAXBElement<DefineNotification> createDefineNotification(DefineNotification value) {
        return new JAXBElement<DefineNotification>(_DefineNotification_QNAME, DefineNotification.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPhysicalParent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPhysicalParent")
    public JAXBElement<GetPhysicalParent> createGetPhysicalParent(GetPhysicalParent value) {
        return new JAXBElement<GetPhysicalParent>(_GetPhysicalParent_QNAME, GetPhysicalParent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEnclosureAndBladeInfoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEnclosureAndBladeInfoResponse")
    public JAXBElement<GetEnclosureAndBladeInfoResponse> createGetEnclosureAndBladeInfoResponse(GetEnclosureAndBladeInfoResponse value) {
        return new JAXBElement<GetEnclosureAndBladeInfoResponse>(_GetEnclosureAndBladeInfoResponse_QNAME, GetEnclosureAndBladeInfoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCoolingIndicator }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getCoolingIndicator")
    public JAXBElement<GetCoolingIndicator> createGetCoolingIndicator(GetCoolingIndicator value) {
        return new JAXBElement<GetCoolingIndicator>(_GetCoolingIndicator_QNAME, GetCoolingIndicator.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBatchQueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getBatchQueryData")
    public JAXBElement<GetBatchQueryData> createGetBatchQueryData(GetBatchQueryData value) {
        return new JAXBElement<GetBatchQueryData>(_GetBatchQueryData_QNAME, GetBatchQueryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEventHandlers }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEventHandlers")
    public JAXBElement<EnumerateEventHandlers> createEnumerateEventHandlers(EnumerateEventHandlers value) {
        return new JAXBElement<EnumerateEventHandlers>(_EnumerateEventHandlers_QNAME, EnumerateEventHandlers.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQueryAggregationPeriodList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getQueryAggregationPeriodList")
    public JAXBElement<GetQueryAggregationPeriodList> createGetQueryAggregationPeriodList(GetQueryAggregationPeriodList value) {
        return new JAXBElement<GetQueryAggregationPeriodList>(_GetQueryAggregationPeriodList_QNAME, GetQueryAggregationPeriodList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOn }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOn")
    public JAXBElement<PowerOn> createPowerOn(PowerOn value) {
        return new JAXBElement<PowerOn>(_PowerOn_QNAME, PowerOn.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getLatestMetricDataResponse")
    public JAXBElement<GetLatestMetricDataResponse> createGetLatestMetricDataResponse(GetLatestMetricDataResponse value) {
        return new JAXBElement<GetLatestMetricDataResponse>(_GetLatestMetricDataResponse_QNAME, GetLatestMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateServerPowerProfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateServerPowerProfiles")
    public JAXBElement<EnumerateServerPowerProfiles> createEnumerateServerPowerProfiles(EnumerateServerPowerProfiles value) {
        return new JAXBElement<EnumerateServerPowerProfiles>(_EnumerateServerPowerProfiles_QNAME, EnumerateServerPowerProfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateServerPowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateServerPowerProfileResponse")
    public JAXBElement<UpdateServerPowerProfileResponse> createUpdateServerPowerProfileResponse(UpdateServerPowerProfileResponse value) {
        return new JAXBElement<UpdateServerPowerProfileResponse>(_UpdateServerPowerProfileResponse_QNAME, UpdateServerPowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaunchPTUResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "launchPTUResponse")
    public JAXBElement<LaunchPTUResponse> createLaunchPTUResponse(LaunchPTUResponse value) {
        return new JAXBElement<LaunchPTUResponse>(_LaunchPTUResponse_QNAME, LaunchPTUResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesWithDetailsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesWithDetailsResponse")
    public JAXBElement<EnumerateEntitiesWithDetailsResponse> createEnumerateEntitiesWithDetailsResponse(EnumerateEntitiesWithDetailsResponse value) {
        return new JAXBElement<EnumerateEntitiesWithDetailsResponse>(_EnumerateEntitiesWithDetailsResponse_QNAME, EnumerateEntitiesWithDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribePredefinedEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "unsubscribePredefinedEventResponse")
    public JAXBElement<UnsubscribePredefinedEventResponse> createUnsubscribePredefinedEventResponse(UnsubscribePredefinedEventResponse value) {
        return new JAXBElement<UnsubscribePredefinedEventResponse>(_UnsubscribePredefinedEventResponse_QNAME, UnsubscribePredefinedEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeEntityResponse")
    public JAXBElement<RemoveEntityResponse> createRemoveEntityResponse(RemoveEntityResponse value) {
        return new JAXBElement<RemoveEntityResponse>(_RemoveEntityResponse_QNAME, RemoveEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityPropertyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEntityPropertyResponse")
    public JAXBElement<GetEntityPropertyResponse> createGetEntityPropertyResponse(GetEntityPropertyResponse value) {
        return new JAXBElement<GetEntityPropertyResponse>(_GetEntityPropertyResponse_QNAME, GetEntityPropertyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEventStateResponse")
    public JAXBElement<GetEventStateResponse> createGetEventStateResponse(GetEventStateResponse value) {
        return new JAXBElement<GetEventStateResponse>(_GetEventStateResponse_QNAME, GetEventStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnServerWithCredentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnServerWithCredentialResponse")
    public JAXBElement<PowerOnServerWithCredentialResponse> createPowerOnServerWithCredentialResponse(PowerOnServerWithCredentialResponse value) {
        return new JAXBElement<PowerOnServerWithCredentialResponse>(_PowerOnServerWithCredentialResponse_QNAME, PowerOnServerWithCredentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnOutlet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnOutlet")
    public JAXBElement<PowerOnOutlet> createPowerOnOutlet(PowerOnOutlet value) {
        return new JAXBElement<PowerOnOutlet>(_PowerOnOutlet_QNAME, PowerOnOutlet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "dumpMetricDataResponse")
    public JAXBElement<DumpMetricDataResponse> createDumpMetricDataResponse(DumpMetricDataResponse value) {
        return new JAXBElement<DumpMetricDataResponse>(_DumpMetricDataResponse_QNAME, DumpMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEventHandlersResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEventHandlersResponse")
    public JAXBElement<EnumerateEventHandlersResponse> createEnumerateEventHandlersResponse(EnumerateEventHandlersResponse value) {
        return new JAXBElement<EnumerateEventHandlersResponse>(_EnumerateEventHandlersResponse_QNAME, EnumerateEventHandlersResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetImmediateLogicalPredecessors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getImmediateLogicalPredecessors")
    public JAXBElement<GetImmediateLogicalPredecessors> createGetImmediateLogicalPredecessors(GetImmediateLogicalPredecessors value) {
        return new JAXBElement<GetImmediateLogicalPredecessors>(_GetImmediateLogicalPredecessors_QNAME, GetImmediateLogicalPredecessors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyDataEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyDataEx")
    public JAXBElement<GetPolicyDataEx> createGetPolicyDataEx(GetPolicyDataEx value) {
        return new JAXBElement<GetPolicyDataEx>(_GetPolicyDataEx_QNAME, GetPolicyDataEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffResponse")
    public JAXBElement<PowerOffResponse> createPowerOffResponse(PowerOffResponse value) {
        return new JAXBElement<PowerOffResponse>(_PowerOffResponse_QNAME, PowerOffResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateServerForMigration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "evaluateServerForMigration")
    public JAXBElement<EvaluateServerForMigration> createEvaluateServerForMigration(EvaluateServerForMigration value) {
        return new JAXBElement<EvaluateServerForMigration>(_EvaluateServerForMigration_QNAME, EvaluateServerForMigration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeEventHandlerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "unsubscribeEventHandlerResponse")
    public JAXBElement<UnsubscribeEventHandlerResponse> createUnsubscribeEventHandlerResponse(UnsubscribeEventHandlerResponse value) {
        return new JAXBElement<UnsubscribeEventHandlerResponse>(_UnsubscribeEventHandlerResponse_QNAME, UnsubscribeEventHandlerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesRecursivelyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesRecursivelyResponse")
    public JAXBElement<EnumerateEntitiesRecursivelyResponse> createEnumerateEntitiesRecursivelyResponse(EnumerateEntitiesRecursivelyResponse value) {
        return new JAXBElement<EnumerateEntitiesRecursivelyResponse>(_EnumerateEntitiesRecursivelyResponse_QNAME, EnumerateEntitiesRecursivelyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyStateResponse")
    public JAXBElement<SetPolicyStateResponse> createSetPolicyStateResponse(SetPolicyStateResponse value) {
        return new JAXBElement<SetPolicyStateResponse>(_SetPolicyStateResponse_QNAME, SetPolicyStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RediscoverEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rediscoverEntity")
    public JAXBElement<RediscoverEntity> createRediscoverEntity(RediscoverEntity value) {
        return new JAXBElement<RediscoverEntity>(_RediscoverEntity_QNAME, RediscoverEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyEx }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePolicyEx")
    public JAXBElement<UpdatePolicyEx> createUpdatePolicyEx(UpdatePolicyEx value) {
        return new JAXBElement<UpdatePolicyEx>(_UpdatePolicyEx_QNAME, UpdatePolicyEx.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RediscoverEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rediscoverEntityResponse")
    public JAXBElement<RediscoverEntityResponse> createRediscoverEntityResponse(RediscoverEntityResponse value) {
        return new JAXBElement<RediscoverEntityResponse>(_RediscoverEntityResponse_QNAME, RediscoverEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateStorageDevicePowerProfilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateStorageDevicePowerProfilesResponse")
    public JAXBElement<EnumerateStorageDevicePowerProfilesResponse> createEnumerateStorageDevicePowerProfilesResponse(EnumerateStorageDevicePowerProfilesResponse value) {
        return new JAXBElement<EnumerateStorageDevicePowerProfilesResponse>(_EnumerateStorageDevicePowerProfilesResponse_QNAME, EnumerateStorageDevicePowerProfilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateServerForWorkload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "evaluateServerForWorkload")
    public JAXBElement<EvaluateServerForWorkload> createEvaluateServerForWorkload(EvaluateServerForWorkload value) {
        return new JAXBElement<EvaluateServerForWorkload>(_EvaluateServerForWorkload_QNAME, EvaluateServerForWorkload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateNotifications }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateNotifications")
    public JAXBElement<EnumerateNotifications> createEnumerateNotifications(EnumerateNotifications value) {
        return new JAXBElement<EnumerateNotifications>(_EnumerateNotifications_QNAME, EnumerateNotifications.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNetworkDevicePowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeNetworkDevicePowerProfile")
    public JAXBElement<RemoveNetworkDevicePowerProfile> createRemoveNetworkDevicePowerProfile(RemoveNetworkDevicePowerProfile value) {
        return new JAXBElement<RemoveNetworkDevicePowerProfile>(_RemoveNetworkDevicePowerProfile_QNAME, RemoveNetworkDevicePowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStaticCUPSData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getStaticCUPSData")
    public JAXBElement<GetStaticCUPSData> createGetStaticCUPSData(GetStaticCUPSData value) {
        return new JAXBElement<GetStaticCUPSData>(_GetStaticCUPSData_QNAME, GetStaticCUPSData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActionLogRecords }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getActionLogRecords")
    public JAXBElement<GetActionLogRecords> createGetActionLogRecords(GetActionLogRecords value) {
        return new JAXBElement<GetActionLogRecords>(_GetActionLogRecords_QNAME, GetActionLogRecords.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEventStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setEventStateResponse")
    public JAXBElement<SetEventStateResponse> createSetEventStateResponse(SetEventStateResponse value) {
        return new JAXBElement<SetEventStateResponse>(_SetEventStateResponse_QNAME, SetEventStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCollectionStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setCollectionStateResponse")
    public JAXBElement<SetCollectionStateResponse> createSetCollectionStateResponse(SetCollectionStateResponse value) {
        return new JAXBElement<SetCollectionStateResponse>(_SetCollectionStateResponse_QNAME, SetCollectionStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventHandlerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEventHandlerResponse")
    public JAXBElement<GetEventHandlerResponse> createGetEventHandlerResponse(GetEventHandlerResponse value) {
        return new JAXBElement<GetEventHandlerResponse>(_GetEventHandlerResponse_QNAME, GetEventHandlerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExportHierarchyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "exportHierarchyResponse")
    public JAXBElement<ExportHierarchyResponse> createExportHierarchyResponse(ExportHierarchyResponse value) {
        return new JAXBElement<ExportHierarchyResponse>(_ExportHierarchyResponse_QNAME, ExportHierarchyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getQueryData")
    public JAXBElement<GetQueryData> createGetQueryData(GetQueryData value) {
        return new JAXBElement<GetQueryData>(_GetQueryData_QNAME, GetQueryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PredictPowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "predictPowerResponse")
    public JAXBElement<PredictPowerResponse> createPredictPowerResponse(PredictPowerResponse value) {
        return new JAXBElement<PredictPowerResponse>(_PredictPowerResponse_QNAME, PredictPowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePolicyHastilyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removePolicyHastilyResponse")
    public JAXBElement<RemovePolicyHastilyResponse> createRemovePolicyHastilyResponse(RemovePolicyHastilyResponse value) {
        return new JAXBElement<RemovePolicyHastilyResponse>(_RemovePolicyHastilyResponse_QNAME, RemovePolicyHastilyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LaunchPTU }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "launchPTU")
    public JAXBElement<LaunchPTU> createLaunchPTU(LaunchPTU value) {
        return new JAXBElement<LaunchPTU>(_LaunchPTU_QNAME, LaunchPTU.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnalyzeCoolingStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "analyzeCoolingStatus")
    public JAXBElement<AnalyzeCoolingStatus> createAnalyzeCoolingStatus(AnalyzeCoolingStatus value) {
        return new JAXBElement<AnalyzeCoolingStatus>(_AnalyzeCoolingStatus_QNAME, AnalyzeCoolingStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesResponse")
    public JAXBElement<EnumerateEntitiesResponse> createEnumerateEntitiesResponse(EnumerateEntitiesResponse value) {
        return new JAXBElement<EnumerateEntitiesResponse>(_EnumerateEntitiesResponse_QNAME, EnumerateEntitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getVersionResponse")
    public JAXBElement<GetVersionResponse> createGetVersionResponse(GetVersionResponse value) {
        return new JAXBElement<GetVersionResponse>(_GetVersionResponse_QNAME, GetVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStorageDevicePowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addStorageDevicePowerProfileResponse")
    public JAXBElement<AddStorageDevicePowerProfileResponse> createAddStorageDevicePowerProfileResponse(AddStorageDevicePowerProfileResponse value) {
        return new JAXBElement<AddStorageDevicePowerProfileResponse>(_AddStorageDevicePowerProfileResponse_QNAME, AddStorageDevicePowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetCollectionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setCollectionState")
    public JAXBElement<SetCollectionState> createSetCollectionState(SetCollectionState value) {
        return new JAXBElement<SetCollectionState>(_SetCollectionState_QNAME, SetCollectionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MaintainDB }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "maintainDB")
    public JAXBElement<MaintainDB> createMaintainDB(MaintainDB value) {
        return new JAXBElement<MaintainDB>(_MaintainDB_QNAME, MaintainDB.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSELInText }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getSELInText")
    public JAXBElement<GetSELInText> createGetSELInText(GetSELInText value) {
        return new JAXBElement<GetSELInText>(_GetSELInText_QNAME, GetSELInText.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchedulePolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "schedulePolicyResponse")
    public JAXBElement<SchedulePolicyResponse> createSchedulePolicyResponse(SchedulePolicyResponse value) {
        return new JAXBElement<SchedulePolicyResponse>(_SchedulePolicyResponse_QNAME, SchedulePolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscoverEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "discoverEntities")
    public JAXBElement<DiscoverEntities> createDiscoverEntities(DiscoverEntities value) {
        return new JAXBElement<DiscoverEntities>(_DiscoverEntities_QNAME, DiscoverEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetEntityProperties }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setEntityProperties")
    public JAXBElement<SetEntityProperties> createSetEntityProperties(SetEntityProperties value) {
        return new JAXBElement<SetEntityProperties>(_SetEntityProperties_QNAME, SetEntityProperties.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesWithDetailsRecursivelyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesWithDetailsRecursivelyResponse")
    public JAXBElement<EnumerateEntitiesWithDetailsRecursivelyResponse> createEnumerateEntitiesWithDetailsRecursivelyResponse(EnumerateEntitiesWithDetailsRecursivelyResponse value) {
        return new JAXBElement<EnumerateEntitiesWithDetailsRecursivelyResponse>(_EnumerateEntitiesWithDetailsRecursivelyResponse_QNAME, EnumerateEntitiesWithDetailsRecursivelyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventMessageAuthenticationKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEventMessageAuthenticationKey")
    public JAXBElement<GetEventMessageAuthenticationKey> createGetEventMessageAuthenticationKey(GetEventMessageAuthenticationKey value) {
        return new JAXBElement<GetEventMessageAuthenticationKey>(_GetEventMessageAuthenticationKey_QNAME, GetEventMessageAuthenticationKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addEntity")
    public JAXBElement<AddEntity> createAddEntity(AddEntity value) {
        return new JAXBElement<AddEntity>(_AddEntity_QNAME, AddEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCustomEventResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateCustomEventResponse")
    public JAXBElement<UpdateCustomEventResponse> createUpdateCustomEventResponse(UpdateCustomEventResponse value) {
        return new JAXBElement<UpdateCustomEventResponse>(_UpdateCustomEventResponse_QNAME, UpdateCustomEventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateEntitiesWithDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateEntitiesWithDetails")
    public JAXBElement<EnumerateEntitiesWithDetails> createEnumerateEntitiesWithDetails(EnumerateEntitiesWithDetails value) {
        return new JAXBElement<EnumerateEntitiesWithDetails>(_EnumerateEntitiesWithDetails_QNAME, EnumerateEntitiesWithDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleLatestQueryData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMultipleLatestQueryData")
    public JAXBElement<GetMultipleLatestQueryData> createGetMultipleLatestQueryData(GetMultipleLatestQueryData value) {
        return new JAXBElement<GetMultipleLatestQueryData>(_GetMultipleLatestQueryData_QNAME, GetMultipleLatestQueryData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPSUPowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPSUPowerResponse")
    public JAXBElement<GetPSUPowerResponse> createGetPSUPowerResponse(GetPSUPowerResponse value) {
        return new JAXBElement<GetPSUPowerResponse>(_GetPSUPowerResponse_QNAME, GetPSUPowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DiscoverEntitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "discoverEntitiesResponse")
    public JAXBElement<DiscoverEntitiesResponse> createDiscoverEntitiesResponse(DiscoverEntitiesResponse value) {
        return new JAXBElement<DiscoverEntitiesResponse>(_DiscoverEntitiesResponse_QNAME, DiscoverEntitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefineCustomEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "defineCustomEvent")
    public JAXBElement<DefineCustomEvent> createDefineCustomEvent(DefineCustomEvent value) {
        return new JAXBElement<DefineCustomEvent>(_DefineCustomEvent_QNAME, DefineCustomEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyState")
    public JAXBElement<SetPolicyState> createSetPolicyState(SetPolicyState value) {
        return new JAXBElement<SetPolicyState>(_SetPolicyState_QNAME, SetPolicyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DefineNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "defineNotificationResponse")
    public JAXBElement<DefineNotificationResponse> createDefineNotificationResponse(DefineNotificationResponse value) {
        return new JAXBElement<DefineNotificationResponse>(_DefineNotificationResponse_QNAME, DefineNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffServerWithCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffServerWithCredential")
    public JAXBElement<PowerOffServerWithCredential> createPowerOffServerWithCredential(PowerOffServerWithCredential value) {
        return new JAXBElement<PowerOffServerWithCredential>(_PowerOffServerWithCredential_QNAME, PowerOffServerWithCredential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateNetworkDevicePowerProfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateNetworkDevicePowerProfiles")
    public JAXBElement<EnumerateNetworkDevicePowerProfiles> createEnumerateNetworkDevicePowerProfiles(EnumerateNetworkDevicePowerProfiles value) {
        return new JAXBElement<EnumerateNetworkDevicePowerProfiles>(_EnumerateNetworkDevicePowerProfiles_QNAME, EnumerateNetworkDevicePowerProfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnsubscribeEventHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "unsubscribeEventHandler")
    public JAXBElement<UnsubscribeEventHandler> createUnsubscribeEventHandler(UnsubscribeEventHandler value) {
        return new JAXBElement<UnsubscribeEventHandler>(_UnsubscribeEventHandler_QNAME, UnsubscribeEventHandler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnResponse")
    public JAXBElement<PowerOnResponse> createPowerOnResponse(PowerOnResponse value) {
        return new JAXBElement<PowerOnResponse>(_PowerOnResponse_QNAME, PowerOnResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWorkloadPattern }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getWorkloadPattern")
    public JAXBElement<GetWorkloadPattern> createGetWorkloadPattern(GetWorkloadPattern value) {
        return new JAXBElement<GetWorkloadPattern>(_GetWorkloadPattern_QNAME, GetWorkloadPattern.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRealTimePduDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getRealTimePduDataResponse")
    public JAXBElement<GetRealTimePduDataResponse> createGetRealTimePduDataResponse(GetRealTimePduDataResponse value) {
        return new JAXBElement<GetRealTimePduDataResponse>(_GetRealTimePduDataResponse_QNAME, GetRealTimePduDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribeEventHandlerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "subscribeEventHandlerResponse")
    public JAXBElement<SubscribeEventHandlerResponse> createSubscribeEventHandlerResponse(SubscribeEventHandlerResponse value) {
        return new JAXBElement<SubscribeEventHandlerResponse>(_SubscribeEventHandlerResponse_QNAME, SubscribeEventHandlerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRealTimeUpsDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getRealTimeUpsDataResponse")
    public JAXBElement<GetRealTimeUpsDataResponse> createGetRealTimeUpsDataResponse(GetRealTimeUpsDataResponse value) {
        return new JAXBElement<GetRealTimeUpsDataResponse>(_GetRealTimeUpsDataResponse_QNAME, GetRealTimeUpsDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLocationInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setLocationInfo")
    public JAXBElement<SetLocationInfo> createSetLocationInfo(SetLocationInfo value) {
        return new JAXBElement<SetLocationInfo>(_SetLocationInfo_QNAME, SetLocationInfo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateNotificationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateNotificationsResponse")
    public JAXBElement<EnumerateNotificationsResponse> createEnumerateNotificationsResponse(EnumerateNotificationsResponse value) {
        return new JAXBElement<EnumerateNotificationsResponse>(_EnumerateNotificationsResponse_QNAME, EnumerateNotificationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicy")
    public JAXBElement<SetPolicy> createSetPolicy(SetPolicy value) {
        return new JAXBElement<SetPolicy>(_SetPolicy_QNAME, SetPolicy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOnOutletResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOnOutletResponse")
    public JAXBElement<PowerOnOutletResponse> createPowerOnOutletResponse(PowerOnOutletResponse value) {
        return new JAXBElement<PowerOnOutletResponse>(_PowerOnOutletResponse_QNAME, PowerOnOutletResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEntities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "findEntities")
    public JAXBElement<FindEntities> createFindEntities(FindEntities value) {
        return new JAXBElement<FindEntities>(_FindEntities_QNAME, FindEntities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getVersion")
    public JAXBElement<GetVersion> createGetVersion(GetVersion value) {
        return new JAXBElement<GetVersion>(_GetVersion_QNAME, GetVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLatestQueryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getLatestQueryDataResponse")
    public JAXBElement<GetLatestQueryDataResponse> createGetLatestQueryDataResponse(GetLatestQueryDataResponse value) {
        return new JAXBElement<GetLatestQueryDataResponse>(_GetLatestQueryDataResponse_QNAME, GetLatestQueryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyDataExResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyDataExResponse")
    public JAXBElement<GetPolicyDataExResponse> createGetPolicyDataExResponse(GetPolicyDataExResponse value) {
        return new JAXBElement<GetPolicyDataExResponse>(_GetPolicyDataExResponse_QNAME, GetPolicyDataExResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNotificationState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNotificationState")
    public JAXBElement<GetNotificationState> createGetNotificationState(GetNotificationState value) {
        return new JAXBElement<GetNotificationState>(_GetNotificationState_QNAME, GetNotificationState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubscribePredefinedEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "subscribePredefinedEvent")
    public JAXBElement<SubscribePredefinedEvent> createSubscribePredefinedEvent(SubscribePredefinedEvent value) {
        return new JAXBElement<SubscribePredefinedEvent>(_SubscribePredefinedEvent_QNAME, SubscribePredefinedEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetLoadfactors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setLoadfactors")
    public JAXBElement<SetLoadfactors> createSetLoadfactors(SetLoadfactors value) {
        return new JAXBElement<SetLoadfactors>(_SetLoadfactors_QNAME, SetLoadfactors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSecretKeyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "deleteSecretKeyResponse")
    public JAXBElement<DeleteSecretKeyResponse> createDeleteSecretKeyResponse(DeleteSecretKeyResponse value) {
        return new JAXBElement<DeleteSecretKeyResponse>(_DeleteSecretKeyResponse_QNAME, DeleteSecretKeyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RediscoverNodeCapabilities }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rediscoverNodeCapabilities")
    public JAXBElement<RediscoverNodeCapabilities> createRediscoverNodeCapabilities(RediscoverNodeCapabilities value) {
        return new JAXBElement<RediscoverNodeCapabilities>(_RediscoverNodeCapabilities_QNAME, RediscoverNodeCapabilities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateWorkloadIntensityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateWorkloadIntensityResponse")
    public JAXBElement<UpdateWorkloadIntensityResponse> createUpdateWorkloadIntensityResponse(UpdateWorkloadIntensityResponse value) {
        return new JAXBElement<UpdateWorkloadIntensityResponse>(_UpdateWorkloadIntensityResponse_QNAME, UpdateWorkloadIntensityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUnreachableEntitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getUnreachableEntitiesResponse")
    public JAXBElement<GetUnreachableEntitiesResponse> createGetUnreachableEntitiesResponse(GetUnreachableEntitiesResponse value) {
        return new JAXBElement<GetUnreachableEntitiesResponse>(_GetUnreachableEntitiesResponse_QNAME, GetUnreachableEntitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovePolicyHastily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removePolicyHastily")
    public JAXBElement<RemovePolicyHastily> createRemovePolicyHastily(RemovePolicyHastily value) {
        return new JAXBElement<RemovePolicyHastily>(_RemovePolicyHastily_QNAME, RemovePolicyHastily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRealTimeSensorData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getRealTimeSensorData")
    public JAXBElement<GetRealTimeSensorData> createGetRealTimeSensorData(GetRealTimeSensorData value) {
        return new JAXBElement<GetRealTimeSensorData>(_GetRealTimeSensorData_QNAME, GetRealTimeSensorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTemperatureRise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getTemperatureRise")
    public JAXBElement<GetTemperatureRise> createGetTemperatureRise(GetTemperatureRise value) {
        return new JAXBElement<GetTemperatureRise>(_GetTemperatureRise_QNAME, GetTemperatureRise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetricData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMetricData")
    public JAXBElement<GetMetricData> createGetMetricData(GetMetricData value) {
        return new JAXBElement<GetMetricData>(_GetMetricData_QNAME, GetMetricData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateNetworkDevicePowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updateNetworkDevicePowerProfileResponse")
    public JAXBElement<UpdateNetworkDevicePowerProfileResponse> createUpdateNetworkDevicePowerProfileResponse(UpdateNetworkDevicePowerProfileResponse value) {
        return new JAXBElement<UpdateNetworkDevicePowerProfileResponse>(_UpdateNetworkDevicePowerProfileResponse_QNAME, UpdateNetworkDevicePowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInletTemperatureDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getInletTemperatureDistribution")
    public JAXBElement<GetInletTemperatureDistribution> createGetInletTemperatureDistribution(GetInletTemperatureDistribution value) {
        return new JAXBElement<GetInletTemperatureDistribution>(_GetInletTemperatureDistribution_QNAME, GetInletTemperatureDistribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPowerModel }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addPowerModel")
    public JAXBElement<AddPowerModel> createAddPowerModel(AddPowerModel value) {
        return new JAXBElement<AddPowerModel>(_AddPowerModel_QNAME, AddPowerModel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveNotificationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeNotificationResponse")
    public JAXBElement<RemoveNotificationResponse> createRemoveNotificationResponse(RemoveNotificationResponse value) {
        return new JAXBElement<RemoveNotificationResponse>(_RemoveNotificationResponse_QNAME, RemoveNotificationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetObservedMaxPowerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getObservedMaxPowerResponse")
    public JAXBElement<GetObservedMaxPowerResponse> createGetObservedMaxPowerResponse(GetObservedMaxPowerResponse value) {
        return new JAXBElement<GetObservedMaxPowerResponse>(_GetObservedMaxPowerResponse_QNAME, GetObservedMaxPowerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMetricDataResponse")
    public JAXBElement<GetMetricDataResponse> createGetMetricDataResponse(GetMetricDataResponse value) {
        return new JAXBElement<GetMetricDataResponse>(_GetMetricDataResponse_QNAME, GetMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateServerForWorkloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "evaluateServerForWorkloadResponse")
    public JAXBElement<EvaluateServerForWorkloadResponse> createEvaluateServerForWorkloadResponse(EvaluateServerForWorkloadResponse value) {
        return new JAXBElement<EvaluateServerForWorkloadResponse>(_EvaluateServerForWorkloadResponse_QNAME, EvaluateServerForWorkloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConnectorPropertySet }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getConnectorPropertySet")
    public JAXBElement<GetConnectorPropertySet> createGetConnectorPropertySet(GetConnectorPropertySet value) {
        return new JAXBElement<GetConnectorPropertySet>(_GetConnectorPropertySet_QNAME, GetConnectorPropertySet.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPredefinedEventTypes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPredefinedEventTypes")
    public JAXBElement<GetPredefinedEventTypes> createGetPredefinedEventTypes(GetPredefinedEventTypes value) {
        return new JAXBElement<GetPredefinedEventTypes>(_GetPredefinedEventTypes_QNAME, GetPredefinedEventTypes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollectionState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getCollectionState")
    public JAXBElement<GetCollectionState> createGetCollectionState(GetCollectionState value) {
        return new JAXBElement<GetCollectionState>(_GetCollectionState_QNAME, GetCollectionState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SchedulePolicyHastily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "schedulePolicyHastily")
    public JAXBElement<SchedulePolicyHastily> createSchedulePolicyHastily(SchedulePolicyHastily value) {
        return new JAXBElement<SchedulePolicyHastily>(_SchedulePolicyHastily_QNAME, SchedulePolicyHastily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetUtilizationMetrics }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getUtilizationMetrics")
    public JAXBElement<GetUtilizationMetrics> createGetUtilizationMetrics(GetUtilizationMetrics value) {
        return new JAXBElement<GetUtilizationMetrics>(_GetUtilizationMetrics_QNAME, GetUtilizationMetrics.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextRawData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getNextRawData")
    public JAXBElement<GetNextRawData> createGetNextRawData(GetNextRawData value) {
        return new JAXBElement<GetNextRawData>(_GetNextRawData_QNAME, GetNextRawData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRealTimeSensorDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getRealTimeSensorDataResponse")
    public JAXBElement<GetRealTimeSensorDataResponse> createGetRealTimeSensorDataResponse(GetRealTimeSensorDataResponse value) {
        return new JAXBElement<GetRealTimeSensorDataResponse>(_GetRealTimeSensorDataResponse_QNAME, GetRealTimeSensorDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffServerResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffServerResponse")
    public JAXBElement<PowerOffServerResponse> createPowerOffServerResponse(PowerOffServerResponse value) {
        return new JAXBElement<PowerOffServerResponse>(_PowerOffServerResponse_QNAME, PowerOffServerResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffServerWithCredentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffServerWithCredentialResponse")
    public JAXBElement<PowerOffServerWithCredentialResponse> createPowerOffServerWithCredentialResponse(PowerOffServerWithCredentialResponse value) {
        return new JAXBElement<PowerOffServerWithCredentialResponse>(_PowerOffServerWithCredentialResponse_QNAME, PowerOffServerWithCredentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AssociateInbandNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "associateInbandNode")
    public JAXBElement<AssociateInbandNode> createAssociateInbandNode(AssociateInbandNode value) {
        return new JAXBElement<AssociateInbandNode>(_AssociateInbandNode_QNAME, AssociateInbandNode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyData")
    public JAXBElement<GetPolicyData> createGetPolicyData(GetPolicyData value) {
        return new JAXBElement<GetPolicyData>(_GetPolicyData_QNAME, GetPolicyData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCustomEventDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getCustomEventDataResponse")
    public JAXBElement<GetCustomEventDataResponse> createGetCustomEventDataResponse(GetCustomEventDataResponse value) {
        return new JAXBElement<GetCustomEventDataResponse>(_GetCustomEventDataResponse_QNAME, GetCustomEventDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetServerWithCredential }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "resetServerWithCredential")
    public JAXBElement<ResetServerWithCredential> createResetServerWithCredential(ResetServerWithCredential value) {
        return new JAXBElement<ResetServerWithCredential>(_ResetServerWithCredential_QNAME, ResetServerWithCredential.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePolicyExHastily }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "updatePolicyExHastily")
    public JAXBElement<UpdatePolicyExHastily> createUpdatePolicyExHastily(UpdatePolicyExHastily value) {
        return new JAXBElement<UpdatePolicyExHastily>(_UpdatePolicyExHastily_QNAME, UpdatePolicyExHastily.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ImportHierarchy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "importHierarchy")
    public JAXBElement<ImportHierarchy> createImportHierarchy(ImportHierarchy value) {
        return new JAXBElement<ImportHierarchy>(_ImportHierarchy_QNAME, ImportHierarchy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DumpMeasurementData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "dumpMeasurementData")
    public JAXBElement<DumpMeasurementData> createDumpMeasurementData(DumpMeasurementData value) {
        return new JAXBElement<DumpMeasurementData>(_DumpMeasurementData_QNAME, DumpMeasurementData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEntityProperty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEntityProperty")
    public JAXBElement<GetEntityProperty> createGetEntityProperty(GetEntityProperty value) {
        return new JAXBElement<GetEntityProperty>(_GetEntityProperty_QNAME, GetEntityProperty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentifyEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "identifyEntity")
    public JAXBElement<IdentifyEntity> createIdentifyEntity(IdentifyEntity value) {
        return new JAXBElement<IdentifyEntity>(_IdentifyEntity_QNAME, IdentifyEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddPowerModelResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addPowerModelResponse")
    public JAXBElement<AddPowerModelResponse> createAddPowerModelResponse(AddPowerModelResponse value) {
        return new JAXBElement<AddPowerModelResponse>(_AddPowerModelResponse_QNAME, AddPowerModelResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStorageDevicePowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "addStorageDevicePowerProfile")
    public JAXBElement<AddStorageDevicePowerProfile> createAddStorageDevicePowerProfile(AddStorageDevicePowerProfile value) {
        return new JAXBElement<AddStorageDevicePowerProfile>(_AddStorageDevicePowerProfile_QNAME, AddStorageDevicePowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEntitiesWithDetails }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "findEntitiesWithDetails")
    public JAXBElement<FindEntitiesWithDetails> createFindEntitiesWithDetails(FindEntitiesWithDetails value) {
        return new JAXBElement<FindEntitiesWithDetails>(_FindEntitiesWithDetails_QNAME, FindEntitiesWithDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveServerPowerProfile }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeServerPowerProfile")
    public JAXBElement<RemoveServerPowerProfile> createRemoveServerPowerProfile(RemoveServerPowerProfile value) {
        return new JAXBElement<RemoveServerPowerProfile>(_RemoveServerPowerProfile_QNAME, RemoveServerPowerProfile.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopCollectingPowerDistribution }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "stopCollectingPowerDistribution")
    public JAXBElement<StopCollectingPowerDistribution> createStopCollectingPowerDistribution(StopCollectingPowerDistribution value) {
        return new JAXBElement<StopCollectingPowerDistribution>(_StopCollectingPowerDistribution_QNAME, StopCollectingPowerDistribution.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyStateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyStateResponse")
    public JAXBElement<GetPolicyStateResponse> createGetPolicyStateResponse(GetPolicyStateResponse value) {
        return new JAXBElement<GetPolicyStateResponse>(_GetPolicyStateResponse_QNAME, GetPolicyStateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReconnectEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "reconnectEntity")
    public JAXBElement<ReconnectEntity> createReconnectEntity(ReconnectEntity value) {
        return new JAXBElement<ReconnectEntity>(_ReconnectEntity_QNAME, ReconnectEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StopPowerSaving }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "stopPowerSaving")
    public JAXBElement<StopPowerSaving> createStopPowerSaving(StopPowerSaving value) {
        return new JAXBElement<StopPowerSaving>(_StopPowerSaving_QNAME, StopPowerSaving.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetricAggregationPeriodListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMetricAggregationPeriodListResponse")
    public JAXBElement<GetMetricAggregationPeriodListResponse> createGetMetricAggregationPeriodListResponse(GetMetricAggregationPeriodListResponse value) {
        return new JAXBElement<GetMetricAggregationPeriodListResponse>(_GetMetricAggregationPeriodListResponse_QNAME, GetMetricAggregationPeriodListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResetActiveIdlePowerEstimationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "resetActiveIdlePowerEstimationResponse")
    public JAXBElement<ResetActiveIdlePowerEstimationResponse> createResetActiveIdlePowerEstimationResponse(ResetActiveIdlePowerEstimationResponse value) {
        return new JAXBElement<ResetActiveIdlePowerEstimationResponse>(_ResetActiveIdlePowerEstimationResponse_QNAME, ResetActiveIdlePowerEstimationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMultipleLatestMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMultipleLatestMetricDataResponse")
    public JAXBElement<GetMultipleLatestMetricDataResponse> createGetMultipleLatestMetricDataResponse(GetMultipleLatestMetricDataResponse value) {
        return new JAXBElement<GetMultipleLatestMetricDataResponse>(_GetMultipleLatestMetricDataResponse_QNAME, GetMultipleLatestMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetActionLogRecordsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getActionLogRecordsResponse")
    public JAXBElement<GetActionLogRecordsResponse> createGetActionLogRecordsResponse(GetActionLogRecordsResponse value) {
        return new JAXBElement<GetActionLogRecordsResponse>(_GetActionLogRecordsResponse_QNAME, GetActionLogRecordsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetectEntitiesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "detectEntitiesResponse")
    public JAXBElement<DetectEntitiesResponse> createDetectEntitiesResponse(DetectEntitiesResponse value) {
        return new JAXBElement<DetectEntitiesResponse>(_DetectEntitiesResponse_QNAME, DetectEntitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClearNodePolicies }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "clearNodePolicies")
    public JAXBElement<ClearNodePolicies> createClearNodePolicies(ClearNodePolicies value) {
        return new JAXBElement<ClearNodePolicies>(_ClearNodePolicies_QNAME, ClearNodePolicies.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveServerPowerProfileResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeServerPowerProfileResponse")
    public JAXBElement<RemoveServerPowerProfileResponse> createRemoveServerPowerProfileResponse(RemoveServerPowerProfileResponse value) {
        return new JAXBElement<RemoveServerPowerProfileResponse>(_RemoveServerPowerProfileResponse_QNAME, RemoveServerPowerProfileResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RankServersForWorkloadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "rankServersForWorkloadResponse")
    public JAXBElement<RankServersForWorkloadResponse> createRankServersForWorkloadResponse(RankServersForWorkloadResponse value) {
        return new JAXBElement<RankServersForWorkloadResponse>(_RankServersForWorkloadResponse_QNAME, RankServersForWorkloadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerOffServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerOffServer")
    public JAXBElement<PowerOffServer> createPowerOffServer(PowerOffServer value) {
        return new JAXBElement<PowerOffServer>(_PowerOffServer_QNAME, PowerOffServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoadfactorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getLoadfactorsResponse")
    public JAXBElement<GetLoadfactorsResponse> createGetLoadfactorsResponse(GetLoadfactorsResponse value) {
        return new JAXBElement<GetLoadfactorsResponse>(_GetLoadfactorsResponse_QNAME, GetLoadfactorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemoveCustomEvent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "removeCustomEvent")
    public JAXBElement<RemoveCustomEvent> createRemoveCustomEvent(RemoveCustomEvent value) {
        return new JAXBElement<RemoveCustomEvent>(_RemoveCustomEvent_QNAME, RemoveCustomEvent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisassociateEntity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "disassociateEntity")
    public JAXBElement<DisassociateEntity> createDisassociateEntity(DisassociateEntity value) {
        return new JAXBElement<DisassociateEntity>(_DisassociateEntity_QNAME, DisassociateEntity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBatchMetricDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getBatchMetricDataResponse")
    public JAXBElement<GetBatchMetricDataResponse> createGetBatchMetricDataResponse(GetBatchMetricDataResponse value) {
        return new JAXBElement<GetBatchMetricDataResponse>(_GetBatchMetricDataResponse_QNAME, GetBatchMetricDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EvaluateLowUtilizationServer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "evaluateLowUtilizationServer")
    public JAXBElement<EvaluateLowUtilizationServer> createEvaluateLowUtilizationServer(EvaluateLowUtilizationServer value) {
        return new JAXBElement<EvaluateLowUtilizationServer>(_EvaluateLowUtilizationServer_QNAME, EvaluateLowUtilizationServer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventHandler }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEventHandler")
    public JAXBElement<GetEventHandler> createGetEventHandler(GetEventHandler value) {
        return new JAXBElement<GetEventHandler>(_GetEventHandler_QNAME, GetEventHandler.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetPolicyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "setPolicyResponse")
    public JAXBElement<SetPolicyResponse> createSetPolicyResponse(SetPolicyResponse value) {
        return new JAXBElement<SetPolicyResponse>(_SetPolicyResponse_QNAME, SetPolicyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPolicyState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getPolicyState")
    public JAXBElement<GetPolicyState> createGetPolicyState(GetPolicyState value) {
        return new JAXBElement<GetPolicyState>(_GetPolicyState_QNAME, GetPolicyState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetInletTemperatureDistributionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getInletTemperatureDistributionResponse")
    public JAXBElement<GetInletTemperatureDistributionResponse> createGetInletTemperatureDistributionResponse(GetInletTemperatureDistributionResponse value) {
        return new JAXBElement<GetInletTemperatureDistributionResponse>(_GetInletTemperatureDistributionResponse_QNAME, GetInletTemperatureDistributionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PowerCycleServerWithCredentialResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "powerCycleServerWithCredentialResponse")
    public JAXBElement<PowerCycleServerWithCredentialResponse> createPowerCycleServerWithCredentialResponse(PowerCycleServerWithCredentialResponse value) {
        return new JAXBElement<PowerCycleServerWithCredentialResponse>(_PowerCycleServerWithCredentialResponse_QNAME, PowerCycleServerWithCredentialResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ReconnectEntityResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "reconnectEntityResponse")
    public JAXBElement<ReconnectEntityResponse> createReconnectEntityResponse(ReconnectEntityResponse value) {
        return new JAXBElement<ReconnectEntityResponse>(_ReconnectEntityResponse_QNAME, ReconnectEntityResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getSensorData")
    public JAXBElement<GetSensorData> createGetSensorData(GetSensorData value) {
        return new JAXBElement<GetSensorData>(_GetSensorData_QNAME, GetSensorData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EnumerateServerPowerProfilesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "enumerateServerPowerProfilesResponse")
    public JAXBElement<EnumerateServerPowerProfilesResponse> createEnumerateServerPowerProfilesResponse(EnumerateServerPowerProfilesResponse value) {
        return new JAXBElement<EnumerateServerPowerProfilesResponse>(_EnumerateServerPowerProfilesResponse_QNAME, EnumerateServerPowerProfilesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetQueryDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getQueryDataResponse")
    public JAXBElement<GetQueryDataResponse> createGetQueryDataResponse(GetQueryDataResponse value) {
        return new JAXBElement<GetQueryDataResponse>(_GetQueryDataResponse_QNAME, GetQueryDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRealTimePduData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getRealTimePduData")
    public JAXBElement<GetRealTimePduData> createGetRealTimePduData(GetRealTimePduData value) {
        return new JAXBElement<GetRealTimePduData>(_GetRealTimePduData_QNAME, GetRealTimePduData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetMetricAggregationPeriodList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getMetricAggregationPeriodList")
    public JAXBElement<GetMetricAggregationPeriodList> createGetMetricAggregationPeriodList(GetMetricAggregationPeriodList value) {
        return new JAXBElement<GetMetricAggregationPeriodList>(_GetMetricAggregationPeriodList_QNAME, GetMetricAggregationPeriodList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOutletState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getOutletState")
    public JAXBElement<GetOutletState> createGetOutletState(GetOutletState value) {
        return new JAXBElement<GetOutletState>(_GetOutletState_QNAME, GetOutletState.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetEventState }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://wsdl.intf.dcm.intel.com/", name = "getEventState")
    public JAXBElement<GetEventState> createGetEventState(GetEventState value) {
        return new JAXBElement<GetEventState>(_GetEventState_QNAME, GetEventState.class, null, value);
    }

}
