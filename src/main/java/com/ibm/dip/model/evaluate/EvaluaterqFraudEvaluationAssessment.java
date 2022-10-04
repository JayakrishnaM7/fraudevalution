package com.ibm.dip.model.evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluaterqFraudEvaluationAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-04T04:52:17.100Z[GMT]")

public class EvaluaterqFraudEvaluationAssessment   {
  @JsonProperty("FraudEvaluationTestProfile")
  private String fraudEvaluationTestProfile;

  @JsonProperty("FraudEvaluationEnsembleTechniqueType")
  private String fraudEvaluationEnsembleTechniqueType;

  @JsonProperty("FraudEvaluationEnsembleTechniqueDefinition")
  private String fraudEvaluationEnsembleTechniqueDefinition;

  @JsonProperty("FraudEvaluationTransactionConsolidationRecord")
  private String fraudEvaluationTransactionConsolidationRecord;

  @JsonProperty("ProductProductionSessionReference")
  private Object productProductionSessionReference;

  public EvaluaterqFraudEvaluationAssessment fraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
    this.fraudEvaluationTestProfile = fraudEvaluationTestProfile;
    return this;
  }

  /**
   * Get fraudEvaluationTestProfile
   * @return fraudEvaluationTestProfile
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationTestProfile() {
    return fraudEvaluationTestProfile;
  }

  public void setFraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
    this.fraudEvaluationTestProfile = fraudEvaluationTestProfile;
  }

  public EvaluaterqFraudEvaluationAssessment fraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
    this.fraudEvaluationEnsembleTechniqueType = fraudEvaluationEnsembleTechniqueType;
    return this;
  }

  /**
   * Get fraudEvaluationEnsembleTechniqueType
   * @return fraudEvaluationEnsembleTechniqueType
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationEnsembleTechniqueType() {
    return fraudEvaluationEnsembleTechniqueType;
  }

  public void setFraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
    this.fraudEvaluationEnsembleTechniqueType = fraudEvaluationEnsembleTechniqueType;
  }

  public EvaluaterqFraudEvaluationAssessment fraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
    this.fraudEvaluationEnsembleTechniqueDefinition = fraudEvaluationEnsembleTechniqueDefinition;
    return this;
  }

  /**
   * Get fraudEvaluationEnsembleTechniqueDefinition
   * @return fraudEvaluationEnsembleTechniqueDefinition
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationEnsembleTechniqueDefinition() {
    return fraudEvaluationEnsembleTechniqueDefinition;
  }

  public void setFraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
    this.fraudEvaluationEnsembleTechniqueDefinition = fraudEvaluationEnsembleTechniqueDefinition;
  }

  public EvaluaterqFraudEvaluationAssessment fraudEvaluationTransactionConsolidationRecord(String fraudEvaluationTransactionConsolidationRecord) {
    this.fraudEvaluationTransactionConsolidationRecord = fraudEvaluationTransactionConsolidationRecord;
    return this;
  }

  /**
   * Get fraudEvaluationTransactionConsolidationRecord
   * @return fraudEvaluationTransactionConsolidationRecord
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationTransactionConsolidationRecord() {
    return fraudEvaluationTransactionConsolidationRecord;
  }

  public void setFraudEvaluationTransactionConsolidationRecord(String fraudEvaluationTransactionConsolidationRecord) {
    this.fraudEvaluationTransactionConsolidationRecord = fraudEvaluationTransactionConsolidationRecord;
  }

  public EvaluaterqFraudEvaluationAssessment productProductionSessionReference(Object productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
    return this;
  }

  /**
   * Get productProductionSessionReference
   * @return productProductionSessionReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductProductionSessionReference() {
    return productProductionSessionReference;
  }

  public void setProductProductionSessionReference(Object productProductionSessionReference) {
    this.productProductionSessionReference = productProductionSessionReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluaterqFraudEvaluationAssessment evaluaterqFraudEvaluationAssessment = (EvaluaterqFraudEvaluationAssessment) o;
    return Objects.equals(this.fraudEvaluationTestProfile, evaluaterqFraudEvaluationAssessment.fraudEvaluationTestProfile) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueType, evaluaterqFraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueType) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueDefinition, evaluaterqFraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueDefinition) &&
        Objects.equals(this.fraudEvaluationTransactionConsolidationRecord, evaluaterqFraudEvaluationAssessment.fraudEvaluationTransactionConsolidationRecord) &&
        Objects.equals(this.productProductionSessionReference, evaluaterqFraudEvaluationAssessment.productProductionSessionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudEvaluationTestProfile, fraudEvaluationEnsembleTechniqueType, fraudEvaluationEnsembleTechniqueDefinition, fraudEvaluationTransactionConsolidationRecord, productProductionSessionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluaterqFraudEvaluationAssessment {\n");
    
    sb.append("    fraudEvaluationTestProfile: ").append(toIndentedString(fraudEvaluationTestProfile)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueType: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueType)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueDefinition: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueDefinition)).append("\n");
    sb.append("    fraudEvaluationTransactionConsolidationRecord: ").append(toIndentedString(fraudEvaluationTransactionConsolidationRecord)).append("\n");
    sb.append("    productProductionSessionReference: ").append(toIndentedString(productProductionSessionReference)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

