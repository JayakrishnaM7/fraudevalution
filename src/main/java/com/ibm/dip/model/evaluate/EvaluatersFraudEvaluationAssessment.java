package com.ibm.dip.model.evaluate;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EvaluatersFraudEvaluationAssessment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-04T04:52:17.100Z[GMT]")

public class EvaluatersFraudEvaluationAssessment   {
  @JsonProperty("FraudEvaluationTestProfile")
  private String fraudEvaluationTestProfile;

  @JsonProperty("FraudEvaluationEnsembleTechniqueType")
  private String fraudEvaluationEnsembleTechniqueType;

  @JsonProperty("FraudEvaluationEnsembleTechniqueDefinition")
  private String fraudEvaluationEnsembleTechniqueDefinition;

  @JsonProperty("FraudEvaluationProductionAnomalyRecord")
  private String fraudEvaluationProductionAnomalyRecord;

  public EvaluatersFraudEvaluationAssessment fraudEvaluationTestProfile(String fraudEvaluationTestProfile) {
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

  public EvaluatersFraudEvaluationAssessment fraudEvaluationEnsembleTechniqueType(String fraudEvaluationEnsembleTechniqueType) {
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

  public EvaluatersFraudEvaluationAssessment fraudEvaluationEnsembleTechniqueDefinition(String fraudEvaluationEnsembleTechniqueDefinition) {
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

  public EvaluatersFraudEvaluationAssessment fraudEvaluationProductionAnomalyRecord(String fraudEvaluationProductionAnomalyRecord) {
    this.fraudEvaluationProductionAnomalyRecord = fraudEvaluationProductionAnomalyRecord;
    return this;
  }

  /**
   * Get fraudEvaluationProductionAnomalyRecord
   * @return fraudEvaluationProductionAnomalyRecord
  */
  @ApiModelProperty(value = "")


  public String getFraudEvaluationProductionAnomalyRecord() {
    return fraudEvaluationProductionAnomalyRecord;
  }

  public void setFraudEvaluationProductionAnomalyRecord(String fraudEvaluationProductionAnomalyRecord) {
    this.fraudEvaluationProductionAnomalyRecord = fraudEvaluationProductionAnomalyRecord;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluatersFraudEvaluationAssessment evaluatersFraudEvaluationAssessment = (EvaluatersFraudEvaluationAssessment) o;
    return Objects.equals(this.fraudEvaluationTestProfile, evaluatersFraudEvaluationAssessment.fraudEvaluationTestProfile) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueType, evaluatersFraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueType) &&
        Objects.equals(this.fraudEvaluationEnsembleTechniqueDefinition, evaluatersFraudEvaluationAssessment.fraudEvaluationEnsembleTechniqueDefinition) &&
        Objects.equals(this.fraudEvaluationProductionAnomalyRecord, evaluatersFraudEvaluationAssessment.fraudEvaluationProductionAnomalyRecord);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fraudEvaluationTestProfile, fraudEvaluationEnsembleTechniqueType, fraudEvaluationEnsembleTechniqueDefinition, fraudEvaluationProductionAnomalyRecord);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluatersFraudEvaluationAssessment {\n");
    
    sb.append("    fraudEvaluationTestProfile: ").append(toIndentedString(fraudEvaluationTestProfile)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueType: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueType)).append("\n");
    sb.append("    fraudEvaluationEnsembleTechniqueDefinition: ").append(toIndentedString(fraudEvaluationEnsembleTechniqueDefinition)).append("\n");
    sb.append("    fraudEvaluationProductionAnomalyRecord: ").append(toIndentedString(fraudEvaluationProductionAnomalyRecord)).append("\n");
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

